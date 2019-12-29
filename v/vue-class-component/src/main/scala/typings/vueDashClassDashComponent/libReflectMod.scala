package typings.vueDashClassDashComponent

import typings.vue.typesVueMod.Vue
import typings.vue.typesVueMod.VueConstructor
import typings.vueDashClassDashComponent.libDeclarationsMod.VueClass
import typings.vueDashClassDashComponent.vueDashClassDashComponentBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue-class-component/lib/reflect", JSImport.Namespace)
@js.native
object libReflectMod extends js.Object {
  val reflectionIsSupported: `false` | (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Reflect.getOwnMetadataKeys */ js.Any) = js.native
  def copyReflectionMetadata(to: VueConstructor[Vue], from: VueClass[Vue]): Unit = js.native
}

