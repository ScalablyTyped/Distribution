package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_platforinfo */
/* Rewritten from type alias, can be one of: 
  - webclLib.webclLibNumbers.`0x0900`
  - webclLib.webclLibNumbers.`0x0901`
  - webclLib.webclLibNumbers.`0x0902`
  - webclLib.webclLibNumbers.`0x0903`
  - webclLib.webclLibNumbers.`0x0904`
*/
trait PlatformInfo extends js.Object

object PlatformInfo {
  @scala.inline
  def PLATFORM_EXTENSIONS: webclLib.webclLibNumbers.`0x0904` = this.cast(0x0904)
  @scala.inline
  def PLATFORM_NAME: webclLib.webclLibNumbers.`0x0902` = this.cast(0x0902)
  @scala.inline
  def PLATFORM_PROFILE: webclLib.webclLibNumbers.`0x0900` = this.cast(0x0900)
  @scala.inline
  def PLATFORM_VENDOR: webclLib.webclLibNumbers.`0x0903` = this.cast(0x0903)
  @scala.inline
  def PLATFORM_VERSION: webclLib.webclLibNumbers.`0x0901` = this.cast(0x0901)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

