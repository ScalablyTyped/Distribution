package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiteralTypeNode extends TypeNode {
  
  @JSName("kind")
  val kind_LiteralTypeNode: typings.typescript.mod.SyntaxKind.LiteralType = js.native
  
  val literal: NullLiteral | BooleanLiteral | LiteralExpression | PrefixUnaryExpression = js.native
}
