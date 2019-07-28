package typings.atTanemSvgDashInjector.distSvgDashInjectorMod

import typings.atTanemSvgDashInjector.distTypesMod.AfterAll
import typings.atTanemSvgDashInjector.distTypesMod.BeforeEach
import typings.atTanemSvgDashInjector.distTypesMod.Errback
import typings.atTanemSvgDashInjector.distTypesMod.EvalScripts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionalArgs extends js.Object {
  var afterAll: js.UndefOr[AfterAll] = js.undefined
  var afterEach: js.UndefOr[Errback] = js.undefined
  var beforeEach: js.UndefOr[BeforeEach] = js.undefined
  var evalScripts: js.UndefOr[EvalScripts] = js.undefined
  var renumerateIRIElements: js.UndefOr[Boolean] = js.undefined
}

object OptionalArgs {
  @scala.inline
  def apply(
    afterAll: AfterAll = null,
    afterEach: Errback = null,
    beforeEach: BeforeEach = null,
    evalScripts: EvalScripts = null,
    renumerateIRIElements: js.UndefOr[Boolean] = js.undefined
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

