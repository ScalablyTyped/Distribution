package typings
package winrtLib.WindowsNs.StorageNs.FilePropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ThumbnailType extends js.Object

@JSGlobal("Windows.Storage.FileProperties.ThumbnailType")
@js.native
object ThumbnailType extends js.Object {
  @js.native
  sealed trait icon
    extends winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailType
  
  @js.native
  sealed trait image
    extends winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailType
  
  val icon: icon with java.lang.String = js.native
  val image: image with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailType with java.lang.String
  ] = js.native
}

