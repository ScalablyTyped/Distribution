package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSource extends StObject {
  
  var endpointUrl: String
  
  var name: String
  
  var resultSelector: String
}
object DataSource {
  
  inline def apply(endpointUrl: String, name: String, resultSelector: String): DataSource = {
    val __obj = js.Dynamic.literal(endpointUrl = endpointUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resultSelector = resultSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSource]
  }
  
  extension [Self <: DataSource](x: Self) {
    
    inline def setEndpointUrl(value: String): Self = StObject.set(x, "endpointUrl", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setResultSelector(value: String): Self = StObject.set(x, "resultSelector", value.asInstanceOf[js.Any])
  }
}
