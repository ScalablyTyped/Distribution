package typings.vueNiceDates.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandleMouseEnterDate extends StObject {
  
  def changeLastValidDate(name: String, date: String): Unit = js.native
  def changeLastValidDate(name: String, date: js.Date): Unit = js.native
  
  def handleClickDate(date: js.Date, `type`: String): Unit = js.native
  
  def handleMouseEnterDate(date: js.Date): Unit = js.native
  
  def handleMouseLeaveDates(): Unit = js.native
  
  def initEndDate(): Unit = js.native
  
  def initStartDate(): Unit = js.native
  
  def isEndDate(date: js.Date): Boolean = js.native
  
  def isMiddleDate(date: js.Date): Boolean = js.native
  
  def isStartDate(date: js.Date): Boolean = js.native
  
  def isValidAndSelectable(date: js.Date): Boolean = js.native
  
  def processInitalDate(): Unit = js.native
}
