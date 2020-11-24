package typings.vscode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShellQuoting extends js.Object
@JSImport("vscode", "ShellQuoting")
@js.native
object ShellQuoting extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ShellQuoting with Double] = js.native
  
  /**
    * Character escaping should be used. This for example
    * uses \ on bash and ` on PowerShell.
    */
  @js.native
  sealed trait Escape extends ShellQuoting
  /* 1 */ @js.native
  object Escape extends TopLevel[Escape with Double]
  
  /**
    * Strong string quoting should be used. This for example
    * uses " for Windows cmd and ' for bash and PowerShell.
    * Strong quoting treats arguments as literal strings.
    * Under PowerShell echo 'The value is $(2 * 3)' will
    * print `The value is $(2 * 3)`
    */
  @js.native
  sealed trait Strong extends ShellQuoting
  /* 2 */ @js.native
  object Strong extends TopLevel[Strong with Double]
  
  /**
    * Weak string quoting should be used. This for example
    * uses " for Windows cmd, bash and PowerShell. Weak quoting
    * still performs some kind of evaluation inside the quoted
    * string.  Under PowerShell echo "The value is $(2 * 3)"
    * will print `The value is 6`
    */
  @js.native
  sealed trait Weak extends ShellQuoting
  /* 3 */ @js.native
  object Weak extends TopLevel[Weak with Double]
}
