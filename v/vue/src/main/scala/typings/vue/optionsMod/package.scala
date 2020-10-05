package typings.vue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object optionsMod {
  type Accessors[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: (): T[K] | vue.vue/types/options.ComputedOptions<T[K]>}
    */ typings.vue.vueStrings.Accessors with org.scalablytyped.runtime.TopLevel[js.Any]
  type ArrayPropsDefinition[T] = js.Array[/* keyof T */ java.lang.String]
  type AsyncComponent[Data, Methods, Computed, Props] = (typings.vue.optionsMod.AsyncComponentPromise[Data, Methods, Computed, Props]) | (typings.vue.optionsMod.AsyncComponentFactory[Data, Methods, Computed, Props])
  type AsyncComponentFactory[Data, Methods, Computed, Props] = js.Function0[typings.vue.anon.Component[Data, Methods, Computed, Props]]
  type AsyncComponentPromise[Data, Methods, Computed, Props] = js.Function2[
    /* resolve */ js.Function1[
      /* component */ typings.vue.optionsMod.Component[Data, Methods, Computed, Props], 
      scala.Unit
    ], 
    /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
    (js.Promise[
      (typings.vue.optionsMod.Component[
        typings.vue.optionsMod.DefaultData[scala.Nothing], 
        typings.vue.optionsMod.DefaultMethods[scala.Nothing], 
        typings.vue.optionsMod.DefaultComputed, 
        typings.vue.optionsMod.DefaultProps
      ]) | typings.vue.optionsMod.EsModuleComponent
    ]) | scala.Unit
  ]
  type Component[Data, Methods, Computed, Props] = typings.vue.vueMod.VueConstructor[typings.vue.vueMod.Vue] | (typings.vue.optionsMod.FunctionalComponentOptions[Props, typings.vue.optionsMod.PropsDefinition[Props]]) | (typings.vue.optionsMod.ComponentOptions[scala.Nothing, Data, Methods, Computed, Props, typings.vue.optionsMod.DefaultProps])
  type DataDef[Data, Props, V] = Data | (js.ThisFunction0[/* this */ Props with V, Data])
  type DefaultComputed = org.scalablytyped.runtime.StringDictionary[js.Any]
  type DefaultData[V] = js.Object | (js.ThisFunction0[/* this */ V, js.Object])
  type DefaultMethods[V] = org.scalablytyped.runtime.StringDictionary[js.ThisFunction1[/* this */ V, /* repeated */ js.Any, js.Any]]
  type DefaultProps = typings.std.Record[java.lang.String, js.Any]
  type DirectiveFunction = js.Function4[
    /* el */ typings.std.HTMLElement, 
    /* binding */ typings.vue.optionsMod.DirectiveBinding, 
    /* vnode */ typings.vue.vnodeMod.VNode, 
    /* oldVnode */ typings.vue.vnodeMod.VNode, 
    scala.Unit
  ]
  type InjectKey = java.lang.String | js.Symbol
  type InjectOptions = (org.scalablytyped.runtime.StringDictionary[typings.vue.optionsMod.InjectKey | typings.vue.anon.Default]) | js.Array[java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - js.Function0[T]
    - typings.vue.anon.Instantiable[T]
    - typings.vue.anon.InstantiableFunction
  */
  type Prop[T] = typings.vue.optionsMod._Prop[T] | js.Function0[T]
  type PropType[T] = typings.vue.optionsMod.Prop[T] | js.Array[typings.vue.optionsMod.Prop[T]]
  type PropValidator[T] = typings.vue.optionsMod.PropOptions[T] | typings.vue.optionsMod.PropType[T]
  type PropsDefinition[T] = typings.vue.optionsMod.ArrayPropsDefinition[T] | typings.vue.optionsMod.RecordPropsDefinition[T]
  type RecordPropsDefinition[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: vue.vue/types/options.PropValidator<T[K]>}
    */ typings.vue.vueStrings.RecordPropsDefinition with org.scalablytyped.runtime.TopLevel[T]
  type ThisTypedComponentOptionsWithArrayProps[V /* <: typings.vue.vueMod.Vue */, Data, Methods, Computed, PropNames /* <: java.lang.String */] = js.Object with (typings.vue.optionsMod.ComponentOptions[
    V, 
    typings.vue.optionsMod.DataDef[Data, typings.std.Record[PropNames, _], V], 
    Methods, 
    Computed, 
    js.Array[PropNames], 
    typings.std.Record[PropNames, _]
  ]) with (typings.std.ThisType[
    typings.vue.vueMod.CombinedVueInstance[V, Data, Methods, Computed, typings.std.Record[PropNames, _]]
  ])
  type ThisTypedComponentOptionsWithRecordProps[V /* <: typings.vue.vueMod.Vue */, Data, Methods, Computed, Props] = js.Object with (typings.vue.optionsMod.ComponentOptions[
    V, 
    typings.vue.optionsMod.DataDef[Data, Props, V], 
    Methods, 
    Computed, 
    typings.vue.optionsMod.RecordPropsDefinition[Props], 
    Props
  ]) with (typings.std.ThisType[typings.vue.vueMod.CombinedVueInstance[V, Data, Methods, Computed, Props]])
  type WatchHandler[T] = js.Function2[/* val */ T, /* oldVal */ T, scala.Unit]
}
