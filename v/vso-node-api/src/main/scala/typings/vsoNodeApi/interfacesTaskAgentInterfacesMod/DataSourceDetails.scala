package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceDetails extends StObject {
  
  var dataSourceName: String
  
  var dataSourceUrl: String
  
  var parameters: StringDictionary[String]
  
  var resultSelector: String
}
object DataSourceDetails {
  
  inline def apply(
    dataSourceName: String,
    dataSourceUrl: String,
    parameters: StringDictionary[String],
    resultSelector: String
  ): DataSourceDetails = {
    val __obj = js.Dynamic.literal(dataSourceName = dataSourceName.asInstanceOf[js.Any], dataSourceUrl = dataSourceUrl.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], resultSelector = resultSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceDetails]
  }
  
  extension [Self <: DataSourceDetails](x: Self) {
    
    inline def setDataSourceName(value: String): Self = StObject.set(x, "dataSourceName", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUrl(value: String): Self = StObject.set(x, "dataSourceUrl", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: StringDictionary[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResultSelector(value: String): Self = StObject.set(x, "resultSelector", value.asInstanceOf[js.Any])
  }
}
