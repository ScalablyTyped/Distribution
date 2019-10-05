package typings.tslint.tslintMod

import typings.typescript.typescriptMod.Declaration
import typings.typescript.typescriptMod.ModifierFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "isCombinedModifierFlagSet")
@js.native
object isCombinedModifierFlagSet extends js.Object {
  def apply(node: Declaration, flagToCheck: ModifierFlags): Boolean = js.native
}

