package typings.vueRuntimeCore.mod

import typings.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentOptions[Props, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */]
  extends StObject
     with ComponentOptionsBase[Props, RawBindings, D, C, M, Mixin, Extends, E, String, js.Object, js.Object, String]
     with ThisType[
      CreateComponentPublicInstance[
        js.Object, 
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
        js.Object, 
        IntersectionMixin[Mixin] & IntersectionMixin[Extends], 
        (UnwrapMixinsType[IntersectionMixin[Mixin] & IntersectionMixin[Extends], "P"]) & EnsureNonVoid[js.Object], 
        (UnwrapMixinsType[IntersectionMixin[Mixin] & IntersectionMixin[Extends], "B"]) & EnsureNonVoid[RawBindings], 
        (UnwrapMixinsType[IntersectionMixin[Mixin] & IntersectionMixin[Extends], "D"]) & EnsureNonVoid[D], 
        (UnwrapMixinsType[IntersectionMixin[Mixin] & IntersectionMixin[Extends], "C"]) & EnsureNonVoid[C], 
        (UnwrapMixinsType[IntersectionMixin[Mixin] & IntersectionMixin[Extends], "M"]) & EnsureNonVoid[M], 
        (UnwrapMixinsType[IntersectionMixin[Mixin] & IntersectionMixin[Extends], "Defaults"]) & EnsureNonVoid[js.Object]
      ]
    ]
object ComponentOptions {
  
  inline def apply[Props, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */](): ComponentOptions[Props, RawBindings, D, C, M, Mixin, Extends, E] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentOptions[Props, RawBindings, D, C, M, Mixin, Extends, E]]
  }
}
