package typings.typescriptServices.TypeScript.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RulesBucketConstructionState extends js.Object {
  var rulesInsertionIndexBitmap: js.Any
  def GetInsertionIndex(maskPosition: RulesPosition): Double
  def IncreaseInsertionIndex(maskPosition: RulesPosition): Unit
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
}

