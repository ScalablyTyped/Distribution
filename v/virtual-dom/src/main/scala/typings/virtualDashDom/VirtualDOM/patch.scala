package typings.virtualDashDom.VirtualDOM

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("VirtualDOM.patch")
@js.native
object patch extends js.Object {
  /**
    patch() usually just returns rootNode after doing stuff to it, so we want
    to preserve that type (though it will usually be just Element).
    */
  def apply[T /* <: Element */](rootNode: T, patches: js.Array[VPatch]): T = js.native
  def apply[T /* <: Element */](rootNode: T, patches: js.Array[VPatch], renderOptions: VPatchOptions[T]): T = js.native
}

