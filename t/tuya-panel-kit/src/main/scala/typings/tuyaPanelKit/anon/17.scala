package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `17`[Params /* <: js.UndefOr[js.Object] */] extends StObject {
  
  /**
    * Params for this route
    */
  var params: js.UndefOr[Params] = js.native
}
object `17` {
  
  @scala.inline
  def apply[Params /* <: js.UndefOr[js.Object] */](): `17`[Params] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`17`[Params]]
  }
  
  @scala.inline
  implicit class `17MutableBuilder`[Self <: `17`[_], Params /* <: js.UndefOr[js.Object] */] (val x: Self with `17`[Params]) extends AnyVal {
    
    @scala.inline
    def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
