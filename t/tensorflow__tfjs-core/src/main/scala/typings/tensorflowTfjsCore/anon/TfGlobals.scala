package typings.tensorflowTfjsCore.anon

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TfGlobals extends StObject {
  
  var _tfGlobals: Map[String, js.Any]
}
object TfGlobals {
  
  @scala.inline
  def apply(_tfGlobals: Map[String, js.Any]): TfGlobals = {
    val __obj = js.Dynamic.literal(_tfGlobals = _tfGlobals.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfGlobals]
  }
  
  @scala.inline
  implicit class TfGlobalsMutableBuilder[Self <: TfGlobals] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_tfGlobals(value: Map[String, js.Any]): Self = StObject.set(x, "_tfGlobals", value.asInstanceOf[js.Any])
  }
}
