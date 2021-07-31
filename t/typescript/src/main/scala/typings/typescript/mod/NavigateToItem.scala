package typings.typescript.mod

import typings.typescript.typescriptStrings.camelCase
import typings.typescript.typescriptStrings.exact
import typings.typescript.typescriptStrings.prefix
import typings.typescript.typescriptStrings.substring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigateToItem extends StObject {
  
  var containerKind: ScriptElementKind
  
  var containerName: java.lang.String
  
  var fileName: java.lang.String
  
  var isCaseSensitive: Boolean
  
  var kind: ScriptElementKind
  
  var kindModifiers: java.lang.String
  
  var matchKind: exact | prefix | substring | camelCase
  
  var name: java.lang.String
  
  var textSpan: TextSpan
}
object NavigateToItem {
  
  @scala.inline
  def apply(
    containerKind: ScriptElementKind,
    containerName: java.lang.String,
    fileName: java.lang.String,
    isCaseSensitive: Boolean,
    kind: ScriptElementKind,
    kindModifiers: java.lang.String,
    matchKind: exact | prefix | substring | camelCase,
    name: java.lang.String,
    textSpan: TextSpan
  ): NavigateToItem = {
    val __obj = js.Dynamic.literal(containerKind = containerKind.asInstanceOf[js.Any], containerName = containerName.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], isCaseSensitive = isCaseSensitive.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], matchKind = matchKind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateToItem]
  }
  
  @scala.inline
  implicit class NavigateToItemMutableBuilder[Self <: NavigateToItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerKind(value: ScriptElementKind): Self = StObject.set(x, "containerKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerName(value: java.lang.String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: java.lang.String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCaseSensitive(value: Boolean): Self = StObject.set(x, "isCaseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: ScriptElementKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindModifiers(value: java.lang.String): Self = StObject.set(x, "kindModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchKind(value: exact | prefix | substring | camelCase): Self = StObject.set(x, "matchKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextSpan(value: TextSpan): Self = StObject.set(x, "textSpan", value.asInstanceOf[js.Any])
  }
}
