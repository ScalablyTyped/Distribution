package typings.wordpressComponents.anon

import typings.wordpressComponents.wordpressComponentsStrings.left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends js.Object {
  var origin: js.UndefOr[left] = js.undefined
}

object `0` {
  @scala.inline
  def apply(origin: left = null): `0` = {
    val __obj = js.Dynamic.literal()
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
}

