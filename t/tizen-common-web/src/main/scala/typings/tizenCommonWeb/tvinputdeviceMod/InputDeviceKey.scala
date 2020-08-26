package typings.tizenCommonWeb.tvinputdeviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputDeviceKey extends js.Object {
  /**
    * The numeric code of the key, like ***37*** or ***13***.
    * @since 2.3
    */
  var code: Double = js.native
  /**
    * The name of the key, for example ***"VolumeUp"*** or ***"ChannelDown"***.
    * @since 2.3
    */
  var name: InputDeviceKeyName = js.native
}

object InputDeviceKey {
  @scala.inline
  def apply(code: Double, name: InputDeviceKeyName): InputDeviceKey = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputDeviceKey]
  }
  @scala.inline
  implicit class InputDeviceKeyOps[Self <: InputDeviceKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: InputDeviceKeyName): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

