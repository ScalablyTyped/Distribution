package typings.vueTestUtils.anon

import typings.std.Record
import typings.vueRuntimeCore.mod.ComponentOptions
import typings.vueRuntimeCore.mod.ComputedOptions
import typings.vueRuntimeCore.mod.Directive
import typings.vueRuntimeCore.mod.MethodOptions
import typings.vueRuntimeCore.mod.Plugin2
import typings.vueTestUtils.distTypesMod.Stub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Omit<@vue/test-utils.@vue/test-utils/dist/types.GlobalMountOptions, 'stubs'>> & {  stubs :std.Record<string, @vue/test-utils.@vue/test-utils/dist/types.Stub>} */
trait RequiredOmitGlobalMountOp extends StObject {
  
  var components: Record[
    String, 
    (typings.vueRuntimeCore.mod.Component[Any, Any, Any, ComputedOptions, MethodOptions]) | js.Object
  ]
  
  var config: PartialOmitAppConfigisNat
  
  var directives: Record[String, Directive[Any, Any]]
  
  var mixins: js.Array[ComponentOptions[js.Object, Any, Any, Any, Any, Any, Any, Any]]
  
  var mocks: Record[String, Any]
  
  var plugins: js.Array[Plugin2 | (Array[Plugin2 | Any])]
  
  var provide: Record[Any, Any]
  
  var renderStubDefaultSlot: Boolean
  
  var stubs: Record[String, Stub]
}
object RequiredOmitGlobalMountOp {
  
  inline def apply(
    components: Record[
      String, 
      (typings.vueRuntimeCore.mod.Component[Any, Any, Any, ComputedOptions, MethodOptions]) | js.Object
    ],
    config: PartialOmitAppConfigisNat,
    directives: Record[String, Directive[Any, Any]],
    mixins: js.Array[ComponentOptions[js.Object, Any, Any, Any, Any, Any, Any, Any]],
    mocks: Record[String, Any],
    plugins: js.Array[Plugin2 | (Array[Plugin2 | Any])],
    provide: Record[Any, Any],
    renderStubDefaultSlot: Boolean,
    stubs: Record[String, Stub]
  ): RequiredOmitGlobalMountOp = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], mixins = mixins.asInstanceOf[js.Any], mocks = mocks.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], provide = provide.asInstanceOf[js.Any], renderStubDefaultSlot = renderStubDefaultSlot.asInstanceOf[js.Any], stubs = stubs.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredOmitGlobalMountOp]
  }
  
  extension [Self <: RequiredOmitGlobalMountOp](x: Self) {
    
    inline def setComponents(
      value: Record[
          String, 
          (typings.vueRuntimeCore.mod.Component[Any, Any, Any, ComputedOptions, MethodOptions]) | js.Object
        ]
    ): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: PartialOmitAppConfigisNat): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setDirectives(value: Record[String, Directive[Any, Any]]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    inline def setMixins(value: js.Array[ComponentOptions[js.Object, Any, Any, Any, Any, Any, Any, Any]]): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
    
    inline def setMixinsVarargs(value: (ComponentOptions[js.Object, Any, Any, Any, Any, Any, Any, Any])*): Self = StObject.set(x, "mixins", js.Array(value*))
    
    inline def setMocks(value: Record[String, Any]): Self = StObject.set(x, "mocks", value.asInstanceOf[js.Any])
    
    inline def setPlugins(value: js.Array[Plugin2 | (Array[Plugin2 | Any])]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsVarargs(value: (Plugin2 | (Array[Plugin2 | Any]))*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setProvide(value: Record[Any, Any]): Self = StObject.set(x, "provide", value.asInstanceOf[js.Any])
    
    inline def setRenderStubDefaultSlot(value: Boolean): Self = StObject.set(x, "renderStubDefaultSlot", value.asInstanceOf[js.Any])
    
    inline def setStubs(value: Record[String, Stub]): Self = StObject.set(x, "stubs", value.asInstanceOf[js.Any])
  }
}
