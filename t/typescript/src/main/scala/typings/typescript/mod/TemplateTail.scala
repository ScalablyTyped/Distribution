package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateTail
  extends TemplateLiteralLikeNode
     with PseudoLiteralToken {
  
  @JSName("kind")
  val kind_TemplateTail: typings.typescript.mod.SyntaxKind.TemplateTail = js.native
  
  @JSName("parent")
  val parent_TemplateTail: TemplateSpan | TemplateLiteralTypeSpan = js.native
}
