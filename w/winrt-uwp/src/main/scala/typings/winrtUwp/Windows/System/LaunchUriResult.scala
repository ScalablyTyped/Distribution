package typings.winrtUwp.Windows.System

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the results of a Uri launch. */
@js.native
trait LaunchUriResult extends js.Object {
  /** Gets the result of the Uri launch. */
  var result: ValueSet = js.native
  /** Gets the status of the Uri launch. */
  var status: LaunchUriStatus = js.native
}

object LaunchUriResult {
  @scala.inline
  def apply(result: ValueSet, status: LaunchUriStatus): LaunchUriResult = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchUriResult]
  }
  @scala.inline
  implicit class LaunchUriResultOps[Self <: LaunchUriResult] (val x: Self) extends AnyVal {
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
    def setResult(value: ValueSet): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: LaunchUriStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

