package typings.vuelidate

import org.scalablytyped.runtime.StringDictionary
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
import typings.vue.vueMod.CreateElement
import typings.vue.vueMod.Vue
import typings.vuelidate.validatorsMod.ValidationParams
import typings.vuelidate.vueMod.ValidationEvaluation
import typings.vuelidate.vueMod.ValidationProperties
import typings.vuelidate.vuelidateMod.Validation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined vuelidate.vue/types/vue.ValidationProperties<vuelidate.vue/types/vue.Vue> & vuelidate.vue/types/vue.ValidationGroups & vuelidate.vuelidate/vuelidate.Validation */
  @js.native
  trait ValidationPropertiesVueVa
    extends StObject
       with /* groupName */ StringDictionary[Validation & ValidationProperties[js.Any]] {
    
    @JSName("$anyDirty")
    val $anyDirty: Boolean = js.native
    
    @JSName("$anyError")
    val $anyError: Boolean = js.native
    
    @JSName("$attrs")
    val $attrs: Record[String, String] = js.native
    
    @JSName("$children")
    val $children: js.Array[Vue] = js.native
    
    @JSName("$createElement")
    def $createElement(): VNode = js.native
    @JSName("$createElement")
    def $createElement(tag: String): VNode = js.native
    @JSName("$createElement")
    def $createElement(tag: String, children: VNodeChildren): VNode = js.native
    @JSName("$createElement")
    def $createElement(tag: String, data: Unit, children: VNodeChildren): VNode = js.native
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
      data: Unit,
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
    @JSName("$createElement")
    def $createElement(tag: Unit, children: VNodeChildren): VNode = js.native
    @JSName("$createElement")
    def $createElement(tag: Unit, data: Unit, children: VNodeChildren): VNode = js.native
    @JSName("$createElement")
    def $createElement(tag: Unit, data: VNodeData): VNode = js.native
    @JSName("$createElement")
    def $createElement(tag: Unit, data: VNodeData, children: VNodeChildren): VNode = js.native
    @JSName("$createElement")
    def $createElement(tag: AsyncComponent[js.Any, js.Any, js.Any, js.Any]): VNode = js.native
    @JSName("$createElement")
    def $createElement(tag: AsyncComponent[js.Any, js.Any, js.Any, js.Any], children: VNodeChildren): VNode = js.native
    @JSName("$createElement")
    def $createElement(tag: AsyncComponent[js.Any, js.Any, js.Any, js.Any], data: Unit, children: VNodeChildren): VNode = js.native
    @JSName("$createElement")
    def $createElement(tag: AsyncComponent[js.Any, js.Any, js.Any, js.Any], data: VNodeData): VNode = js.native
    @JSName("$createElement")
    def $createElement(tag: AsyncComponent[js.Any, js.Any, js.Any, js.Any], data: VNodeData, children: VNodeChildren): VNode = js.native
    @JSName("$createElement")
    def $createElement(tag: Component[js.Any, js.Any, js.Any, js.Any]): VNode = js.native
    @JSName("$createElement")
    def $createElement(tag: Component[js.Any, js.Any, js.Any, js.Any], children: VNodeChildren): VNode = js.native
    @JSName("$createElement")
    def $createElement(tag: Component[js.Any, js.Any, js.Any, js.Any], data: Unit, children: VNodeChildren): VNode = js.native
    @JSName("$createElement")
    def $createElement(tag: Component[js.Any, js.Any, js.Any, js.Any], data: VNodeData): VNode = js.native
    @JSName("$createElement")
    def $createElement(tag: Component[js.Any, js.Any, js.Any, js.Any], data: VNodeData, children: VNodeChildren): VNode = js.native
    @JSName("$createElement")
    var $createElement_Original: CreateElement = js.native
    
    @JSName("$data")
    val $data: Record[String, js.Any] = js.native
    
    @JSName("$delete")
    def $delete(`object`: js.Object, key: String): Unit = js.native
    @JSName("$delete")
    def $delete(`object`: js.Object, key: Double): Unit = js.native
    @JSName("$delete")
    def $delete[T](array: js.Array[T], key: Double): Unit = js.native
    @JSName("$delete")
    var $delete_Original: FnCallObjectKey = js.native
    
    @JSName("$destroy")
    def $destroy(): Unit = js.native
    
    @JSName("$dirty")
    val $dirty: Boolean = js.native
    
    @JSName("$el")
    val $el: Element = js.native
    
    @JSName("$emit")
    def $emit(event: String, args: js.Any*): this.type = js.native
    
    @JSName("$error")
    val $error: Boolean = js.native
    
    @JSName("$flattenParams")
    def $flattenParams(): js.Array[ValidationParams] = js.native
    
    @JSName("$forceUpdate")
    def $forceUpdate(): Unit = js.native
    
    // const validationGetters
    @JSName("$invalid")
    val $invalid: Boolean = js.native
    
    @JSName("$isServer")
    val $isServer: Boolean = js.native
    
    @JSName("$listeners")
    val $listeners: Record[String, js.Function | js.Array[js.Function]] = js.native
    
    @JSName("$model")
    var $model: js.Any = js.native
    
    @JSName("$mount")
    def $mount(): this.type = js.native
    @JSName("$mount")
    def $mount(elementOrSelector: String): this.type = js.native
    @JSName("$mount")
    def $mount(elementOrSelector: String, hydrating: Boolean): this.type = js.native
    @JSName("$mount")
    def $mount(elementOrSelector: Unit, hydrating: Boolean): this.type = js.native
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
    def $off(event: String): this.type = js.native
    @JSName("$off")
    def $off(event: String, callback: js.Function): this.type = js.native
    @JSName("$off")
    def $off(event: js.Array[String]): this.type = js.native
    @JSName("$off")
    def $off(event: js.Array[String], callback: js.Function): this.type = js.native
    @JSName("$off")
    def $off(event: Unit, callback: js.Function): this.type = js.native
    
    @JSName("$on")
    def $on(event: String, callback: js.Function): this.type = js.native
    @JSName("$on")
    def $on(event: js.Array[String], callback: js.Function): this.type = js.native
    
    @JSName("$once")
    def $once(event: String, callback: js.Function): this.type = js.native
    @JSName("$once")
    def $once(event: js.Array[String], callback: js.Function): this.type = js.native
    
    @JSName("$options")
    val $options: ComponentOptions[
        Vue, 
        DefaultData[Vue], 
        DefaultMethods[Vue], 
        DefaultComputed, 
        PropsDefinition[DefaultProps], 
        DefaultProps
      ] = js.native
    
    @JSName("$params")
    val $params: StringDictionary[js.Any] = js.native
    
    @JSName("$parent")
    val $parent: Vue = js.native
    
    @JSName("$pending")
    val $pending: Boolean = js.native
    
    @JSName("$props")
    val $props: Record[String, js.Any] = js.native
    
    @JSName("$refs")
    val $refs: StringDictionary[Vue | Element | (js.Array[Element | Vue])] = js.native
    
    @JSName("$reset")
    def $reset(): Unit = js.native
    
    @JSName("$root")
    val $root: Vue = js.native
    
    @JSName("$scopedSlots")
    val $scopedSlots: StringDictionary[js.UndefOr[NormalizedScopedSlot]] = js.native
    
    @JSName("$set")
    def $set[T](array: js.Array[T], key: Double, value: T): T = js.native
    @JSName("$set")
    def $set[T](`object`: js.Object, key: String, value: T): T = js.native
    @JSName("$set")
    def $set[T](`object`: js.Object, key: Double, value: T): T = js.native
    @JSName("$set")
    var $set_Original: FnCall = js.native
    
    @JSName("$slots")
    val $slots: StringDictionary[js.UndefOr[js.Array[VNode]]] = js.native
    
    @JSName("$ssrContext")
    val $ssrContext: js.Any = js.native
    
    // const validationMethods
    @JSName("$touch")
    def $touch(): Unit = js.native
    
    @JSName("$vnode")
    val $vnode: VNode = js.native
    
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
    
    var delayTouch: js.UndefOr[
        Validation & (ValidationProperties[js.Function1[/* v */ Validation, Unit]]) & ValidationEvaluation
      ] = js.native
  }
}
