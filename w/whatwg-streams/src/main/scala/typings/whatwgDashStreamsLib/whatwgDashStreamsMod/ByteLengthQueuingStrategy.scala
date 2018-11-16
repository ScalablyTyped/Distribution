package typings
package whatwgDashStreamsLib.whatwgDashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("whatwg-streams", "ByteLengthQueuingStrategy")
@js.native
class ByteLengthQueuingStrategy[T] protected () extends js.Object {
  def this(hasHighWaterMark: whatwgDashStreamsLib.Anon_HighWaterMark) = this()
  def size(chunk: T): js.UndefOr[scala.Double] = js.native
}

