package typings.tslint.utilsMod

import typings.typescript.mod.ModifiersArray
import typings.typescript.mod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/utils", "hasModifier")
@js.native
object hasModifier extends js.Object {
  def apply(modifiers: js.UndefOr[scala.Nothing], modifierKinds: SyntaxKind*): Boolean = js.native
  def apply(modifiers: ModifiersArray, modifierKinds: SyntaxKind*): Boolean = js.native
}

