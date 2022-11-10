package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebixDate extends StObject {
  
  def add(date: js.Date, inc: Double, mode: String): js.Date = js.native
  def add(date: js.Date, inc: Double, mode: String, copy: Boolean): js.Date = js.native
  
  def copy(date: js.Date): js.Date = js.native
  
  def datePart(date: js.Date): js.Date = js.native
  def datePart(date: js.Date, copy: Boolean): js.Date = js.native
  
  def dateToStr(format: String): WebixCallback = js.native
  def dateToStr(format: String, utc: Boolean): WebixCallback = js.native
  def dateToStr(format: WebixCallback): WebixCallback = js.native
  def dateToStr(format: WebixCallback, utc: Boolean): WebixCallback = js.native
  
  def dayStart(date: js.Date): js.Date = js.native
  
  def equal(datea: js.Date, dateb: js.Date): Boolean = js.native
  
  def getISOWeek(date: js.Date): Double = js.native
  
  def getUTCISOWeek(date: js.Date): Double = js.native
  
  def isHoliday(date: js.Date): Boolean = js.native
  
  def monthStart(date: js.Date): js.Date = js.native
  
  var startOnMonday: Boolean = js.native
  
  def strToDate(format: String): WebixCallback = js.native
  def strToDate(format: String, utc: Boolean): WebixCallback = js.native
  
  def timePart(date: js.Date): Double = js.native
  
  def toFixed(num: String): Double | String = js.native
  def toFixed(num: Double): Double | String = js.native
  
  def weekStart(date: js.Date): js.Date = js.native
  
  def yearStart(date: js.Date): js.Date = js.native
}
