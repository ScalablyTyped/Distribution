package typings.vuex.typesHelpersMod

import typings.vuex.typesMod.Commit
import typings.vuex.typesMod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vuex/types/helpers", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val mapActions: Mapper[ActionMethod] with MapperWithNamespace[ActionMethod] with (FunctionMapper[Dispatch, ActionMethod]) with (FunctionMapperWithNamespace[Dispatch, ActionMethod]) = js.native
  val mapGetters: Mapper[Computed] with MapperWithNamespace[Computed] = js.native
  val mapMutations: Mapper[MutationMethod] with MapperWithNamespace[MutationMethod] with (FunctionMapper[Commit, MutationMethod]) with (FunctionMapperWithNamespace[Commit, MutationMethod]) = js.native
  val mapState: Mapper[Computed] with MapperWithNamespace[Computed] with MapperForState with MapperForStateWithNamespace = js.native
  def createNamespacedHelpers(namespace: String): NamespacedMappers = js.native
}

