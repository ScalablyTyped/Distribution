package typings.atWordpressDate.atWordpressDateMod

import typings.moment.momentMod.MomentInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/date", "format")
@js.native
object format extends js.Object {
  def apply(dateFormat: String): String = js.native
  def apply(dateFormat: String, dateValue: MomentInput): String = js.native
}

