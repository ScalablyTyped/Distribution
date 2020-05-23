package typings.typescript.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildOptions
  extends /* option */ StringDictionary[js.UndefOr[CompilerOptionsValue]] {
  var assumeChangesOnlyAffectDirectDependencies: js.UndefOr[Boolean] = js.undefined
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
    assumeChangesOnlyAffectDirectDependencies: js.UndefOr[Boolean] = js.undefined,
    dry: js.UndefOr[Boolean] = js.undefined,
    force: js.UndefOr[Boolean] = js.undefined,
    incremental: js.UndefOr[Boolean] = js.undefined,
    traceResolution: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): BuildOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(assumeChangesOnlyAffectDirectDependencies)) __obj.updateDynamic("assumeChangesOnlyAffectDirectDependencies")(assumeChangesOnlyAffectDirectDependencies.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dry)) __obj.updateDynamic("dry")(dry.get.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.get.asInstanceOf[js.Any])
    if (!js.isUndefined(incremental)) __obj.updateDynamic("incremental")(incremental.get.asInstanceOf[js.Any])
    if (!js.isUndefined(traceResolution)) __obj.updateDynamic("traceResolution")(traceResolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildOptions]
  }
}

