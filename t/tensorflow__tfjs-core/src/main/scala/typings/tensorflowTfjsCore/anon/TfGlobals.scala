package typings.tensorflowTfjsCore.anon

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TfGlobals extends StObject {
  
  var _tfGlobals: Map[String, _] = js.native
}
object TfGlobals {
  
  @scala.inline
  def apply(_tfGlobals: Map[String, _]): TfGlobals = {
    val __obj = js.Dynamic.literal(_tfGlobals = _tfGlobals.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfGlobals]
  }
  
  @scala.inline
  implicit class TfGlobalsMutableBuilder[Self <: TfGlobals] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_tfGlobals(value: Map[String, _]): Self = StObject.set(x, "_tfGlobals", value.asInstanceOf[js.Any])
  }
}
