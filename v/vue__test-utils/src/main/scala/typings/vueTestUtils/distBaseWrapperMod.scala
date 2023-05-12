package typings.vueTestUtils

import typings.std.Element
import typings.std.Node
import typings.vueRuntimeCore.mod.ComponentInternalInstance
import typings.vueRuntimeCore.mod.ComponentOptions
import typings.vueRuntimeCore.mod.ComponentOptionsMixin
import typings.vueRuntimeCore.mod.ComputedOptions
import typings.vueRuntimeCore.mod.CreateComponentPublicInstance
import typings.vueRuntimeCore.mod.EnsureNonVoid
import typings.vueRuntimeCore.mod.FunctionalComponent
import typings.vueRuntimeCore.mod.IntersectionMixin
import typings.vueRuntimeCore.mod.MethodOptions
import typings.vueRuntimeCore.mod.UnwrapMixinsType
import typings.vueTestUtils.anon.OmitDOMWrapperElementexis
import typings.vueTestUtils.anon.OmitVueWrapperComponentPu
import typings.vueTestUtils.anon.Omitdefaultexists
import typings.vueTestUtils.anon.Raw
import typings.vueTestUtils.anon.VueNodeNode
import typings.vueTestUtils.distInterfacesWrapperLikeMod.WrapperLike
import typings.vueTestUtils.distTypesMod.FindComponentSelector
import typings.vueTestUtils.distTypesMod.NameSelector
import typings.vueTestUtils.distTypesMod.RefSelector
import typings.vueTestUtils.distTypesMod.VueNode
import typings.vueTestUtils.distVueWrapperMod.VueWrapper
import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import typings.vueTestUtils.vueTestUtilsStrings.B
import typings.vueTestUtils.vueTestUtilsStrings.Defaults
import typings.vueTestUtils.vueTestUtilsStrings.P
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBaseWrapperMod {
  
  /* note: abstract class */ @JSImport("@vue/test-utils/dist/baseWrapper", JSImport.Default)
  @js.native
  open class default[ElementType /* <: Node */] protected ()
    extends StObject
       with BaseWrapper[ElementType] {
    /* protected */ def this(element: ElementType) = this()
  }
  
  @js.native
  trait BaseWrapper[ElementType /* <: Node */]
    extends StObject
       with WrapperLike {
    
    @JSName("element")
    def element_MBaseWrapper: VueNode[ElementType] = js.native
    
    /* protected */ def findAllDOMElements(selector: String): js.Array[Element] = js.native
    
    def findComponent[Props, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */](selector: ComponentOptions[Props, RawBindings, D, C, M, Any, Any, Any, Any]): VueWrapper[
        CreateComponentPublicInstance[
          Props, 
          RawBindings, 
          D, 
          C, 
          M, 
          ComponentOptionsMixin, 
          ComponentOptionsMixin, 
          js.Object, 
          Props, 
          js.Object, 
          `false`, 
          js.Object, 
          js.Object, 
          IntersectionMixin[ComponentOptionsMixin], 
          (UnwrapMixinsType[IntersectionMixin[ComponentOptionsMixin], P]) & EnsureNonVoid[Props], 
          (UnwrapMixinsType[IntersectionMixin[ComponentOptionsMixin], B]) & EnsureNonVoid[RawBindings], 
          (UnwrapMixinsType[
            IntersectionMixin[ComponentOptionsMixin], 
            typings.vueTestUtils.vueTestUtilsStrings.D
          ]) & EnsureNonVoid[D], 
          (UnwrapMixinsType[
            IntersectionMixin[ComponentOptionsMixin], 
            typings.vueTestUtils.vueTestUtilsStrings.C
          ]) & EnsureNonVoid[C], 
          (UnwrapMixinsType[
            IntersectionMixin[ComponentOptionsMixin], 
            typings.vueTestUtils.vueTestUtilsStrings.M
          ]) & EnsureNonVoid[M], 
          (UnwrapMixinsType[IntersectionMixin[ComponentOptionsMixin], Defaults]) & EnsureNonVoid[js.Object]
        ]
      ] = js.native
    @JSName("findComponent")
    def findComponent_T_VueWrapper[T /* <: ComponentOptions[js.Object, Any, Any, Any, Any, Any, Any, Any, Any] */](selector: String): VueWrapper[
        /* import warning: importer.ImportType#apply Failed type conversion: T extends @vue/runtime-core.@vue/runtime-core.ComponentOptions<infer Props, infer RawBindings, infer D, infer C, infer M, any, any, any, any> ? @vue/runtime-core.@vue/runtime-core.CreateComponentPublicInstance<Props, RawBindings, D, C, M, @vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin, @vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin, {}, Props, {}, false, {}, {}, @vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin> & @vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin>, @vue/runtime-core.@vue/runtime-core.UnwrapMixinsType<@vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin> & @vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin>, 'P'> & @vue/runtime-core.@vue/runtime-core.EnsureNonVoid<Props>, @vue/runtime-core.@vue/runtime-core.UnwrapMixinsType<@vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin> & @vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin>, 'B'> & @vue/runtime-core.@vue/runtime-core.EnsureNonVoid<RawBindings>, @vue/runtime-core.@vue/runtime-core.UnwrapMixinsType<@vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin> & @vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin>, 'D'> & @vue/runtime-core.@vue/runtime-core.EnsureNonVoid<D>, @vue/runtime-core.@vue/runtime-core.UnwrapMixinsType<@vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin> & @vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin>, 'C'> & @vue/runtime-core.@vue/runtime-core.EnsureNonVoid<C>, @vue/runtime-core.@vue/runtime-core.UnwrapMixinsType<@vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin> & @vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin>, 'M'> & @vue/runtime-core.@vue/runtime-core.EnsureNonVoid<M>, @vue/runtime-core.@vue/runtime-core.UnwrapMixinsType<@vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin> & @vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin>, 'Defaults'> & @vue/runtime-core.@vue/runtime-core.EnsureNonVoid<{}>> : @vue/test-utils.@vue/test-utils/dist/vueWrapper.VueWrapper<@vue/runtime-core.@vue/runtime-core.CreateComponentPublicInstance<{}, {}, {}, {}, {}, @vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin, @vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin, {}, {}, {}, false, {}, {}, @vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin> & @vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin>, @vue/runtime-core.@vue/runtime-core.UnwrapMixinsType<@vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin> & @vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin>, 'P'> & @vue/runtime-core.@vue/runtime-core.EnsureNonVoid<{}>, @vue/runtime-core.@vue/runtime-core.UnwrapMixinsType<@vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin> & @vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin>, 'B'> & @vue/runtime-core.@vue/runtime-core.EnsureNonVoid<{}>, @vue/runtime-core.@vue/runtime-core.UnwrapMixinsType<@vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin> & @vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin>, 'D'> & @vue/runtime-core.@vue/runtime-core.EnsureNonVoid<{}>, @vue/runtime-core.@vue/runtime-core.UnwrapMixinsType<@vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin> & @vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin>, 'C'> & @vue/runtime-core.@vue/runtime-core.EnsureNonVoid<{}>, @vue/runtime-core.@vue/runtime-core.UnwrapMixinsType<@vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin> & @vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin>, 'M'> & @vue/runtime-core.@vue/runtime-core.EnsureNonVoid<{}>, @vue/runtime-core.@vue/runtime-core.UnwrapMixinsType<@vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin> & @vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin>, 'Defaults'> & @vue/runtime-core.@vue/runtime-core.EnsureNonVoid<{}>>> */ js.Any
      ] = js.native
    @JSName("findComponent")
    def findComponent_T_WrapperLike[T /* <: scala.Nothing */](selector: FindComponentSelector): WrapperLike = js.native
    
    def getComponent[T /* <: scala.Nothing */](selector: NameSelector): OmitVueWrapperComponentPu = js.native
    def getComponent[T /* <: scala.Nothing */](selector: RefSelector): OmitVueWrapperComponentPu = js.native
    @JSName("getComponent")
    def getComponent_T_OmitDOMWrapperElementexis[T /* <: FunctionalComponent[js.Object, js.Object, Any] */](selector: T): OmitDOMWrapperElementexis = js.native
    @JSName("getComponent")
    def getComponent_T_OmitDOMWrapperElementexis[T /* <: FunctionalComponent[js.Object, js.Object, Any] */](selector: String): OmitDOMWrapperElementexis = js.native
    @JSName("getComponent")
    def getComponent_T_Omitdefaultexists[T /* <: scala.Nothing */](selector: FindComponentSelector): Omitdefaultexists = js.native
    
    /* protected */ def getCurrentComponent(): ComponentInternalInstance | Unit = js.native
    
    /* protected */ def getRootNodes(): js.Array[VueNodeNode] = js.native
    
    def html(options: Raw): String = js.native
    
    /* protected */ def isDisabled(): Boolean = js.native
    
    def setValue(): js.Promise[Unit] = js.native
    
    /* protected */ val wrapperElement: VueNode[ElementType] = js.native
  }
}
