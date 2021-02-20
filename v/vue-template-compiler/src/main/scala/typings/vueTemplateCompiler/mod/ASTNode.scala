package typings.vueTemplateCompiler.mod

import typings.std.Record
import typings.vueTemplateCompiler.anon.Name
import typings.vueTemplateCompiler.vueTemplateCompilerNumbers.`1`
import typings.vueTemplateCompiler.vueTemplateCompilerNumbers.`2`
import typings.vueTemplateCompiler.vueTemplateCompilerNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    attrsMap: Record[String, _],
    children: js.Array[ASTNode],
    tag: String,
    `type`: `1`
  ): typings.vueTemplateCompiler.mod.ASTElement = {
    val __obj = js.Dynamic.literal(attrsList = attrsList.asInstanceOf[js.Any], attrsMap = attrsMap.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vueTemplateCompiler.mod.ASTElement]
  }
  
  @scala.inline
  def ASTExpression(expression: String, text: String, tokens: js.Array[String | (Record[String, _])], `type`: `2`): typings.vueTemplateCompiler.mod.ASTExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vueTemplateCompiler.mod.ASTExpression]
  }
  
  @scala.inline
  def ASTText(text: String, `type`: `3`): typings.vueTemplateCompiler.mod.ASTText = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vueTemplateCompiler.mod.ASTText]
  }
}
