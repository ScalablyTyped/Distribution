package typings.tengitsui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderProps extends StObject {
  
  var record: Record
  
  var value: Any
}
object RenderProps {
  
  inline def apply(record: Record, value: Any): RenderProps = {
    val __obj = js.Dynamic.literal(record = record.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderProps]
  }
  
  extension [Self <: RenderProps](x: Self) {
    
    inline def setRecord(value: Record): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
