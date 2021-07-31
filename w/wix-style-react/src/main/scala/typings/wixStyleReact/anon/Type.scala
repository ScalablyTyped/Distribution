package typings.wixStyleReact.anon

import typings.wixStyleReact.wixStyleReactStrings.ALL
import typings.wixStyleReact.wixStyleReactStrings.NONE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var origin: String
  
  var `type`: ALL | NONE
}
object Type {
  
  @scala.inline
  def apply(origin: String, `type`: ALL | NONE): Type = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ALL | NONE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
