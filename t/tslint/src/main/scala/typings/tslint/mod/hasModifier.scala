package typings.tslint.mod

import typings.typescript.mod.ModifiersArray
import typings.typescript.mod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "hasModifier")
@js.native
object hasModifier extends js.Object {
  def apply(modifierKinds: SyntaxKind*): Boolean = js.native
  def apply(modifiers: ModifiersArray, modifierKinds: SyntaxKind*): Boolean = js.native
}

