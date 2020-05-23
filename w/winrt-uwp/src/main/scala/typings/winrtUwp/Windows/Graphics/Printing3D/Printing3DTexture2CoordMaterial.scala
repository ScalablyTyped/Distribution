package typings.winrtUwp.Windows.Graphics.Printing3D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a 2D texture material used in the 3D model. */
trait Printing3DTexture2CoordMaterial extends js.Object {
  /** Gets or sets the texture used in the 2D texture material. */
  var texture: Printing3DModelTexture
  /** Gets or sets the U-coordinate within the texture, horizontally right from the origin in the upper left of the texture. */
  var u: Double
  /** Gets or sets the V-coordinate within the texture, vertically down from the origin in the upper left of the texture. */
  var v: Double
}

object Printing3DTexture2CoordMaterial {
  @scala.inline
  def apply(texture: Printing3DModelTexture, u: Double, v: Double): Printing3DTexture2CoordMaterial = {
    val __obj = js.Dynamic.literal(texture = texture.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DTexture2CoordMaterial]
  }
}

