package typings.uniqid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonProcess extends js.Object {
  @JSName("process")
  var process_Original: js.Function1[/* prefix */ js.UndefOr[String], String] = js.native
  @JSName("time")
  var time_Original: js.Function1[/* prefix */ js.UndefOr[String], String] = js.native
  def process(): String = js.native
  def process(prefix: String): String = js.native
  def time(): String = js.native
  def time(prefix: String): String = js.native
}

