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

