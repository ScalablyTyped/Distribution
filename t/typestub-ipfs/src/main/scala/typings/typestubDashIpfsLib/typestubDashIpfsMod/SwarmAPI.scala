package typings
package typestubDashIpfsLib.typestubDashIpfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwarmAPI extends js.Object {
  def addrs(): js.Promise[js.Array[PeerInfo]] = js.native
  def addrs(callback: Callback[js.Array[PeerInfo]]): scala.Unit = js.native
  def connect(maddr: java.lang.String): js.Promise[_] = js.native
  def connect(maddr: java.lang.String, callback: Callback[_]): scala.Unit = js.native
  def connect(maddr: Multiaddr): js.Promise[_] = js.native
  def connect(maddr: Multiaddr, callback: Callback[_]): scala.Unit = js.native
  def disconnect(maddr: java.lang.String): js.Promise[_] = js.native
  def disconnect(maddr: java.lang.String, callback: Callback[_]): scala.Unit = js.native
  def disconnect(maddr: Multiaddr): js.Promise[_] = js.native
  def disconnect(maddr: Multiaddr, callback: Callback[_]): scala.Unit = js.native
  def filters(callback: Callback[scala.Unit]): scala.Nothing = js.native
  def localAddrs(): js.Promise[js.Array[Multiaddr]] = js.native
  def localAddrs(callback: Callback[js.Array[Multiaddr]]): scala.Unit = js.native
  def peers(): js.Promise[js.Array[Peer]] = js.native
  def peers(callback: Callback[js.Array[Peer]]): scala.Unit = js.native
  def peers(options: PeersOptions): js.Promise[js.Array[Peer]] = js.native
  def peers(options: PeersOptions, callback: Callback[js.Array[Peer]]): scala.Unit = js.native
}

