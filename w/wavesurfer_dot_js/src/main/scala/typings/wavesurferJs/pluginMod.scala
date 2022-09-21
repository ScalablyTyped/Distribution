package typings.wavesurferJs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.wavesurferJs.anon.Instantiable
import typings.wavesurferJs.wavesurferMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
  @JSImport("wavesurfer.js/types/plugin", "WaveSurferPlugin")
  @js.native
  abstract class WaveSurferPlugin protected () extends StObject {
    def this(params: Record[String, Any], ws: default) = this()
    
    def destroy(): Unit = js.native
    
    def init(): Unit = js.native
  }
  /* static members */
  object WaveSurferPlugin {
    
    @JSImport("wavesurfer.js/types/plugin", "WaveSurferPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(params: Record[String, Any]): PluginDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(params.asInstanceOf[js.Any]).asInstanceOf[PluginDefinition]
  }
  
  trait PluginDefinition extends StObject {
    
    /** Don't initialise plugin automatically. */
    var deferInit: js.UndefOr[Boolean] = js.undefined
    
    /** The plugin instance factory, is called with the dependency specified in extends. Returns the plugin class. */
    var instance: Instantiable
    
    /** The name of the plugin, the plugin instance will be added as a property to the wavesurfer instance under this name. */
    var name: String
    
    /** The plugin parameters, they are the first parameter passed to the plugin class constructor function. */
    var params: PluginParams
    
    /** The properties that should be added to the wavesurfer instance as static properties. */
    var staticProps: js.UndefOr[StringDictionary[Any]] = js.undefined
  }
  object PluginDefinition {
    
    inline def apply(instance: Instantiable, name: String, params: PluginParams): PluginDefinition = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginDefinition]
    }
    
    extension [Self <: PluginDefinition](x: Self) {
      
      inline def setDeferInit(value: Boolean): Self = StObject.set(x, "deferInit", value.asInstanceOf[js.Any])
      
      inline def setDeferInitUndefined: Self = StObject.set(x, "deferInit", js.undefined)
      
      inline def setInstance(value: Instantiable): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParams(value: PluginParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setStaticProps(value: StringDictionary[Any]): Self = StObject.set(x, "staticProps", value.asInstanceOf[js.Any])
      
      inline def setStaticPropsUndefined: Self = StObject.set(x, "staticProps", js.undefined)
    }
  }
  
  trait PluginParams
    extends StObject
       with /* paramName */ StringDictionary[Any] {
    
    /** Set to true to manually call (default: false). */
    var deferInit: js.UndefOr[Boolean] = js.undefined
  }
  object PluginParams {
    
    inline def apply(): PluginParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginParams]
    }
    
    extension [Self <: PluginParams](x: Self) {
      
      inline def setDeferInit(value: Boolean): Self = StObject.set(x, "deferInit", value.asInstanceOf[js.Any])
      
      inline def setDeferInitUndefined: Self = StObject.set(x, "deferInit", js.undefined)
    }
  }
}
