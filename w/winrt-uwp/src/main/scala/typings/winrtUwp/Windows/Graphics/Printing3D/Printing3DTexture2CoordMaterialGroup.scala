package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a group of 2D texture materials used in the 3D model. */
@js.native
trait Printing3DTexture2CoordMaterialGroup extends js.Object {
  /** Gets the identifier (ID) of the 2D texture material group. */
  var materialGroupId: Double = js.native
  /** Gets or sets the texture of the material group. */
  var texture: Printing3DModelTexture = js.native
  /** Gets a group of 2D texture materials used in the 3D model. */
  var texture2Coords: IVector[Printing3DTexture2CoordMaterial] = js.native
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
  @scala.inline
  implicit class Printing3DTexture2CoordMaterialGroupOps[Self <: Printing3DTexture2CoordMaterialGroup] (val x: Self) extends AnyVal {
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
    def setMaterialGroupId(value: Double): Self = this.set("materialGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTexture(value: Printing3DModelTexture): Self = this.set("texture", value.asInstanceOf[js.Any])
    @scala.inline
    def setTexture2Coords(value: IVector[Printing3DTexture2CoordMaterial]): Self = this.set("texture2Coords", value.asInstanceOf[js.Any])
  }
  
}

