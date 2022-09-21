package typings.vsoNodeApi.testInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestConfiguration extends StObject {
  
  /**
    * Area of the configuration
    */
  var area: ShallowReference
  
  /**
    * Description of the configuration
    */
  var description: String
  
  /**
    * Id of the configuration
    */
  var id: Double
  
  /**
    * Is the configuration a default for the test plans
    */
  var isDefault: Boolean
  
  /**
    * Last Updated By  Reference
    */
  var lastUpdatedBy: IdentityRef
  
  /**
    * Last Updated Data
    */
  var lastUpdatedDate: js.Date
  
  /**
    * Name of the configuration
    */
  var name: String
  
  /**
    * Project to which the configuration belongs
    */
  var project: ShallowReference
  
  /**
    * Revision of the the configuration
    */
  var revision: Double
  
  /**
    * State of the configuration
    */
  var state: TestConfigurationState
  
  /**
    * Url of Configuration Resource
    */
  var url: String
  
  /**
    * Dictionary of Test Variable, Selected Value
    */
  var values: js.Array[NameValuePair]
}
object TestConfiguration {
  
  inline def apply(
    area: ShallowReference,
    description: String,
    id: Double,
    isDefault: Boolean,
    lastUpdatedBy: IdentityRef,
    lastUpdatedDate: js.Date,
    name: String,
    project: ShallowReference,
    revision: Double,
    state: TestConfigurationState,
    url: String,
    values: js.Array[NameValuePair]
  ): TestConfiguration = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDefault = isDefault.asInstanceOf[js.Any], lastUpdatedBy = lastUpdatedBy.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestConfiguration]
  }
  
  extension [Self <: TestConfiguration](x: Self) {
    
    inline def setArea(value: ShallowReference): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedBy(value: IdentityRef): Self = StObject.set(x, "lastUpdatedBy", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDate(value: js.Date): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProject(value: ShallowReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setState(value: TestConfigurationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[NameValuePair]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: NameValuePair*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
