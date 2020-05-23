package typings.tensorflowTfjsConverter.compiledApiMod.OpDef

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an OpDeprecation. */
trait IOpDeprecation extends js.Object {
  /** OpDeprecation explanation */
  var explanation: js.UndefOr[String | Null] = js.undefined
  /** OpDeprecation version */
  var version: js.UndefOr[Double | Null] = js.undefined
}

object IOpDeprecation {
  @scala.inline
  def apply(
    explanation: js.UndefOr[Null | String] = js.undefined,
    version: js.UndefOr[Null | Double] = js.undefined
  ): IOpDeprecation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(explanation)) __obj.updateDynamic("explanation")(explanation.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOpDeprecation]
  }
}

