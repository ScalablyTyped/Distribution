package typings.typedoc

import typings.typescript.mod.Symbol
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsSymbolsMod {
  
  @JSImport("typedoc/dist/lib/converter/utils/symbols", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveAliasedSymbol(symbol: Symbol, checker: TypeChecker): Symbol = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAliasedSymbol")(symbol.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[Symbol]
}
