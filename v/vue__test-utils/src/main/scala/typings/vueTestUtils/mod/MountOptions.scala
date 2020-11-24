package typings.vueTestUtils.mod

import typings.std.Element
import typings.std.Record
import typings.vue.optionsMod.Component
import typings.vue.optionsMod.ComponentOptions
import typings.vue.optionsMod.DefaultComputed
import typings.vue.optionsMod.DefaultData
import typings.vue.optionsMod.DefaultMethods
import typings.vue.optionsMod.DefaultProps
import typings.vue.optionsMod.PropsDefinition
import typings.vue.vnodeMod.VNodeData
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MountOptions[V /* <: Vue */] extends ComponentOptions[
      V, 
      DefaultData[V], 
      DefaultMethods[V], 
      DefaultComputed, 
      PropsDefinition[DefaultProps], 
      DefaultProps
    ] {
  
  var attachTo: js.UndefOr[Element | String] = js.native
  
  var attachToDocument: js.UndefOr[Boolean] = js.native
  
  var attrs: js.UndefOr[Record[String, String]] = js.native
  
  var context: js.UndefOr[VNodeData] = js.native
  
  var listeners: js.UndefOr[Record[String, js.Function | js.Array[js.Function]]] = js.native
  
  var localVue: js.UndefOr[VueConstructor[Vue]] = js.native
  
  var mocks: js.UndefOr[js.Object | `false`] = js.native
  
  var parentComponent: js.UndefOr[
    Component[
      DefaultData[scala.Nothing], 
      DefaultMethods[scala.Nothing], 
      DefaultComputed, 
      DefaultProps
    ]
  ] = js.native
  
  var scopedSlots: js.UndefOr[Record[String, String | js.Function]] = js.native
  
  var slots: js.UndefOr[Slots] = js.native
  
  var stubs: js.UndefOr[Stubs | `false`] = js.native
}
object MountOptions {
  
  @scala.inline
  def apply[V /* <: Vue */](): MountOptions[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MountOptions[V]]
  }
  
  @scala.inline
  implicit class MountOptionsOps[Self <: MountOptions[_], V /* <: Vue */] (val x: Self with MountOptions[V]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttachTo(value: Element | String): Self = this.set("attachTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachTo: Self = this.set("attachTo", js.undefined)
    
    @scala.inline
    def setAttachToDocument(value: Boolean): Self = this.set("attachToDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachToDocument: Self = this.set("attachToDocument", js.undefined)
    
    @scala.inline
    def setAttrs(value: Record[String, String]): Self = this.set("attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttrs: Self = this.set("attrs", js.undefined)
    
    @scala.inline
    def setContext(value: VNodeData): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setListeners(value: Record[String, js.Function | js.Array[js.Function]]): Self = this.set("listeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListeners: Self = this.set("listeners", js.undefined)
    
    @scala.inline
    def setLocalVue(value: VueConstructor[Vue]): Self = this.set("localVue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalVue: Self = this.set("localVue", js.undefined)
    
    @scala.inline
    def setMocks(value: js.Object | `false`): Self = this.set("mocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMocks: Self = this.set("mocks", js.undefined)
    
    @scala.inline
    def setParentComponent(
      value: Component[
          DefaultData[scala.Nothing], 
          DefaultMethods[scala.Nothing], 
          DefaultComputed, 
          DefaultProps
        ]
    ): Self = this.set("parentComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentComponent: Self = this.set("parentComponent", js.undefined)
    
    @scala.inline
    def setScopedSlots(value: Record[String, String | js.Function]): Self = this.set("scopedSlots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopedSlots: Self = this.set("scopedSlots", js.undefined)
    
    @scala.inline
    def setSlots(value: Slots): Self = this.set("slots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlots: Self = this.set("slots", js.undefined)
    
    @scala.inline
    def setStubsVarargs(value: String*): Self = this.set("stubs", js.Array(value :_*))
    
    @scala.inline
    def setStubs(value: Stubs | `false`): Self = this.set("stubs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStubs: Self = this.set("stubs", js.undefined)
  }
}
