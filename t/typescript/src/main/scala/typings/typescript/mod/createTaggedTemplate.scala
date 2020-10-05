package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createTaggedTemplate")
@js.native
object createTaggedTemplate extends js.Object {
  /** @deprecated */ def apply(tag: Expression, template: TemplateLiteral): TaggedTemplateExpression = js.native
  def apply(tag: Expression, typeArguments: js.UndefOr[scala.Nothing], template: TemplateLiteral): TaggedTemplateExpression = js.native
  def apply(tag: Expression, typeArguments: js.Array[TypeNode], template: TemplateLiteral): TaggedTemplateExpression = js.native
}

