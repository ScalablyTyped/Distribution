package typings.videojsPlaylistUi

import typings.videojsPlaylistUi.anon.TypeofvideojsPlaylistUi
import typings.videojsPlaylistUi.videojsPlaylistUiStrings.`4Dot0Dot0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(options: Options): Unit = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("videojs-playlist-ui", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("videojs-playlist-ui", "VERSION")
  @js.native
  def VERSION: `4Dot0Dot0` = js.native
  inline def VERSION_=(x: `4Dot0Dot0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify videojs.ComponentOptions * / any */ trait Options extends StObject {
    
    /**
      * @default 'vjs-playlist'
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * @default false
      */
    var playOnSelect: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setPlayOnSelect(value: Boolean): Self = StObject.set(x, "playOnSelect", value.asInstanceOf[js.Any])
      
      inline def setPlayOnSelectUndefined: Self = StObject.set(x, "playOnSelect", js.undefined)
    }
  }
  
  /* augmented module */
  object videoJsAugmentingMod {
    
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
