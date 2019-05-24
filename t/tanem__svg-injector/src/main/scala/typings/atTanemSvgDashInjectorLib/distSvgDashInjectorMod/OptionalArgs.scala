package typings
package atTanemSvgDashInjectorLib.distSvgDashInjectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionalArgs extends js.Object {
  var afterAll: js.UndefOr[atTanemSvgDashInjectorLib.distTypesMod.AfterAll] = js.undefined
  var afterEach: js.UndefOr[atTanemSvgDashInjectorLib.distTypesMod.Errback] = js.undefined
  var beforeEach: js.UndefOr[atTanemSvgDashInjectorLib.distTypesMod.BeforeEach] = js.undefined
  var evalScripts: js.UndefOr[atTanemSvgDashInjectorLib.distTypesMod.EvalScripts] = js.undefined
  var renumerateIRIElements: js.UndefOr[scala.Boolean] = js.undefined
}

object OptionalArgs {
  @scala.inline
  def apply(
    afterAll: atTanemSvgDashInjectorLib.distTypesMod.AfterAll = null,
    afterEach: atTanemSvgDashInjectorLib.distTypesMod.Errback = null,
    beforeEach: atTanemSvgDashInjectorLib.distTypesMod.BeforeEach = null,
    evalScripts: atTanemSvgDashInjectorLib.distTypesMod.EvalScripts = null,
    renumerateIRIElements: js.UndefOr[scala.Boolean] = js.undefined
  ): OptionalArgs = {
    val __obj = js.Dynamic.literal()
    if (afterAll != null) __obj.updateDynamic("afterAll")(afterAll)
    if (afterEach != null) __obj.updateDynamic("afterEach")(afterEach)
    if (beforeEach != null) __obj.updateDynamic("beforeEach")(beforeEach)
    if (evalScripts != null) __obj.updateDynamic("evalScripts")(evalScripts)
    if (!js.isUndefined(renumerateIRIElements)) __obj.updateDynamic("renumerateIRIElements")(renumerateIRIElements)
    __obj.asInstanceOf[OptionalArgs]
  }
}

