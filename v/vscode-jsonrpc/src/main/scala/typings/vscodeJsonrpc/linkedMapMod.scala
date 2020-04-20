package typings.vscodeJsonrpc

import typings.vscodeJsonrpc.vscodeJsonrpcNumbers.`0`
import typings.vscodeJsonrpc.vscodeJsonrpcNumbers.`1`
import typings.vscodeJsonrpc.vscodeJsonrpcNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/linkedMap", JSImport.Namespace)
@js.native
object linkedMapMod extends js.Object {
  @js.native
  class LinkedMap[K, V] () extends js.Object {
    var _head: js.Any = js.native
    var _map: js.Any = js.native
    var _size: js.Any = js.native
    var _tail: js.Any = js.native
    var addItemFirst: js.Any = js.native
    var addItemLast: js.Any = js.native
    var removeItem: js.Any = js.native
    var touch: js.Any = js.native
    def clear(): Unit = js.native
    def delete(key: K): Boolean = js.native
    def forEach(callbackfn: js.Function3[/* value */ V, /* key */ K, /* map */ LinkedMap[K, V], Unit]): Unit = js.native
    def forEach(
      callbackfn: js.Function3[/* value */ V, /* key */ K, /* map */ LinkedMap[K, V], Unit],
      thisArg: js.Any
    ): Unit = js.native
    def forEachReverse(callbackfn: js.Function3[/* value */ V, /* key */ K, /* map */ LinkedMap[K, V], Unit]): Unit = js.native
    def forEachReverse(
      callbackfn: js.Function3[/* value */ V, /* key */ K, /* map */ LinkedMap[K, V], Unit],
      thisArg: js.Any
    ): Unit = js.native
    def get(key: K): js.UndefOr[V] = js.native
    def has(key: K): Boolean = js.native
    def isEmpty(): Boolean = js.native
    def keys(): js.Array[K] = js.native
    def set(key: K, value: V): Unit = js.native
    def set(key: K, value: V, touch: Touch): Unit = js.native
    def shift(): js.UndefOr[V] = js.native
    def size: Double = js.native
    def values(): js.Array[V] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vscodeJsonrpc.vscodeJsonrpcNumbers.`0`
    - typings.vscodeJsonrpc.vscodeJsonrpcNumbers.`1`
    - typings.vscodeJsonrpc.vscodeJsonrpcNumbers.`2`
  */
  trait Touch extends js.Object
  
  @js.native
  object Touch extends js.Object {
    val First: `1` = js.native
    val Last: `2` = js.native
    val None: `0` = js.native
  }
  
}

