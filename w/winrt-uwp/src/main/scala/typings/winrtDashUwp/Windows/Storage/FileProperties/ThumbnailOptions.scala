package typings.winrtDashUwp.Windows.Storage.FileProperties

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ThumbnailOptions with Double] = js.native
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object resizeThumbnail extends TopLevel[resizeThumbnail with Double]
  
  /* 1 */ @js.native
  object returnOnlyIfCached extends TopLevel[returnOnlyIfCached with Double]
  
  /* 3 */ @js.native
  object useCurrentScale extends TopLevel[useCurrentScale with Double]
  
}

