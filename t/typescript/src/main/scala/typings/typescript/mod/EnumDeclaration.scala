package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumDeclaration
  extends StObject
     with DeclarationStatement
     with HasJSDoc
     with HasModifiers {
  
  @JSName("kind")
  val kind_EnumDeclaration: typings.typescript.mod.SyntaxKind.EnumDeclaration = js.native
  
  val members: NodeArray[EnumMember] = js.native
  
  val modifiers: js.UndefOr[NodeArray[ModifierLike]] = js.native
  
  @JSName("name")
  val name_EnumDeclaration: Identifier = js.native
}
