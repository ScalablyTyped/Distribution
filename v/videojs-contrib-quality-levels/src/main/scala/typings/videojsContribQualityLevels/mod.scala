package typings.videojsContribQualityLevels

import typings.videojsContribQualityLevels.anon.Call
import typings.videojsContribQualityLevels.qualityLevelMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
    inline def apply(options: js.Object): Unit = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("videojs-contrib-quality-levels", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("videojs-contrib-quality-levels", "default.VERSION")
    @js.native
    def VERSION: String = js.native
    inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("videojs-contrib-quality-levels", "QualityLevel")
  @js.native
  open class QualityLevel protected () extends default {
    def this(representation: Representation) = this()
  }
  
  @JSImport("videojs-contrib-quality-levels", "QualityLevelList")
  @js.native
  open class QualityLevelList ()
    extends typings.videojsContribQualityLevels.qualityLevelListMod.default
  
  @js.native
  trait Representation extends StObject {
    
    var bandwidth: Double = js.native
    
    def enabled(): Boolean = js.native
    def enabled(enable: Boolean): Unit = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var id: String = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  
  /* augmented module */
  object videoJsAugmentingMod {
    
    trait VideoJsPlayer extends StObject {
      
      def qualityLevels(): typings.videojsContribQualityLevels.qualityLevelListMod.default
      @JSName("qualityLevels")
      var qualityLevels_Original: Call
    }
    object VideoJsPlayer {
      
      inline def apply(qualityLevels: Call): VideoJsPlayer = {
        val __obj = js.Dynamic.literal(qualityLevels = qualityLevels.asInstanceOf[js.Any])
        __obj.asInstanceOf[VideoJsPlayer]
      }
      
      extension [Self <: VideoJsPlayer](x: Self) {
        
        inline def setQualityLevels(value: Call): Self = StObject.set(x, "qualityLevels", value.asInstanceOf[js.Any])
      }
    }
  }
}
