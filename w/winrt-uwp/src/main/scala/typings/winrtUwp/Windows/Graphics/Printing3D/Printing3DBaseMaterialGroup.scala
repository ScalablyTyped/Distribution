package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a group of base materials used in the 3D model. */
trait Printing3DBaseMaterialGroup extends js.Object {
  /** Gets a group of base materials used in the 3D model. */
  var bases: IVector[Printing3DBaseMaterial]
  /** Gets the identifier (ID) of the base material group. */
  var materialGroupId: Double
}

object Printing3DBaseMaterialGroup {
  @scala.inline
  def apply(bases: IVector[Printing3DBaseMaterial], materialGroupId: Double): Printing3DBaseMaterialGroup = {
    val __obj = js.Dynamic.literal(bases = bases.asInstanceOf[js.Any], materialGroupId = materialGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DBaseMaterialGroup]
  }
}

