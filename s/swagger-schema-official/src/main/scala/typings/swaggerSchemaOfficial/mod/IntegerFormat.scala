package typings.swaggerSchemaOfficial.mod

import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.int32
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.int64
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntegerFormat extends SchemaFormatConstraints {
  
  var format: js.UndefOr[int32 | int64] = js.native
  
  var `type`: integer = js.native
}
object IntegerFormat {
  
  @scala.inline
  def apply(`type`: integer): IntegerFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerFormat]
  }
  
  @scala.inline
  implicit class IntegerFormatMutableBuilder[Self <: IntegerFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: int32 | int64): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setType(value: integer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
