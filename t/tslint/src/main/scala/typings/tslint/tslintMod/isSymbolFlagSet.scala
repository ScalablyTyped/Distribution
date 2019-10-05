package typings.tslint.tslintMod

import typings.typescript.typescriptMod.Symbol
import typings.typescript.typescriptMod.SymbolFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "isSymbolFlagSet")
@js.native
object isSymbolFlagSet extends js.Object {
  def apply(symbol: Symbol, flagToCheck: SymbolFlags): Boolean = js.native
}

