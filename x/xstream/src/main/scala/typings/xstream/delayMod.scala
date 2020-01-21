package typings.xstream

import typings.xstream.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstream/extra/delay", JSImport.Namespace)
@js.native
object delayMod extends js.Object {
  def default[T](period: Double): js.Function1[/* ins */ Stream[T], Stream[T]] = js.native
}

