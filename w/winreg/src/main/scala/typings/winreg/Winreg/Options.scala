package typings.winreg.Winreg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Optional registry hive architecture ('x86' or 'x64'; only valid on Windows 64 Bit Operating Systems).
    */
  var arch: js.UndefOr[String] = js.native
  /**
    * Optional hive ID, default is HKLM.
    */
  var hive: js.UndefOr[String] = js.native
  /**
    * Optional hostname, must start with '\\' sequence.
    */
  var host: js.UndefOr[String] = js.native
  /**
    * Optional key, default is the root key.
    */
  var key: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setArch(value: String): Self = this.set("arch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArch: Self = this.set("arch", js.undefined)
    @scala.inline
    def setHive(value: String): Self = this.set("hive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHive: Self = this.set("hive", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
  
}

