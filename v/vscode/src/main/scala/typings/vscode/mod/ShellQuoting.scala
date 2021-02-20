package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShellQuoting extends StObject
@JSImport("vscode", "ShellQuoting")
@js.native
object ShellQuoting extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ShellQuoting with Double] = js.native
  
  /**
    * Character escaping should be used. This for example
    * uses \ on bash and ` on PowerShell.
    */
  @js.native
  sealed trait Escape extends ShellQuoting
  /* 1 */ val Escape: typings.vscode.mod.ShellQuoting.Escape with Double = js.native
  
  /**
    * Strong string quoting should be used. This for example
    * uses " for Windows cmd and ' for bash and PowerShell.
    * Strong quoting treats arguments as literal strings.
    * Under PowerShell echo 'The value is $(2 * 3)' will
    * print `The value is $(2 * 3)`
    */
  @js.native
  sealed trait Strong extends ShellQuoting
  /* 2 */ val Strong: typings.vscode.mod.ShellQuoting.Strong with Double = js.native
  
  /**
    * Weak string quoting should be used. This for example
    * uses " for Windows cmd, bash and PowerShell. Weak quoting
    * still performs some kind of evaluation inside the quoted
    * string.  Under PowerShell echo "The value is $(2 * 3)"
    * will print `The value is 6`
    */
  @js.native
  sealed trait Weak extends ShellQuoting
  /* 3 */ val Weak: typings.vscode.mod.ShellQuoting.Weak with Double = js.native
}
