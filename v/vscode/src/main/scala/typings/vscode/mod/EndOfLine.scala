package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EndOfLine extends StObject
@JSImport("vscode", "EndOfLine")
@js.native
object EndOfLine extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EndOfLine & Double] = js.native
  
  /**
  		 * The carriage return line feed `\r\n` sequence.
  		 */
  @js.native
  sealed trait CRLF
    extends StObject
       with EndOfLine
  /* 2 */ val CRLF: typings.vscode.mod.EndOfLine.CRLF & Double = js.native
  
  /**
  		 * The line feed `\n` character.
  		 */
  @js.native
  sealed trait LF
    extends StObject
       with EndOfLine
  /* 1 */ val LF: typings.vscode.mod.EndOfLine.LF & Double = js.native
}
