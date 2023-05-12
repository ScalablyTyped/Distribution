package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "SemanticTokensLegend")
@js.native
open class SemanticTokensLegend protected () extends StObject {
  def this(tokenTypes: js.Array[String]) = this()
  def this(tokenTypes: js.Array[String], tokenModifiers: js.Array[String]) = this()
  
  /**
  		 * The possible token modifiers.
  		 */
  val tokenModifiers: js.Array[String] = js.native
  
  /**
  		 * The possible token types.
  		 */
  val tokenTypes: js.Array[String] = js.native
}
