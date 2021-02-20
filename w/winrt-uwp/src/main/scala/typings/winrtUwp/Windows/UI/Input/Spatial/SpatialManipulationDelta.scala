package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpatialManipulationDelta extends StObject {
  
  var translation: js.Any = js.native
}
object SpatialManipulationDelta {
  
  @scala.inline
  def apply(translation: js.Any): SpatialManipulationDelta = {
    val __obj = js.Dynamic.literal(translation = translation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialManipulationDelta]
  }
  
  @scala.inline
  implicit class SpatialManipulationDeltaMutableBuilder[Self <: SpatialManipulationDelta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTranslation(value: js.Any): Self = StObject.set(x, "translation", value.asInstanceOf[js.Any])
  }
}
