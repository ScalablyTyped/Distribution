package typings.wavesurferJs

import typings.std.HTMLElement
import typings.wavesurferJs.typesPluginMod.PluginDefinition
import typings.wavesurferJs.typesPluginMod.PluginParams
import typings.wavesurferJs.wavesurferJsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPluginMinimapMod {
  
  @JSImport("wavesurfer.js/src/plugin/minimap", JSImport.Default)
  @js.native
  open class default protected () extends MinimapPlugin {
    def this(params: MinimapPluginParams, ws: typings.wavesurferJs.srcWavesurferMod.default) = this()
  }
  /* static members */
  object default {
    
    @JSImport("wavesurfer.js/src/plugin/minimap", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(params: MinimapPluginParams): PluginDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(params.asInstanceOf[js.Any]).asInstanceOf[PluginDefinition]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.wavesurferJs.typesPluginMod.WaveSurferPlugin because Inheritance from two classes. Inlined init, destroy */ @js.native
  trait MinimapPlugin
    extends typings.wavesurferJs.srcUtilObserverMod.default {
    
    def bindMinmapEvents(): Unit = js.native
    
    def bindWavesurferEvents(): Unit = js.native
    
    def createElements(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    val draggingOverview: Boolean = js.native
    
    val drawer: typings.wavesurferJs.srcDrawerMod.default = js.native
    
    def getWidth(): Double = js.native
    
    def init(): Unit = js.native
    
    def moveOverviewRegion(pixels: Double): Unit = js.native
    
    val overviewPosition: Double = js.native
    
    val overviewRegion: HTMLElement | Null = js.native
    
    val overviewWidth: Double | Null = js.native
    
    val params: MinimapPluginParams = js.native
    
    val ratio: Double = js.native
    
    def regions(): Unit = js.native
    
    val regionsPlugin: typings.wavesurferJs.srcPluginRegionsMod.default | Null = js.native
    
    def render(): Unit = js.native
    
    val renderEvent: String = js.native
    
    def renderRegions(): Unit = js.native
    
    val util: /* import warning: importer.ImportType#apply Failed type conversion: wavesurfer.js.wavesurfer.js/src/wavesurfer.default['util'] */ js.Any = js.native
    
    val waveShowedWidth: Double = js.native
    
    val waveWidth: Double = js.native
    
    val wavesurfer: typings.wavesurferJs.srcWavesurferMod.default = js.native
  }
  
  trait MinimapPluginParams
    extends StObject
       with PluginParams {
    
    /** CSS selector or HTML element where the map should be rendered. By default it is simply appended after the waveform. */
    var container: js.UndefOr[String | HTMLElement | `false`] = js.undefined
  }
  object MinimapPluginParams {
    
    inline def apply(): MinimapPluginParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MinimapPluginParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MinimapPluginParams] (val x: Self) extends AnyVal {
      
      inline def setContainer(value: String | HTMLElement | `false`): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    }
  }
}
