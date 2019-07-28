package typings.typestubDashIpfs.typestubDashIpfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwarmAPI extends js.Object {
  def addrs(): js.Promise[js.Array[PeerInfo]] = js.native
  def addrs(callback: Callback[js.Array[PeerInfo]]): Unit = js.native
  def connect(maddr: String): js.Promise[_] = js.native
  def connect(maddr: String, callback: Callback[_]): Unit = js.native
  def connect(maddr: Multiaddr): js.Promise[_] = js.native
  def connect(maddr: Multiaddr, callback: Callback[_]): Unit = js.native
  def disconnect(maddr: String): js.Promise[_] = js.native
  def disconnect(maddr: String, callback: Callback[_]): Unit = js.native
  def disconnect(maddr: Multiaddr): js.Promise[_] = js.native
  def disconnect(maddr: Multiaddr, callback: Callback[_]): Unit = js.native
  def filters(callback: Callback[Unit]): scala.Nothing = js.native
  def localAddrs(): js.Promise[js.Array[Multiaddr]] = js.native
  def localAddrs(callback: Callback[js.Array[Multiaddr]]): Unit = js.native
  def peers(): js.Promise[js.Array[Peer]] = js.native
  def peers(callback: Callback[js.Array[Peer]]): Unit = js.native
  def peers(options: PeersOptions): js.Promise[js.Array[Peer]] = js.native
  def peers(options: PeersOptions, callback: Callback[js.Array[Peer]]): Unit = js.native
}

