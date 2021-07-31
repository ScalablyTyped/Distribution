package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnvironmentVariableMutatorType extends StObject
@JSImport("vscode", "EnvironmentVariableMutatorType")
@js.native
object EnvironmentVariableMutatorType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnvironmentVariableMutatorType & Double] = js.native
  
  /**
    * Append to the end of the variable's existing value.
    */
  @js.native
  sealed trait Append
    extends StObject
       with EnvironmentVariableMutatorType
  /* 2 */ val Append: typings.vscode.mod.EnvironmentVariableMutatorType.Append & Double = js.native
  
  /**
    * Prepend to the start of the variable's existing value.
    */
  @js.native
  sealed trait Prepend
    extends StObject
       with EnvironmentVariableMutatorType
  /* 3 */ val Prepend: typings.vscode.mod.EnvironmentVariableMutatorType.Prepend & Double = js.native
  
  /**
    * Replace the variable's existing value.
    */
  @js.native
  sealed trait Replace
    extends StObject
       with EnvironmentVariableMutatorType
  /* 1 */ val Replace: typings.vscode.mod.EnvironmentVariableMutatorType.Replace & Double = js.native
}
