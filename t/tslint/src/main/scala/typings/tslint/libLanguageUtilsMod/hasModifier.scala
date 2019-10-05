package typings.tslint.libLanguageUtilsMod

import typings.typescript.typescriptMod.ModifiersArray
import typings.typescript.typescriptMod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/utils", "hasModifier")
@js.native
object hasModifier extends js.Object {
  def apply(modifierKinds: SyntaxKind*): Boolean = js.native
  def apply(modifiers: ModifiersArray, modifierKinds: SyntaxKind*): Boolean = js.native
}

