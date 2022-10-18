package typings.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamFieldValues
  extends StObject
     with TeamSettingsDataContractBase {
  
  /**
    * The default team field value
    */
  var defaultValue: String
  
  /**
    * Shallow ref to the field being used as a team field
    */
  var field: FieldReference
  
  /**
    * Collection of all valid team field values
    */
  var values: js.Array[TeamFieldValue]
}
object TeamFieldValues {
  
  inline def apply(
    _links: Any,
    defaultValue: String,
    field: FieldReference,
    url: String,
    values: js.Array[TeamFieldValue]
  ): TeamFieldValues = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamFieldValues]
  }
  
  extension [Self <: TeamFieldValues](x: Self) {
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setField(value: FieldReference): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[TeamFieldValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: TeamFieldValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
