package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IndentAction extends js.Object

@JSImport("vscode", "IndentAction")
@js.native
object IndentAction extends js.Object {
  /**
  		 * Insert new line and indent once (relative to the previous line's indentation).
  		 */
  @js.native
  sealed trait Indent extends IndentAction
  
  /**
  		 * Insert two new lines:
  		 *  - the first one indented which will hold the cursor
  		 *  - the second one at the same indentation level
  		 */
  @js.native
  sealed trait IndentOutdent extends IndentAction
  
  /**
  		 * Insert new line and copy the previous line's indentation.
  		 */
  @js.native
  sealed trait None extends IndentAction
  
  /**
  		 * Insert new line and outdent once (relative to the previous line's indentation).
  		 */
  @js.native
  sealed trait Outdent extends IndentAction
  
  /* 1 */ val Indent: typings.vscode.vscodeMod.IndentAction.Indent with Double = js.native
  /* 2 */ val IndentOutdent: typings.vscode.vscodeMod.IndentAction.IndentOutdent with Double = js.native
  /* 0 */ val None: typings.vscode.vscodeMod.IndentAction.None with Double = js.native
  /* 3 */ val Outdent: typings.vscode.vscodeMod.IndentAction.Outdent with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndentAction with Double] = js.native
}

