package typings.xstream

import typings.xstream.xstreamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstream/extra/pairwise", JSImport.Namespace)
@js.native
object extraPairwiseMod extends js.Object {
  def default[T](ins: Stream[T]): Stream[js.Tuple2[T, T]] = js.native
}

