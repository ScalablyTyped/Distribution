package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "updateImportClause")
@js.native
object updateImportClause extends js.Object {
  def apply(
    node: ImportClause,
    name: js.UndefOr[Identifier],
    namedBindings: js.UndefOr[NamedImportBindings],
    isTypeOnly: Boolean
  ): ImportClause = js.native
}

