package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceBinding extends StObject {
  
  var dataSourceName: String
  
  var endpointId: String
  
  var endpointUrl: String
  
  var parameters: StringDictionary[String]
  
  var resultSelector: String
  
  var resultTemplate: String
  
  var target: String
}
object DataSourceBinding {
  
  @scala.inline
  def apply(
    dataSourceName: String,
    endpointId: String,
    endpointUrl: String,
    parameters: StringDictionary[String],
    resultSelector: String,
    resultTemplate: String,
    target: String
  ): DataSourceBinding = {
    val __obj = js.Dynamic.literal(dataSourceName = dataSourceName.asInstanceOf[js.Any], endpointId = endpointId.asInstanceOf[js.Any], endpointUrl = endpointUrl.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], resultSelector = resultSelector.asInstanceOf[js.Any], resultTemplate = resultTemplate.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceBinding]
  }
  
  @scala.inline
  implicit class DataSourceBindingMutableBuilder[Self <: DataSourceBinding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSourceName(value: String): Self = StObject.set(x, "dataSourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointId(value: String): Self = StObject.set(x, "endpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUrl(value: String): Self = StObject.set(x, "endpointUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: StringDictionary[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultSelector(value: String): Self = StObject.set(x, "resultSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultTemplate(value: String): Self = StObject.set(x, "resultTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
