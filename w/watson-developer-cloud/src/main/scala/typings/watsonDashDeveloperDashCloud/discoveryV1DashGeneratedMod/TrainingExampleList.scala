package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** TrainingExampleList. */
trait TrainingExampleList extends js.Object {
  /** Array of training examples. */
  var examples: js.UndefOr[js.Array[TrainingExample]] = js.undefined
}

object TrainingExampleList {
  @scala.inline
  def apply(examples: js.Array[TrainingExample] = null): TrainingExampleList = {
    val __obj = js.Dynamic.literal()
    if (examples != null) __obj.updateDynamic("examples")(examples.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingExampleList]
  }
}

