package typings.typestubIpfs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bitswap extends js.Object {
  def stat(): js.Promise[Stat] = js.native
  def stat(callback: Callback[Stat]): Unit = js.native
  def unwant(keys: js.Array[KeyType]): js.Promise[_] = js.native
  def unwant(keys: js.Array[KeyType], callback: Callback[_]): Unit = js.native
  def unwant(keys: KeyType): js.Promise[_] = js.native
  def unwant(keys: KeyType, callback: Callback[_]): Unit = js.native
  def wantlist(): js.Promise[WantList] = js.native
  def wantlist(callback: Callback[WantList]): Unit = js.native
  def wantlist(peerId: String): js.Promise[WantList] = js.native
  def wantlist(peerId: String, callback: Callback[WantList]): Unit = js.native
}

