package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleDeclaration
  extends StObject
     with DeclarationStatement
     with LocalsContainer
     with HasJSDoc
     with HasModifiers {
  
  val body: js.UndefOr[ModuleBody | JSDocNamespaceDeclaration] = js.native
  
  @JSName("kind")
  val kind_ModuleDeclaration: typings.typescript.mod.SyntaxKind.ModuleDeclaration = js.native
  
  val modifiers: js.UndefOr[NodeArray[ModifierLike]] = js.native
  
  @JSName("name")
  val name_ModuleDeclaration: ModuleName = js.native
  
  @JSName("parent")
  val parent_ModuleDeclaration: ModuleBody | SourceFile = js.native
}
