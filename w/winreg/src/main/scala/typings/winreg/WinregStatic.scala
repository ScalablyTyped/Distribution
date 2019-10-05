package typings.winreg

import org.scalablytyped.runtime.Instantiable1
import typings.winreg.Winreg.Options
import typings.winreg.Winreg.Registry
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
Instantiable1[/* options */ Options, Registry] {
  /**
    * The name of the default value. May be used instead of the empty string literal for better readability.
    */
  var DEFAULT_VALUE: String = js.native
  /**
    * Collection of available registry hive keys.
    */
  var HIVES: js.Array[String] = js.native
  /**
    * Registry hive key HKEY_CURRENT_CONFIG.
    * Note: For writing to this hive your program has to run with admin privileges.
    */
  var HKCC: String = js.native
  /**
    * Registry hive key HKEY_CLASSES_ROOT.
    * Note: For writing to this hive your program has to run with admin privileges.
    */
  var HKCR: String = js.native
  /**
    * Registry hive key HKEY_CURRENT_USER.
    */
  var HKCU: String = js.native
  /**
    * Registry hive key HKEY_LOCAL_MACHINE.
    * Note: For writing to this hive your program has to run with admin privileges.
    */
  var HKLM: String = js.native
  /**
    * Registry hive key HKEY_USERS.
    * Note: For writing to this hive your program has to run with admin privileges.
    */
  var HKU: String = js.native
  /**
    * Registry value type BINARY.
    *
    * Values of this type contain a binary value.
    */
  var REG_BINARY: String = js.native
  /**
    * Registry value type DOUBLE_WORD.
    *
    * Values of this type contain a double word (32 bit integer).
    */
  var REG_DWORD: String = js.native
  /**
    * Registry value type EXPANDABLE_STRING.
    *
    * Values of this type contain an expandable string.
    */
  var REG_EXPAND_SZ: String = js.native
  /**
    * Registry value type MULTILINE_STRING.
    *
    * Values of this type contain a multiline string.
    */
  var REG_MULTI_SZ: String = js.native
  /**
    * Registry value type UNKNOWN.
    *
    * Values of this type contain a value of an unknown type.
    */
  var REG_NONE: String = js.native
  /**
    * Registry value type QUAD_WORD.
    *
    * Values of this type contain a quad word (64 bit integer).
    */
  var REG_QWORD: String = js.native
  /**
    * Registry value type STRING.
    *
    * Values of this type contain a string.
    */
  var REG_SZ: String = js.native
  /**
    * Collection of available registry value types.
    */
  var REG_TYPES: js.Array[String] = js.native
}

