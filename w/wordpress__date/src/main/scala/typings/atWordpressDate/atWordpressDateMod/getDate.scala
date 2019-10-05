package typings.atWordpressDate.atWordpressDateMod

import typings.moment.momentMod.MomentInput
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/date", "getDate")
@js.native
object getDate extends js.Object {
  def apply(): Date = js.native
  def apply(dateValue: MomentInput): Date = js.native
}

