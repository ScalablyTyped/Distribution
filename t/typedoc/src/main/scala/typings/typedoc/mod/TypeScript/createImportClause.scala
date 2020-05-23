package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Identifier
import typings.typescript.mod.ImportClause
import typings.typescript.mod.NamedImportBindings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createImportClause")
@js.native
object createImportClause extends js.Object {
  def apply(): ImportClause = js.native
  def apply(name: Identifier): ImportClause = js.native
  def apply(name: Identifier, namedBindings: NamedImportBindings): ImportClause = js.native
  def apply(name: Identifier, namedBindings: NamedImportBindings, isTypeOnly: Boolean): ImportClause = js.native
}

