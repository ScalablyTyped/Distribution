package typings
package winrtDashUwpLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the accumulated transformations for the current manipulation. */
trait ManipulationDelta extends js.Object {
  /** The change in distance between touch contacts, as DIPs. For example, if the distance between two contacts changes from 100 DIPs to 200 DIPs during a manipulation, the value of Expansion would be 100.0. */
  var expansion: scala.Double
  /** The change in angle of rotation, in degrees. */
  var rotation: scala.Double
  /** The change in distance between touch contacts, as a percentage. For example, if the distance between two contacts changes from 100 DIPs to 200 DIPs during a manipulation, the value of Scale would be 1.0. */
  var scale: scala.Double
  /** The change in x-y screen coordinates, in DIPs. */
  var translation: winrtDashUwpLib.WindowsNs.FoundationNs.Point
}

object ManipulationDelta {
  @scala.inline
  def apply(
    expansion: scala.Double,
    rotation: scala.Double,
    scale: scala.Double,
    translation: winrtDashUwpLib.WindowsNs.FoundationNs.Point
  ): ManipulationDelta = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expansion")(expansion)
    __obj.updateDynamic("rotation")(rotation)
    __obj.updateDynamic("scale")(scale)
    __obj.updateDynamic("translation")(translation)
    __obj.asInstanceOf[ManipulationDelta]
  }
}

