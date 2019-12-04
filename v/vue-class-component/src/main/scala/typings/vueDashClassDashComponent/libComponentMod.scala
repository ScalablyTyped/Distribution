package typings.vueDashClassDashComponent

import typings.vue.typesOptionsMod.ComponentOptions
import typings.vue.typesOptionsMod.DefaultComputed
import typings.vue.typesOptionsMod.DefaultData
import typings.vue.typesOptionsMod.DefaultMethods
import typings.vue.typesOptionsMod.DefaultProps
import typings.vue.typesOptionsMod.PropsDefinition
import typings.vue.typesVueMod.Vue
import typings.vueDashClassDashComponent.libDeclarationsMod.VueClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue-class-component/lib/component", JSImport.Namespace)
@js.native
object libComponentMod extends js.Object {
  @JSName("$internalHooks")
  val $internalHooks: js.Array[String] = js.native
  def componentFactory(Component: VueClass[Vue]): VueClass[Vue] = js.native
  def componentFactory(
    Component: VueClass[Vue],
    options: ComponentOptions[
      Vue, 
      DefaultData[Vue], 
      DefaultMethods[Vue], 
      DefaultComputed, 
      PropsDefinition[DefaultProps], 
      DefaultProps
    ]
  ): VueClass[Vue] = js.native
}

