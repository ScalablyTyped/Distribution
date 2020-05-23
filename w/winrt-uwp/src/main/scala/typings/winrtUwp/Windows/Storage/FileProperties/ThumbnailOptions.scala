package typings.winrtUwp.Windows.Storage.FileProperties

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
  sealed trait none extends ThumbnailOptions
  
  /** Scale the thumbnail to the requested size. */
  @js.native
  sealed trait resizeThumbnail extends ThumbnailOptions
  
  /** Retrieve a thumbnail only if it is cached or embedded in the file. */
  @js.native
  sealed trait returnOnlyIfCached extends ThumbnailOptions
  
  /** Default. Increase requested size based on the Pixels Per Inch (PPI) of the display. */
  @js.native
  sealed trait useCurrentScale extends ThumbnailOptions
  
}

