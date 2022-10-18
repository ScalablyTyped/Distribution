package typings.wavesurferJs

import typings.std.HTMLElement
import typings.wavesurferJs.typesPluginMod.PluginDefinition
import typings.wavesurferJs.typesPluginMod.PluginParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPluginElanMod {
  
  @JSImport("wavesurfer.js/src/plugin/elan", JSImport.Default)
  @js.native
  open class default protected () extends ElanPlugin {
    def this(params: ElanPluginParams, ws: typings.wavesurferJs.srcWavesurferMod.default) = this()
  }
  /* static members */
  object default {
    
    @JSImport("wavesurfer.js/src/plugin/elan", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(params: ElanPluginParams): PluginDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(params.asInstanceOf[js.Any]).asInstanceOf[PluginDefinition]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.wavesurferJs.typesPluginMod.WaveSurferPlugin because Inheritance from two classes. Inlined init, destroy */ @js.native
  trait ElanPlugin
    extends typings.wavesurferJs.srcUtilObserverMod.default {
    
    def destroy(): Unit = js.native
    
    def init(): Unit = js.native
  }
  
  trait ElanPluginParams
    extends StObject
       with PluginParams {
    
    /** CSS selector or HTML element where the ELAN information should be rendered. */
    var container: js.UndefOr[String | HTMLElement] = js.undefined
    
    /** If set only shows the data tiers with the TIER_ID in this map. */
    var tiers: js.UndefOr[Any] = js.undefined
    
    /** The location of ELAN XML data. */
    var url: js.UndefOr[String] = js.undefined
  }
  object ElanPluginParams {
    
    inline def apply(): ElanPluginParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElanPluginParams]
    }
    
    extension [Self <: ElanPluginParams](x: Self) {
      
      inline def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setTiers(value: Any): Self = StObject.set(x, "tiers", value.asInstanceOf[js.Any])
      
      inline def setTiersUndefined: Self = StObject.set(x, "tiers", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
