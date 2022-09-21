package typings.sucrase

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getTSImportedNamesMod {
  
  @JSImport("sucrase/dist/types/util/getTSImportedNames", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(tokens: typings.sucrase.tokenProcessorMod.default): Set[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(tokens.asInstanceOf[js.Any]).asInstanceOf[Set[String]]
}
