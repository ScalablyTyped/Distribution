package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Decorator
import typings.typescript.mod.Expression
import typings.typescript.mod.ImportClause
import typings.typescript.mod.ImportDeclaration
import typings.typescript.mod.Modifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createImportDeclaration")
@js.native
object createImportDeclaration extends js.Object {
  
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    importClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    importClause: ImportClause,
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    importClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    importClause: ImportClause,
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def apply(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    importClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def apply(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    importClause: ImportClause,
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def apply(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    importClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  /** @deprecated Use `factory.createImportDeclaration` or the factory supplied by your transformation context instead. */
  def apply(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    importClause: ImportClause,
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
}
