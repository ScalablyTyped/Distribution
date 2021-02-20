package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetReginOptions extends CommonCallbackOptions {
  
  @JSName("success")
  var success_GetReginOptions: js.UndefOr[
    js.Function1[/* callback */ js.Function1[/* res */ GetReginSuccessCallbackOptions, Unit], Unit]
  ] = js.native
}
object GetReginOptions {
  
  @scala.inline
  def apply(): GetReginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReginOptions]
  }
  
  @scala.inline
  implicit class GetReginOptionsMutableBuilder[Self <: GetReginOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: /* callback */ js.Function1[/* res */ GetReginSuccessCallbackOptions, Unit] => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
