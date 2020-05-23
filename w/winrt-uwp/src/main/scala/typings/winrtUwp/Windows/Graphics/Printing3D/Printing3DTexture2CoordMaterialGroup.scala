package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a group of 2D texture materials used in the 3D model. */
trait Printing3DTexture2CoordMaterialGroup extends js.Object {
  /** Gets the identifier (ID) of the 2D texture material group. */
  var materialGroupId: Double
  /** Gets or sets the texture of the material group. */
  var texture: Printing3DModelTexture
  /** Gets a group of 2D texture materials used in the 3D model. */
  var texture2Coords: IVector[Printing3DTexture2CoordMaterial]
}

object Printing3DTexture2CoordMaterialGroup {
  @scala.inline
  def apply(
    materialGroupId: Double,
    texture: Printing3DModelTexture,
    texture2Coords: IVector[Printing3DTexture2CoordMaterial]
  ): Printing3DTexture2CoordMaterialGroup = {
    val __obj = js.Dynamic.literal(materialGroupId = materialGroupId.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any], texture2Coords = texture2Coords.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DTexture2CoordMaterialGroup]
  }
}

