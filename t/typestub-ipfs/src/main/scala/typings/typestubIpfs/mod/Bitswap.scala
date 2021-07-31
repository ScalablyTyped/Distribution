package typings.typestubIpfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bitswap extends StObject {
  
  def stat(): js.Promise[Stat] = js.native
  def stat(callback: Callback[Stat]): Unit = js.native
  
  def unwant(keys: js.Array[KeyType]): js.Promise[js.Any] = js.native
  def unwant(keys: js.Array[KeyType], callback: Callback[js.Any]): Unit = js.native
  def unwant(keys: KeyType): js.Promise[js.Any] = js.native
  def unwant(keys: KeyType, callback: Callback[js.Any]): Unit = js.native
  
  def wantlist(): js.Promise[WantList] = js.native
  def wantlist(callback: Callback[WantList]): Unit = js.native
  def wantlist(peerId: String): js.Promise[WantList] = js.native
  def wantlist(peerId: String, callback: Callback[WantList]): Unit = js.native
}
