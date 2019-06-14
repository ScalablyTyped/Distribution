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
  
  /* 1 */ val icon: icon with scala.Double = js.native
  /* 0 */ val image: image with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailType with scala.Double] = js.native
}

