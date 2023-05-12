package typings.vueTestUtils

import typings.std.Record
import typings.vueRuntimeCore.mod.Component
import typings.vueRuntimeCore.mod.ComponentOptionsMixin
import typings.vueRuntimeCore.mod.ComputedOptions
import typings.vueRuntimeCore.mod.ConcreteComponent
import typings.vueRuntimeCore.mod.DefineComponent_
import typings.vueRuntimeCore.mod.ExtractDefaultPropTypes
import typings.vueRuntimeCore.mod.MethodOptions
import typings.vueRuntimeCore.mod.PublicProps
import typings.vueRuntimeCore.mod.ResolveProps
import typings.vueRuntimeCore.mod.VNodeTypes
import typings.vueTestUtils.anon.Functional
import typings.vueTestUtils.anon.TypeofKeepAlive
import typings.vueTestUtils.anon.TypeofTeleport
import typings.vueTestUtils.distVnodeTransformersUtilMod.VTUVNodeTypeTransformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVnodeTransformersStubComponentsTransformerMod {
  
  @JSImport("@vue/test-utils/dist/vnodeTransformers/stubComponentsTransformer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    ResolveProps[js.Object, js.Object], 
    ExtractDefaultPropTypes[js.Object], 
    js.Object
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
    ResolveProps[js.Object, js.Object], 
    ExtractDefaultPropTypes[js.Object], 
    js.Object
  ]]
  
  inline def createStubComponentsTransformer(param0: CreateStubComponentsTransformerConfig): VTUVNodeTypeTransformer = ^.asInstanceOf[js.Dynamic].applyDynamic("createStubComponentsTransformer")(param0.asInstanceOf[js.Any]).asInstanceOf[VTUVNodeTypeTransformer]
  
  trait CreateStubComponentsTransformerConfig extends StObject {
    
    var renderStubDefaultSlot: Boolean
    
    var rootComponents: Functional
    
    var shallow: js.UndefOr[Boolean] = js.undefined
    
    var stubs: js.UndefOr[
        Record[String, (Component[Any, Any, Any, ComputedOptions, MethodOptions]) | Boolean]
      ] = js.undefined
  }
  object CreateStubComponentsTransformerConfig {
    
    inline def apply(renderStubDefaultSlot: Boolean, rootComponents: Functional): CreateStubComponentsTransformerConfig = {
      val __obj = js.Dynamic.literal(renderStubDefaultSlot = renderStubDefaultSlot.asInstanceOf[js.Any], rootComponents = rootComponents.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateStubComponentsTransformerConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateStubComponentsTransformerConfig] (val x: Self) extends AnyVal {
      
      inline def setRenderStubDefaultSlot(value: Boolean): Self = StObject.set(x, "renderStubDefaultSlot", value.asInstanceOf[js.Any])
      
      inline def setRootComponents(value: Functional): Self = StObject.set(x, "rootComponents", value.asInstanceOf[js.Any])
      
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
    
    var `type`: js.UndefOr[VNodeTypes | TypeofTeleport | TypeofKeepAlive] = js.undefined
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
      
      inline def setType(value: VNodeTypes | TypeofTeleport | TypeofKeepAlive): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
