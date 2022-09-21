package typings.sucrase

import typings.sucrase.tokenizerMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatTokensMod {
  
  @JSImport("sucrase/dist/types/util/formatTokens", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(code: String, tokens: js.Array[Token]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(code.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any])).asInstanceOf[String]
}
