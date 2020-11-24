package typings.vueTestUtils.mod

import typings.vue.optionsMod.ComponentOptions
import typings.vue.optionsMod.DefaultComputed
import typings.vue.optionsMod.DefaultData
import typings.vue.optionsMod.DefaultMethods
import typings.vue.optionsMod.DefaultProps
import typings.vue.optionsMod.FunctionalComponentOptions
import typings.vue.optionsMod.PropsDefinition
import typings.vue.vueMod.Vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/test-utils", "mount")
@js.native
object mount extends js.Object {
  
  def apply[V /* <: Vue */](
    component: ComponentOptions[
      V, 
      DefaultData[V], 
      DefaultMethods[V], 
      DefaultComputed, 
      PropsDefinition[DefaultProps], 
      DefaultProps
    ]
  ): Wrapper[V] = js.native
  def apply[V /* <: Vue */](
    component: ComponentOptions[
      V, 
      DefaultData[V], 
      DefaultMethods[V], 
      DefaultComputed, 
      PropsDefinition[DefaultProps], 
      DefaultProps
    ],
    options: ThisTypedMountOptions[V]
  ): Wrapper[V] = js.native
  def apply[V /* <: Vue */](component: VueClass[V]): Wrapper[V] = js.native
  def apply[V /* <: Vue */](component: VueClass[V], options: ThisTypedMountOptions[V]): Wrapper[V] = js.native
  def apply[Props, PropDefs](component: FunctionalComponentOptions[Props, PropDefs]): Wrapper[Vue] = js.native
  def apply[Props, PropDefs](component: FunctionalComponentOptions[Props, PropDefs], options: MountOptions[Vue]): Wrapper[Vue] = js.native
}
