package typings.tslint.mod

import typings.typescript.mod.Declaration
import typings.typescript.mod.ModifierFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint", "isCombinedModifierFlagSet")
@js.native
object isCombinedModifierFlagSet extends js.Object {
  
  def apply(node: Declaration, flagToCheck: ModifierFlags): Boolean = js.native
}
