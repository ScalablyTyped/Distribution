package typings.vuex

import org.scalablytyped.runtime.StringDictionary
import typings.vue.typesVueMod.Vue
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
import typings.vuex.typesMod.Commit
import typings.vuex.typesMod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vuex/types/helpers", JSImport.Namespace)
@js.native
object typesHelpersMod extends js.Object {
  @js.native
  trait Mapper[R] extends js.Object {
    def apply(map: js.Array[String]): Dictionary[R] = js.native
    def apply(map: Dictionary[String]): Dictionary[R] = js.native
  }
  
  @js.native
  trait MapperWithNamespace[R] extends js.Object {
    def apply(namespace: String, map: js.Array[String]): Dictionary[R] = js.native
    def apply(namespace: String, map: Dictionary[String]): Dictionary[R] = js.native
  }
  
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
  
  val mapActions: Mapper[ActionMethod] with MapperWithNamespace[ActionMethod] with (FunctionMapper[Dispatch, ActionMethod]) with (FunctionMapperWithNamespace[Dispatch, ActionMethod]) = js.native
  val mapGetters: Mapper[Computed] with MapperWithNamespace[Computed] = js.native
  val mapMutations: Mapper[MutationMethod] with MapperWithNamespace[MutationMethod] with (FunctionMapper[Commit, MutationMethod]) with (FunctionMapperWithNamespace[Commit, MutationMethod]) = js.native
  val mapState: Mapper[Computed] with MapperWithNamespace[Computed] with MapperForState with MapperForStateWithNamespace = js.native
  def createNamespacedHelpers(namespace: String): NamespacedMappers = js.native
  type ActionMethod = js.Function1[/* repeated */ js.Any, js.Promise[js.Any]]
  type Computed = js.Function0[js.Any]
  type CustomVue = Vue with Dictionary[_]
  type Dictionary[T] = StringDictionary[T]
  type FunctionMapper[F, R] = js.Function1[
    /* map */ Dictionary[
      js.ThisFunction2[/* this */ CustomVue, /* fn */ F, /* repeated */ js.Any, js.Any]
    ], 
    Dictionary[R]
  ]
  type FunctionMapperWithNamespace[F, R] = js.Function2[
    /* namespace */ String, 
    /* map */ Dictionary[
      js.ThisFunction2[/* this */ CustomVue, /* fn */ F, /* repeated */ js.Any, js.Any]
    ], 
    Dictionary[R]
  ]
  type MapperForState = js.Function1[
    /* map */ Dictionary[
      js.ThisFunction2[/* this */ CustomVue, /* state */ js.Any, /* getters */ js.Any, js.Any]
    ], 
    Dictionary[Computed]
  ]
  type MapperForStateWithNamespace = js.Function2[
    /* namespace */ String, 
    /* map */ Dictionary[
      js.ThisFunction2[/* this */ CustomVue, /* state */ js.Any, /* getters */ js.Any, js.Any]
    ], 
    Dictionary[Computed]
  ]
  type MutationMethod = js.Function1[/* repeated */ js.Any, Unit]
}

