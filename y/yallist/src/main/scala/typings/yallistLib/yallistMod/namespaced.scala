package typings
package yallistLib.yallistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yallist", JSImport.Namespace)
@js.native
class namespaced[T] () extends Yallist[T] {
  def this(items: T*) = this()
  def this(list: yallistLib.yallistMod.YallistNs.ForEachIterable[T]) = this()
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  override var iterator: js.Function0[stdLib.Iterator[T]] = js.native
}

@JSImport("yallist", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  @JSName("Node")
  var Node_Original: yallistLib.yallistMod.YallistNs.NodeConstructor = js.native
  def Node[T](value: T): yallistLib.yallistMod.YallistNs.Node[T] = js.native
  def Node[T](value: T, prev: yallistLib.yallistMod.YallistNs.Node[T]): yallistLib.yallistMod.YallistNs.Node[T] = js.native
  def Node[T](
    value: T,
    prev: yallistLib.yallistMod.YallistNs.Node[T],
    next: yallistLib.yallistMod.YallistNs.Node[T]
  ): yallistLib.yallistMod.YallistNs.Node[T] = js.native
  def Node[T](
    value: T,
    prev: yallistLib.yallistMod.YallistNs.Node[T],
    next: yallistLib.yallistMod.YallistNs.Node[T],
    list: yallistLib.yallistMod.Yallist[T]
  ): yallistLib.yallistMod.YallistNs.Node[T] = js.native
  def create[T](): yallistLib.yallistMod.Yallist[T] = js.native
  def create[T](items: T*): yallistLib.yallistMod.Yallist[T] = js.native
  def create[T](list: yallistLib.yallistMod.YallistNs.ForEachIterable[T]): yallistLib.yallistMod.Yallist[T] = js.native
}

