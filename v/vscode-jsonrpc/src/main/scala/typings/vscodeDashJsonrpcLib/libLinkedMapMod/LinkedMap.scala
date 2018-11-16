package typings
package vscodeDashJsonrpcLib.libLinkedMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/linkedMap", "LinkedMap")
@js.native
class LinkedMap[K, V] () extends js.Object {
  var _head: js.Any = js.native
  var _map: js.Any = js.native
  var _size: js.Any = js.native
  var _tail: js.Any = js.native
  var addItemFirst: js.Any = js.native
  var addItemLast: js.Any = js.native
  var removeItem: js.Any = js.native
  val size: scala.Double = js.native
  var touch: js.Any = js.native
  def clear(): scala.Unit = js.native
  def delete(key: K): scala.Boolean = js.native
  def forEach(callbackfn: js.Function3[/* value */ V, /* key */ K, /* map */ LinkedMap[K, V], scala.Unit]): scala.Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ V, /* key */ K, /* map */ LinkedMap[K, V], scala.Unit],
    thisArg: js.Any
  ): scala.Unit = js.native
  def forEachReverse(callbackfn: js.Function3[/* value */ V, /* key */ K, /* map */ LinkedMap[K, V], scala.Unit]): scala.Unit = js.native
  def forEachReverse(
    callbackfn: js.Function3[/* value */ V, /* key */ K, /* map */ LinkedMap[K, V], scala.Unit],
    thisArg: js.Any
  ): scala.Unit = js.native
  def get(key: K): js.UndefOr[V] = js.native
  def has(key: K): scala.Boolean = js.native
  def isEmpty(): scala.Boolean = js.native
  def keys(): js.Array[K] = js.native
  def set(key: K, value: V): scala.Unit = js.native
  def set(key: K, value: V, touch: Touch): scala.Unit = js.native
  def shift(): js.UndefOr[V] = js.native
  def values(): js.Array[V] = js.native
}

