package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatternVisitorOptions extends js.Object {
  var processRightHandNodes: js.UndefOr[Boolean] = js.undefined
}

object PatternVisitorOptions {
  @scala.inline
  def apply(processRightHandNodes: js.UndefOr[Boolean] = js.undefined): PatternVisitorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(processRightHandNodes)) __obj.updateDynamic("processRightHandNodes")(processRightHandNodes)
    __obj.asInstanceOf[PatternVisitorOptions]
  }
}

