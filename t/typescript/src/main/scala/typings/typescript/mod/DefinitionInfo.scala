package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefinitionInfo
  extends StObject
     with DocumentSpan {
  
  var containerKind: ScriptElementKind
  
  var containerName: java.lang.String
  
  var kind: ScriptElementKind
  
  var name: java.lang.String
}
object DefinitionInfo {
  
  @scala.inline
  def apply(
    containerKind: ScriptElementKind,
    containerName: java.lang.String,
    fileName: java.lang.String,
    kind: ScriptElementKind,
    name: java.lang.String,
    textSpan: TextSpan
  ): DefinitionInfo = {
    val __obj = js.Dynamic.literal(containerKind = containerKind.asInstanceOf[js.Any], containerName = containerName.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionInfo]
  }
  
  @scala.inline
  implicit class DefinitionInfoMutableBuilder[Self <: DefinitionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerKind(value: ScriptElementKind): Self = StObject.set(x, "containerKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerName(value: java.lang.String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: ScriptElementKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
