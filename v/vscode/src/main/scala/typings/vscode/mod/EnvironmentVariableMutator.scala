package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentVariableMutator extends js.Object {
  /**
    * The type of mutation that will occur to the variable.
    */
  val `type`: EnvironmentVariableMutatorType
  /**
    * The value to use for the variable.
    */
  val value: String
}

object EnvironmentVariableMutator {
  @scala.inline
  def apply(`type`: EnvironmentVariableMutatorType, value: String): EnvironmentVariableMutator = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentVariableMutator]
  }
}

