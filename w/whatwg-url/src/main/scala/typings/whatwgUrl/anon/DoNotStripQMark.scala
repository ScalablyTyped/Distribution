package typings.whatwgUrl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoNotStripQMark extends js.Object {
  var doNotStripQMark: js.UndefOr[Boolean] = js.undefined
}

object DoNotStripQMark {
  @scala.inline
  def apply(doNotStripQMark: js.UndefOr[Boolean] = js.undefined): DoNotStripQMark = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(doNotStripQMark)) __obj.updateDynamic("doNotStripQMark")(doNotStripQMark.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoNotStripQMark]
  }
}

