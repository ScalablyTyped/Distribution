package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a group of color materials used in the 3D model. */
trait Printing3DColorMaterialGroup extends js.Object {
  /** Gets a group of color materials used in the 3D model. */
  var colors: IVector[Printing3DColorMaterial]
  /** Gets the identifier (ID) for the color material group. */
  var materialGroupId: Double
}

object Printing3DColorMaterialGroup {
  @scala.inline
  def apply(colors: IVector[Printing3DColorMaterial], materialGroupId: Double): Printing3DColorMaterialGroup = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], materialGroupId = materialGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DColorMaterialGroup]
  }
}

