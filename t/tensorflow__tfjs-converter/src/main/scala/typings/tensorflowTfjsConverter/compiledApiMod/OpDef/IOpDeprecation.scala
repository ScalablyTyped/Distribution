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
  def apply(explanation: String = null, version: Int | Double = null): IOpDeprecation = {
    val __obj = js.Dynamic.literal()
    if (explanation != null) __obj.updateDynamic("explanation")(explanation.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOpDeprecation]
  }
}

