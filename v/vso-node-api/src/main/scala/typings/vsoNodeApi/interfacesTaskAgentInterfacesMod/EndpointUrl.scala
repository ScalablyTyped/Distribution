package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointUrl extends StObject {
  
  var dependsOn: DependsOn
  
  var displayName: String
  
  var helpText: String
  
  var isVisible: String
  
  var value: String
}
object EndpointUrl {
  
  inline def apply(dependsOn: DependsOn, displayName: String, helpText: String, isVisible: String, value: String): EndpointUrl = {
    val __obj = js.Dynamic.literal(dependsOn = dependsOn.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], helpText = helpText.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointUrl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndpointUrl] (val x: Self) extends AnyVal {
    
    inline def setDependsOn(value: DependsOn): Self = StObject.set(x, "dependsOn", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setHelpText(value: String): Self = StObject.set(x, "helpText", value.asInstanceOf[js.Any])
    
    inline def setIsVisible(value: String): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
