package typings.wordpressComponents.anon

import typings.wordpressComponents.wordpressComponentsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1` extends js.Object {
  var multiple: js.UndefOr[`false`] = js.undefined
}

object `1` {
  @scala.inline
  def apply(multiple: `false` = null): `1` = {
    val __obj = js.Dynamic.literal()
    if (multiple != null) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
}

