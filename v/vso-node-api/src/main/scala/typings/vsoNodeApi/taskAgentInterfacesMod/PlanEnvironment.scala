package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlanEnvironment extends js.Object {
  var mask: js.Array[MaskHint]
  var options: StringDictionary[JobOption]
  var variables: StringDictionary[String]
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
}

