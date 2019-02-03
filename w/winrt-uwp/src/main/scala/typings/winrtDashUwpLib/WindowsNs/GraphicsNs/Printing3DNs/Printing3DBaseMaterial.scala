package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the base material used for manufacturing certain objects in the 3D model. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DBaseMaterial")
@js.native
/** Creates an instance of the Printing3DBaseMaterial class. */
class Printing3DBaseMaterial () extends js.Object {
  /** Gets or sets the color of the base material. */
  var color: Printing3DColorMaterial = js.native
  /** Gets or sets the name of the base material. */
  var name: java.lang.String = js.native
}

/* static members */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DBaseMaterial")
@js.native
object Printing3DBaseMaterial extends js.Object {
  /** Gets the name the acrylonitrile butadiene styrene (ABS) thermoplastic used in the base material. */
  var abs: java.lang.String = js.native
  /** Gets the name the polylactic acid (PLA) thermoplastic used in the base material. */
  var pla: java.lang.String = js.native
}

