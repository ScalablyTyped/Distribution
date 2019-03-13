package typings
package vscodeLib.vscodeMod

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
  sealed trait Indent
    extends vscodeLib.vscodeMod.IndentAction
  
  /**
  		 * Insert two new lines:
  		 *  - the first one indented which will hold the cursor
  		 *  - the second one at the same indentation level
  		 */
  @js.native
  sealed trait IndentOutdent
    extends vscodeLib.vscodeMod.IndentAction
  
  /**
  		 * Insert new line and copy the previous line's indentation.
  		 */
  @js.native
  sealed trait None
    extends vscodeLib.vscodeMod.IndentAction
  
  /**
  		 * Insert new line and outdent once (relative to the previous line's indentation).
  		 */
  @js.native
  sealed trait Outdent
    extends vscodeLib.vscodeMod.IndentAction
  
  /* 1 */ val Indent: Indent with scala.Double = js.native
  /* 2 */ val IndentOutdent: IndentOutdent with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 3 */ val Outdent: Outdent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeLib.vscodeMod.IndentAction with scala.Double] = js.native
}

