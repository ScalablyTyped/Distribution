package typings.typestubDashIpfs.typestubDashIpfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Peer extends js.Object {
  var addr: Multiaddr
  var peer: PeerInfo
}

object Peer {
  @scala.inline
  def apply(addr: Multiaddr, peer: PeerInfo): Peer = {
    val __obj = js.Dynamic.literal(addr = addr, peer = peer)
  
    __obj.asInstanceOf[Peer]
  }
}

