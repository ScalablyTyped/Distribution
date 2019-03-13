package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShellQuoting extends js.Object

@JSImport("vscode", "ShellQuoting")
@js.native
object ShellQuoting extends js.Object {
  /**
  		 * Character escaping should be used. This for example
  		 * uses \ on bash and ` on PowerShell.
  		 */
  @js.native
  sealed trait Escape
    extends vscodeLib.vscodeMod.ShellQuoting
  
  /**
  		 * Strong string quoting should be used. This for example
  		 * uses " for Windows cmd and ' for bash and PowerShell.
  		 * Strong quoting treats arguments as literal strings.
  		 * Under PowerShell echo 'The value is $(2 * 3)' will
  		 * print `The value is $(2 * 3)`
  		 */
  @js.native
  sealed trait Strong
    extends vscodeLib.vscodeMod.ShellQuoting
  
  /**
  		 * Weak string quoting should be used. This for example
  		 * uses " for Windows cmd, bash and PowerShell. Weak quoting
  		 * still performs some kind of evaluation inside the quoted
  		 * string.  Under PowerShell echo "The value is $(2 * 3)"
  		 * will print `The value is 6`
  		 */
  @js.native
  sealed trait Weak
    extends vscodeLib.vscodeMod.ShellQuoting
  
  /* 1 */ val Escape: Escape with scala.Double = js.native
  /* 2 */ val Strong: Strong with scala.Double = js.native
  /* 3 */ val Weak: Weak with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeLib.vscodeMod.ShellQuoting with scala.Double] = js.native
}

