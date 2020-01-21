package typings.tslint.utilsMod

import typings.typescript.mod.Symbol
import typings.typescript.mod.SymbolFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/utils", "isSymbolFlagSet")
@js.native
object isSymbolFlagSet extends js.Object {
  def apply(symbol: Symbol, flagToCheck: SymbolFlags): Boolean = js.native
}

