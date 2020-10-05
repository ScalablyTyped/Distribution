package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateExpression
  extends PrimaryExpression
     with TemplateLiteral {
  var head: TemplateHead = js.native
  @JSName("kind")
  var kind_TemplateExpression: typings.typescript.mod.SyntaxKind.TemplateExpression = js.native
  var templateSpans: NodeArray[TemplateSpan] = js.native
}

