package typings.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoardChartReference extends StObject {
  
  /**
    * Name of the resource
    */
  var name: String
  
  /**
    * Full http link to the resource
    */
  var url: String
}
object BoardChartReference {
  
  inline def apply(name: String, url: String): BoardChartReference = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoardChartReference]
  }
  
  extension [Self <: BoardChartReference](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
