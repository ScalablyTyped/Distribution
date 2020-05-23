package typings.wicgMediasession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class MediaMetadata ()
    extends typings.wicgMediasession.MediaMetadata {
    def this(init: MediaMetadataInit) = this()
    // Media's album.
    /* CompleteClass */
    override var album: String = js.native
    // Media's artist.
    /* CompleteClass */
    override var artist: String = js.native
    // Media's artwork.
    /* CompleteClass */
    override var artwork: js.Array[MediaImage] = js.native
    // Media's title.
    /* CompleteClass */
    override var title: String = js.native
  }
  
}

