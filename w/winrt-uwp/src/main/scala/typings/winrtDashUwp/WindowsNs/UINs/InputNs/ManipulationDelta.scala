package typings.winrtDashUwp.WindowsNs.UINs.InputNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the accumulated transformations for the current manipulation. */
trait ManipulationDelta extends js.Object {
  /** The change in distance between touch contacts, as DIPs. For example, if the distance between two contacts changes from 100 DIPs to 200 DIPs during a manipulation, the value of Expansion would be 100.0. */
  var expansion: Double
  /** The change in angle of rotation, in degrees. */
  var rotation: Double
  /** The change in distance between touch contacts, as a percentage. For example, if the distance between two contacts changes from 100 DIPs to 200 DIPs during a manipulation, the value of Scale would be 1.0. */
  var scale: Double
  /** The change in x-y screen coordinates, in DIPs. */
  var translation: Point
}

object ManipulationDelta {
  @scala.inline
  def apply(expansion: Double, rotation: Double, scale: Double, translation: Point): ManipulationDelta = {
    val __obj = js.Dynamic.literal(expansion = expansion, rotation = rotation, scale = scale, translation = translation)
  
    __obj.asInstanceOf[ManipulationDelta]
  }
}

