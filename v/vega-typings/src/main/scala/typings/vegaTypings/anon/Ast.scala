package typings.vegaTypings.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ast extends StObject {
  
  var ast: js.UndefOr[Boolean] = js.undefined
}
object Ast {
  
  @scala.inline
  def apply(): Ast = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ast]
  }
  
  @scala.inline
  implicit class AstMutableBuilder[Self <: Ast] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAst(value: Boolean): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAstUndefined: Self = StObject.set(x, "ast", js.undefined)
  }
}
