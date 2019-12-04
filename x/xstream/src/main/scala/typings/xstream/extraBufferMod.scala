package typings.xstream

import typings.xstream.xstreamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstream/extra/buffer", JSImport.Namespace)
@js.native
object extraBufferMod extends js.Object {
  def default[T](s: Stream[_]): js.Function1[/* ins */ Stream[T], Stream[js.Array[T]]] = js.native
}

