package typings
package winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ThumbnailOptions extends js.Object

/** Describes the behavior used to retrieve and adjust thumbnails, including the size and quality of the image and how quickly the thumbnail image is retrieved. */
@JSGlobal("Windows.Storage.FileProperties.ThumbnailOptions")
@js.native
object ThumbnailOptions extends js.Object {
  /** No options. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailOptions
  
  /** Scale the thumbnail to the requested size. */
  @js.native
  sealed trait resizeThumbnail
    extends winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailOptions
  
  /** Retrieve a thumbnail only if it is cached or embedded in the file. */
  @js.native
  sealed trait returnOnlyIfCached
    extends winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailOptions
  
  /** Default. Increase requested size based on the Pixels Per Inch (PPI) of the display. */
  @js.native
  sealed trait useCurrentScale
    extends winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailOptions
  
  val none: none with java.lang.String = js.native
  val resizeThumbnail: resizeThumbnail with java.lang.String = js.native
  val returnOnlyIfCached: returnOnlyIfCached with java.lang.String = js.native
  val useCurrentScale: useCurrentScale with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailOptions with java.lang.String
  ] = js.native
}

