package typings.tensorflowTfjsCore.anon

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TfGlobals extends StObject {
  
  var _tfGlobals: Map[String, Any]
}
object TfGlobals {
  
  inline def apply(_tfGlobals: Map[String, Any]): TfGlobals = {
    val __obj = js.Dynamic.literal(_tfGlobals = _tfGlobals.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfGlobals]
  }
  
  extension [Self <: TfGlobals](x: Self) {
    
    inline def set_tfGlobals(value: Map[String, Any]): Self = StObject.set(x, "_tfGlobals", value.asInstanceOf[js.Any])
  }
}
