package typings.vscode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EndOfLine extends js.Object

@JSImport("vscode", "EndOfLine")
@js.native
object EndOfLine extends js.Object {
  /**
    * The carriage return line feed `\r\n` sequence.
    */
  @js.native
  sealed trait CRLF extends EndOfLine
  
  /**
    * The line feed `\n` character.
    */
  @js.native
  sealed trait LF extends EndOfLine
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EndOfLine with Double] = js.native
  /* 2 */ @js.native
  object CRLF extends TopLevel[CRLF with Double]
  
  /* 1 */ @js.native
  object LF extends TopLevel[LF with Double]
  
}

