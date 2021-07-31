package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enum extends StObject {
  
  var `enum`: js.Array[String]
  
  var `type`: String
}
object Enum {
  
  @scala.inline
  def apply(`enum`: js.Array[String], `type`: String): Enum = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enum]
  }
  
  @scala.inline
  implicit class EnumMutableBuilder[Self <: Enum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnum(value: js.Array[String]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumVarargs(value: String*): Self = StObject.set(x, "enum", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
