package typings.webix.mod

import typings.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Date extends StObject {
  
  def add(date: Any, inc: Double, mode: String, copy: Boolean): Any = js.native
  
  def copy(date: Any): Any = js.native
  
  def datePart(date: Any, copy: Boolean): Any = js.native
  
  def dateToStr(format: String, utc: Boolean): WebixCallback = js.native
  
  def dayStart(date: Any): Any = js.native
  
  def equal(datea: Any, dateb: Any): Boolean = js.native
  
  def getISOWeek(date: Any): Double = js.native
  
  def getUTCISOWeek(date: Any): Double = js.native
  
  def isHoliday(date: Any): Boolean = js.native
  
  def monthStart(date: Any): Any = js.native
  
  var startOnMonday: Boolean = js.native
  
  def strToDate(format: String, utc: Boolean): WebixCallback = js.native
  
  def timePart(date: Any): Double = js.native
  
  def toFixed(num: String): Double | String = js.native
  def toFixed(num: Double): Double | String = js.native
  
  def weekStart(date: Any): Any = js.native
  
  def yearStart(date: Any): Any = js.native
}
object Date {
  
  inline def apply: Date = ^.asInstanceOf[js.Dynamic].selectDynamic("Date").asInstanceOf[Date]
}
