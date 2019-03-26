package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Device
trait _DeviceProperties extends _NativeObjectProperties {
  /**
    * The name of the platform. Currently either `"Android"`, `"iOS"`, or `"windows"`. This property is
    * also available globally as `device.platform`.
    * @static
    */
  var platform: tabrisLib.tabrisLibStrings.Android | tabrisLib.tabrisLibStrings.iOS | tabrisLib.tabrisLibStrings.windows
}

object _DeviceProperties {
  @scala.inline
  def apply(
    platform: tabrisLib.tabrisLibStrings.Android | tabrisLib.tabrisLibStrings.iOS | tabrisLib.tabrisLibStrings.windows
  ): _DeviceProperties = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_DeviceProperties]
  }
}

