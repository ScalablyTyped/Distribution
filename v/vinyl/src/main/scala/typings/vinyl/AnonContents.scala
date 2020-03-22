package typings.vinyl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContents extends js.Object {
  var contents: js.UndefOr[Boolean] = js.undefined
  var deep: js.UndefOr[Boolean] = js.undefined
}

object AnonContents {
  @scala.inline
  def apply(contents: js.UndefOr[Boolean] = js.undefined, deep: js.UndefOr[Boolean] = js.undefined): AnonContents = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contents)) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContents]
  }
}

