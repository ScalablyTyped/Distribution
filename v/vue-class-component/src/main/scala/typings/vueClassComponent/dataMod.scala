package typings.vueClassComponent

import typings.vue.vueMod.Vue
import typings.vueClassComponent.declarationsMod.VueClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataMod {
  
  @JSImport("vue-class-component/lib/data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def collectDataFromConstructor(vm: Vue, Component: VueClass[Vue]): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("collectDataFromConstructor")(vm.asInstanceOf[js.Any], Component.asInstanceOf[js.Any])).asInstanceOf[js.Object]
}
