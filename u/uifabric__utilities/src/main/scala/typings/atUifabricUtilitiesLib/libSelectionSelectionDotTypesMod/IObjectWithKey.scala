package typings
package atUifabricUtilitiesLib.libSelectionSelectionDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectWithKey extends js.Object {
  var key: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object IObjectWithKey {
  @scala.inline
  def apply(key: java.lang.String | scala.Double = null): IObjectWithKey = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectWithKey]
  }
}

