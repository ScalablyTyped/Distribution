package typings.typedoc.schemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.StringLiteralType, 'type' | 'value'> */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typedoc.schemaMod.__ModelToObject because Already inherited */ trait StringLiteralType
  extends StObject
     with SomeType {
  
  var `type`: (ModelToObject[/* "stringLiteral" */ String]) | (/* "stringLiteral" */ String)
  
  var value: ModelToObject[String] | String
}
object StringLiteralType {
  
  @scala.inline
  def apply(
    `type`: (ModelToObject[/* "stringLiteral" */ String]) | (/* "stringLiteral" */ String),
    value: ModelToObject[String] | String
  ): StringLiteralType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringLiteralType]
  }
  
  @scala.inline
  implicit class StringLiteralTypeMutableBuilder[Self <: StringLiteralType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: (ModelToObject[/* "stringLiteral" */ String]) | (/* "stringLiteral" */ String)): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: ModelToObject[String] | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
