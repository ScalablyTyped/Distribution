package typings
package vueLib.typesVueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueConstructor[V /* <: Vue */]
  extends // ideally, the return type should just contain Props, not Record<keyof Props, any>. But TS requires to have Base constructors with the same return type.
org.scalablytyped.runtime.Instantiable0[
      CombinedVueInstance[V, js.Object, js.Object, js.Object, stdLib.Record[java.lang.String, js.Any]]
    ]
     with org.scalablytyped.runtime.Instantiable1[
      (/* options */ vueLib.typesOptionsMod.ComponentOptions[
        V, 
        vueLib.typesOptionsMod.DefaultData[V], 
        vueLib.typesOptionsMod.DefaultMethods[V], 
        vueLib.typesOptionsMod.DefaultComputed, 
        vueLib.typesOptionsMod.PropsDefinition[vueLib.typesOptionsMod.DefaultProps], 
        vueLib.typesOptionsMod.DefaultProps
      ]) | (/* options */ vueLib.typesOptionsMod.ThisTypedComponentOptionsWithArrayProps[V, js.Object, js.Object, js.Object, java.lang.String]) | (/* options */ vueLib.typesOptionsMod.ThisTypedComponentOptionsWithRecordProps[V, js.Object, js.Object, js.Object, js.Object]), 
      CombinedVueInstance[V, js.Object, js.Object, js.Object, stdLib.Record[java.lang.String, js.Any]]
    ] {
  var config: VueConfiguration = js.native
  var version: java.lang.String = js.native
  def compile(template: java.lang.String): vueLib.Anon_CreateElement = js.native
  def component(id: java.lang.String): VueConstructor[Vue] = js.native
  def component(
    id: java.lang.String,
    definition: vueLib.typesOptionsMod.ComponentOptions[
      V, 
      vueLib.typesOptionsMod.DefaultData[V], 
      vueLib.typesOptionsMod.DefaultMethods[V], 
      vueLib.typesOptionsMod.DefaultComputed, 
      vueLib.typesOptionsMod.PropsDefinition[vueLib.typesOptionsMod.DefaultProps], 
      vueLib.typesOptionsMod.DefaultProps
    ]
  ): ExtendedVue[V, js.Object, js.Object, js.Object, js.Object] = js.native
  def component[VC /* <: VueConstructor[Vue] */](id: java.lang.String, constructor: VC): VC = js.native
  def component[PropNames /* <: java.lang.String */](
    id: java.lang.String,
    definition: vueLib.typesOptionsMod.FunctionalComponentOptions[stdLib.Record[PropNames, _], js.Array[PropNames]]
  ): ExtendedVue[V, js.Object, js.Object, js.Object, stdLib.Record[PropNames, _]] = js.native
  def component[Data, Methods, Computed, Props](
    id: java.lang.String,
    definition: vueLib.typesOptionsMod.AsyncComponent[Data, Methods, Computed, Props]
  ): ExtendedVue[V, Data, Methods, Computed, Props] = js.native
  @JSName("component")
  def component_DataMethodsComputedPropNamesString[Data, Methods, Computed, PropNames /* <: java.lang.String */](
    id: java.lang.String,
    definition: vueLib.typesOptionsMod.ThisTypedComponentOptionsWithArrayProps[V, Data, Methods, Computed, PropNames]
  ): ExtendedVue[V, Data, Methods, Computed, stdLib.Record[PropNames, _]] = js.native
  @JSName("component")
  def component_DataMethodsComputedPropNamesStringExtendedVue[Data, Methods, Computed, PropNames /* <: java.lang.String */](id: java.lang.String): ExtendedVue[V, Data, Methods, Computed, stdLib.Record[PropNames, _]] = js.native
  @JSName("component")
  def component_DataMethodsComputedProps[Data, Methods, Computed, Props](
    id: java.lang.String,
    definition: vueLib.typesOptionsMod.ThisTypedComponentOptionsWithRecordProps[V, Data, Methods, Computed, Props]
  ): ExtendedVue[V, Data, Methods, Computed, Props] = js.native
  @JSName("component")
  def component_DataMethodsComputedPropsExtendedVue[Data, Methods, Computed, Props](id: java.lang.String): ExtendedVue[V, Data, Methods, Computed, Props] = js.native
  @JSName("component")
  def component_ExtendedVue(id: java.lang.String): ExtendedVue[V, js.Object, js.Object, js.Object, js.Object] = js.native
  @JSName("component")
  def component_Props[Props](
    id: java.lang.String,
    definition: vueLib.typesOptionsMod.FunctionalComponentOptions[Props, vueLib.typesOptionsMod.RecordPropsDefinition[Props]]
  ): ExtendedVue[V, js.Object, js.Object, js.Object, Props] = js.native
  def delete(`object`: js.Object, key: java.lang.String): scala.Unit = js.native
  def delete(`object`: js.Object, key: scala.Double): scala.Unit = js.native
  def delete[T](array: js.Array[T], key: scala.Double): scala.Unit = js.native
  def directive(id: java.lang.String): vueLib.typesOptionsMod.DirectiveOptions = js.native
  def directive(id: java.lang.String, definition: vueLib.typesOptionsMod.DirectiveFunction): vueLib.typesOptionsMod.DirectiveOptions = js.native
  def directive(id: java.lang.String, definition: vueLib.typesOptionsMod.DirectiveOptions): vueLib.typesOptionsMod.DirectiveOptions = js.native
  def extend(): ExtendedVue[V, js.Object, js.Object, js.Object, js.Object] = js.native
  def extend(
    options: vueLib.typesOptionsMod.ComponentOptions[
      V, 
      vueLib.typesOptionsMod.DefaultData[V], 
      vueLib.typesOptionsMod.DefaultMethods[V], 
      vueLib.typesOptionsMod.DefaultComputed, 
      vueLib.typesOptionsMod.PropsDefinition[vueLib.typesOptionsMod.DefaultProps], 
      vueLib.typesOptionsMod.DefaultProps
    ]
  ): ExtendedVue[V, js.Object, js.Object, js.Object, js.Object] = js.native
  def extend[PropNames /* <: java.lang.String */](
    definition: vueLib.typesOptionsMod.FunctionalComponentOptions[stdLib.Record[PropNames, _], js.Array[PropNames]]
  ): ExtendedVue[V, js.Object, js.Object, js.Object, stdLib.Record[PropNames, _]] = js.native
  @JSName("extend")
  def extend_DataMethodsComputedPropNamesString[Data, Methods, Computed, PropNames /* <: java.lang.String */](): ExtendedVue[V, Data, Methods, Computed, stdLib.Record[PropNames, _]] = js.native
  @JSName("extend")
  def extend_DataMethodsComputedPropNamesString[Data, Methods, Computed, PropNames /* <: java.lang.String */](
    options: vueLib.typesOptionsMod.ThisTypedComponentOptionsWithArrayProps[V, Data, Methods, Computed, PropNames]
  ): ExtendedVue[V, Data, Methods, Computed, stdLib.Record[PropNames, _]] = js.native
  @JSName("extend")
  def extend_DataMethodsComputedProps[Data, Methods, Computed, Props](): ExtendedVue[V, Data, Methods, Computed, Props] = js.native
  @JSName("extend")
  def extend_DataMethodsComputedProps[Data, Methods, Computed, Props](
    options: vueLib.typesOptionsMod.ThisTypedComponentOptionsWithRecordProps[V, Data, Methods, Computed, Props]
  ): ExtendedVue[V, Data, Methods, Computed, Props] = js.native
  @JSName("extend")
  def extend_Props[Props](
    definition: vueLib.typesOptionsMod.FunctionalComponentOptions[Props, vueLib.typesOptionsMod.RecordPropsDefinition[Props]]
  ): ExtendedVue[V, js.Object, js.Object, js.Object, Props] = js.native
  def filter(id: java.lang.String): js.Function = js.native
  def filter(id: java.lang.String, definition: js.Function): js.Function = js.native
  def mixin(
    mixin: vueLib.typesOptionsMod.ComponentOptions[
      Vue, 
      vueLib.typesOptionsMod.DefaultData[Vue], 
      vueLib.typesOptionsMod.DefaultMethods[Vue], 
      vueLib.typesOptionsMod.DefaultComputed, 
      vueLib.typesOptionsMod.PropsDefinition[vueLib.typesOptionsMod.DefaultProps], 
      vueLib.typesOptionsMod.DefaultProps
    ]
  ): VueConstructor[V] = js.native
  def mixin(mixin: VueConstructor[Vue]): VueConstructor[V] = js.native
  def nextTick(): js.Promise[scala.Unit] = js.native
  def nextTick[T](callback: js.ThisFunction0[/* this */ T, scala.Unit]): scala.Unit = js.native
  def nextTick[T](callback: js.ThisFunction0[/* this */ T, scala.Unit], context: T): scala.Unit = js.native
  def observable[T](obj: T): T = js.native
  def set[T](array: js.Array[T], key: scala.Double, value: T): T = js.native
  def set[T](`object`: js.Object, key: java.lang.String, value: T): T = js.native
  def set[T](`object`: js.Object, key: scala.Double, value: T): T = js.native
  def use(plugin: vueLib.typesPluginMod.PluginFunction[_], options: js.Any*): VueConstructor[V] = js.native
  def use(plugin: vueLib.typesPluginMod.PluginObject[_], options: js.Any*): VueConstructor[V] = js.native
  def use[T](plugin: vueLib.typesPluginMod.PluginFunction[T]): VueConstructor[V] = js.native
  def use[T](plugin: vueLib.typesPluginMod.PluginFunction[T], options: T): VueConstructor[V] = js.native
  def use[T](plugin: vueLib.typesPluginMod.PluginObject[T]): VueConstructor[V] = js.native
  def use[T](plugin: vueLib.typesPluginMod.PluginObject[T], options: T): VueConstructor[V] = js.native
}

