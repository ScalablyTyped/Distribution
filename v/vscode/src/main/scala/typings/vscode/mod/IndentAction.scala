package typings.vscode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IndentAction extends js.Object
@JSImport("vscode", "IndentAction")
@js.native
object IndentAction extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndentAction with Double] = js.native
  
  /**
    * Insert new line and indent once (relative to the previous line's indentation).
    */
  @js.native
  sealed trait Indent extends IndentAction
  /* 1 */ @js.native
  object Indent extends TopLevel[Indent with Double]
  
  /**
    * Insert two new lines:
    *  - the first one indented which will hold the cursor
    *  - the second one at the same indentation level
    */
  @js.native
  sealed trait IndentOutdent extends IndentAction
  /* 2 */ @js.native
  object IndentOutdent extends TopLevel[IndentOutdent with Double]
  
  /**
    * Insert new line and copy the previous line's indentation.
    */
  @js.native
  sealed trait None extends IndentAction
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /**
    * Insert new line and outdent once (relative to the previous line's indentation).
    */
  @js.native
  sealed trait Outdent extends IndentAction
  /* 3 */ @js.native
  object Outdent extends TopLevel[Outdent with Double]
}
