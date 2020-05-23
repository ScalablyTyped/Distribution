package typings.tanemSvgInjector.svgInjectorMod

import typings.std.Error
import typings.std.SVGElement
import typings.tanemSvgInjector.typesMod.AfterAll
import typings.tanemSvgInjector.typesMod.BeforeEach
import typings.tanemSvgInjector.typesMod.Errback
import typings.tanemSvgInjector.typesMod.EvalScripts
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
    afterAll: /* elementsLoaded */ Double => Unit = null,
    afterEach: (/* error */ Error | Null, /* svg */ js.UndefOr[SVGElement]) => Unit = null,
    beforeEach: /* svg */ SVGElement => Unit = null,
    evalScripts: EvalScripts = null,
    renumerateIRIElements: js.UndefOr[Boolean] = js.undefined
  ): OptionalArgs = {
    val __obj = js.Dynamic.literal()
    if (afterAll != null) __obj.updateDynamic("afterAll")(js.Any.fromFunction1(afterAll))
    if (afterEach != null) __obj.updateDynamic("afterEach")(js.Any.fromFunction2(afterEach))
    if (beforeEach != null) __obj.updateDynamic("beforeEach")(js.Any.fromFunction1(beforeEach))
    if (evalScripts != null) __obj.updateDynamic("evalScripts")(evalScripts.asInstanceOf[js.Any])
    if (!js.isUndefined(renumerateIRIElements)) __obj.updateDynamic("renumerateIRIElements")(renumerateIRIElements.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalArgs]
  }
}

