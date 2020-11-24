package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import typings.ibmCloudSdkCore.helperMod.FileObject
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.DetectFacesConstants.AcceptLanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `detectFaces` operation. */
@js.native
trait DetectFacesParams extends js.Object {
  
  /** The desired language of parts of the response. See the response for details. */
  var accept_language: js.UndefOr[AcceptLanguage | String] = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  /** An image file (gif, .jpg, .png, .tif.) or .zip file with images. Limit the .zip file to 100 MB. You can include a maximum of 15 images in a request. Encode the image and .zip file names in UTF-8 if they contain non-ASCII characters. The service assumes UTF-8 encoding if it encounters non-ASCII characters. You can also include an image with the **url** parameter. */
  var images_file: js.UndefOr[ReadableStream | FileObject | Buffer] = js.native
  
  /** The content type of images_file. */
  var images_file_content_type: js.UndefOr[String] = js.native
  
  /** The filename for images_file. */
  var images_filename: js.UndefOr[String] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
  
  /** The URL of an image to analyze. Must be in .gif, .jpg, .png, or .tif format. The minimum recommended pixel density is 32X32 pixels, but the service tends to perform better with images that are at least 224 x 224 pixels. The maximum image size is 10 MB. Redirects are followed, so you can use a shortened URL. You can also include images with the **images_file** parameter. */
  var url: js.UndefOr[String] = js.native
}
object DetectFacesParams {
  
  @scala.inline
  def apply(): DetectFacesParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectFacesParams]
  }
  
  @scala.inline
  implicit class DetectFacesParamsOps[Self <: DetectFacesParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccept_language(value: AcceptLanguage | String): Self = this.set("accept_language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccept_language: Self = this.set("accept_language", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setImages_file(value: ReadableStream | FileObject | Buffer): Self = this.set("images_file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImages_file: Self = this.set("images_file", js.undefined)
    
    @scala.inline
    def setImages_file_content_type(value: String): Self = this.set("images_file_content_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImages_file_content_type: Self = this.set("images_file_content_type", js.undefined)
    
    @scala.inline
    def setImages_filename(value: String): Self = this.set("images_filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImages_filename: Self = this.set("images_filename", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
