package typings.wixUiCore

import typings.wixUiCore.anon.Field
import typings.wixUiCore.anon.Hour
import typings.wixUiCore.anon.Strings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timePickerUtilsMod {
  
  @JSImport("wix-ui-core/dist/src/components/time-picker/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def convertToAmPm(hasValueStrings: Strings): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToAmPm")(hasValueStrings.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def decrement(hasValueFieldStep: Field): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decrement")(hasValueFieldStep.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getFieldFromPos(pos: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getFieldFromPos")(pos.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def increment(hasValueFieldStep: Field): String = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(hasValueFieldStep.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def isValidTime(timeStr: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidTime")(timeStr.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isValidTime(timeStr: String, useAmPm: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidTime")(timeStr.asInstanceOf[js.Any], useAmPm.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def leftpad(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("leftpad")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def leftpad(str: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("leftpad")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def parseTime(timeStr: String): Hour = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTime")(timeStr.asInstanceOf[js.Any]).asInstanceOf[Hour]
}
