package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateExpression
  extends PrimaryExpression
     with TemplateLiteral {
  var head: TemplateHead = js.native
  @JSName("kind")
  var kind_TemplateExpression: typings.typescript.typescriptMod.SyntaxKind.TemplateExpression = js.native
  var templateSpans: NodeArray[TemplateSpan] = js.native
}

