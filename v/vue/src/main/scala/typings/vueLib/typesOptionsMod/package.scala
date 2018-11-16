package typings
package vueLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesOptionsMod {
  type Accessors[T] = vueLib.vueLibStrings.Accessors with T
  type ArrayPropsDefinition[T] = js.Array[java.lang.String]
  type AsyncComponent[Data, Methods, Computed, Props] = js.Function2[
    /* resolve */ js.Function1[/* component */ Component[Data, Methods, Computed, Props], scala.Unit], 
    /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
    (stdLib.Promise[
      (Component[
        DefaultData[scala.Nothing], 
        DefaultMethods[scala.Nothing], 
        DefaultComputed, 
        DefaultProps
      ]) | EsModuleComponent
    ]) | scala.Unit
  ]
  type Component[Data, Methods, Computed, Props] = vueLib.typesVueMod.VueConstructor[vueLib.typesVueMod.Vue] | (FunctionalComponentOptions[Props, PropsDefinition[Props]]) | (ComponentOptions[scala.Nothing, Data, Methods, Computed, DefaultProps, DefaultProps])
  type DataDef[Data, Props, V] = Data | (js.ThisFunction0[/* this */ stdLib.Readonly[Props] with V, Data])
  type DefaultData[V] = js.Object | (js.ThisFunction0[/* this */ V, js.Object])
  type DefaultProps = stdLib.Record[java.lang.String, js.Any]
  type DirectiveFunction = js.Function4[
    /* el */ stdLib.HTMLElement, 
    /* binding */ vueLib.typesVnodeMod.VNodeDirective, 
    /* vnode */ vueLib.typesVnodeMod.VNode, 
    /* oldVnode */ vueLib.typesVnodeMod.VNode, 
    scala.Unit
  ]
  type InjectKey = java.lang.String | js.Symbol
  type InjectOptions = (ScalablyTyped.runtime.StringDictionary[InjectKey | vueLib.Anon_From]) | js.Array[java.lang.String]
  type Prop[T] = vueLib.Anon_T[T] | vueLib.Anon_Args[T]
  type PropValidator[T] = PropOptions[T] | Prop[T] | js.Array[Prop[T]]
  type PropsDefinition[T] = ArrayPropsDefinition[T] | RecordPropsDefinition[T]
  type RecordPropsDefinition[T] = vueLib.vueLibStrings.RecordPropsDefinition with T
  type ThisTypedComponentOptionsWithArrayProps[V /* <: vueLib.typesVueMod.Vue */, Data, Methods, Computed, PropNames /* <: java.lang.String */] = js.Object with (ComponentOptions[
    V, 
    DataDef[Data, stdLib.Record[PropNames, _], V], 
    Methods, 
    Computed, 
    js.Array[PropNames], 
    stdLib.Record[PropNames, _]
  ]) with (stdLib.ThisType[
    vueLib.typesVueMod.CombinedVueInstance[V, Data, Methods, Computed, stdLib.Readonly[stdLib.Record[PropNames, _]]]
  ])
  type ThisTypedComponentOptionsWithRecordProps[V /* <: vueLib.typesVueMod.Vue */, Data, Methods, Computed, Props] = js.Object with (ComponentOptions[V, DataDef[Data, Props, V], Methods, Computed, RecordPropsDefinition[Props], Props]) with (stdLib.ThisType[
    vueLib.typesVueMod.CombinedVueInstance[V, Data, Methods, Computed, stdLib.Readonly[Props]]
  ])
  type WatchHandler[T] = js.Function2[/* val */ T, /* oldVal */ T, scala.Unit]
}
