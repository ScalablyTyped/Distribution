package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PickerDataProps extends StObject {
  
  /**
    * @language zh-CN
    * @description 标签
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Label
    * @defaultValue null
    */
  var label: String
  
  /**
    * @language zh-CN
    * @description 具体值
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Value
    * @defaultValue null
    */
  var value: String
}
object PickerDataProps {
  
  inline def apply(label: String, value: String): PickerDataProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerDataProps]
  }
  
  extension [Self <: PickerDataProps](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
