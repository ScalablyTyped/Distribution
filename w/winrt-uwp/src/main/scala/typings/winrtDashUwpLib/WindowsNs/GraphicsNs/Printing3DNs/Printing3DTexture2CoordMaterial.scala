package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a 2D texture material used in the 3D model. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DTexture2CoordMaterial")
@js.native
class Printing3DTexture2CoordMaterial () extends js.Object {
  /** Gets or sets the texture used in the 2D texture material. */
  var texture: Printing3DModelTexture = js.native
  /** Gets or sets the U-coordinate within the texture, horizontally right from the origin in the upper left of the texture. */
  var u: scala.Double = js.native
  /** Gets or sets the V-coordinate within the texture, vertically down from the origin in the upper left of the texture. */
  var v: scala.Double = js.native
}

