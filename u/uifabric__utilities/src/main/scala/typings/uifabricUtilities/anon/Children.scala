package typings.uifabricUtilities.anon

import typings.uifabricUtilities.ivirtualelementMod.IVirtualElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children extends js.Object {
  var children: js.Array[IVirtualElement]
  var parent: js.UndefOr[IVirtualElement] = js.undefined
}

object Children {
  @scala.inline
  def apply(children: js.Array[IVirtualElement], parent: IVirtualElement = null): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
}

