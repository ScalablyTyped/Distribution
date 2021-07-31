package typings.vueTemplateCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASTDirective extends StObject {
  
  var arg: js.UndefOr[String] = js.undefined
  
  var modifiers: js.UndefOr[ASTModifiers] = js.undefined
  
  var name: String
  
  var rawName: String
  
  var value: String
}
object ASTDirective {
  
  @scala.inline
  def apply(name: String, rawName: String, value: String): ASTDirective = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], rawName = rawName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTDirective]
  }
  
  @scala.inline
  implicit class ASTDirectiveMutableBuilder[Self <: ASTDirective] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArg(value: String): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgUndefined: Self = StObject.set(x, "arg", js.undefined)
    
    @scala.inline
    def setModifiers(value: ASTModifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawName(value: String): Self = StObject.set(x, "rawName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
