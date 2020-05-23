package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents all material resources in the 3D model. */
trait Printing3DMaterial extends js.Object {
  /** Gets all base material groups used in the 3D model. */
  var baseGroups: IVector[Printing3DBaseMaterialGroup]
  /** Gets all color material groups used in the 3D model. */
  var colorGroups: IVector[Printing3DColorMaterialGroup]
  /** Gets all composite material groups used in the 3D model. */
  var compositeGroups: IVector[Printing3DCompositeMaterialGroup]
  /** Gets all multi-property groups used in the 3D model. */
  var multiplePropertyGroups: IVector[Printing3DMultiplePropertyMaterialGroup]
  /** Gets all 2D texture material groups used in the 3D model. */
  var texture2CoordGroups: IVector[Printing3DTexture2CoordMaterialGroup]
}

object Printing3DMaterial {
  @scala.inline
  def apply(
    baseGroups: IVector[Printing3DBaseMaterialGroup],
    colorGroups: IVector[Printing3DColorMaterialGroup],
    compositeGroups: IVector[Printing3DCompositeMaterialGroup],
    multiplePropertyGroups: IVector[Printing3DMultiplePropertyMaterialGroup],
    texture2CoordGroups: IVector[Printing3DTexture2CoordMaterialGroup]
  ): Printing3DMaterial = {
    val __obj = js.Dynamic.literal(baseGroups = baseGroups.asInstanceOf[js.Any], colorGroups = colorGroups.asInstanceOf[js.Any], compositeGroups = compositeGroups.asInstanceOf[js.Any], multiplePropertyGroups = multiplePropertyGroups.asInstanceOf[js.Any], texture2CoordGroups = texture2CoordGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DMaterial]
  }
}

