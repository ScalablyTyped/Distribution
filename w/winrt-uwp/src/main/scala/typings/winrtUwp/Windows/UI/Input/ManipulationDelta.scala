package typings.winrtUwp.Windows.UI.Input

import typings.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the accumulated transformations for the current manipulation. */
@js.native
trait ManipulationDelta extends js.Object {
  
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
  implicit class ManipulationDeltaOps[Self <: ManipulationDelta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExpansion(value: Double): Self = this.set("expansion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslation(value: Point): Self = this.set("translation", value.asInstanceOf[js.Any])
  }
}
