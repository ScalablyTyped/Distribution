package typings
package typestubDashIpfsLib.typestubDashIpfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bitswap extends js.Object {
  def stat(): js.Promise[Stat] = js.native
  def stat(callback: Callback[Stat]): scala.Unit = js.native
  def unwant(keys: js.Array[KeyType]): js.Promise[_] = js.native
  def unwant(keys: js.Array[KeyType], callback: Callback[_]): scala.Unit = js.native
  def unwant(keys: KeyType): js.Promise[_] = js.native
  def unwant(keys: KeyType, callback: Callback[_]): scala.Unit = js.native
  def wantlist(): js.Promise[WantList] = js.native
  def wantlist(callback: Callback[WantList]): scala.Unit = js.native
  def wantlist(peerId: java.lang.String): js.Promise[WantList] = js.native
  def wantlist(peerId: java.lang.String, callback: Callback[WantList]): scala.Unit = js.native
}

