package typings.vueTestUtils.anon

import typings.std.Record
import typings.vueRuntimeCore.mod.ComponentInjectOptions
import typings.vueRuntimeCore.mod.ComponentOptionsMixin
import typings.vueRuntimeCore.mod.ComponentOptionsWithArrayProps
import typings.vueRuntimeCore.mod.ComponentOptionsWithObjectProps
import typings.vueRuntimeCore.mod.ComponentOptionsWithoutProps
import typings.vueRuntimeCore.mod.ComponentPropsOptions
import typings.vueRuntimeCore.mod.ComputedOptions
import typings.vueRuntimeCore.mod.Data
import typings.vueRuntimeCore.mod.EmitsOptions
import typings.vueRuntimeCore.mod.EmitsToProps
import typings.vueRuntimeCore.mod.ExtractDefaultPropTypes
import typings.vueRuntimeCore.mod.ExtractPropTypes
import typings.vueRuntimeCore.mod.MethodOptions
import typings.vueRuntimeCore.mod.RenderFunction
import typings.vueRuntimeCore.mod.SetupContext
import typings.vueRuntimeCore.mod.SlotsType
import typings.vueRuntimeDom.anon.Styles
import typings.vueRuntimeDom.mod.VueElementConstructor
import typings.vueShared.mod.Prettify
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofdefineSSRCustomElem extends StObject {
  
  def apply(options: typings.vueRuntimeDom.anon.Instantiable): VueElementConstructor[js.Object] = js.native
  def apply[Props, RawBindings](
    setup: js.Function2[
      /* props */ Props, 
      /* ctx */ SetupContext[EmitsOptions, js.Object], 
      RawBindings | RenderFunction
    ]
  ): VueElementConstructor[Props] = js.native
  def apply[PropNames /* <: String */, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, I /* <: ComponentInjectOptions */, II /* <: String */, S /* <: SlotsType[Record[String, Any]] */](
    options: (ComponentOptionsWithArrayProps[
      PropNames, 
      RawBindings, 
      D, 
      C, 
      M, 
      Mixin, 
      Extends, 
      E, 
      EE, 
      I, 
      II, 
      S, 
      Prettify[
        (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in PropNames ]:? any} */ js.Any) & EmitsToProps[E]
      ]
    ]) & Styles
  ): VueElementConstructor[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in PropNames ]: any} */ js.Any
  ] = js.native
  def apply[Props, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, I /* <: ComponentInjectOptions */, II /* <: String */, S /* <: SlotsType[Record[String, Any]] */](
    options: (ComponentOptionsWithoutProps[Props, RawBindings, D, C, M, Mixin, Extends, E, EE, I, II, S, Props & EmitsToProps[E]]) & Styles
  ): VueElementConstructor[Props] = js.native
  def apply[PropsOptions /* <: ComponentPropsOptions[Data] */, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, I /* <: ComponentInjectOptions */, II /* <: String */, S /* <: SlotsType[Record[String, Any]] */](
    options: (ComponentOptionsWithObjectProps[
      PropsOptions, 
      RawBindings, 
      D, 
      C, 
      M, 
      Mixin, 
      Extends, 
      E, 
      EE, 
      I, 
      II, 
      S, 
      Prettify[ExtractPropTypes[PropsOptions] & EmitsToProps[E]], 
      ExtractDefaultPropTypes[PropsOptions]
    ]) & Styles
  ): VueElementConstructor[ExtractPropTypes[PropsOptions]] = js.native
}
