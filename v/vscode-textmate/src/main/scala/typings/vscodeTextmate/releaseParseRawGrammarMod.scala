package typings.vscodeTextmate

import typings.vscodeTextmate.releaseRawGrammarMod.IRawGrammar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object releaseParseRawGrammarMod {
  
  @JSImport("vscode-textmate/release/parseRawGrammar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseRawGrammar(content: String): IRawGrammar = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRawGrammar")(content.asInstanceOf[js.Any]).asInstanceOf[IRawGrammar]
  inline def parseRawGrammar(content: String, filePath: String): IRawGrammar = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRawGrammar")(content.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[IRawGrammar]
}
