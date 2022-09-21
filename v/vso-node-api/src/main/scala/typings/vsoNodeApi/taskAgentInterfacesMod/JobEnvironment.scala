package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobEnvironment extends StObject {
  
  var endpoints: js.Array[ServiceEndpoint]
  
  var mask: js.Array[MaskHint]
  
  var options: StringDictionary[JobOption]
  
  var secureFiles: js.Array[SecureFile]
  
  /**
    * Gets or sets the endpoint used for communicating back to the calling service.
    */
  var systemConnection: ServiceEndpoint
  
  var variables: StringDictionary[String]
}
object JobEnvironment {
  
  inline def apply(
    endpoints: js.Array[ServiceEndpoint],
    mask: js.Array[MaskHint],
    options: StringDictionary[JobOption],
    secureFiles: js.Array[SecureFile],
    systemConnection: ServiceEndpoint,
    variables: StringDictionary[String]
  ): JobEnvironment = {
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], secureFiles = secureFiles.asInstanceOf[js.Any], systemConnection = systemConnection.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobEnvironment]
  }
  
  extension [Self <: JobEnvironment](x: Self) {
    
    inline def setEndpoints(value: js.Array[ServiceEndpoint]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsVarargs(value: ServiceEndpoint*): Self = StObject.set(x, "endpoints", js.Array(value*))
    
    inline def setMask(value: js.Array[MaskHint]): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskVarargs(value: MaskHint*): Self = StObject.set(x, "mask", js.Array(value*))
    
    inline def setOptions(value: StringDictionary[JobOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSecureFiles(value: js.Array[SecureFile]): Self = StObject.set(x, "secureFiles", value.asInstanceOf[js.Any])
    
    inline def setSecureFilesVarargs(value: SecureFile*): Self = StObject.set(x, "secureFiles", js.Array(value*))
    
    inline def setSystemConnection(value: ServiceEndpoint): Self = StObject.set(x, "systemConnection", value.asInstanceOf[js.Any])
    
    inline def setVariables(value: StringDictionary[String]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
