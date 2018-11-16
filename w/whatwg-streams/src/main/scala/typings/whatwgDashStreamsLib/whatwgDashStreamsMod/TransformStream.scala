package typings
package whatwgDashStreamsLib.whatwgDashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("whatwg-streams", "TransformStream")
@js.native
class TransformStream[R, W] () extends WritableReadablePair[WritableStream[W], ReadableStream[R]] {
  def this(transformer: TransformStreamTransformer[R, W]) = this()
  def this(transformer: TransformStreamTransformer[R, W], writableStrategy: QueuingStrategy[W]) = this()
  def this(transformer: TransformStreamTransformer[R, W], writableStrategy: QueuingStrategy[W], readableStrategy: QueuingStrategy[R]) = this()
  /* CompleteClass */
  override var readable: ReadableStream[R] = js.native
  /* CompleteClass */
  override var writable: WritableStream[W] = js.native
}

