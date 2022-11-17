package typings.vueRuntimeCore.mod

import typings.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentOptionsWithArrayProps[PropNames /* <: String */, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, I /* <: ComponentInjectOptions */, II /* <: String */, Props]
  extends StObject
     with ComponentOptionsBase[Props, RawBindings, D, C, M, Mixin, Extends, E, EE, js.Object, I, II]
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
        false, 
        I, 
        IntersectionMixin[Mixin] & IntersectionMixin[Extends], 
        (UnwrapMixinsType[IntersectionMixin[Mixin] & IntersectionMixin[Extends], "P"]) & EnsureNonVoid[Props], 
        (UnwrapMixinsType[IntersectionMixin[Mixin] & IntersectionMixin[Extends], "B"]) & EnsureNonVoid[RawBindings], 
        (UnwrapMixinsType[IntersectionMixin[Mixin] & IntersectionMixin[Extends], "D"]) & EnsureNonVoid[D], 
        (UnwrapMixinsType[IntersectionMixin[Mixin] & IntersectionMixin[Extends], "C"]) & EnsureNonVoid[C], 
        (UnwrapMixinsType[IntersectionMixin[Mixin] & IntersectionMixin[Extends], "M"]) & EnsureNonVoid[M], 
        (UnwrapMixinsType[IntersectionMixin[Mixin] & IntersectionMixin[Extends], "Defaults"]) & EnsureNonVoid[js.Object]
      ]
    ] {
  
  var props: js.Array[PropNames]
}
object ComponentOptionsWithArrayProps {
  
  inline def apply[PropNames /* <: String */, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, I /* <: ComponentInjectOptions */, II /* <: String */, Props](props: js.Array[PropNames]): ComponentOptionsWithArrayProps[PropNames, RawBindings, D, C, M, Mixin, Extends, E, EE, I, II, Props] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentOptionsWithArrayProps[PropNames, RawBindings, D, C, M, Mixin, Extends, E, EE, I, II, Props]]
  }
  
  extension [Self <: ComponentOptionsWithArrayProps[?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?], PropNames /* <: String */, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, I /* <: ComponentInjectOptions */, II /* <: String */, Props](x: Self & (ComponentOptionsWithArrayProps[PropNames, RawBindings, D, C, M, Mixin, Extends, E, EE, I, II, Props])) {
    
    inline def setProps(value: js.Array[PropNames]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsVarargs(value: PropNames*): Self = StObject.set(x, "props", js.Array(value*))
  }
}
