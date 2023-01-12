package typings.wavesurferJs

import typings.std.EventListener
import typings.std.HTMLElement
import typings.std.Record
import typings.wavesurferJs.typesPluginMod.PluginDefinition
import typings.wavesurferJs.typesPluginMod.PluginParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPluginPlayheadMod {
  
  @JSImport("wavesurfer.js/src/plugin/playhead", JSImport.Default)
  @js.native
  open class default protected () extends PlayheadPlugin {
    def this(params: PlayheadPluginParams, ws: typings.wavesurferJs.srcWavesurferMod.default) = this()
  }
  /* static members */
  object default {
    
    @JSImport("wavesurfer.js/src/plugin/playhead", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(params: PlayheadPluginParams): PluginDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(params.asInstanceOf[js.Any]).asInstanceOf[PluginDefinition]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.wavesurferJs.typesPluginMod.WaveSurferPlugin because Inheritance from two classes. Inlined init, destroy */ @js.native
  trait PlayheadPlugin
    extends typings.wavesurferJs.srcUtilObserverMod.default {
    
    def destroy(): Unit = js.native
    
    val element: HTMLElement = js.native
    
    def init(): Unit = js.native
    
    val markerHeight: Double = js.native
    
    val markerWidth: Double = js.native
    
    val options: Record[String, Any] = js.native
    
    val params: PlayheadPluginParams = js.native
    
    val playheadTime: Double = js.native
    
    def setPlayheadTime(time: Double): Unit = js.native
    
    val style: /* import warning: importer.ImportType#apply Failed type conversion: wavesurfer.js.wavesurfer.js/src/wavesurfer.default['util']['style'] */ js.Any = js.native
    
    val unFuns: js.Array[js.ThisFunction0[/* this */ typings.wavesurferJs.srcWavesurferMod.default, Unit]] = js.native
    
    val util: /* import warning: importer.ImportType#apply Failed type conversion: wavesurfer.js.wavesurfer.js/src/wavesurfer.default['util'] */ js.Any = js.native
    
    val wavesurfer: typings.wavesurferJs.srcWavesurferMod.default = js.native
    
    def wavesurferOn(ev: String, fn: EventListener): Unit = js.native
    
    val wrapper: HTMLElement = js.native
  }
  
  trait PlayheadPluginParams
    extends StObject
       with PluginParams {
    
    /** Draw the playhead as a triangle/line. */
    var draw: js.UndefOr[Boolean] = js.undefined
    
    /** Seeking (via clicking) while playing moves the playhead. */
    var moveOnSeek: js.UndefOr[Boolean] = js.undefined
    
    /** Pausing the track returns the seek position to the playhead. */
    var returnOnPause: js.UndefOr[Boolean] = js.undefined
  }
  object PlayheadPluginParams {
    
    inline def apply(): PlayheadPluginParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlayheadPluginParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PlayheadPluginParams] (val x: Self) extends AnyVal {
      
      inline def setDraw(value: Boolean): Self = StObject.set(x, "draw", value.asInstanceOf[js.Any])
      
      inline def setDrawUndefined: Self = StObject.set(x, "draw", js.undefined)
      
      inline def setMoveOnSeek(value: Boolean): Self = StObject.set(x, "moveOnSeek", value.asInstanceOf[js.Any])
      
      inline def setMoveOnSeekUndefined: Self = StObject.set(x, "moveOnSeek", js.undefined)
      
      inline def setReturnOnPause(value: Boolean): Self = StObject.set(x, "returnOnPause", value.asInstanceOf[js.Any])
      
      inline def setReturnOnPauseUndefined: Self = StObject.set(x, "returnOnPause", js.undefined)
    }
  }
}
