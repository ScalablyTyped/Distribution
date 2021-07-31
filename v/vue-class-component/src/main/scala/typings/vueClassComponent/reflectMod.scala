package typings.vueClassComponent

import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import typings.vueClassComponent.declarationsMod.VueClass
import typings.vueClassComponent.vueClassComponentBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectMod {
  
  @JSImport("vue-class-component/lib/reflect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def copyReflectionMetadata(to: VueConstructor[Vue], from: VueClass[Vue]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyReflectionMetadata")(to.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def reflectionIsSupported(): `false` | (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Reflect.getOwnMetadataKeys */ js.Any) = ^.asInstanceOf[js.Dynamic].applyDynamic("reflectionIsSupported")().asInstanceOf[`false` | (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Reflect.getOwnMetadataKeys */ js.Any)]
}
