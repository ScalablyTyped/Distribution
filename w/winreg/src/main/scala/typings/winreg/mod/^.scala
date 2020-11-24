package typings.winreg.mod

import org.scalablytyped.runtime.TopLevel
import typings.winreg.Winreg.Options
import typings.winreg.Winreg.Registry
import typings.winreg.WinregStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("winreg", JSImport.Namespace)
@js.native
class ^ protected () extends Registry {
  /**
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
  def this(options: Options) = this()
}
@JSImport("winreg", JSImport.Namespace)
@js.native
object ^ extends TopLevel[WinregStatic]
