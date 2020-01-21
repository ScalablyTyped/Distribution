package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleDeclaration
  extends DeclarationStatement
     with JSDocContainer
     with _HasJSDoc {
  var body: js.UndefOr[ModuleBody | JSDocNamespaceDeclaration] = js.native
  @JSName("kind")
  var kind_ModuleDeclaration: typings.typescript.mod.SyntaxKind.ModuleDeclaration = js.native
  @JSName("name")
  var name_ModuleDeclaration: ModuleName = js.native
  @JSName("parent")
  var parent_ModuleDeclaration: ModuleBody | SourceFile = js.native
}

