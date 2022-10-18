package typings.vueTestUtils.anon

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
import typings.vueRuntimeDom.anon.Styles
import typings.vueRuntimeDom.mod.VueElementConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofdefineSSRCustomElem extends StObject {
  
  def apply(options: typings.vueRuntimeDom.anon.Instantiable): VueElementConstructor[js.Object] = js.native
  def apply[Props, RawBindings](
    setup: js.Function2[
      /* props */ Props, 
      /* ctx */ SetupContext[EmitsOptions], 
      RawBindings | RenderFunction
    ]
  ): VueElementConstructor[Props] = js.native
  def apply[PropNames /* <: String */, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */](
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
      (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in PropNames ]:? any} */ js.Any) & EmitsToProps[E]
    ]) & Styles
  ): VueElementConstructor[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in PropNames ]: any} */ js.Any
  ] = js.native
  def apply[Props, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */](
    options: (ComponentOptionsWithoutProps[Props, RawBindings, D, C, M, Mixin, Extends, E, EE, Props & EmitsToProps[E]]) & Styles
  ): VueElementConstructor[Props] = js.native
  def apply[PropsOptions /* <: ComponentPropsOptions[Data] */, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */](
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
      ExtractPropTypes[PropsOptions] & EmitsToProps[E], 
      ExtractDefaultPropTypes[PropsOptions]
    ]) & Styles
  ): VueElementConstructor[ExtractPropTypes[PropsOptions]] = js.native
}
