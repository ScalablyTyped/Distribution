package typings
package whatwgDashMimetypeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowParameters extends js.Object {
  var allowParameters: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AllowParameters {
  @scala.inline
  def apply(allowParameters: js.UndefOr[scala.Boolean] = js.undefined): Anon_AllowParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowParameters)) __obj.updateDynamic("allowParameters")(allowParameters)
    __obj.asInstanceOf[Anon_AllowParameters]
  }
}

