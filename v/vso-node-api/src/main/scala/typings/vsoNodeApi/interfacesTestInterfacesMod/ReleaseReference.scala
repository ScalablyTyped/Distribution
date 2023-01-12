package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseReference extends StObject {
  
  var definitionId: Double
  
  var environmentDefinitionId: Double
  
  var environmentDefinitionName: String
  
  var environmentId: Double
  
  var environmentName: String
  
  var id: Double
  
  var name: String
}
object ReleaseReference {
  
  inline def apply(
    definitionId: Double,
    environmentDefinitionId: Double,
    environmentDefinitionName: String,
    environmentId: Double,
    environmentName: String,
    id: Double,
    name: String
  ): ReleaseReference = {
    val __obj = js.Dynamic.literal(definitionId = definitionId.asInstanceOf[js.Any], environmentDefinitionId = environmentDefinitionId.asInstanceOf[js.Any], environmentDefinitionName = environmentDefinitionName.asInstanceOf[js.Any], environmentId = environmentId.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReleaseReference] (val x: Self) extends AnyVal {
    
    inline def setDefinitionId(value: Double): Self = StObject.set(x, "definitionId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentDefinitionId(value: Double): Self = StObject.set(x, "environmentDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentDefinitionName(value: String): Self = StObject.set(x, "environmentDefinitionName", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentId(value: Double): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentName(value: String): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
