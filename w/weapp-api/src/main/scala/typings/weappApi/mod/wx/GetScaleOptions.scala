package typings.weappApi.mod.wx

import typings.weappApi.anon.Scale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetScaleOptions extends CommonCallbackOptions {
  
  @JSName("success")
  var success_GetScaleOptions: js.UndefOr[js.Function1[/* callback */ js.Function1[/* res */ Scale, Unit], Unit]] = js.native
}
object GetScaleOptions {
  
  @scala.inline
  def apply(): GetScaleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetScaleOptions]
  }
  
  @scala.inline
  implicit class GetScaleOptionsMutableBuilder[Self <: GetScaleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: /* callback */ js.Function1[/* res */ Scale, Unit] => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
