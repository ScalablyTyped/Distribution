package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingDetails extends StObject {
  
  /**
    * The local path.
    */
  var localPath: String
  
  /**
    * The mapping type.
    */
  var mappingType: String
  
  /**
    * The server path.
    */
  var serverPath: String
}
object MappingDetails {
  
  inline def apply(localPath: String, mappingType: String, serverPath: String): MappingDetails = {
    val __obj = js.Dynamic.literal(localPath = localPath.asInstanceOf[js.Any], mappingType = mappingType.asInstanceOf[js.Any], serverPath = serverPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappingDetails]
  }
  
  extension [Self <: MappingDetails](x: Self) {
    
    inline def setLocalPath(value: String): Self = StObject.set(x, "localPath", value.asInstanceOf[js.Any])
    
    inline def setMappingType(value: String): Self = StObject.set(x, "mappingType", value.asInstanceOf[js.Any])
    
    inline def setServerPath(value: String): Self = StObject.set(x, "serverPath", value.asInstanceOf[js.Any])
  }
}
