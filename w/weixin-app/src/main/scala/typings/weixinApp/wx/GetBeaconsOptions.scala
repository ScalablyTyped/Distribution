package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBeaconsOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  var success_GetBeaconsOptions: js.UndefOr[js.Function1[/* options */ GetBeaconsSuccess, Unit]] = js.native
}
object GetBeaconsOptions {
  
  @scala.inline
  def apply(): GetBeaconsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBeaconsOptions]
  }
  
  @scala.inline
  implicit class GetBeaconsOptionsMutableBuilder[Self <: GetBeaconsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: /* options */ GetBeaconsSuccess => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
