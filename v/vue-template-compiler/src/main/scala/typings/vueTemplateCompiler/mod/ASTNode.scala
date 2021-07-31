package typings.vueTemplateCompiler.mod

import typings.std.Record
import typings.vueTemplateCompiler.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vueTemplateCompiler.mod.ASTElement
  - typings.vueTemplateCompiler.mod.ASTText
  - typings.vueTemplateCompiler.mod.ASTExpression
*/
trait ASTNode extends StObject
object ASTNode {
  
  @scala.inline
  def ASTElement(
    attrsList: js.Array[Name],
    attrsMap: Record[String, js.Any],
    children: js.Array[ASTNode],
    tag: String
  ): typings.vueTemplateCompiler.mod.ASTElement = {
    val __obj = js.Dynamic.literal(attrsList = attrsList.asInstanceOf[js.Any], attrsMap = attrsMap.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(1)
    __obj.asInstanceOf[typings.vueTemplateCompiler.mod.ASTElement]
  }
  
  @scala.inline
  def ASTExpression(expression: String, text: String, tokens: js.Array[String | (Record[String, js.Any])]): typings.vueTemplateCompiler.mod.ASTExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(2)
    __obj.asInstanceOf[typings.vueTemplateCompiler.mod.ASTExpression]
  }
  
  @scala.inline
  def ASTText(text: String): typings.vueTemplateCompiler.mod.ASTText = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(3)
    __obj.asInstanceOf[typings.vueTemplateCompiler.mod.ASTText]
  }
}
