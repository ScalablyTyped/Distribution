package typings.videojsPlaylistUi

import typings.videojsPlaylistUi.anon.TypeofvideojsPlaylistUi
import typings.videojsPlaylistUi.mod.Options
import typings.videojsPlaylistUi.videojsPlaylistUiStrings.`4Dot0Dot0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object videojsPlaylistUi {
    
    inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
    inline def apply(options: Options): Unit = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("videojsPlaylistUi")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("videojsPlaylistUi.VERSION")
    @js.native
    def VERSION: `4Dot0Dot0` = js.native
    inline def VERSION_=(x: `4Dot0Dot0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
    
    /* augmented module */
    object videoDotjsMod {
      
      trait VideoJsPlayer extends StObject {
        
        var playlistUi: TypeofvideojsPlaylistUi
      }
      object VideoJsPlayer {
        
        inline def apply(playlistUi: TypeofvideojsPlaylistUi): VideoJsPlayer = {
          val __obj = js.Dynamic.literal(playlistUi = playlistUi.asInstanceOf[js.Any])
          __obj.asInstanceOf[VideoJsPlayer]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: VideoJsPlayer] (val x: Self) extends AnyVal {
          
          inline def setPlaylistUi(value: TypeofvideojsPlaylistUi): Self = StObject.set(x, "playlistUi", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
