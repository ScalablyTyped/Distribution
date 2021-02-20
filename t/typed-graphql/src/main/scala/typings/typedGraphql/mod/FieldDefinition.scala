package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldDefinition extends Node {
  
  var arguments: js.Array[InputValueDefinition] = js.native
  
  var kind: String = js.native
  
  var loc: js.UndefOr[Location] = js.native
  
  var name: Name = js.native
  
  var `type`: Type = js.native
}
object FieldDefinition {
  
  @scala.inline
  def apply(arguments: js.Array[InputValueDefinition], kind: String, name: Name, `type`: Type): FieldDefinition = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldDefinition]
  }
  
  @scala.inline
  implicit class FieldDefinitionMutableBuilder[Self <: FieldDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: js.Array[InputValueDefinition]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsVarargs(value: InputValueDefinition*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: Location): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
