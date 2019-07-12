package typings
package atWordpressDateLib.atWordpressDateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/date", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def date(dateFormat: java.lang.String): java.lang.String = js.native
  def date(dateFormat: java.lang.String, dateValue: momentLib.momentMod.MomentInput): java.lang.String = js.native
  def dateI18n(dateFormat: java.lang.String): java.lang.String = js.native
  def dateI18n(dateFormat: java.lang.String, dateValue: momentLib.momentMod.MomentInput): java.lang.String = js.native
  def dateI18n(dateFormat: java.lang.String, dateValue: momentLib.momentMod.MomentInput, gmt: scala.Boolean): java.lang.String = js.native
  def format(dateFormat: java.lang.String): java.lang.String = js.native
  def format(dateFormat: java.lang.String, dateValue: momentLib.momentMod.MomentInput): java.lang.String = js.native
  def getDate(): stdLib.Date = js.native
  def getDate(dateValue: momentLib.momentMod.MomentInput): stdLib.Date = js.native
  def gmdate(dateFormat: java.lang.String): java.lang.String = js.native
  def gmdate(dateFormat: java.lang.String, dateValue: momentLib.momentMod.MomentInput): java.lang.String = js.native
  def isInTheFuture(dateValue: momentLib.momentMod.MomentInput): scala.Boolean = js.native
  def setSettings(dateSettings: DateSettings): scala.Unit = js.native
}

