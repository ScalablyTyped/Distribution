package typings
package atUifabricUtilitiesLib.libGlobalSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChangeDescription extends js.Object {
  var key: java.lang.String
  var oldValue: js.Any
  var value: js.Any
}

object IChangeDescription {
  @scala.inline
  def apply(key: java.lang.String, oldValue: js.Any, value: js.Any): IChangeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("oldValue")(oldValue)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IChangeDescription]
  }
}

