package typings.weixinApp.wx

import typings.weixinApp.anon.TempImagePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TakePhotoOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /** 成像质量，值为high, normal, low，默认normal */
  var quality: js.UndefOr[String] = js.native
  
  @JSName("success")
  var success_TakePhotoOptions: js.UndefOr[js.Function1[/* res */ TempImagePath, Unit]] = js.native
}
object TakePhotoOptions {
  
  @scala.inline
  def apply(): TakePhotoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TakePhotoOptions]
  }
  
  @scala.inline
  implicit class TakePhotoOptionsMutableBuilder[Self <: TakePhotoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuality(value: String): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ TempImagePath => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
