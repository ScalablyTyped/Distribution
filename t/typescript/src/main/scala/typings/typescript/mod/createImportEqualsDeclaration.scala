package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createImportEqualsDeclaration")
@js.native
object createImportEqualsDeclaration extends js.Object {
  
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: Identifier,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def apply(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def apply(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  /** @deprecated Use `factory.createImportEqualsDeclaration` or the factory supplied by your transformation context instead. */
  def apply(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def apply(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
}
