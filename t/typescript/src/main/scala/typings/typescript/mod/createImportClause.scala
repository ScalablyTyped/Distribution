package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createImportClause")
@js.native
object createImportClause extends js.Object {
  
  /** @deprecated Use `factory.createImportClause` or the factory supplied by your transformation context instead. */
  def apply(): ImportClause = js.native
  def apply(name: js.UndefOr[scala.Nothing], namedBindings: js.UndefOr[scala.Nothing], isTypeOnly: js.Any): ImportClause = js.native
  def apply(name: js.UndefOr[scala.Nothing], namedBindings: NamedImportBindings): ImportClause = js.native
  def apply(name: js.UndefOr[scala.Nothing], namedBindings: NamedImportBindings, isTypeOnly: js.Any): ImportClause = js.native
  def apply(name: Identifier): ImportClause = js.native
  def apply(name: Identifier, namedBindings: js.UndefOr[scala.Nothing], isTypeOnly: js.Any): ImportClause = js.native
  def apply(name: Identifier, namedBindings: NamedImportBindings): ImportClause = js.native
  def apply(name: Identifier, namedBindings: NamedImportBindings, isTypeOnly: js.Any): ImportClause = js.native
}
