package typings.vueRuntimeCore.mod

import typings.std.Record
import typings.std.ThisType
import typings.vueRuntimeCore.vueRuntimeCoreBooleans.`false`
import typings.vueRuntimeCore.vueRuntimeCoreStrings.B
import typings.vueRuntimeCore.vueRuntimeCoreStrings.Defaults
import typings.vueRuntimeCore.vueRuntimeCoreStrings.P
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentOptionsWithArrayProps[PropNames /* <: String */, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, I /* <: ComponentInjectOptions */, II /* <: String */, S /* <: SlotsType[Record[String, Any]] */, Props]
  extends StObject
     with ComponentOptionsBase[Props, RawBindings, D, C, M, Mixin, Extends, E, EE, js.Object, I, II, S]
     with ThisType[
      CreateComponentPublicInstance[
        Props, 
        RawBindings, 
        D, 
        C, 
        M, 
        Mixin, 
        Extends, 
        E, 
        Props, 
        js.Object, 
        `false`, 
        I, 
        S, 
        IntersectionMixin[Mixin] & IntersectionMixin[Extends], 
        (UnwrapMixinsType[IntersectionMixin[Mixin] & IntersectionMixin[Extends], P]) & EnsureNonVoid[Props], 
        (UnwrapMixinsType[IntersectionMixin[Mixin] & IntersectionMixin[Extends], B]) & EnsureNonVoid[RawBindings], 
        (UnwrapMixinsType[
          IntersectionMixin[Mixin] & IntersectionMixin[Extends], 
          typings.vueRuntimeCore.vueRuntimeCoreStrings.D
        ]) & EnsureNonVoid[D], 
        (UnwrapMixinsType[
          IntersectionMixin[Mixin] & IntersectionMixin[Extends], 
          typings.vueRuntimeCore.vueRuntimeCoreStrings.C
        ]) & EnsureNonVoid[C], 
        (UnwrapMixinsType[
          IntersectionMixin[Mixin] & IntersectionMixin[Extends], 
          typings.vueRuntimeCore.vueRuntimeCoreStrings.M
        ]) & EnsureNonVoid[M], 
        (UnwrapMixinsType[IntersectionMixin[Mixin] & IntersectionMixin[Extends], Defaults]) & EnsureNonVoid[js.Object]
      ]
    ] {
  
  var props: js.Array[PropNames]
}
object ComponentOptionsWithArrayProps {
  
  inline def apply[PropNames /* <: String */, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, I /* <: ComponentInjectOptions */, II /* <: String */, S /* <: SlotsType[Record[String, Any]] */, Props](props: js.Array[PropNames]): ComponentOptionsWithArrayProps[PropNames, RawBindings, D, C, M, Mixin, Extends, E, EE, I, II, S, Props] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentOptionsWithArrayProps[PropNames, RawBindings, D, C, M, Mixin, Extends, E, EE, I, II, S, Props]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentOptionsWithArrayProps[?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?], PropNames /* <: String */, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, I /* <: ComponentInjectOptions */, II /* <: String */, S /* <: SlotsType[Record[String, Any]] */, Props] (val x: Self & (ComponentOptionsWithArrayProps[PropNames, RawBindings, D, C, M, Mixin, Extends, E, EE, I, II, S, Props])) extends AnyVal {
    
    inline def setProps(value: js.Array[PropNames]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsVarargs(value: PropNames*): Self = StObject.set(x, "props", js.Array(value*))
  }
}
