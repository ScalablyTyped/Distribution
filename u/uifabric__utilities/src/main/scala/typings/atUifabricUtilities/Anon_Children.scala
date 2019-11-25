package typings.atUifabricUtilities

import typings.atUifabricUtilities.libDomIVirtualElementMod.IVirtualElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: js.Array[IVirtualElement]
  var parent: js.UndefOr[IVirtualElement] = js.undefined
}

object Anon_Children {
  @scala.inline
  def apply(children: js.Array[IVirtualElement], parent: IVirtualElement = null): Anon_Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Children]
  }
}

