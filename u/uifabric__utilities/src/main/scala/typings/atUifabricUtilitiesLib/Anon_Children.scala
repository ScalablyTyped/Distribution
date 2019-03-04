package typings
package atUifabricUtilitiesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: js.Array[atUifabricUtilitiesLib.libDomIVirtualElementMod.IVirtualElement]
  var parent: js.UndefOr[atUifabricUtilitiesLib.libDomIVirtualElementMod.IVirtualElement] = js.undefined
}

object Anon_Children {
  @scala.inline
  def apply(
    children: js.Array[atUifabricUtilitiesLib.libDomIVirtualElementMod.IVirtualElement],
    parent: atUifabricUtilitiesLib.libDomIVirtualElementMod.IVirtualElement = null
  ): Anon_Children = {
    val __obj = js.Dynamic.literal(children = children)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[Anon_Children]
  }
}

