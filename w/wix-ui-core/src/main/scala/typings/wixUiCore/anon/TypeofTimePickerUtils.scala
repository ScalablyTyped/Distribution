package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTimePickerUtils extends StObject {
  
  def convertToAmPm(hasValueStrings: Strings): String = js.native
  
  def decrement(hasValueFieldStep: Field): String = js.native
  
  def getFieldFromPos(pos: Double): Double = js.native
  
  def increment(hasValueFieldStep: Field): String = js.native
  
  def isValidTime(timeStr: String): Boolean = js.native
  def isValidTime(timeStr: String, useAmPm: Boolean): Boolean = js.native
  
  def leftpad(str: String): String = js.native
  def leftpad(str: Double): String = js.native
  
  def parseTime(timeStr: String): Hour = js.native
}
