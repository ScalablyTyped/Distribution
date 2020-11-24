package typings.twilioSync.cacheMod

import typings.twilioSync.treeMod.TreeMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-sync/lib/cache", "Cache")
@js.native
class Cache[K, V] () extends js.Object {
  
  def delete(key: K, revision: Double): Unit = js.native
  def delete(key: K, revision: Double, force: Boolean): Unit = js.native
  
  def forEach(callbackfn: js.Function2[/* key */ K, /* value */ V, Unit]): Unit = js.native
  
  def get(key: K): V = js.native
  
  def has(key: K): Boolean = js.native
  
  def isKnown(key: K, revision: Double): Boolean = js.native
  
  val items: TreeMap[K, CacheEntry[V]] = js.native
  
  def store(key: K, value: V, revision: Double): V = js.native
}
