package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumTypeName extends StObject {
  
  var enumTypeName: js.Any = js.native
  
  var enumTypeSchema: js.Any = js.native
}
object EnumTypeName {
  
  @scala.inline
  def apply(enumTypeName: js.Any, enumTypeSchema: js.Any): EnumTypeName = {
    val __obj = js.Dynamic.literal(enumTypeName = enumTypeName.asInstanceOf[js.Any], enumTypeSchema = enumTypeSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumTypeName]
  }
  
  @scala.inline
  implicit class EnumTypeNameMutableBuilder[Self <: EnumTypeName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumTypeName(value: js.Any): Self = StObject.set(x, "enumTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumTypeSchema(value: js.Any): Self = StObject.set(x, "enumTypeSchema", value.asInstanceOf[js.Any])
  }
}
