package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallHierarchyItem extends StObject {
  
  var containerName: js.UndefOr[java.lang.String] = js.native
  
  var file: java.lang.String = js.native
  
  var kind: ScriptElementKind = js.native
  
  var kindModifiers: js.UndefOr[java.lang.String] = js.native
  
  var name: java.lang.String = js.native
  
  var selectionSpan: TextSpan = js.native
  
  var span: TextSpan = js.native
}
object CallHierarchyItem {
  
  @scala.inline
  def apply(
    file: java.lang.String,
    kind: ScriptElementKind,
    name: java.lang.String,
    selectionSpan: TextSpan,
    span: TextSpan
  ): CallHierarchyItem = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selectionSpan = selectionSpan.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchyItem]
  }
  
  @scala.inline
  implicit class CallHierarchyItemMutableBuilder[Self <: CallHierarchyItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerName(value: java.lang.String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerNameUndefined: Self = StObject.set(x, "containerName", js.undefined)
    
    @scala.inline
    def setFile(value: java.lang.String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: ScriptElementKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindModifiers(value: java.lang.String): Self = StObject.set(x, "kindModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindModifiersUndefined: Self = StObject.set(x, "kindModifiers", js.undefined)
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionSpan(value: TextSpan): Self = StObject.set(x, "selectionSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpan(value: TextSpan): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
  }
}
