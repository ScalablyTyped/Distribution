package typings.wixUiCore

import typings.wixUiCore.anon.Field
import typings.wixUiCore.anon.Hour
import typings.wixUiCore.anon.Strings
import typings.wixUiCore.anon.UseNativeInteraction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsTimePickerMod {
  
  @JSImport("wix-ui-core/src/components/time-picker", "TimePicker")
  @js.native
  class TimePicker protected ()
    extends typings.wixUiCore.srcComponentsTimePickerTimePickerMod.TimePicker {
    def this(props: js.Any) = this()
  }
  /* static members */
  object TimePicker {
    
    @JSImport("wix-ui-core/src/components/time-picker", "TimePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/src/components/time-picker", "TimePicker.defaultProps")
    @js.native
    def defaultProps: UseNativeInteraction = js.native
    inline def defaultProps_=(x: UseNativeInteraction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/src/components/time-picker", "TimePicker.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  object TimePickerUtils {
    
    @JSImport("wix-ui-core/src/components/time-picker", "TimePickerUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def convertToAmPm(hasValueStrings: Strings): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToAmPm")(hasValueStrings.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def decrement(hasValueFieldStep: Field): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decrement")(hasValueFieldStep.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getFieldFromPos(pos: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getFieldFromPos")(pos.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def increment(hasValueFieldStep: Field): String = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(hasValueFieldStep.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def isValidTime(timeStr: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidTime")(timeStr.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isValidTime(timeStr: String, useAmPm: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidTime")(timeStr.asInstanceOf[js.Any], useAmPm.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def leftpad(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("leftpad")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def leftpad(str: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("leftpad")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def parseTime(timeStr: String): Hour = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTime")(timeStr.asInstanceOf[js.Any]).asInstanceOf[Hour]
  }
}
