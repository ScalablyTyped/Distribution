package typings
package vuexLib.typesHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vuex/types/helpers", JSImport.Namespace)
@js.native
object typesHelpersModMembers extends js.Object {
  val mapActions: Mapper[ActionMethod] with MapperWithNamespace[ActionMethod] with (FunctionMapper[vuexLib.typesMod.Dispatch, ActionMethod]) with (FunctionMapperWithNamespace[vuexLib.typesMod.Dispatch, ActionMethod]) = js.native
  val mapGetters: Mapper[Computed] with MapperWithNamespace[Computed] = js.native
  val mapMutations: Mapper[MutationMethod] with MapperWithNamespace[MutationMethod] with (FunctionMapper[vuexLib.typesMod.Commit, MutationMethod]) with (FunctionMapperWithNamespace[vuexLib.typesMod.Commit, MutationMethod]) = js.native
  val mapState: Mapper[Computed] with MapperWithNamespace[Computed] with MapperForState with MapperForStateWithNamespace = js.native
  def createNamespacedHelpers(namespace: java.lang.String): NamespacedMappers = js.native
}

