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
  
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val resizeThumbnail: resizeThumbnail with scala.Double = js.native
  /* 1 */ val returnOnlyIfCached: returnOnlyIfCached with scala.Double = js.native
  /* 3 */ val useCurrentScale: useCurrentScale with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailOptions with scala.Double
  ] = js.native
}

