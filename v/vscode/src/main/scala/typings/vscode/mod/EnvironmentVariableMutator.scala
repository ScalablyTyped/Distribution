package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentVariableMutator extends js.Object {
  /**
    * The type of mutation that will occur to the variable.
    */
  val `type`: EnvironmentVariableMutatorType = js.native
  /**
    * The value to use for the variable.
    */
  val value: String = js.native
}

object EnvironmentVariableMutator {
  @scala.inline
  def apply(`type`: EnvironmentVariableMutatorType, value: String): EnvironmentVariableMutator = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentVariableMutator]
  }
  @scala.inline
  implicit class EnvironmentVariableMutatorOps[Self <: EnvironmentVariableMutator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: EnvironmentVariableMutatorType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

