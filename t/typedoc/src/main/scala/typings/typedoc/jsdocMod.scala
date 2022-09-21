package typings.typedoc

import typings.typedoc.contextMod.Context
import typings.typescript.mod.JSDocCallbackTag
import typings.typescript.mod.JSDocEnumTag
import typings.typescript.mod.JSDocTypedefTag
import typings.typescript.mod.Symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsdocMod {
  
  @JSImport("typedoc/dist/lib/converter/jsdoc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertJsDocAlias(context: Context, symbol: Symbol, declaration: JSDocEnumTag): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertJsDocAlias")(context.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any], declaration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def convertJsDocAlias(context: Context, symbol: Symbol, declaration: JSDocEnumTag, exportSymbol: Symbol): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertJsDocAlias")(context.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any], declaration.asInstanceOf[js.Any], exportSymbol.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def convertJsDocAlias(context: Context, symbol: Symbol, declaration: JSDocTypedefTag): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertJsDocAlias")(context.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any], declaration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def convertJsDocAlias(context: Context, symbol: Symbol, declaration: JSDocTypedefTag, exportSymbol: Symbol): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertJsDocAlias")(context.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any], declaration.asInstanceOf[js.Any], exportSymbol.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def convertJsDocCallback(context: Context, symbol: Symbol, declaration: JSDocCallbackTag): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertJsDocCallback")(context.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any], declaration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def convertJsDocCallback(context: Context, symbol: Symbol, declaration: JSDocCallbackTag, exportSymbol: Symbol): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertJsDocCallback")(context.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any], declaration.asInstanceOf[js.Any], exportSymbol.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
