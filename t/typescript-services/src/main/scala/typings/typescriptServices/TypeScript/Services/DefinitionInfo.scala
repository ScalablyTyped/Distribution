package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefinitionInfo extends StObject {
  
  var containerKind: String = js.native
  
  var containerName: String = js.native
  
  var fileName: String = js.native
  
  var kind: String = js.native
  
  var limChar: Double = js.native
  
  var minChar: Double = js.native
  
  var name: String = js.native
}
object DefinitionInfo {
  
  @scala.inline
  def apply(
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
  implicit class DefinitionInfoMutableBuilder[Self <: DefinitionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerKind(value: String): Self = StObject.set(x, "containerKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimChar(value: Double): Self = StObject.set(x, "limChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinChar(value: Double): Self = StObject.set(x, "minChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
