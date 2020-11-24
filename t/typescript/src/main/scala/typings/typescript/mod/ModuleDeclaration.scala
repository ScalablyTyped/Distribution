package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleDeclaration
  extends DeclarationStatement
     with JSDocContainer
     with _HasJSDoc {
  
  val body: js.UndefOr[ModuleBody | JSDocNamespaceDeclaration] = js.native
  
  @JSName("kind")
  val kind_ModuleDeclaration: typings.typescript.mod.SyntaxKind.ModuleDeclaration = js.native
  
  @JSName("name")
  val name_ModuleDeclaration: ModuleName = js.native
  
  @JSName("parent")
  val parent_ModuleDeclaration: ModuleBody | SourceFile = js.native
}
