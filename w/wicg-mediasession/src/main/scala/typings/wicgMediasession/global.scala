package typings.wicgMediasession

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("MediaMetadata")
  @js.native
  open class MediaMetadata ()
    extends StObject
       with typings.wicgMediasession.MediaMetadata {
    def this(init: MediaMetadataInit) = this()
    
    // Media's album.
    /* CompleteClass */
    var album: String = js.native
    
    // Media's artist.
    /* CompleteClass */
    var artist: String = js.native
    
    // Media's artwork.
    /* CompleteClass */
    var artwork: js.Array[MediaImage] = js.native
    
    // Media's title.
    /* CompleteClass */
    var title: String = js.native
  }
}
