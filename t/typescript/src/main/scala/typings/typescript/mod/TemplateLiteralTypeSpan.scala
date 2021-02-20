package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateLiteralTypeSpan extends TypeNode {
  
  @JSName("kind")
  val kind_TemplateLiteralTypeSpan: typings.typescript.mod.SyntaxKind.TemplateLiteralTypeSpan = js.native
  
  val literal: TemplateMiddle | TemplateTail = js.native
  
  @JSName("parent")
  val parent_TemplateLiteralTypeSpan: TemplateLiteralTypeNode = js.native
  
  val `type`: TypeNode = js.native
}
