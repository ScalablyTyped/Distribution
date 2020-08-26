package typings.vue.vueMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.std.Element
import typings.std.Record
import typings.vue.anon.FnCall
import typings.vue.anon.FnCallObjectKey
import typings.vue.optionsMod.AsyncComponent
import typings.vue.optionsMod.Component
import typings.vue.optionsMod.ComponentOptions
import typings.vue.optionsMod.DefaultComputed
import typings.vue.optionsMod.DefaultData
import typings.vue.optionsMod.DefaultMethods
import typings.vue.optionsMod.DefaultProps
import typings.vue.optionsMod.PropsDefinition
import typings.vue.optionsMod.WatchOptions
import typings.vue.vnodeMod.NormalizedScopedSlot
import typings.vue.vnodeMod.VNode
import typings.vue.vnodeMod.VNodeChildren
import typings.vue.vnodeMod.VNodeData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vue extends js.Object {
  @JSName("$attrs")
  val $attrs: Record[String, String] = js.native
  @JSName("$children")
  val $children: js.Array[Vue] = js.native
  @JSName("$createElement")
  var $createElement_Original: CreateElement = js.native
  @JSName("$data")
  val $data: Record[String, _] = js.native
  @JSName("$delete")
  var $delete_Original: FnCallObjectKey = js.native
  @JSName("$el")
  val $el: Element = js.native
  @JSName("$isServer")
  val $isServer: Boolean = js.native
  @JSName("$listeners")
  val $listeners: Record[String, js.Function | js.Array[js.Function]] = js.native
  @JSName("$options")
  val $options: ComponentOptions[
    Vue, 
    DefaultData[Vue], 
    DefaultMethods[Vue], 
    DefaultComputed, 
    PropsDefinition[DefaultProps], 
    DefaultProps
  ] = js.native
  @JSName("$parent")
  val $parent: Vue = js.native
  @JSName("$props")
  val $props: Record[String, _] = js.native
  @JSName("$refs")
  val $refs: StringDictionary[Vue | Element | (js.Array[Element | Vue])] = js.native
  @JSName("$root")
  val $root: Vue = js.native
  @JSName("$scopedSlots")
  val $scopedSlots: StringDictionary[js.UndefOr[NormalizedScopedSlot]] = js.native
  @JSName("$set")
  var $set_Original: FnCall = js.native
  @JSName("$slots")
  val $slots: StringDictionary[js.UndefOr[js.Array[VNode]]] = js.native
  @JSName("$ssrContext")
  val $ssrContext: js.Any = js.native
  @JSName("$vnode")
  val $vnode: VNode = js.native
  @JSName("$createElement")
  def $createElement(): VNode = js.native
  @JSName("$createElement")
  def $createElement(tag: (AsyncComponent[_, _, _, _]) | (Component[_, _, _, _])): VNode = js.native
  @JSName("$createElement")
  def $createElement(tag: js.UndefOr[(AsyncComponent[_, _, _, _]) | (Component[_, _, _, _])], children: VNodeChildren): VNode = js.native
  @JSName("$createElement")
  def $createElement(
    tag: js.UndefOr[(AsyncComponent[_, _, _, _]) | (Component[_, _, _, _])],
    data: js.UndefOr[scala.Nothing],
    children: VNodeChildren
  ): VNode = js.native
  @JSName("$createElement")
  def $createElement(tag: js.UndefOr[(AsyncComponent[_, _, _, _]) | (Component[_, _, _, _])], data: VNodeData): VNode = js.native
  @JSName("$createElement")
  def $createElement(
    tag: js.UndefOr[(AsyncComponent[_, _, _, _]) | (Component[_, _, _, _])],
    data: VNodeData,
    children: VNodeChildren
  ): VNode = js.native
  @JSName("$createElement")
  def $createElement(tag: String): VNode = js.native
  @JSName("$createElement")
  def $createElement(tag: String, children: VNodeChildren): VNode = js.native
  @JSName("$createElement")
  def $createElement(tag: String, data: js.UndefOr[scala.Nothing], children: VNodeChildren): VNode = js.native
  @JSName("$createElement")
  def $createElement(tag: String, data: VNodeData): VNode = js.native
  @JSName("$createElement")
  def $createElement(tag: String, data: VNodeData, children: VNodeChildren): VNode = js.native
  @JSName("$createElement")
  def $createElement(
    tag: js.Function0[
      Component[
        DefaultData[scala.Nothing], 
        DefaultMethods[scala.Nothing], 
        DefaultComputed, 
        DefaultProps
      ]
    ]
  ): VNode = js.native
  @JSName("$createElement")
  def $createElement(
    tag: js.Function0[
      Component[
        DefaultData[scala.Nothing], 
        DefaultMethods[scala.Nothing], 
        DefaultComputed, 
        DefaultProps
      ]
    ],
    children: VNodeChildren
  ): VNode = js.native
  @JSName("$createElement")
  def $createElement(
    tag: js.Function0[
      Component[
        DefaultData[scala.Nothing], 
        DefaultMethods[scala.Nothing], 
        DefaultComputed, 
        DefaultProps
      ]
    ],
    data: js.UndefOr[scala.Nothing],
    children: VNodeChildren
  ): VNode = js.native
  @JSName("$createElement")
  def $createElement(
    tag: js.Function0[
      Component[
        DefaultData[scala.Nothing], 
        DefaultMethods[scala.Nothing], 
        DefaultComputed, 
        DefaultProps
      ]
    ],
    data: VNodeData
  ): VNode = js.native
  @JSName("$createElement")
  def $createElement(
    tag: js.Function0[
      Component[
        DefaultData[scala.Nothing], 
        DefaultMethods[scala.Nothing], 
        DefaultComputed, 
        DefaultProps
      ]
    ],
    data: VNodeData,
    children: VNodeChildren
  ): VNode = js.native
  @JSName("$delete")
  def $delete(`object`: js.Object, key: String): Unit = js.native
  @JSName("$delete")
  def $delete(`object`: js.Object, key: Double): Unit = js.native
  @JSName("$delete")
  def $delete[T](array: js.Array[T], key: Double): Unit = js.native
  @JSName("$destroy")
  def $destroy(): Unit = js.native
  @JSName("$emit")
  def $emit(event: String, args: js.Any*): this.type = js.native
  @JSName("$forceUpdate")
  def $forceUpdate(): Unit = js.native
  @JSName("$mount")
  def $mount(): this.type = js.native
  @JSName("$mount")
  def $mount(elementOrSelector: js.UndefOr[scala.Nothing], hydrating: Boolean): this.type = js.native
  @JSName("$mount")
  def $mount(elementOrSelector: String): this.type = js.native
  @JSName("$mount")
  def $mount(elementOrSelector: String, hydrating: Boolean): this.type = js.native
  @JSName("$mount")
  def $mount(elementOrSelector: Element): this.type = js.native
  @JSName("$mount")
  def $mount(elementOrSelector: Element, hydrating: Boolean): this.type = js.native
  @JSName("$nextTick")
  def $nextTick(): js.Promise[Unit] = js.native
  @JSName("$nextTick")
  def $nextTick(callback: js.ThisFunction0[/* this */ this.type, Unit]): Unit = js.native
  @JSName("$off")
  def $off(): this.type = js.native
  @JSName("$off")
  def $off(event: js.UndefOr[scala.Nothing], callback: js.Function): this.type = js.native
  @JSName("$off")
  def $off(event: String): this.type = js.native
  @JSName("$off")
  def $off(event: String, callback: js.Function): this.type = js.native
  @JSName("$off")
  def $off(event: js.Array[String]): this.type = js.native
  @JSName("$off")
  def $off(event: js.Array[String], callback: js.Function): this.type = js.native
  @JSName("$on")
  def $on(event: String, callback: js.Function): this.type = js.native
  @JSName("$on")
  def $on(event: js.Array[String], callback: js.Function): this.type = js.native
  @JSName("$once")
  def $once(event: String, callback: js.Function): this.type = js.native
  @JSName("$once")
  def $once(event: js.Array[String], callback: js.Function): this.type = js.native
  @JSName("$set")
  def $set[T](array: js.Array[T], key: Double, value: T): T = js.native
  @JSName("$set")
  def $set[T](`object`: js.Object, key: String, value: T): T = js.native
  @JSName("$set")
  def $set[T](`object`: js.Object, key: Double, value: T): T = js.native
  @JSName("$watch")
  def $watch(
    expOrFn: String,
    callback: js.ThisFunction2[/* this */ this.type, /* n */ js.Any, /* o */ js.Any, Unit]
  ): js.Function0[Unit] = js.native
  @JSName("$watch")
  def $watch(
    expOrFn: String,
    callback: js.ThisFunction2[/* this */ this.type, /* n */ js.Any, /* o */ js.Any, Unit],
    options: WatchOptions
  ): js.Function0[Unit] = js.native
  @JSName("$watch")
  def $watch[T](
    expOrFn: js.ThisFunction0[/* this */ this.type, T],
    callback: js.ThisFunction2[/* this */ this.type, /* n */ T, /* o */ T, Unit]
  ): js.Function0[Unit] = js.native
  @JSName("$watch")
  def $watch[T](
    expOrFn: js.ThisFunction0[/* this */ this.type, T],
    callback: js.ThisFunction2[/* this */ this.type, /* n */ T, /* o */ T, Unit],
    options: WatchOptions
  ): js.Function0[Unit] = js.native
}

@JSImport("vue/types/vue", "Vue")
@js.native
object Vue extends TopLevel[VueConstructor[Vue]]

