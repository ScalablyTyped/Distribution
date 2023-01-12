package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefinitionInfo extends StObject {
  
  var containerKind: String
  
  var containerName: String
  
  var fileName: String
  
  var kind: String
  
  var limChar: Double
  
  var minChar: Double
  
  var name: String
}
object DefinitionInfo {
  
  inline def apply(
    containerKind: String,
    containerName: String,
    fileName: String,
    kind: String,
    limChar: Double,
    minChar: Double,
    name: String
  ): DefinitionInfo = {
    val __obj = js.Dynamic.literal(containerKind = containerKind.asInstanceOf[js.Any], containerName = containerName.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], limChar = limChar.asInstanceOf[js.Any], minChar = minChar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefinitionInfo] (val x: Self) extends AnyVal {
    
    inline def setContainerKind(value: String): Self = StObject.set(x, "containerKind", value.asInstanceOf[js.Any])
    
    inline def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLimChar(value: Double): Self = StObject.set(x, "limChar", value.asInstanceOf[js.Any])
    
    inline def setMinChar(value: Double): Self = StObject.set(x, "minChar", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
