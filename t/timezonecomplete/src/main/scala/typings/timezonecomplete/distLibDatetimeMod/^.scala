package typings.timezonecomplete.distLibDatetimeMod

import typings.timezonecomplete.distLibTimezoneMod.TimeZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete/dist/lib/datetime", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def isDateTime(value: js.Any): /* is timezonecomplete.timezonecomplete/dist/lib/datetime.DateTime */ Boolean = js.native
  def now(): DateTime = js.native
  def now(timeZone: TimeZone): DateTime = js.native
  def nowLocal(): DateTime = js.native
  def nowUtc(): DateTime = js.native
}

