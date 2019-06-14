package typings
package winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ThumbnailType extends js.Object

/** Indicates whether the thumbnail is an icon or an image. */
@JSGlobal("Windows.Storage.FileProperties.ThumbnailType")
@js.native
object ThumbnailType extends js.Object {
  /** The thumbnail is an icon. */
  @js.native
  sealed trait icon
    extends winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailType
  
  /** The thumbnail is an image. */
  @js.native
  sealed trait image
    extends winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailType
  
  /* 1 */ val icon: icon with scala.Double = js.native
  /* 0 */ val image: image with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailType with scala.Double
  ] = js.native
}

