package typings.yadda.convertersMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda/lib/converters", "pass_through")
@js.native
object passThrough extends js.Object {
  def apply(value: String, next: js.Function2[/* err */ Error | Null, /* value */ String, Unit]): Unit = js.native
}

