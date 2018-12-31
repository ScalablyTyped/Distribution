package typings
package vueLib.typesVueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vue extends js.Object {
  @JSName("$attrs")
  val $attrs: stdLib.Record[java.lang.String, java.lang.String] = js.native
  @JSName("$children")
  val $children: js.Array[Vue] = js.native
  @JSName("$createElement")
  var $createElement_Original: CreateElement = js.native
  @JSName("$data")
  val $data: stdLib.Record[java.lang.String, _] = js.native
  @JSName("$delete")
  var $delete_Original: vueLib.Anon_ObjectKey = js.native
  @JSName("$el")
  val $el: stdLib.Element = js.native
  @JSName("$isServer")
  val $isServer: scala.Boolean = js.native
  @JSName("$listeners")
  val $listeners: stdLib.Record[java.lang.String, js.Function | js.Array[js.Function]] = js.native
  @JSName("$options")
  val $options: vueLib.typesOptionsMod.ComponentOptions[
    Vue, 
    vueLib.typesOptionsMod.DefaultData[Vue], 
    vueLib.typesOptionsMod.DefaultMethods[Vue], 
    vueLib.typesOptionsMod.DefaultComputed, 
    vueLib.typesOptionsMod.PropsDefinition[vueLib.typesOptionsMod.DefaultProps], 
    vueLib.typesOptionsMod.DefaultProps
  ] = js.native
  @JSName("$parent")
  val $parent: Vue = js.native
  @JSName("$props")
  val $props: stdLib.Record[java.lang.String, _] = js.native
  @JSName("$refs")
  val $refs: org.scalablytyped.runtime.StringDictionary[Vue | stdLib.Element | js.Array[Vue] | js.Array[stdLib.Element]] = js.native
  @JSName("$root")
  val $root: Vue = js.native
  @JSName("$scopedSlots")
  val $scopedSlots: org.scalablytyped.runtime.StringDictionary[js.UndefOr[vueLib.typesVnodeMod.ScopedSlot]] = js.native
  @JSName("$set")
  var $set_Original: vueLib.Anon_Object = js.native
  @JSName("$slots")
  val $slots: org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Array[vueLib.typesVnodeMod.VNode]]] = js.native
  @JSName("$ssrContext")
  val $ssrContext: js.Any = js.native
  @JSName("$vnode")
  val $vnode: vueLib.typesVnodeMod.VNode = js.native
  @JSName("$createElement")
  def $createElement(): vueLib.typesVnodeMod.VNode = js.native
  @JSName("$createElement")
  def $createElement(
    tag: (vueLib.typesOptionsMod.AsyncComponent[_, _, _, _]) | (vueLib.typesOptionsMod.Component[_, _, _, _])
  ): vueLib.typesVnodeMod.VNode = js.native
  @JSName("$createElement")
  def $createElement(
    tag: (vueLib.typesOptionsMod.AsyncComponent[_, _, _, _]) | (vueLib.typesOptionsMod.Component[_, _, _, _]),
    children: vueLib.typesVnodeMod.VNodeChildren
  ): vueLib.typesVnodeMod.VNode = js.native
  @JSName("$createElement")
  def $createElement(
    tag: (vueLib.typesOptionsMod.AsyncComponent[_, _, _, _]) | (vueLib.typesOptionsMod.Component[_, _, _, _]),
    data: vueLib.typesVnodeMod.VNodeData
  ): vueLib.typesVnodeMod.VNode = js.native
  @JSName("$createElement")
  def $createElement(
    tag: (vueLib.typesOptionsMod.AsyncComponent[_, _, _, _]) | (vueLib.typesOptionsMod.Component[_, _, _, _]),
    data: vueLib.typesVnodeMod.VNodeData,
    children: vueLib.typesVnodeMod.VNodeChildren
  ): vueLib.typesVnodeMod.VNode = js.native
  @JSName("$createElement")
  def $createElement(tag: java.lang.String): vueLib.typesVnodeMod.VNode = js.native
  @JSName("$createElement")
  def $createElement(tag: java.lang.String, children: vueLib.typesVnodeMod.VNodeChildren): vueLib.typesVnodeMod.VNode = js.native
  @JSName("$createElement")
  def $createElement(tag: java.lang.String, data: vueLib.typesVnodeMod.VNodeData): vueLib.typesVnodeMod.VNode = js.native
  @JSName("$createElement")
  def $createElement(
    tag: java.lang.String,
    data: vueLib.typesVnodeMod.VNodeData,
    children: vueLib.typesVnodeMod.VNodeChildren
  ): vueLib.typesVnodeMod.VNode = js.native
  @JSName("$createElement")
  def $createElement(
    tag: js.Function0[
      vueLib.typesOptionsMod.Component[
        vueLib.typesOptionsMod.DefaultData[scala.Nothing], 
        vueLib.typesOptionsMod.DefaultMethods[scala.Nothing], 
        vueLib.typesOptionsMod.DefaultComputed, 
        vueLib.typesOptionsMod.DefaultProps
      ]
    ]
  ): vueLib.typesVnodeMod.VNode = js.native
  @JSName("$createElement")
  def $createElement(
    tag: js.Function0[
      vueLib.typesOptionsMod.Component[
        vueLib.typesOptionsMod.DefaultData[scala.Nothing], 
        vueLib.typesOptionsMod.DefaultMethods[scala.Nothing], 
        vueLib.typesOptionsMod.DefaultComputed, 
        vueLib.typesOptionsMod.DefaultProps
      ]
    ],
    children: vueLib.typesVnodeMod.VNodeChildren
  ): vueLib.typesVnodeMod.VNode = js.native
  @JSName("$createElement")
  def $createElement(
    tag: js.Function0[
      vueLib.typesOptionsMod.Component[
        vueLib.typesOptionsMod.DefaultData[scala.Nothing], 
        vueLib.typesOptionsMod.DefaultMethods[scala.Nothing], 
        vueLib.typesOptionsMod.DefaultComputed, 
        vueLib.typesOptionsMod.DefaultProps
      ]
    ],
    data: vueLib.typesVnodeMod.VNodeData
  ): vueLib.typesVnodeMod.VNode = js.native
  @JSName("$createElement")
  def $createElement(
    tag: js.Function0[
      vueLib.typesOptionsMod.Component[
        vueLib.typesOptionsMod.DefaultData[scala.Nothing], 
        vueLib.typesOptionsMod.DefaultMethods[scala.Nothing], 
        vueLib.typesOptionsMod.DefaultComputed, 
        vueLib.typesOptionsMod.DefaultProps
      ]
    ],
    data: vueLib.typesVnodeMod.VNodeData,
    children: vueLib.typesVnodeMod.VNodeChildren
  ): vueLib.typesVnodeMod.VNode = js.native
  @JSName("$delete")
  def $delete(`object`: js.Object, key: java.lang.String): scala.Unit = js.native
  @JSName("$delete")
  def $delete(`object`: js.Object, key: scala.Double): scala.Unit = js.native
  @JSName("$delete")
  def $delete[T](array: js.Array[T], key: scala.Double): scala.Unit = js.native
  @JSName("$destroy")
  def $destroy(): scala.Unit = js.native
  @JSName("$emit")
  def $emit(event: java.lang.String, args: js.Any*): this.type = js.native
  @JSName("$forceUpdate")
  def $forceUpdate(): scala.Unit = js.native
  @JSName("$mount")
  def $mount(): this.type = js.native
  @JSName("$mount")
  def $mount(elementOrSelector: java.lang.String): this.type = js.native
  @JSName("$mount")
  def $mount(elementOrSelector: java.lang.String, hydrating: scala.Boolean): this.type = js.native
  @JSName("$mount")
  def $mount(elementOrSelector: stdLib.Element): this.type = js.native
  @JSName("$mount")
  def $mount(elementOrSelector: stdLib.Element, hydrating: scala.Boolean): this.type = js.native
  @JSName("$nextTick")
  def $nextTick(): js.Promise[scala.Unit] = js.native
  @JSName("$nextTick")
  def $nextTick(callback: js.ThisFunction0[/* this */ this.type, scala.Unit]): scala.Unit = js.native
  @JSName("$off")
  def $off(): this.type = js.native
  @JSName("$off")
  def $off(event: java.lang.String): this.type = js.native
  @JSName("$off")
  def $off(event: java.lang.String, callback: js.Function): this.type = js.native
  @JSName("$off")
  def $off(event: js.Array[java.lang.String]): this.type = js.native
  @JSName("$off")
  def $off(event: js.Array[java.lang.String], callback: js.Function): this.type = js.native
  @JSName("$on")
  def $on(event: java.lang.String, callback: js.Function): this.type = js.native
  @JSName("$on")
  def $on(event: js.Array[java.lang.String], callback: js.Function): this.type = js.native
  @JSName("$once")
  def $once(event: java.lang.String, callback: js.Function): this.type = js.native
  @JSName("$once")
  def $once(event: js.Array[java.lang.String], callback: js.Function): this.type = js.native
  @JSName("$set")
  def $set[T](array: js.Array[T], key: scala.Double, value: T): T = js.native
  @JSName("$set")
  def $set[T](`object`: js.Object, key: java.lang.String, value: T): T = js.native
  @JSName("$set")
  def $set[T](`object`: js.Object, key: scala.Double, value: T): T = js.native
  @JSName("$watch")
  def $watch(
    expOrFn: java.lang.String,
    callback: js.ThisFunction2[/* this */ this.type, /* n */ js.Any, /* o */ js.Any, scala.Unit]
  ): js.Function0[scala.Unit] = js.native
  @JSName("$watch")
  def $watch(
    expOrFn: java.lang.String,
    callback: js.ThisFunction2[/* this */ this.type, /* n */ js.Any, /* o */ js.Any, scala.Unit],
    options: vueLib.typesOptionsMod.WatchOptions
  ): js.Function0[scala.Unit] = js.native
  @JSName("$watch")
  def $watch[T](
    expOrFn: js.ThisFunction0[/* this */ this.type, T],
    callback: js.ThisFunction2[/* this */ this.type, /* n */ T, /* o */ T, scala.Unit]
  ): js.Function0[scala.Unit] = js.native
  @JSName("$watch")
  def $watch[T](
    expOrFn: js.ThisFunction0[/* this */ this.type, T],
    callback: js.ThisFunction2[/* this */ this.type, /* n */ T, /* o */ T, scala.Unit],
    options: vueLib.typesOptionsMod.WatchOptions
  ): js.Function0[scala.Unit] = js.native
}

