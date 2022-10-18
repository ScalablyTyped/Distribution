package typings.vueTestUtils

import typings.std.WeakSet
import typings.vueRuntimeCore.mod.ComponentOptionsMixin
import typings.vueRuntimeCore.mod.ComputedOptions
import typings.vueRuntimeCore.mod.ConcreteComponent
import typings.vueRuntimeCore.mod.DefineComponent_
import typings.vueRuntimeCore.mod.ExtractDefaultPropTypes
import typings.vueRuntimeCore.mod.MethodOptions
import typings.vueRuntimeCore.mod.PublicProps
import typings.vueRuntimeCore.mod.VNodeTypes
import typings.vueTestUtils.anon.Component
import typings.vueTestUtils.anon.OriginalStub
import typings.vueTestUtils.anon.TypeofTeleport
import typings.vueTestUtils.distTypesMod.Stubs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStubsMod {
  
  @JSImport("@vue/test-utils/dist/stubs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addToDoNotStubComponents(`type`: ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions]): WeakSet[ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions]] = ^.asInstanceOf[js.Dynamic].applyDynamic("addToDoNotStubComponents")(`type`.asInstanceOf[js.Any]).asInstanceOf[WeakSet[ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions]]]
  
  inline def createStub(hasNameTypeRenderStubDefaultSlot: StubOptions): DefineComponent_[
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
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStub")(hasNameTypeRenderStubDefaultSlot.asInstanceOf[js.Any]).asInstanceOf[DefineComponent_[
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
  
  inline def getOriginalStubFromSpecializedStub(`type`: ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions]): js.UndefOr[VNodeTypes] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOriginalStubFromSpecializedStub")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[VNodeTypes]]
  
  inline def getOriginalVNodeTypeFromStub(`type`: ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions]): js.UndefOr[VNodeTypes] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOriginalVNodeTypeFromStub")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[VNodeTypes]]
  
  inline def registerStub(hasSourceStubOriginalStub: OriginalStub): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerStub")(hasSourceStubOriginalStub.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def stubComponents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stubComponents")().asInstanceOf[Unit]
  inline def stubComponents(stubs: Unit, shallow: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stubComponents")(stubs.asInstanceOf[js.Any], shallow.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stubComponents(stubs: Unit, shallow: Boolean, renderStubDefaultSlot: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stubComponents")(stubs.asInstanceOf[js.Any], shallow.asInstanceOf[js.Any], renderStubDefaultSlot.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stubComponents(stubs: Unit, shallow: Unit, renderStubDefaultSlot: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stubComponents")(stubs.asInstanceOf[js.Any], shallow.asInstanceOf[js.Any], renderStubDefaultSlot.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stubComponents(stubs: Stubs): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stubComponents")(stubs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def stubComponents(stubs: Stubs, shallow: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stubComponents")(stubs.asInstanceOf[js.Any], shallow.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stubComponents(stubs: Stubs, shallow: Boolean, renderStubDefaultSlot: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stubComponents")(stubs.asInstanceOf[js.Any], shallow.asInstanceOf[js.Any], renderStubDefaultSlot.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stubComponents(stubs: Stubs, shallow: Unit, renderStubDefaultSlot: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stubComponents")(stubs.asInstanceOf[js.Any], shallow.asInstanceOf[js.Any], renderStubDefaultSlot.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type CustomCreateStub = js.Function1[
    /* params */ Component, 
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
    
    extension [Self <: StubOptions](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRenderStubDefaultSlot(value: Boolean): Self = StObject.set(x, "renderStubDefaultSlot", value.asInstanceOf[js.Any])
      
      inline def setRenderStubDefaultSlotUndefined: Self = StObject.set(x, "renderStubDefaultSlot", js.undefined)
      
      inline def setType(value: VNodeTypes | TypeofTeleport): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
