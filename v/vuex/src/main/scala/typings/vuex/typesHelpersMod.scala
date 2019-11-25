package typings.vuex

import typings.std.Record
import typings.vue.typesVueMod.Vue
import typings.vuex.typesHelpersMod.ActionMethod
import typings.vuex.typesHelpersMod.Computed
import typings.vuex.typesHelpersMod.CustomVue
import typings.vuex.typesHelpersMod.Mapper
import typings.vuex.typesHelpersMod.MapperForAction
import typings.vuex.typesHelpersMod.MapperForActionWithNamespace
import typings.vuex.typesHelpersMod.MapperForMutation
import typings.vuex.typesHelpersMod.MapperForMutationWithNamespace
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
    def apply[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: R}
      */ typings.vuex.vuexStrings.Mapper with js.Any = js.native
    def apply[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in Key ]: R}
      */ typings.vuex.vuexStrings.Mapper with js.Any = js.native
  }
  
  @js.native
  trait MapperWithNamespace[R] extends js.Object {
    def apply[Map /* <: Record[String, String] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: R}
      */ typings.vuex.vuexStrings.MapperWithNamespace with js.Any = js.native
    def apply[Key /* <: String */](namespace: String, map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in Key ]: R}
      */ typings.vuex.vuexStrings.MapperWithNamespace with js.Any = js.native
  }
  
  @js.native
  trait NamespacedMappers extends js.Object {
    @JSName("mapActions")
    var mapActions_Original: Mapper[ActionMethod] with MapperForAction = js.native
    @JSName("mapGetters")
    var mapGetters_Original: Mapper[Computed] = js.native
    @JSName("mapMutations")
    var mapMutations_Original: Mapper[MutationMethod] with MapperForMutation = js.native
    @JSName("mapState")
    var mapState_Original: Mapper[Computed] with MapperForState = js.native
    def mapActions[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: vuex.vuex/types/helpers.ActionMethod}
      */ typings.vuex.vuexStrings.NamespacedMappers with js.Any = js.native
    def mapActions[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in Key ]: vuex.vuex/types/helpers.ActionMethod}
      */ typings.vuex.vuexStrings.NamespacedMappers with js.Any = js.native
    @JSName("mapActions")
    def mapActions_Map_RecordStringThisFunction2CustomVueDispatchWildcardWildcard[Map /* <: Record[
        String, 
        js.ThisFunction2[/* this */ CustomVue, /* dispatch */ Dispatch, /* repeated */ _, _]
      ] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineMethod<Map[K]>}
      */ typings.vuex.vuexStrings.NamespacedMappers with Map = js.native
    def mapGetters[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: vuex.vuex/types/helpers.Computed}
      */ typings.vuex.vuexStrings.NamespacedMappers with js.Any = js.native
    def mapGetters[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in Key ]: vuex.vuex/types/helpers.Computed}
      */ typings.vuex.vuexStrings.NamespacedMappers with js.Any = js.native
    def mapMutations[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: vuex.vuex/types/helpers.MutationMethod}
      */ typings.vuex.vuexStrings.NamespacedMappers with js.Any = js.native
    def mapMutations[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in Key ]: vuex.vuex/types/helpers.MutationMethod}
      */ typings.vuex.vuexStrings.NamespacedMappers with js.Any = js.native
    @JSName("mapMutations")
    def mapMutations_Map_RecordStringThisFunction2CustomVueCommitWildcardWildcard[Map /* <: Record[
        String, 
        js.ThisFunction2[/* this */ CustomVue, /* commit */ Commit, /* repeated */ _, _]
      ] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineMethod<Map[K]>}
      */ typings.vuex.vuexStrings.NamespacedMappers with Map = js.native
    def mapState[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: vuex.vuex/types/helpers.Computed}
      */ typings.vuex.vuexStrings.NamespacedMappers with js.Any = js.native
    def mapState[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in Key ]: vuex.vuex/types/helpers.Computed}
      */ typings.vuex.vuexStrings.NamespacedMappers with js.Any = js.native
    @JSName("mapState")
    def mapState_SMap_RecordStringThisFunction2CustomVueSWildcardWildcard[S, Map /* <: Record[String, js.ThisFunction2[/* this */ CustomVue, /* state */ S, /* getters */ _, _]] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineComputed<Map[K]>}
      */ typings.vuex.vuexStrings.NamespacedMappers with Map = js.native
  }
  
  val mapActions: Mapper[ActionMethod] with MapperWithNamespace[ActionMethod] with MapperForAction with MapperForActionWithNamespace = js.native
  val mapGetters: Mapper[Computed] with MapperWithNamespace[Computed] = js.native
  val mapMutations: Mapper[MutationMethod] with MapperWithNamespace[MutationMethod] with MapperForMutation with MapperForMutationWithNamespace = js.native
  val mapState: Mapper[Computed] with MapperWithNamespace[Computed] with MapperForState with MapperForStateWithNamespace = js.native
  def createNamespacedHelpers(namespace: String): NamespacedMappers = js.native
  type ActionMethod = js.Function1[/* repeated */ js.Any, js.Promise[js.Any]]
  type Computed = js.Function0[js.Any]
  type CustomVue = Vue with (Record[String, _])
  type InlineComputed[T /* <: js.Function */] = js.Function0[js.Any]
  type InlineMethod[T /* <: js.Function2[/* fn */ js.Any, /* repeated */ js.Any, _] */] = js.Function1[/* args */ js.Any, js.Any]
  type MapperForAction = js.Function1[
    /* map */ Record[
      String, 
      js.ThisFunction2[/* this */ CustomVue, /* dispatch */ Dispatch, /* repeated */ js.Any, js.Any]
    ], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof std.Record<string, (this : vuex.vuex/types/helpers.CustomVue, dispatch : vuex.vuex/types.Dispatch, args : ...any): any> ]: vuex.vuex/types/helpers.InlineMethod<std.Record<string, (this : vuex.vuex/types/helpers.CustomVue, dispatch : vuex.vuex/types.Dispatch, args : ...any): any>[K]>}
    */ typings.vuex.vuexStrings.MapperForAction with (Record[
      String, 
      js.ThisFunction2[/* this */ CustomVue, /* dispatch */ Dispatch, /* repeated */ js.Any, js.Any]
    ])
  ]
  type MapperForActionWithNamespace = js.Function2[
    /* namespace */ String, 
    /* map */ Record[
      String, 
      js.ThisFunction2[/* this */ CustomVue, /* dispatch */ Dispatch, /* repeated */ js.Any, js.Any]
    ], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof std.Record<string, (this : vuex.vuex/types/helpers.CustomVue, dispatch : vuex.vuex/types.Dispatch, args : ...any): any> ]: vuex.vuex/types/helpers.InlineMethod<std.Record<string, (this : vuex.vuex/types/helpers.CustomVue, dispatch : vuex.vuex/types.Dispatch, args : ...any): any>[K]>}
    */ typings.vuex.vuexStrings.MapperForActionWithNamespace with (Record[
      String, 
      js.ThisFunction2[/* this */ CustomVue, /* dispatch */ Dispatch, /* repeated */ js.Any, js.Any]
    ])
  ]
  type MapperForMutation = js.Function1[
    /* map */ Record[
      String, 
      js.ThisFunction2[/* this */ CustomVue, /* commit */ Commit, /* repeated */ js.Any, js.Any]
    ], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof std.Record<string, (this : vuex.vuex/types/helpers.CustomVue, commit : vuex.vuex/types.Commit, args : ...any): any> ]: vuex.vuex/types/helpers.InlineMethod<std.Record<string, (this : vuex.vuex/types/helpers.CustomVue, commit : vuex.vuex/types.Commit, args : ...any): any>[K]>}
    */ typings.vuex.vuexStrings.MapperForMutation with (Record[
      String, 
      js.ThisFunction2[/* this */ CustomVue, /* commit */ Commit, /* repeated */ js.Any, js.Any]
    ])
  ]
  type MapperForMutationWithNamespace = js.Function2[
    /* namespace */ String, 
    /* map */ Record[
      String, 
      js.ThisFunction2[/* this */ CustomVue, /* commit */ Commit, /* repeated */ js.Any, js.Any]
    ], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof std.Record<string, (this : vuex.vuex/types/helpers.CustomVue, commit : vuex.vuex/types.Commit, args : ...any): any> ]: vuex.vuex/types/helpers.InlineMethod<std.Record<string, (this : vuex.vuex/types/helpers.CustomVue, commit : vuex.vuex/types.Commit, args : ...any): any>[K]>}
    */ typings.vuex.vuexStrings.MapperForMutationWithNamespace with (Record[
      String, 
      js.ThisFunction2[/* this */ CustomVue, /* commit */ Commit, /* repeated */ js.Any, js.Any]
    ])
  ]
  type MapperForState = js.Function1[
    /* map */ js.Object, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof {} ]: vuex.vuex/types/helpers.InlineComputed<{}[K]>}
    */ typings.vuex.vuexStrings.MapperForState with js.Any
  ]
  type MapperForStateWithNamespace = js.Function2[
    /* namespace */ String, 
    /* map */ js.Object, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof {} ]: vuex.vuex/types/helpers.InlineComputed<{}[K]>}
    */ typings.vuex.vuexStrings.MapperForStateWithNamespace with js.Any
  ]
  type MutationMethod = js.Function1[/* repeated */ js.Any, Unit]
}

