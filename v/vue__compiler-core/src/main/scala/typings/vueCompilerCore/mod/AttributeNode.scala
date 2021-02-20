package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeNode extends Node2 {
  
  var name: String = js.native
  
  @JSName("type")
  var type_AttributeNode: `6` = js.native
  
  var value: js.UndefOr[TextNode] = js.native
}
object AttributeNode {
  
  @scala.inline
  def apply(loc: SourceLocation, name: String, `type`: `6`): AttributeNode = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeNode]
  }
  
  @scala.inline
  implicit class AttributeNodeMutableBuilder[Self <: AttributeNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `6`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: TextNode): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
