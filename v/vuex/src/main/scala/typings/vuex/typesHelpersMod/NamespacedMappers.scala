package typings.vuex.typesHelpersMod

import typings.vuex.typesMod.Commit
import typings.vuex.typesMod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamespacedMappers extends js.Object {
  @JSName("mapActions")
  var mapActions_Original: Mapper[ActionMethod] with (FunctionMapper[Dispatch, ActionMethod]) = js.native
  @JSName("mapGetters")
  var mapGetters_Original: Mapper[Computed] = js.native
  @JSName("mapMutations")
  var mapMutations_Original: Mapper[MutationMethod] with (FunctionMapper[Commit, MutationMethod]) = js.native
  @JSName("mapState")
  var mapState_Original: Mapper[Computed] with MapperForState = js.native
  def mapActions(map: js.Array[String]): Dictionary[ActionMethod] = js.native
  def mapActions(
    map: Dictionary[
      String | (js.ThisFunction2[/* this */ CustomVue, /* fn */ Dispatch, /* repeated */ _, _])
    ]
  ): Dictionary[ActionMethod] = js.native
  def mapGetters(map: js.Array[String]): Dictionary[Computed] = js.native
  def mapGetters(map: Dictionary[String]): Dictionary[Computed] = js.native
  def mapMutations(map: js.Array[String]): Dictionary[MutationMethod] = js.native
  def mapMutations(
    map: Dictionary[
      String | (js.ThisFunction2[/* this */ CustomVue, /* fn */ Commit, /* repeated */ _, _])
    ]
  ): Dictionary[MutationMethod] = js.native
  def mapState(map: js.Array[String]): Dictionary[Computed] = js.native
  def mapState(map: Dictionary[String]): Dictionary[Computed] = js.native
  @JSName("mapState")
  def mapState_S[S](map: Dictionary[js.ThisFunction2[/* this */ CustomVue, /* state */ S, /* getters */ _, _]]): Dictionary[Computed] = js.native
}

