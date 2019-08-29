package typings.typescript.typescriptMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildOptions
  extends /* option */ StringDictionary[js.UndefOr[CompilerOptionsValue]] {
  var dry: js.UndefOr[Boolean] = js.undefined
  var force: js.UndefOr[Boolean] = js.undefined
  var incremental: js.UndefOr[Boolean] = js.undefined
  var traceResolution: js.UndefOr[Boolean] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object BuildOptions {
  @scala.inline
  def apply(
    StringDictionary: /* option */ StringDictionary[js.UndefOr[CompilerOptionsValue]] = null,
    dry: js.UndefOr[Boolean] = js.undefined,
    force: js.UndefOr[Boolean] = js.undefined,
    incremental: js.UndefOr[Boolean] = js.undefined,
    traceResolution: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): BuildOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(dry)) __obj.updateDynamic("dry")(dry)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (!js.isUndefined(incremental)) __obj.updateDynamic("incremental")(incremental)
    if (!js.isUndefined(traceResolution)) __obj.updateDynamic("traceResolution")(traceResolution)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[BuildOptions]
  }
}

