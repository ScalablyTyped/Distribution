package typings.webgme.Gme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegistryKeys extends js.Object {
  var POSITION: String = js.native
}

object RegistryKeys {
  @scala.inline
  def apply(POSITION: String): RegistryKeys = {
    val __obj = js.Dynamic.literal(POSITION = POSITION.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegistryKeys]
  }
  @scala.inline
  implicit class RegistryKeysOps[Self <: RegistryKeys] (val x: Self) extends AnyVal {
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
    def setPOSITION(value: String): Self = this.set("POSITION", value.asInstanceOf[js.Any])
  }
  
}

