package typings.whatwgDashStreams.whatwgDashStreamsMod

import typings.whatwgDashStreams.Anon_HighWaterMark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("whatwg-streams", "ByteLengthQueuingStrategy")
@js.native
class ByteLengthQueuingStrategy[T] protected () extends js.Object {
  def this(hasHighWaterMark: Anon_HighWaterMark) = this()
  def size(chunk: T): js.UndefOr[Double] = js.native
}

