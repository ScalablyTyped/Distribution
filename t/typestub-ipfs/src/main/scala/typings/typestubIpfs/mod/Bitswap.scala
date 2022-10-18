package typings.typestubIpfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bitswap extends StObject {
  
  def stat(): js.Promise[Stat] = js.native
  def stat(callback: Callback[Stat]): Unit = js.native
  
  def unwant(keys: js.Array[KeyType]): js.Promise[Any] = js.native
  def unwant(keys: js.Array[KeyType], callback: Callback[Any]): Unit = js.native
  def unwant(keys: KeyType): js.Promise[Any] = js.native
  def unwant(keys: KeyType, callback: Callback[Any]): Unit = js.native
  
  def wantlist(): js.Promise[WantList] = js.native
  def wantlist(callback: Callback[WantList]): Unit = js.native
  def wantlist(peerId: String): js.Promise[WantList] = js.native
  def wantlist(peerId: String, callback: Callback[WantList]): Unit = js.native
}
