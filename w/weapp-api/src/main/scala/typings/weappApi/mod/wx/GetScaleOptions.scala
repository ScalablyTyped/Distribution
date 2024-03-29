package typings.weappApi.mod.wx

import typings.weappApi.anon.Scale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScaleOptions
  extends StObject
     with CommonCallbackOptions {
  
  @JSName("success")
  var success_GetScaleOptions: js.UndefOr[js.Function1[/* callback */ js.Function1[/* res */ Scale, Unit], Unit]] = js.undefined
}
object GetScaleOptions {
  
  inline def apply(): GetScaleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetScaleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetScaleOptions] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: /* callback */ js.Function1[/* res */ Scale, Unit] => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
