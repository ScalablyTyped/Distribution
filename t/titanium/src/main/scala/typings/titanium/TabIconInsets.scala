package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary to specify edge insets for <Titanium.UI.Tab.iconInsets>. Difference from typical <Padding> is that `right` and `bottom` are ignored and calculated internally from `top`/`left` values.
  */
@js.native
trait TabIconInsets extends Padding

object TabIconInsets {
  @scala.inline
  def apply(): TabIconInsets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabIconInsets]
  }
}

