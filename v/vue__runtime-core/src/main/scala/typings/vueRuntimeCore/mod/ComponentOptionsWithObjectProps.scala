package typings.vueRuntimeCore.mod

import typings.std.Record
import typings.std.ThisType
import typings.vueRuntimeCore.vueRuntimeCoreBooleans.`false`
import typings.vueRuntimeCore.vueRuntimeCoreStrings.B
import typings.vueRuntimeCore.vueRuntimeCoreStrings.P
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentOptionsWithObjectProps[PropsOptions, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, I /* <: ComponentInjectOptions */, II /* <: String */, S /* <: SlotsType[Record[String, Any]] */, Props, Defaults]
  extends StObject
     with ComponentOptionsBase[Props, RawBindings, D, C, M, Mixin, Extends, E, EE, Defaults, I, II, S]
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
        Defaults, 
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
        (UnwrapMixinsType[
          IntersectionMixin[Mixin] & IntersectionMixin[Extends], 
          typings.vueRuntimeCore.vueRuntimeCoreStrings.Defaults
        ]) & EnsureNonVoid[Defaults]
      ]
    ] {
  
  var props: PropsOptions & ThisType[Unit]
}
object ComponentOptionsWithObjectProps {
  
  inline def apply[PropsOptions, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, I /* <: ComponentInjectOptions */, II /* <: String */, S /* <: SlotsType[Record[String, Any]] */, Props, Defaults](props: PropsOptions & ThisType[Unit]): ComponentOptionsWithObjectProps[PropsOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, I, II, S, Props, Defaults] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentOptionsWithObjectProps[PropsOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, I, II, S, Props, Defaults]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentOptionsWithObjectProps[?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?], PropsOptions, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, I /* <: ComponentInjectOptions */, II /* <: String */, S /* <: SlotsType[Record[String, Any]] */, Props, Defaults] (val x: Self & (ComponentOptionsWithObjectProps[PropsOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, I, II, S, Props, Defaults])) extends AnyVal {
    
    inline def setProps(value: PropsOptions & ThisType[Unit]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
