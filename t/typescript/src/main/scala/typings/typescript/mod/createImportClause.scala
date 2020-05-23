package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createImportClause")
@js.native
object createImportClause extends js.Object {
  def apply(): ImportClause = js.native
  def apply(name: Identifier): ImportClause = js.native
  def apply(name: Identifier, namedBindings: NamedImportBindings): ImportClause = js.native
  def apply(name: Identifier, namedBindings: NamedImportBindings, isTypeOnly: Boolean): ImportClause = js.native
}

