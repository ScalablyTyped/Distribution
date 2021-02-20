package typings.vueNiceDates.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandleMouseEnterDate extends StObject {
  
  def changeLastValidDate(name: String, date: String): Unit = js.native
  def changeLastValidDate(name: String, date: typings.std.Date): Unit = js.native
  
  def handleClickDate(date: typings.std.Date, `type`: String): Unit = js.native
  
  def handleMouseEnterDate(date: typings.std.Date): Unit = js.native
  
  def handleMouseLeaveDates(): Unit = js.native
  
  def initEndDate(): Unit = js.native
  
  def initStartDate(): Unit = js.native
  
  def isEndDate(date: typings.std.Date): Boolean = js.native
  
  def isMiddleDate(date: typings.std.Date): Boolean = js.native
  
  def isStartDate(date: typings.std.Date): Boolean = js.native
  
  def isValidAndSelectable(date: typings.std.Date): Boolean = js.native
  
  def processInitalDate(): Unit = js.native
}
