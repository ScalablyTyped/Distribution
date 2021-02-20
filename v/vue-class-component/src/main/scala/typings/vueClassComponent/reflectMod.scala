package typings.vueClassComponent

import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import typings.vueClassComponent.declarationsMod.VueClass
import typings.vueClassComponent.vueClassComponentBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectMod {
  
  @JSImport("vue-class-component/lib/reflect", "copyReflectionMetadata")
  @js.native
  def copyReflectionMetadata(to: VueConstructor[Vue], from: VueClass[Vue]): Unit = js.native
  
  @JSImport("vue-class-component/lib/reflect", "reflectionIsSupported")
  @js.native
  def reflectionIsSupported(): `false` | (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Reflect.getOwnMetadataKeys */ js.Any) = js.native
}
