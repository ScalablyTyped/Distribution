package typings.sugar.sugarjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locale extends js.Object {
  def addFormat(src: String): Unit = js.native
  def addFormat(src: String, to: js.Array[String]): Unit = js.native
  def getDuration(ms: Double): String = js.native
  def getFirstDayOfWeek(): Double = js.native
  def getFirstDayOfWeekYear(): Double = js.native
  def getMonthName(n: Double): String = js.native
  def getWeekdayName(n: Double): String = js.native
}

