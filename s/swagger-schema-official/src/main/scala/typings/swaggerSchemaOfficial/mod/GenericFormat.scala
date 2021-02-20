package typings.swaggerSchemaOfficial.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenericFormat extends SchemaFormatConstraints {
  
  var format: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[ParameterType] = js.native
}
object GenericFormat {
  
  @scala.inline
  def apply(): GenericFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenericFormat]
  }
  
  @scala.inline
  implicit class GenericFormatMutableBuilder[Self <: GenericFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setType(value: ParameterType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
