package typings.symbolTree.treeIteratorMod

import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeIterator[T /* <: js.Object */] extends IterableIterator[T] {
  
  @JSName(js.Symbol.iterator)
  var iterator_TreeIterator: js.Function0[this.type] = js.native
  
  def next(): TreeIteratorResult[T] = js.native
}
