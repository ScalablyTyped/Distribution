package typings.wavesurferJs

import typings.wavesurferJs.pluginMod.PluginDefinition
import typings.wavesurferJs.pluginMod.PluginParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediasessionMod {
  
  @JSImport("wavesurfer.js/src/plugin/mediasession", JSImport.Default)
  @js.native
  open class default protected () extends MediaSessionPlugin {
    def this(params: MediaSessionPluginParams, ws: typings.wavesurferJs.wavesurferMod.default) = this()
  }
  /* static members */
  object default {
    
    @JSImport("wavesurfer.js/src/plugin/mediasession", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(params: MediaSessionPluginParams): PluginDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(params.asInstanceOf[js.Any]).asInstanceOf[PluginDefinition]
  }
  
  trait MediaImage extends StObject {
    
    var sizes: js.UndefOr[String] = js.undefined
    
    var src: String
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object MediaImage {
    
    inline def apply(src: String): MediaImage = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaImage]
    }
    
    extension [Self <: MediaImage](x: Self) {
      
      inline def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait MediaMetadata extends StObject {
    
    var album: String
    
    var artist: String
    
    var artwork: js.Array[MediaImage]
    
    var title: String
  }
  object MediaMetadata {
    
    inline def apply(album: String, artist: String, artwork: js.Array[MediaImage], title: String): MediaMetadata = {
      val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], artwork = artwork.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaMetadata]
    }
    
    extension [Self <: MediaMetadata](x: Self) {
      
      inline def setAlbum(value: String): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
      
      inline def setArtist(value: String): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
      
      inline def setArtwork(value: js.Array[MediaImage]): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
      
      inline def setArtworkVarargs(value: MediaImage*): Self = StObject.set(x, "artwork", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.wavesurferJs.pluginMod.WaveSurferPlugin because Inheritance from two classes. Inlined init, destroy */ @js.native
  trait MediaSessionPlugin
    extends typings.wavesurferJs.observerMod.default {
    
    def destroy(): Unit = js.native
    
    def init(): Unit = js.native
    
    val metadata: MediaMetadata = js.native
    
    val params: MediaSessionPluginParams = js.native
    
    def update(): Unit = js.native
    
    val wavesurfer: typings.wavesurferJs.wavesurferMod.default = js.native
  }
  
  trait MediaSessionPluginParams
    extends StObject
       with PluginParams {
    
    /** Representation of the metadata associated with a MediaSession that can be used by user agents to provide a customized user interface. */
    var metadata: MediaMetadata
  }
  object MediaSessionPluginParams {
    
    inline def apply(metadata: MediaMetadata): MediaSessionPluginParams = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaSessionPluginParams]
    }
    
    extension [Self <: MediaSessionPluginParams](x: Self) {
      
      inline def setMetadata(value: MediaMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    }
  }
}
