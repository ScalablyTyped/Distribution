package typings.atUifabricUtilities.libSelectionSelectionDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectWithKey extends js.Object {
  var key: js.UndefOr[String | Double] = js.undefined
}

object IObjectWithKey {
  @scala.inline
  def apply(key: String | Double = null): IObjectWithKey = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectWithKey]
  }
}

