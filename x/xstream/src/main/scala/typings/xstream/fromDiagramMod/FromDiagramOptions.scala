package typings.xstream.fromDiagramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FromDiagramOptions extends js.Object {
  var errorValue: js.UndefOr[js.Any] = js.undefined
  var timeUnit: js.UndefOr[Double] = js.undefined
  var values: js.UndefOr[js.Object] = js.undefined
}

object FromDiagramOptions {
  @scala.inline
  def apply(errorValue: js.Any = null, timeUnit: js.UndefOr[Double] = js.undefined, values: js.Object = null): FromDiagramOptions = {
    val __obj = js.Dynamic.literal()
    if (errorValue != null) __obj.updateDynamic("errorValue")(errorValue.asInstanceOf[js.Any])
    if (!js.isUndefined(timeUnit)) __obj.updateDynamic("timeUnit")(timeUnit.get.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromDiagramOptions]
  }
}

