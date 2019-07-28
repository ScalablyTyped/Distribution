package typings.atWordpressDate.atWordpressDateMod

import typings.moment.momentMod.MomentInput
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/date", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def date(dateFormat: String): String = js.native
  def date(dateFormat: String, dateValue: MomentInput): String = js.native
  def dateI18n(dateFormat: String): String = js.native
  def dateI18n(dateFormat: String, dateValue: MomentInput): String = js.native
  def dateI18n(dateFormat: String, dateValue: MomentInput, gmt: Boolean): String = js.native
  def format(dateFormat: String): String = js.native
  def format(dateFormat: String, dateValue: MomentInput): String = js.native
  def getDate(): Date = js.native
  def getDate(dateValue: MomentInput): Date = js.native
  def gmdate(dateFormat: String): String = js.native
  def gmdate(dateFormat: String, dateValue: MomentInput): String = js.native
  def isInTheFuture(dateValue: MomentInput): Boolean = js.native
  def setSettings(dateSettings: DateSettings): Unit = js.native
}

