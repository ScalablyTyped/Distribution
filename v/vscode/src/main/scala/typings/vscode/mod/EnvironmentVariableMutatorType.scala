package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnvironmentVariableMutatorType extends StObject
@JSImport("vscode", "EnvironmentVariableMutatorType")
@js.native
object EnvironmentVariableMutatorType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnvironmentVariableMutatorType with Double] = js.native
  
  /**
    * Append to the end of the variable's existing value.
    */
  @js.native
  sealed trait Append extends EnvironmentVariableMutatorType
  /* 2 */ val Append: typings.vscode.mod.EnvironmentVariableMutatorType.Append with Double = js.native
  
  /**
    * Prepend to the start of the variable's existing value.
    */
  @js.native
  sealed trait Prepend extends EnvironmentVariableMutatorType
  /* 3 */ val Prepend: typings.vscode.mod.EnvironmentVariableMutatorType.Prepend with Double = js.native
  
  /**
    * Replace the variable's existing value.
    */
  @js.native
  sealed trait Replace extends EnvironmentVariableMutatorType
  /* 1 */ val Replace: typings.vscode.mod.EnvironmentVariableMutatorType.Replace with Double = js.native
}
