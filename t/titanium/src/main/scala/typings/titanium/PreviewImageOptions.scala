package typings.titanium

import typings.titanium.Titanium.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options passed to <Titanium.Media.previewImage>.
  */
@js.native
trait PreviewImageOptions extends StObject {
  
  /**
    * Function called back if the preview fails. Check the `message` property of passed back parameter.
    */
  var error: js.UndefOr[js.Function1[/* param0 */ PreviewImageError, Unit]] = js.native
  
  /**
    * The image to preview. Must be a blob based on a file, such as from <Titanium.Filesystem.File.read>.
    */
  var image: js.UndefOr[Blob] = js.native
  
  /**
    * Function to be called back if the preview succeeds. No info is passed.
    */
  var success: js.UndefOr[js.Function1[/* param0 */ SuccessResponse, Unit]] = js.native
}
object PreviewImageOptions {
  
  @scala.inline
  def apply(): PreviewImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviewImageOptions]
  }
  
  @scala.inline
  implicit class PreviewImageOptionsMutableBuilder[Self <: PreviewImageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: /* param0 */ PreviewImageError => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setImage(value: Blob): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* param0 */ SuccessResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
