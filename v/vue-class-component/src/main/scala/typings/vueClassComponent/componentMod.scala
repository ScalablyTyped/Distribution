package typings.vueClassComponent

import typings.vue.optionsMod.ComponentOptions
import typings.vue.optionsMod.DefaultComputed
import typings.vue.optionsMod.DefaultData
import typings.vue.optionsMod.DefaultMethods
import typings.vue.optionsMod.DefaultProps
import typings.vue.optionsMod.PropsDefinition
import typings.vue.vueMod.Vue
import typings.vueClassComponent.declarationsMod.VueClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("vue-class-component/lib/component", "componentFactory")
  @js.native
  def componentFactory(Component: VueClass[Vue]): VueClass[Vue] = js.native
  @JSImport("vue-class-component/lib/component", "componentFactory")
  @js.native
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
  
  @JSImport("vue-class-component/lib/component", "$internalHooks")
  @js.native
  val internalHooks: js.Array[String] = js.native
}
