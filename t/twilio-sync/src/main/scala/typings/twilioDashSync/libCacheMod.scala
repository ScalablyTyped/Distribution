package typings.twilioDashSync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync/lib/cache", JSImport.Namespace)
@js.native
object libCacheMod extends js.Object {
  @js.native
  class Cache[K, V] () extends js.Object {
    var items: js.Any = js.native
    def delete(key: K, revision: Double): Unit = js.native
    def get(key: K): V = js.native
    def has(key: K): Boolean = js.native
    def isKnown(key: K, revision: Double): Boolean = js.native
    def store(key: K, value: V, revision: Double): V = js.native
  }
  
  @js.native
  class default[K, V] () extends Cache[K, V]
  
}

