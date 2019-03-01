package typings
package winregLib.WinregNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Optional registry hive architecture ('x86' or 'x64'; only valid on Windows 64 Bit Operating Systems).
    */
  var arch: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional hive ID, default is HKLM.
    */
  var hive: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional hostname, must start with '\\' sequence.
    */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional key, default is the root key.
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    arch: java.lang.String = null,
    hive: java.lang.String = null,
    host: java.lang.String = null,
    key: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (arch != null) __obj.updateDynamic("arch")(arch)
    if (hive != null) __obj.updateDynamic("hive")(hive)
    if (host != null) __obj.updateDynamic("host")(host)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[Options]
  }
}

