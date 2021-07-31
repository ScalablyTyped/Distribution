package typings.webgme.Gme

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeSchema extends StObject {
  
  /** array of possible/allowed values */
  var `enum`: js.Array[String]
  
  /** integer, float, asset, string */
  var `type`: String
}
object AttributeSchema {
  
  @scala.inline
  def apply(`enum`: js.Array[String], `type`: String): AttributeSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeSchema]
  }
  
  @scala.inline
  implicit class AttributeSchemaMutableBuilder[Self <: AttributeSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnum(value: js.Array[String]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumVarargs(value: String*): Self = StObject.set(x, "enum", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
