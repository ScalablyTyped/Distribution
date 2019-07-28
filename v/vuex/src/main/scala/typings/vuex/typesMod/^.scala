package typings.vuex.typesMod

import typings.vue.typesVueMod.Vue
import typings.vue.typesVueMod.VueConstructor
import typings.vuex.typesHelpersMod.ActionMethod
import typings.vuex.typesHelpersMod.Computed
import typings.vuex.typesHelpersMod.FunctionMapper
import typings.vuex.typesHelpersMod.FunctionMapperWithNamespace
import typings.vuex.typesHelpersMod.Mapper
import typings.vuex.typesHelpersMod.MapperForState
import typings.vuex.typesHelpersMod.MapperForStateWithNamespace
import typings.vuex.typesHelpersMod.MapperWithNamespace
import typings.vuex.typesHelpersMod.MutationMethod
import typings.vuex.typesHelpersMod.NamespacedMappers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vuex/types", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val mapActions: Mapper[ActionMethod] with MapperWithNamespace[ActionMethod] with (FunctionMapper[Dispatch, ActionMethod]) with (FunctionMapperWithNamespace[Dispatch, ActionMethod]) = js.native
  val mapGetters: Mapper[Computed] with MapperWithNamespace[Computed] = js.native
  val mapMutations: Mapper[MutationMethod] with MapperWithNamespace[MutationMethod] with (FunctionMapper[Commit, MutationMethod]) with (FunctionMapperWithNamespace[Commit, MutationMethod]) = js.native
  val mapState: Mapper[Computed] with MapperWithNamespace[Computed] with MapperForState with MapperForStateWithNamespace = js.native
  def createNamespacedHelpers(namespace: String): NamespacedMappers = js.native
  def install(Vue: VueConstructor[Vue]): Unit = js.native
}

