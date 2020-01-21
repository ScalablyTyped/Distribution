package typings.uifabricUtilities

import typings.uifabricUtilities.ivirtualelementMod.IVirtualElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: js.Array[IVirtualElement]
  var parent: js.UndefOr[IVirtualElement] = js.undefined
}

object AnonChildren {
  @scala.inline
  def apply(children: js.Array[IVirtualElement], parent: IVirtualElement = null): AnonChildren = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren]
  }
}

