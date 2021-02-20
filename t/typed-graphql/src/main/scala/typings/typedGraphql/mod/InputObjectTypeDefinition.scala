package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputObjectTypeDefinition
  extends TypeDefinition
     with Node {
  
  var fields: js.Array[InputValueDefinition] = js.native
  
  var kind: String = js.native
  
  var loc: js.UndefOr[Location] = js.native
  
  var name: Name = js.native
}
object InputObjectTypeDefinition {
  
  @scala.inline
  def apply(fields: js.Array[InputValueDefinition], kind: String, name: Name): InputObjectTypeDefinition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputObjectTypeDefinition]
  }
  
  @scala.inline
  implicit class InputObjectTypeDefinitionMutableBuilder[Self <: InputObjectTypeDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[InputValueDefinition]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: InputValueDefinition*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: Location): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
