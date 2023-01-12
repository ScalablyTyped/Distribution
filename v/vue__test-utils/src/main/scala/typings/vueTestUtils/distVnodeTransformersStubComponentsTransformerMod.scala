package typings.vueTestUtils

import typings.std.Record
import typings.std.WeakSet
import typings.vueRuntimeCore.mod.Component
import typings.vueRuntimeCore.mod.ComponentOptionsMixin
import typings.vueRuntimeCore.mod.ComputedOptions
import typings.vueRuntimeCore.mod.ConcreteComponent
import typings.vueRuntimeCore.mod.DefineComponent_
import typings.vueRuntimeCore.mod.ExtractDefaultPropTypes
import typings.vueRuntimeCore.mod.MethodOptions
import typings.vueRuntimeCore.mod.PublicProps
import typings.vueRuntimeCore.mod.VNodeTypes
import typings.vueTestUtils.anon.TypeofTeleport
import typings.vueTestUtils.distVnodeTransformersUtilMod.VTUVNodeTypeTransformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVnodeTransformersStubComponentsTransformerMod {
  
  @JSImport("@vue/test-utils/dist/vnodeTransformers/stubComponentsTransformer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addToDoNotStubComponents(`type`: ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions]): WeakSet[ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions]] = ^.asInstanceOf[js.Dynamic].applyDynamic("addToDoNotStubComponents")(`type`.asInstanceOf[js.Any]).asInstanceOf[WeakSet[ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions]]]
  
  inline def createStub(param0: StubOptions): DefineComponent_[
    js.Object, 
    js.Object, 
    js.Object, 
    ComputedOptions, 
    MethodOptions, 
    ComponentOptionsMixin, 
    ComponentOptionsMixin, 
    js.Object, 
    String, 
    PublicProps, 
    /* import warning: importer.ImportType#apply Failed type conversion: {} extends @vue/runtime-core.@vue/runtime-core.ComponentPropsOptions<@vue/runtime-core.@vue/runtime-core.Data> ? @vue/runtime-core.@vue/runtime-core.ExtractPropTypes<{}> : {} */ js.Any, 
    ExtractDefaultPropTypes[js.Object]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStub")(param0.asInstanceOf[js.Any]).asInstanceOf[DefineComponent_[
    js.Object, 
    js.Object, 
    js.Object, 
    ComputedOptions, 
    MethodOptions, 
    ComponentOptionsMixin, 
    ComponentOptionsMixin, 
    js.Object, 
    String, 
    PublicProps, 
    /* import warning: importer.ImportType#apply Failed type conversion: {} extends @vue/runtime-core.@vue/runtime-core.ComponentPropsOptions<@vue/runtime-core.@vue/runtime-core.Data> ? @vue/runtime-core.@vue/runtime-core.ExtractPropTypes<{}> : {} */ js.Any, 
    ExtractDefaultPropTypes[js.Object]
  ]]
  
  inline def createStubComponentsTransformer(param0: CreateStubComponentsTransformerConfig): VTUVNodeTypeTransformer = ^.asInstanceOf[js.Dynamic].applyDynamic("createStubComponentsTransformer")(param0.asInstanceOf[js.Any]).asInstanceOf[VTUVNodeTypeTransformer]
  
  trait CreateStubComponentsTransformerConfig extends StObject {
    
    var renderStubDefaultSlot: Boolean
    
    var shallow: js.UndefOr[Boolean] = js.undefined
    
    var stubs: js.UndefOr[
        Record[String, (Component[Any, Any, Any, ComputedOptions, MethodOptions]) | Boolean]
      ] = js.undefined
  }
  object CreateStubComponentsTransformerConfig {
    
    inline def apply(renderStubDefaultSlot: Boolean): CreateStubComponentsTransformerConfig = {
      val __obj = js.Dynamic.literal(renderStubDefaultSlot = renderStubDefaultSlot.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateStubComponentsTransformerConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateStubComponentsTransformerConfig] (val x: Self) extends AnyVal {
      
      inline def setRenderStubDefaultSlot(value: Boolean): Self = StObject.set(x, "renderStubDefaultSlot", value.asInstanceOf[js.Any])
      
      inline def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
      
      inline def setShallowUndefined: Self = StObject.set(x, "shallow", js.undefined)
      
      inline def setStubs(value: Record[String, (Component[Any, Any, Any, ComputedOptions, MethodOptions]) | Boolean]): Self = StObject.set(x, "stubs", value.asInstanceOf[js.Any])
      
      inline def setStubsUndefined: Self = StObject.set(x, "stubs", js.undefined)
    }
  }
  
  type CustomCreateStub = js.Function1[
    /* params */ typings.vueTestUtils.anon.Component, 
    ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions]
  ]
  
  trait StubOptions extends StObject {
    
    var name: String
    
    var renderStubDefaultSlot: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[VNodeTypes | TypeofTeleport] = js.undefined
  }
  object StubOptions {
    
    inline def apply(name: String): StubOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[StubOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StubOptions] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRenderStubDefaultSlot(value: Boolean): Self = StObject.set(x, "renderStubDefaultSlot", value.asInstanceOf[js.Any])
      
      inline def setRenderStubDefaultSlotUndefined: Self = StObject.set(x, "renderStubDefaultSlot", js.undefined)
      
      inline def setType(value: VNodeTypes | TypeofTeleport): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
