package typings.xstream

import typings.xstream.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstream/extra/concat", JSImport.Namespace)
@js.native
object concatMod extends js.Object {
  def default[T](streams: Stream[T]*): Stream[T] = js.native
}

