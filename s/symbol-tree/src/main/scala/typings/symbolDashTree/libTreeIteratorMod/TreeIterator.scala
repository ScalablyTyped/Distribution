package typings.symbolDashTree.libTreeIteratorMod

import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeIterator[T /* <: js.Object */] extends IterableIterator[T] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator_TreeIterator: js.Function0[this.type] = js.native
  def next(): TreeIteratorResult[T] = js.native
}

