package typings.swaggerSchemaOfficial.mod

import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.double
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.float
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberFormat
  extends StObject
     with SchemaFormatConstraints {
  
  var format: js.UndefOr[float | double] = js.undefined
  
  var `type`: number
}
object NumberFormat {
  
  @scala.inline
  def apply(): NumberFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("number")
    __obj.asInstanceOf[NumberFormat]
  }
  
  @scala.inline
  implicit class NumberFormatMutableBuilder[Self <: NumberFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: float | double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setType(value: number): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
