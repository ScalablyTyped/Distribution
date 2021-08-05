package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `17`[Params /* <: js.UndefOr[js.Object] */] extends StObject {
  
  /**
    * Params for this route
    */
  var params: js.UndefOr[Params] = js.undefined
}
object `17` {
  
  inline def apply[Params /* <: js.UndefOr[js.Object] */](): `17`[Params] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`17`[Params]]
  }
  
  extension [Self <: `17`[?], Params /* <: js.UndefOr[js.Object] */](x: Self & `17`[Params]) {
    
    inline def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
