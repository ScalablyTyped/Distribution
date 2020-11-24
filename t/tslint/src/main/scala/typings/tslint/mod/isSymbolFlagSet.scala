package typings.tslint.mod

import typings.typescript.mod.Symbol
import typings.typescript.mod.SymbolFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint", "isSymbolFlagSet")
@js.native
object isSymbolFlagSet extends js.Object {
  
  def apply(symbol: Symbol, flagToCheck: SymbolFlags): Boolean = js.native
}
