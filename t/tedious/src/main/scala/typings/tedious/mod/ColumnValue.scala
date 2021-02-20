package typings.tedious.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnValue extends StObject {
  
  var metadata: ColumnMetaData = js.native
  
  var value: js.Any = js.native
}
object ColumnValue {
  
  @scala.inline
  def apply(metadata: ColumnMetaData, value: js.Any): ColumnValue = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnValue]
  }
  
  @scala.inline
  implicit class ColumnValueMutableBuilder[Self <: ColumnValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: ColumnMetaData): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
