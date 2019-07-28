package typings.yadda.yaddaMod

import typings.std.Date
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda", "converters")
@js.native
object convertersNs extends js.Object {
  def date(value: String, next: js.Function2[/* err */ Error | Null, /* value */ Date, Unit]): Unit = js.native
  def float(value: String, next: js.Function2[/* err */ Error | Null, /* value */ Double, Unit]): Unit = js.native
  def integer(value: String, next: js.Function2[/* err */ Error | Null, /* value */ Double, Unit]): Unit = js.native
  def list(value: String, next: js.Function2[/* err */ Error | Null, /* value */ js.Array[String], Unit]): Unit = js.native
  def pass_through(value: String, next: js.Function2[/* err */ Error | Null, /* value */ String, Unit]): Unit = js.native
  def table(value: String, next: js.Function2[/* err */ Error | Null, /* value */ js.Array[String], Unit]): Unit = js.native
}

