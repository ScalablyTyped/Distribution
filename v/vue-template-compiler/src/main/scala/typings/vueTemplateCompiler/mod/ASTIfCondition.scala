package typings.vueTemplateCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASTIfCondition extends StObject {
  
  var block: ASTElement = js.native
  
  var exp: js.UndefOr[String] = js.native
}
object ASTIfCondition {
  
  @scala.inline
  def apply(block: ASTElement): ASTIfCondition = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTIfCondition]
  }
  
  @scala.inline
  implicit class ASTIfConditionMutableBuilder[Self <: ASTIfCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock(value: ASTElement): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExp(value: String): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpUndefined: Self = StObject.set(x, "exp", js.undefined)
  }
}
