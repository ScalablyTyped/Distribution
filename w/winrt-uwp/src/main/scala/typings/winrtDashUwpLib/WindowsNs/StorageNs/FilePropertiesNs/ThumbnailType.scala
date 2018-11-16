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
  
  val icon: icon with java.lang.String = js.native
  val image: image with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailType with java.lang.String
  ] = js.native
}

