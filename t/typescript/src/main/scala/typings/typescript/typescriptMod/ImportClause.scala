package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportClause extends NamedDeclaration {
  @JSName("kind")
  var kind_ImportClause: typings.typescript.typescriptMod.SyntaxKind.ImportClause = js.native
  @JSName("name")
  var name_ImportClause: js.UndefOr[Identifier] = js.native
  var namedBindings: js.UndefOr[NamedImportBindings] = js.native
  @JSName("parent")
  var parent_ImportClause: ImportDeclaration = js.native
}

