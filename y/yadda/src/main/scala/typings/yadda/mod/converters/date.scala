package typings.yadda.mod.converters

import typings.std.Date
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda", "converters.date")
@js.native
object date extends js.Object {
  def apply(value: String, next: js.Function2[/* err */ Error | Null, /* value */ Date, Unit]): Unit = js.native
}

