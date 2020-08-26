package typings.typescriptServices.TypeScript.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RulesBucketConstructionState extends js.Object {
  var rulesInsertionIndexBitmap: js.Any = js.native
  def GetInsertionIndex(maskPosition: RulesPosition): Double = js.native
  def IncreaseInsertionIndex(maskPosition: RulesPosition): Unit = js.native
}

object RulesBucketConstructionState {
  @scala.inline
  def apply(
    GetInsertionIndex: RulesPosition => Double,
    IncreaseInsertionIndex: RulesPosition => Unit,
    rulesInsertionIndexBitmap: js.Any
  ): RulesBucketConstructionState = {
    val __obj = js.Dynamic.literal(GetInsertionIndex = js.Any.fromFunction1(GetInsertionIndex), IncreaseInsertionIndex = js.Any.fromFunction1(IncreaseInsertionIndex), rulesInsertionIndexBitmap = rulesInsertionIndexBitmap.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesBucketConstructionState]
  }
  @scala.inline
  implicit class RulesBucketConstructionStateOps[Self <: RulesBucketConstructionState] (val x: Self) extends AnyVal {
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
    def setGetInsertionIndex(value: RulesPosition => Double): Self = this.set("GetInsertionIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setIncreaseInsertionIndex(value: RulesPosition => Unit): Self = this.set("IncreaseInsertionIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setRulesInsertionIndexBitmap(value: js.Any): Self = this.set("rulesInsertionIndexBitmap", value.asInstanceOf[js.Any])
  }
  
}

