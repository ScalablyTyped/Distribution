package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import typings.ibmCloudSdkCore.helperMod.FileObject
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.DetectFacesConstants.AcceptLanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `detectFaces` operation. */
trait DetectFacesParams extends js.Object {
  /** The desired language of parts of the response. See the response for details. */
  var accept_language: js.UndefOr[AcceptLanguage | String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  /** An image file (gif, .jpg, .png, .tif.) or .zip file with images. Limit the .zip file to 100 MB. You can include a maximum of 15 images in a request. Encode the image and .zip file names in UTF-8 if they contain non-ASCII characters. The service assumes UTF-8 encoding if it encounters non-ASCII characters. You can also include an image with the **url** parameter. */
  var images_file: js.UndefOr[ReadableStream | FileObject | Buffer] = js.undefined
  /** The content type of images_file. */
  var images_file_content_type: js.UndefOr[String] = js.undefined
  /** The filename for images_file. */
  var images_filename: js.UndefOr[String] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** The URL of an image to analyze. Must be in .gif, .jpg, .png, or .tif format. The minimum recommended pixel density is 32X32 pixels, but the service tends to perform better with images that are at least 224 x 224 pixels. The maximum image size is 10 MB. Redirects are followed, so you can use a shortened URL. You can also include images with the **images_file** parameter. */
  var url: js.UndefOr[String] = js.undefined
}

object DetectFacesParams {
  @scala.inline
  def apply(
    accept_language: AcceptLanguage | String = null,
    headers: js.Object = null,
    images_file: ReadableStream | FileObject | Buffer = null,
    images_file_content_type: String = null,
    images_filename: String = null,
    return_response: js.UndefOr[Boolean] = js.undefined,
    url: String = null
  ): DetectFacesParams = {
    val __obj = js.Dynamic.literal()
    if (accept_language != null) __obj.updateDynamic("accept_language")(accept_language.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (images_file != null) __obj.updateDynamic("images_file")(images_file.asInstanceOf[js.Any])
    if (images_file_content_type != null) __obj.updateDynamic("images_file_content_type")(images_file_content_type.asInstanceOf[js.Any])
    if (images_filename != null) __obj.updateDynamic("images_filename")(images_filename.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectFacesParams]
  }
}

