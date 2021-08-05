package typings.tedious.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnValue extends StObject {
  
  var metadata: ColumnMetaData
  
  var value: js.Any
}
object ColumnValue {
  
  inline def apply(metadata: ColumnMetaData, value: js.Any): ColumnValue = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnValue]
  }
  
  extension [Self <: ColumnValue](x: Self) {
    
    inline def setMetadata(value: ColumnMetaData): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
