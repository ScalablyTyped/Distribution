package typings
package atTanemSvgDashInjectorLib.distSvgDashInjectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionalArgs extends js.Object {
  var done: js.UndefOr[atTanemSvgDashInjectorLib.distTypesMod.DoneCallback] = js.undefined
  var each: js.UndefOr[atTanemSvgDashInjectorLib.distTypesMod.Errback] = js.undefined
  var evalScripts: js.UndefOr[atTanemSvgDashInjectorLib.distTypesMod.EvalScripts] = js.undefined
  var renumerateIRIElements: js.UndefOr[scala.Boolean] = js.undefined
}

object OptionalArgs {
  @scala.inline
  def apply(
    done: atTanemSvgDashInjectorLib.distTypesMod.DoneCallback = null,
    each: atTanemSvgDashInjectorLib.distTypesMod.Errback = null,
    evalScripts: atTanemSvgDashInjectorLib.distTypesMod.EvalScripts = null,
    renumerateIRIElements: js.UndefOr[scala.Boolean] = js.undefined
  ): OptionalArgs = {
    val __obj = js.Dynamic.literal()
    if (done != null) __obj.updateDynamic("done")(done)
    if (each != null) __obj.updateDynamic("each")(each)
    if (evalScripts != null) __obj.updateDynamic("evalScripts")(evalScripts)
    if (!js.isUndefined(renumerateIRIElements)) __obj.updateDynamic("renumerateIRIElements")(renumerateIRIElements)
    __obj.asInstanceOf[OptionalArgs]
  }
}

