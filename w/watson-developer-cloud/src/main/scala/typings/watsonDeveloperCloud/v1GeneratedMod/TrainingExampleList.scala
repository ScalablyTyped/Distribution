package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** TrainingExampleList. */
@js.native
trait TrainingExampleList extends js.Object {
  /** Array of training examples. */
  var examples: js.UndefOr[js.Array[TrainingExample]] = js.native
}

object TrainingExampleList {
  @scala.inline
  def apply(): TrainingExampleList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingExampleList]
  }
  @scala.inline
  implicit class TrainingExampleListOps[Self <: TrainingExampleList] (val x: Self) extends AnyVal {
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
    def setExamplesVarargs(value: TrainingExample*): Self = this.set("examples", js.Array(value :_*))
    @scala.inline
    def setExamples(value: js.Array[TrainingExample]): Self = this.set("examples", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExamples: Self = this.set("examples", js.undefined)
  }
  
}

