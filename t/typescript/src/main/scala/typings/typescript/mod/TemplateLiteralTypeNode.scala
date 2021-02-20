package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateLiteralTypeNode extends TypeNode {
  
  val head: TemplateHead = js.native
  
  @JSName("kind")
  var kind_TemplateLiteralTypeNode: typings.typescript.mod.SyntaxKind.TemplateLiteralType = js.native
  
  val templateSpans: NodeArray[TemplateLiteralTypeSpan] = js.native
}
