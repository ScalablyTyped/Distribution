package typings.wavesurferJs

import typings.std.HTMLElement
import typings.std.NodeList
import typings.wavesurferJs.paramsMod.WaveSurferParams
import typings.wavesurferJs.pluginMod.PluginDefinition
import typings.wavesurferJs.pluginMod.WaveSurferPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlInitMod {
  
  @JSImport("wavesurfer.js/src/html-init", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Init {
    def this(waveSurfer: typings.wavesurferJs.wavesurferMod.default) = this()
    def this(waveSurfer: typings.wavesurferJs.wavesurferMod.default, params: InitParams) = this()
    
    /** The nodes that should have instances attached to them. */
    /* CompleteClass */
    override val containers: NodeList = js.native
    
    /** Initialize all container elements. */
    /* CompleteClass */
    override def initAllEls(): Unit = js.native
    
    /** Initialize a single container element and add to `this.instances`. */
    /* CompleteClass */
    override def initEl(el: HTMLElement, plugins: js.Array[PluginDefinition]): typings.wavesurferJs.wavesurferMod.default = js.native
    
    /** An array of wavesurfer instances. */
    /* CompleteClass */
    override val instances: js.Array[typings.wavesurferJs.wavesurferMod.default] = js.native
  }
  
  trait Init extends StObject {
    
    /** The nodes that should have instances attached to them. */
    val containers: NodeList
    
    /** Initialize all container elements. */
    def initAllEls(): Unit
    
    /** Initialize a single container element and add to `this.instances`. */
    def initEl(el: HTMLElement, plugins: js.Array[PluginDefinition]): typings.wavesurferJs.wavesurferMod.default
    
    /** An array of wavesurfer instances. */
    val instances: js.Array[typings.wavesurferJs.wavesurferMod.default]
  }
  object Init {
    
    inline def apply(
      containers: NodeList,
      initAllEls: () => Unit,
      initEl: (HTMLElement, js.Array[PluginDefinition]) => typings.wavesurferJs.wavesurferMod.default,
      instances: js.Array[typings.wavesurferJs.wavesurferMod.default]
    ): Init = {
      val __obj = js.Dynamic.literal(containers = containers.asInstanceOf[js.Any], initAllEls = js.Any.fromFunction0(initAllEls), initEl = js.Any.fromFunction2(initEl), instances = instances.asInstanceOf[js.Any])
      __obj.asInstanceOf[Init]
    }
    
    extension [Self <: Init](x: Self) {
      
      inline def setContainers(value: NodeList): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
      
      inline def setInitAllEls(value: () => Unit): Self = StObject.set(x, "initAllEls", js.Any.fromFunction0(value))
      
      inline def setInitEl(value: (HTMLElement, js.Array[PluginDefinition]) => typings.wavesurferJs.wavesurferMod.default): Self = StObject.set(x, "initEl", js.Any.fromFunction2(value))
      
      inline def setInstances(value: js.Array[typings.wavesurferJs.wavesurferMod.default]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
      
      inline def setInstancesVarargs(value: typings.wavesurferJs.wavesurferMod.default*): Self = StObject.set(x, "instances", js.Array(value*))
    }
  }
  
  trait InitParams extends StObject {
    
    /** Selector or NodeList of elements to attach instances to. */
    var containers: js.UndefOr[String | NodeList] = js.undefined
    
    /** The default wavesurfer initialisation parameters (default: { backend: 'MediaElement', mediaControls: true }). */
    var defaults: js.UndefOr[WaveSurferParams] = js.undefined
    
    /** If set overwrites the default request function, can be used to inject plugins differently. */
    var loadPlugin: js.UndefOr[
        js.Function2[
          /* pluginName */ String, 
          /* callback */ js.Function1[/* plugin */ WaveSurferPlugin, Unit], 
          Unit
        ]
      ] = js.undefined
    
    /** URL template for the dynamic loading of plugins (default: '//localhost:8080/dist/plugin/wavesurfer.[name].js'). */
    var pluginCdnTemplate: js.UndefOr[String] = js.undefined
  }
  object InitParams {
    
    inline def apply(): InitParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitParams]
    }
    
    extension [Self <: InitParams](x: Self) {
      
      inline def setContainers(value: String | NodeList): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
      
      inline def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
      
      inline def setDefaults(value: WaveSurferParams): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      inline def setLoadPlugin(
        value: (/* pluginName */ String, /* callback */ js.Function1[/* plugin */ WaveSurferPlugin, Unit]) => Unit
      ): Self = StObject.set(x, "loadPlugin", js.Any.fromFunction2(value))
      
      inline def setLoadPluginUndefined: Self = StObject.set(x, "loadPlugin", js.undefined)
      
      inline def setPluginCdnTemplate(value: String): Self = StObject.set(x, "pluginCdnTemplate", value.asInstanceOf[js.Any])
      
      inline def setPluginCdnTemplateUndefined: Self = StObject.set(x, "pluginCdnTemplate", js.undefined)
    }
  }
}
