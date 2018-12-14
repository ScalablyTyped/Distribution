package typings
package winregLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WinregStatic
  extends /**
     * Creates a registry object, which provides access to a single registry key.
     * Note: This class is returned by a call to ```require('winreg')```.
     *
     * @public
     * @class
     *
     * @param {@link Options} options - the options
     *
     * @example
     * var Registry = require('winreg')
     * ,   autoStartCurrentUser = new Registry({
     *       hive: Registry.HKCU,
     *       key:  '\\Software\\Microsoft\\Windows\\CurrentVersion\\Run'
     *     });
     */
org.scalablytyped.runtime.Instantiable1[/* options */ winregLib.WinregNs.Options, winregLib.WinregNs.Registry] {
  /**
       * The name of the default value. May be used instead of the empty string literal for better readability.
       */
  var DEFAULT_VALUE: java.lang.String = js.native
  /**
       * Collection of available registry hive keys.
       */
  var HIVES: js.Array[java.lang.String] = js.native
  /**
       * Registry hive key HKEY_CURRENT_CONFIG.
       * Note: For writing to this hive your program has to run with admin privileges.
       */
  var HKCC: java.lang.String = js.native
  /**
       * Registry hive key HKEY_CLASSES_ROOT.
       * Note: For writing to this hive your program has to run with admin privileges.
       */
  var HKCR: java.lang.String = js.native
  /**
       * Registry hive key HKEY_CURRENT_USER.
       */
  var HKCU: java.lang.String = js.native
  /**
       * Registry hive key HKEY_LOCAL_MACHINE.
       * Note: For writing to this hive your program has to run with admin privileges.
       */
  var HKLM: java.lang.String = js.native
  /**
       * Registry hive key HKEY_USERS.
       * Note: For writing to this hive your program has to run with admin privileges.
       */
  var HKU: java.lang.String = js.native
  /**
       * Registry value type BINARY.
       *
       * Values of this type contain a binary value.
       */
  var REG_BINARY: java.lang.String = js.native
  /**
       * Registry value type DOUBLE_WORD.
       *
       * Values of this type contain a double word (32 bit integer).
       */
  var REG_DWORD: java.lang.String = js.native
  /**
       * Registry value type EXPANDABLE_STRING.
       *
       * Values of this type contain an expandable string.
       */
  var REG_EXPAND_SZ: java.lang.String = js.native
  /**
       * Registry value type MULTILINE_STRING.
       *
       * Values of this type contain a multiline string.
       */
  var REG_MULTI_SZ: java.lang.String = js.native
  /**
       * Registry value type UNKNOWN.
       *
       * Values of this type contain a value of an unknown type.
       */
  var REG_NONE: java.lang.String = js.native
  /**
       * Registry value type QUAD_WORD.
       *
       * Values of this type contain a quad word (64 bit integer).
       */
  var REG_QWORD: java.lang.String = js.native
  /**
       * Registry value type STRING.
       *
       * Values of this type contain a string.
       */
  var REG_SZ: java.lang.String = js.native
  /**
       * Collection of available registry value types.
       */
  var REG_TYPES: js.Array[java.lang.String] = js.native
}

