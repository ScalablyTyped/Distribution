package typings
package typestubDashIpfsLib.typestubDashIpfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Multiaddr extends js.Object {
  var buffer: stdLib.Uint8Array
}

object Multiaddr {
  @scala.inline
  def apply(buffer: stdLib.Uint8Array): Multiaddr = {
    val __obj = js.Dynamic.literal(buffer = buffer)
  
    __obj.asInstanceOf[Multiaddr]
  }
}

