package typings.writableConsumableStream.consumerMod

import typings.std.IteratorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("writable-consumable-stream/consumer", JSImport.Namespace)
@js.native
class ^[T] protected () extends Consumer[T] {
  def this(stream: typings.writableConsumableStream.mod.^[T], id: Double, startNode: Node[T], timeout: Double) = this()
  /* CompleteClass */
  override def next(): js.Promise[IteratorResult[T, _]] = js.native
  /* CompleteClass */
  override def `return`(): Unit = js.native
}

