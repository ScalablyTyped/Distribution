package typings.testingLibraryVue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ConfigurationCallback[V /* <: typings.vue.vueMod.Vue */] = js.Function3[
    /* localVue */ typings.vue.vueMod.VueConstructor[typings.vue.vueMod.Vue], 
    /* store */ typings.vuex.mod.Store[js.Any], 
    /* router */ typings.vueRouter.mod.default, 
    typings.std.Partial[typings.vueTestUtils.mod.ThisTypedMountOptions[V]] | scala.Unit
  ]
}
