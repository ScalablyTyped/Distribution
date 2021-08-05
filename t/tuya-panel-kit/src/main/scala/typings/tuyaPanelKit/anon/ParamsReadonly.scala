package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsReadonly[Params /* <: js.UndefOr[js.Object] */] extends StObject {
  
  /**
    * Params for this route
    */
  var params: Params
}
object ParamsReadonly {
  
  inline def apply[Params /* <: js.UndefOr[js.Object] */](params: Params): ParamsReadonly[Params] = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsReadonly[Params]]
  }
  
  extension [Self <: ParamsReadonly[?], Params /* <: js.UndefOr[js.Object] */](x: Self & ParamsReadonly[Params]) {
    
    inline def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
