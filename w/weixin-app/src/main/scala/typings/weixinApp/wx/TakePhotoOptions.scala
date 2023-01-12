package typings.weixinApp.wx

import typings.weixinApp.anon.TempImagePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TakePhotoOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** 成像质量，值为high, normal, low，默认normal */
  var quality: js.UndefOr[String] = js.undefined
  
  @JSName("success")
  var success_TakePhotoOptions: js.UndefOr[js.Function1[/* res */ TempImagePath, Unit]] = js.undefined
}
object TakePhotoOptions {
  
  inline def apply(): TakePhotoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TakePhotoOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TakePhotoOptions] (val x: Self) extends AnyVal {
    
    inline def setQuality(value: String): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setSuccess(value: /* res */ TempImagePath => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
