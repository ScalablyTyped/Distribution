package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputObjectConfig extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var fields: InputObjectConfigFieldMapThunk | InputObjectConfigFieldMap
  
  var name: String
}
object InputObjectConfig {
  
  @scala.inline
  def apply(fields: InputObjectConfigFieldMapThunk | InputObjectConfigFieldMap, name: String): InputObjectConfig = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputObjectConfig]
  }
  
  @scala.inline
  implicit class InputObjectConfigMutableBuilder[Self <: InputObjectConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFields(value: InputObjectConfigFieldMapThunk | InputObjectConfigFieldMap): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsFunction0(value: () => InputObjectConfigFieldMap): Self = StObject.set(x, "fields", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
