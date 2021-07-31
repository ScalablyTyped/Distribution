package typings.tern.ternMod

import typings.estree.mod.Program
import typings.tern.inferMod.Scope
import typings.tern.ternStrings.delete
import typings.tern.ternStrings.full
import typings.tern.ternStrings.part
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait File extends StObject {
  
  var asLineChar: js.UndefOr[js.Function1[/* nodePosition */ Double, Position]] = js.undefined
  
  var ast: Program
  
  var name: String
  
  var scope: Scope
  
  var text: String
  
  var `type`: js.UndefOr[full | part | delete] = js.undefined
}
object File {
  
  @scala.inline
  def apply(ast: Program, name: String, scope: Scope, text: String): File = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsLineChar(value: /* nodePosition */ Double => Position): Self = StObject.set(x, "asLineChar", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAsLineCharUndefined: Self = StObject.set(x, "asLineChar", js.undefined)
    
    @scala.inline
    def setAst(value: Program): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: full | part | delete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
