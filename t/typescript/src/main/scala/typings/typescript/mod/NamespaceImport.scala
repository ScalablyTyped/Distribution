package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamespaceImport
  extends NamedDeclaration
     with NamedImportBindings {
  @JSName("kind")
  var kind_NamespaceImport: typings.typescript.mod.SyntaxKind.NamespaceImport = js.native
  @JSName("name")
  var name_NamespaceImport: Identifier = js.native
  @JSName("parent")
  var parent_NamespaceImport: ImportClause = js.native
}

