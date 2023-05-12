package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassExpression
  extends StObject
     with ClassLikeDeclarationBase
     with PrimaryExpression
     with ClassLikeDeclaration
     with HasDecorators
     with HasModifiers {
  
  @JSName("kind")
  val kind_ClassExpression: typings.typescript.mod.SyntaxKind.ClassExpression = js.native
  
  val modifiers: js.UndefOr[NodeArray[ModifierLike]] = js.native
}
