package typings.typedoc

import typings.typescript.mod.EnumMember
import typings.typescript.mod.Expression
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.VariableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convertExpressionMod {
  
  @JSImport("typedoc/dist/lib/converter/convert-expression", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def convertDefaultValue(node: EnumMember): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDefaultValue")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def convertDefaultValue(node: ParameterDeclaration): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDefaultValue")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def convertDefaultValue(node: VariableDeclaration): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDefaultValue")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def convertExpression(expression: Expression): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertExpression")(expression.asInstanceOf[js.Any]).asInstanceOf[String]
}
