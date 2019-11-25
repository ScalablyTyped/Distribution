package typings.winreg.Winreg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Optional registry hive architecture ('x86' or 'x64'; only valid on Windows 64 Bit Operating Systems).
    */
  var arch: js.UndefOr[String] = js.undefined
  /**
    * Optional hive ID, default is HKLM.
    */
  var hive: js.UndefOr[String] = js.undefined
  /**
    * Optional hostname, must start with '\\' sequence.
    */
  var host: js.UndefOr[String] = js.undefined
  /**
    * Optional key, default is the root key.
    */
  var key: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(arch: String = null, hive: String = null, host: String = null, key: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (arch != null) __obj.updateDynamic("arch")(arch.asInstanceOf[js.Any])
    if (hive != null) __obj.updateDynamic("hive")(hive.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

