package typings.vue

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.std.Record
import typings.std.ThisType
import typings.vue.Anon_Component
import typings.vue.Anon_Default
import typings.vue.typesVnodeMod.VNode
import typings.vue.typesVueMod.CombinedVueInstance
import typings.vue.typesVueMod.Vue
import typings.vue.typesVueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesOptionsMod {
  type Accessors[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: (): T[K] | vue.vue/types/options.ComputedOptions<T[K]>}
    */ typings.vue.vueStrings.Accessors with js.Any
  type ArrayPropsDefinition[T] = js.Array[String]
  type AsyncComponent[Data, Methods, Computed, Props] = (AsyncComponentPromise[Data, Methods, Computed, Props]) | (AsyncComponentFactory[Data, Methods, Computed, Props])
  type AsyncComponentFactory[Data, Methods, Computed, Props] = js.Function0[Anon_Component[Data, Methods, Computed, Props]]
  type AsyncComponentPromise[Data, Methods, Computed, Props] = js.Function2[
    /* resolve */ js.Function1[/* component */ Component[Data, Methods, Computed, Props], Unit], 
    /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
    (js.Promise[
      (Component[
        DefaultData[scala.Nothing], 
        DefaultMethods[scala.Nothing], 
        DefaultComputed, 
        DefaultProps
      ]) | EsModuleComponent
    ]) | Unit
  ]
  type Component[Data, Methods, Computed, Props] = VueConstructor[Vue] | (FunctionalComponentOptions[Props, PropsDefinition[Props]]) | (ComponentOptions[scala.Nothing, Data, Methods, Computed, Props, DefaultProps])
  type DataDef[Data, Props, V] = Data | (js.ThisFunction0[/* this */ Props with V, Data])
  type DefaultComputed = StringDictionary[js.Any]
  type DefaultData[V] = js.Object | (js.ThisFunction0[/* this */ V, js.Object])
  type DefaultMethods[V] = StringDictionary[js.ThisFunction1[/* this */ V, /* repeated */ js.Any, js.Any]]
  type DefaultProps = Record[String, js.Any]
  type DirectiveFunction = js.Function4[
    /* el */ HTMLElement, 
    /* binding */ DirectiveBinding, 
    /* vnode */ VNode, 
    /* oldVnode */ VNode, 
    Unit
  ]
  type InjectKey = String | js.Symbol
  type InjectOptions = (StringDictionary[InjectKey | Anon_Default]) | js.Array[String]
  type PropType[T] = Prop[T] | js.Array[Prop[T]]
  type PropValidator[T] = PropOptions[T] | PropType[T]
  type PropsDefinition[T] = ArrayPropsDefinition[T] | RecordPropsDefinition[T]
  type RecordPropsDefinition[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: vue.vue/types/options.PropValidator<T[K]>}
    */ typings.vue.vueStrings.RecordPropsDefinition with T
  type ThisTypedComponentOptionsWithArrayProps[V /* <: Vue */, Data, Methods, Computed, PropNames /* <: String */] = js.Object with (ComponentOptions[
    V, 
    DataDef[Data, Record[PropNames, _], V], 
    Methods, 
    Computed, 
    js.Array[PropNames], 
    Record[PropNames, _]
  ]) with (ThisType[CombinedVueInstance[V, Data, Methods, Computed, Record[PropNames, _]]])
  type ThisTypedComponentOptionsWithRecordProps[V /* <: Vue */, Data, Methods, Computed, Props] = js.Object with (ComponentOptions[V, DataDef[Data, Props, V], Methods, Computed, RecordPropsDefinition[Props], Props]) with (ThisType[CombinedVueInstance[V, Data, Methods, Computed, Props]])
  type WatchHandler[T] = js.Function2[/* val */ T, /* oldVal */ T, Unit]
}
