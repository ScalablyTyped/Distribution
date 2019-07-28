package typings.vuex.typesMod

import org.scalablytyped.runtime.Instantiable1
import typings.vuex.typesHelpersMod.ActionMethod
import typings.vuex.typesHelpersMod.Computed
import typings.vuex.typesHelpersMod.CustomVue
import typings.vuex.typesHelpersMod.Dictionary
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

/* Extracted nested Instantiables into classes in defaultNs */
@JSImport("vuex/types", JSImport.Default)
@js.native
object default extends js.Object {
  var Store: Instantiable1[
    /* options */ StoreOptions[/* import warning: RewrittenClass.unapply cls $anonfun was tparam S */ js.Any], 
    typings.vuex.typesMod.Store[js.Object]
  ] = js.native
  @JSName("createNamespacedHelpers")
  var createNamespacedHelpers_Original: js.Function1[/* namespace */ String, NamespacedMappers] = js.native
  @JSName("install")
  var install_Original: js.Function1[
    /* import warning: ImportType.apply Failed type conversion: typeof _Vue */ /* Vue */ js.Any, 
    Unit
  ] = js.native
  @JSName("mapActions")
  var mapActions_Original: Mapper[ActionMethod] with MapperWithNamespace[ActionMethod] with (FunctionMapper[Dispatch, ActionMethod]) with (FunctionMapperWithNamespace[Dispatch, ActionMethod]) = js.native
  @JSName("mapGetters")
  var mapGetters_Original: Mapper[Computed] with MapperWithNamespace[Computed] = js.native
  @JSName("mapMutations")
  var mapMutations_Original: Mapper[MutationMethod] with MapperWithNamespace[MutationMethod] with (FunctionMapper[Commit, MutationMethod]) with (FunctionMapperWithNamespace[Commit, MutationMethod]) = js.native
  @JSName("mapState")
  var mapState_Original: Mapper[Computed] with MapperWithNamespace[Computed] with MapperForState with MapperForStateWithNamespace = js.native
  def createNamespacedHelpers(namespace: String): NamespacedMappers = js.native
  def install(Vue: /* import warning: ImportType.apply Failed type conversion: typeof _Vue */ js.Any): Unit = js.native
  def mapActions(map: js.Array[String]): Dictionary[ActionMethod] = js.native
  def mapActions(
    map: Dictionary[
      String | (js.ThisFunction2[/* this */ CustomVue, /* fn */ Dispatch, /* repeated */ _, _])
    ]
  ): Dictionary[ActionMethod] = js.native
  def mapActions(namespace: String, map: js.Array[String]): Dictionary[ActionMethod] = js.native
  def mapActions(
    namespace: String,
    map: Dictionary[
      String | (js.ThisFunction2[/* this */ CustomVue, /* fn */ Dispatch, /* repeated */ _, _])
    ]
  ): Dictionary[ActionMethod] = js.native
  def mapGetters(map: js.Array[String]): Dictionary[Computed] = js.native
  def mapGetters(map: Dictionary[String]): Dictionary[Computed] = js.native
  def mapGetters(namespace: String, map: js.Array[String]): Dictionary[Computed] = js.native
  def mapGetters(namespace: String, map: Dictionary[String]): Dictionary[Computed] = js.native
  def mapMutations(map: js.Array[String]): Dictionary[MutationMethod] = js.native
  def mapMutations(
    map: Dictionary[
      String | (js.ThisFunction2[/* this */ CustomVue, /* fn */ Commit, /* repeated */ _, _])
    ]
  ): Dictionary[MutationMethod] = js.native
  def mapMutations(namespace: String, map: js.Array[String]): Dictionary[MutationMethod] = js.native
  def mapMutations(
    namespace: String,
    map: Dictionary[
      String | (js.ThisFunction2[/* this */ CustomVue, /* fn */ Commit, /* repeated */ _, _])
    ]
  ): Dictionary[MutationMethod] = js.native
  def mapState(map: js.Array[String]): Dictionary[Computed] = js.native
  def mapState(map: Dictionary[String]): Dictionary[Computed] = js.native
  def mapState(namespace: String, map: js.Array[String]): Dictionary[Computed] = js.native
  def mapState(namespace: String, map: Dictionary[String]): Dictionary[Computed] = js.native
  @JSName("mapState")
  def mapState_S[S](map: Dictionary[js.ThisFunction2[/* this */ CustomVue, /* state */ S, /* getters */ _, _]]): Dictionary[Computed] = js.native
  @JSName("mapState")
  def mapState_S[S](
    namespace: String,
    map: Dictionary[js.ThisFunction2[/* this */ CustomVue, /* state */ S, /* getters */ _, _]]
  ): Dictionary[Computed] = js.native
}

