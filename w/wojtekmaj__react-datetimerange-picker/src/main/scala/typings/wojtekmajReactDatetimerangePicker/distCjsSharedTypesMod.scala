package typings.wojtekmajReactDatetimerangePicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSharedTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.am
    - typings.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.pm
  */
  trait AmPmType extends StObject
  object AmPmType {
    
    inline def am: typings.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.am = "am".asInstanceOf[typings.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.am]
    
    inline def pm: typings.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.pm = "pm".asInstanceOf[typings.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.pm]
  }
  
  type ClassName = js.UndefOr[String | Null | (js.Array[js.UndefOr[String | Null]])]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.hour
    - typings.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.minute
    - typings.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.second
  */
  trait Detail extends StObject
  object Detail {
    
    inline def hour: typings.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.hour = "hour".asInstanceOf[typings.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.hour]
    
    inline def minute: typings.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.minute = "minute".asInstanceOf[typings.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.minute]
    
    inline def second: typings.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.second = "second".asInstanceOf[typings.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.second]
  }
  
  type LooseValue = LooseValuePiece | (js.Tuple2[LooseValuePiece, LooseValuePiece])
  
  type LooseValuePiece = String | js.Date | Null
  
  type Value = ValuePiece | (js.Tuple2[ValuePiece, ValuePiece])
  
  type ValuePiece = js.Date | Null
}
