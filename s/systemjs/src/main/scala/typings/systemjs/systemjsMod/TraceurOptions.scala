package typings.systemjs.systemjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraceurOptions extends js.Object {
  var arrayComprehension: js.UndefOr[Boolean] = js.undefined
  var asyncFunctions: js.UndefOr[Boolean] = js.undefined
  var asyncGenerators: js.UndefOr[js.Any] = js.undefined
  var forOn: js.UndefOr[Boolean] = js.undefined
  var generatorComprehension: js.UndefOr[Boolean] = js.undefined
  var properTailCalls: js.UndefOr[Boolean] = js.undefined
  var symbols: js.UndefOr[Boolean] = js.undefined
}

object TraceurOptions {
  @scala.inline
  def apply(
    arrayComprehension: js.UndefOr[Boolean] = js.undefined,
    asyncFunctions: js.UndefOr[Boolean] = js.undefined,
    asyncGenerators: js.Any = null,
    forOn: js.UndefOr[Boolean] = js.undefined,
    generatorComprehension: js.UndefOr[Boolean] = js.undefined,
    properTailCalls: js.UndefOr[Boolean] = js.undefined,
    symbols: js.UndefOr[Boolean] = js.undefined
  ): TraceurOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrayComprehension)) __obj.updateDynamic("arrayComprehension")(arrayComprehension)
    if (!js.isUndefined(asyncFunctions)) __obj.updateDynamic("asyncFunctions")(asyncFunctions)
    if (asyncGenerators != null) __obj.updateDynamic("asyncGenerators")(asyncGenerators)
    if (!js.isUndefined(forOn)) __obj.updateDynamic("forOn")(forOn)
    if (!js.isUndefined(generatorComprehension)) __obj.updateDynamic("generatorComprehension")(generatorComprehension)
    if (!js.isUndefined(properTailCalls)) __obj.updateDynamic("properTailCalls")(properTailCalls)
    if (!js.isUndefined(symbols)) __obj.updateDynamic("symbols")(symbols)
    __obj.asInstanceOf[TraceurOptions]
  }
}

