package typings.swaggerSchemaOfficial.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenericFormat
  extends StObject
     with SchemaFormatConstraints {
  
  var format: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[ParameterType] = js.undefined
}
object GenericFormat {
  
  inline def apply(): GenericFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenericFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenericFormat] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setType(value: ParameterType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
