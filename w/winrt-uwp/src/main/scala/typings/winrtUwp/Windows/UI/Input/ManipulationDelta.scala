package typings.winrtUwp.Windows.UI.Input

import typings.winrtUwp.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the accumulated transformations for the current manipulation. */
@js.native
trait ManipulationDelta extends StObject {
  
  /** The change in distance between touch contacts, as DIPs. For example, if the distance between two contacts changes from 100 DIPs to 200 DIPs during a manipulation, the value of Expansion would be 100.0. */
  var expansion: Double = js.native
  
  /** The change in angle of rotation, in degrees. */
  var rotation: Double = js.native
  
  /** The change in distance between touch contacts, as a percentage. For example, if the distance between two contacts changes from 100 DIPs to 200 DIPs during a manipulation, the value of Scale would be 1.0. */
  var scale: Double = js.native
  
  /** The change in x-y screen coordinates, in DIPs. */
  var translation: Point = js.native
}
object ManipulationDelta {
  
  @scala.inline
  def apply(expansion: Double, rotation: Double, scale: Double, translation: Point): ManipulationDelta = {
    val __obj = js.Dynamic.literal(expansion = expansion.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], translation = translation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManipulationDelta]
  }
  
  @scala.inline
  implicit class ManipulationDeltaMutableBuilder[Self <: ManipulationDelta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpansion(value: Double): Self = StObject.set(x, "expansion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslation(value: Point): Self = StObject.set(x, "translation", value.asInstanceOf[js.Any])
  }
}
