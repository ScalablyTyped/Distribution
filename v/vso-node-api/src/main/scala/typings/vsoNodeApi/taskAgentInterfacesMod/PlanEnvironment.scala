package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlanEnvironment extends js.Object {
  var mask: js.Array[MaskHint] = js.native
  var options: StringDictionary[JobOption] = js.native
  var variables: StringDictionary[String] = js.native
}

object PlanEnvironment {
  @scala.inline
  def apply(
    mask: js.Array[MaskHint],
    options: StringDictionary[JobOption],
    variables: StringDictionary[String]
  ): PlanEnvironment = {
    val __obj = js.Dynamic.literal(mask = mask.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanEnvironment]
  }
  @scala.inline
  implicit class PlanEnvironmentOps[Self <: PlanEnvironment] (val x: Self) extends AnyVal {
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
    def setMaskVarargs(value: MaskHint*): Self = this.set("mask", js.Array(value :_*))
    @scala.inline
    def setMask(value: js.Array[MaskHint]): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: StringDictionary[JobOption]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariables(value: StringDictionary[String]): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
  
}

