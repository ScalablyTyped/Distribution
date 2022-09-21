package typings.typedoc

import typings.typedoc.contextMod.Context
import typings.typescript.mod.Symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symbolsMod {
  
  @JSImport("typedoc/dist/lib/converter/symbols", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertSymbol(context: Context, symbol: Symbol): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertSymbol")(context.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def convertSymbol(context: Context, symbol: Symbol, exportSymbol: Symbol): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertSymbol")(context.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any], exportSymbol.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
