package typings
package virtualDashDomLib.VirtualDOMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Thunk extends js.Object {
  var `type`: java.lang.String
   // 'Thunk'
  var vnode: VTree
  def render(previous: VTree): VTree
}

