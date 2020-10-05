package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateSpan extends Node {
  var expression: Expression = js.native
  @JSName("kind")
  var kind_TemplateSpan: typings.typescript.mod.SyntaxKind.TemplateSpan = js.native
  var literal: TemplateMiddle | TemplateTail = js.native
  @JSName("parent")
  var parent_TemplateSpan: TemplateExpression = js.native
}

