package typings.typedoc

import typings.typedoc.contextMod.Context
import typings.typescript.mod.Symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexSignatureMod {
  
  @JSImport("typedoc/dist/lib/converter/factories/index-signature", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertIndexSignature(context: Context, symbol: Symbol): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertIndexSignature")(context.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
