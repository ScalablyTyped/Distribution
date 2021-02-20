package typings.vuex

import org.scalablytyped.runtime.TopLevel
import typings.std.Record
import typings.vue.vueMod.Vue
import typings.vuex.mod.Commit
import typings.vuex.mod.Dispatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("vuex/types/helpers", "createNamespacedHelpers")
  @js.native
  def createNamespacedHelpers(namespace: String): NamespacedMappers = js.native
  
  @JSImport("vuex/types/helpers", "mapActions")
  @js.native
  val mapActions: Mapper[ActionMethod] with MapperWithNamespace[ActionMethod] with MapperForAction with MapperForActionWithNamespace = js.native
  
  @JSImport("vuex/types/helpers", "mapGetters")
  @js.native
  val mapGetters: Mapper[Computed] with MapperWithNamespace[Computed] = js.native
  
  @JSImport("vuex/types/helpers", "mapMutations")
  @js.native
  val mapMutations: Mapper[MutationMethod] with MapperWithNamespace[MutationMethod] with MapperForMutation with MapperForMutationWithNamespace = js.native
  
  @JSImport("vuex/types/helpers", "mapState")
  @js.native
  val mapState: Mapper[Computed] with MapperWithNamespace[Computed] with MapperForState with MapperForStateWithNamespace = js.native
  
  type ActionMethod = js.Function1[/* repeated */ js.Any, js.Promise[js.Any]]
  
  type Computed = js.Function0[js.Any]
  
  type CustomVue = Vue with (Record[String, _])
  
  type InlineComputed[T /* <: js.Function */] = js.Function0[js.Any]
  
  type InlineMethod[T /* <: js.Function2[/* fn */ js.Any, /* repeated */ js.Any, _] */] = js.Function1[/* args */ js.Any, js.Any]
  
  @js.native
  trait Mapper[R] extends StObject {
    
    def apply[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: R}
      */ typings.vuex.vuexStrings.Mapper with TopLevel[js.Any] = js.native
    def apply[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in Key ]: R}
      */ typings.vuex.vuexStrings.Mapper with TopLevel[js.Any] = js.native
  }
  
  type MapperForAction = js.Function1[
    /* map */ Record[
      String, 
      js.ThisFunction2[/* this */ CustomVue, /* dispatch */ Dispatch, /* repeated */ js.Any, js.Any]
    ], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof std.Record<string, (this : vuex.vuex/types/helpers.CustomVue, dispatch : vuex.vuex.Dispatch, args : ...any): any> ]: vuex.vuex/types/helpers.InlineMethod<std.Record<string, (this : vuex.vuex/types/helpers.CustomVue, dispatch : vuex.vuex.Dispatch, args : ...any): any>[K]>}
    */ typings.vuex.vuexStrings.MapperForAction with (TopLevel[
      Record[
        String, 
        js.ThisFunction2[/* this */ CustomVue, /* dispatch */ Dispatch, /* repeated */ js.Any, js.Any]
      ]
    ])
  ]
  
  type MapperForActionWithNamespace = js.Function2[
    /* namespace */ String, 
    /* map */ Record[
      String, 
      js.ThisFunction2[/* this */ CustomVue, /* dispatch */ Dispatch, /* repeated */ js.Any, js.Any]
    ], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof std.Record<string, (this : vuex.vuex/types/helpers.CustomVue, dispatch : vuex.vuex.Dispatch, args : ...any): any> ]: vuex.vuex/types/helpers.InlineMethod<std.Record<string, (this : vuex.vuex/types/helpers.CustomVue, dispatch : vuex.vuex.Dispatch, args : ...any): any>[K]>}
    */ typings.vuex.vuexStrings.MapperForActionWithNamespace with (TopLevel[
      Record[
        String, 
        js.ThisFunction2[/* this */ CustomVue, /* dispatch */ Dispatch, /* repeated */ js.Any, js.Any]
      ]
    ])
  ]
  
  type MapperForMutation = js.Function1[
    /* map */ Record[
      String, 
      js.ThisFunction2[/* this */ CustomVue, /* commit */ Commit, /* repeated */ js.Any, js.Any]
    ], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof std.Record<string, (this : vuex.vuex/types/helpers.CustomVue, commit : vuex.vuex.Commit, args : ...any): any> ]: vuex.vuex/types/helpers.InlineMethod<std.Record<string, (this : vuex.vuex/types/helpers.CustomVue, commit : vuex.vuex.Commit, args : ...any): any>[K]>}
    */ typings.vuex.vuexStrings.MapperForMutation with (TopLevel[
      Record[
        String, 
        js.ThisFunction2[/* this */ CustomVue, /* commit */ Commit, /* repeated */ js.Any, js.Any]
      ]
    ])
  ]
  
  type MapperForMutationWithNamespace = js.Function2[
    /* namespace */ String, 
    /* map */ Record[
      String, 
      js.ThisFunction2[/* this */ CustomVue, /* commit */ Commit, /* repeated */ js.Any, js.Any]
    ], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof std.Record<string, (this : vuex.vuex/types/helpers.CustomVue, commit : vuex.vuex.Commit, args : ...any): any> ]: vuex.vuex/types/helpers.InlineMethod<std.Record<string, (this : vuex.vuex/types/helpers.CustomVue, commit : vuex.vuex.Commit, args : ...any): any>[K]>}
    */ typings.vuex.vuexStrings.MapperForMutationWithNamespace with (TopLevel[
      Record[
        String, 
        js.ThisFunction2[/* this */ CustomVue, /* commit */ Commit, /* repeated */ js.Any, js.Any]
      ]
    ])
  ]
  
  type MapperForState = js.Function1[
    /* map */ js.Object, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof {} ]: vuex.vuex/types/helpers.InlineComputed<{}[K]>}
    */ typings.vuex.vuexStrings.MapperForState with TopLevel[js.Any]
  ]
  
  type MapperForStateWithNamespace = js.Function2[
    /* namespace */ String, 
    /* map */ js.Object, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof {} ]: vuex.vuex/types/helpers.InlineComputed<{}[K]>}
    */ typings.vuex.vuexStrings.MapperForStateWithNamespace with TopLevel[js.Any]
  ]
  
  @js.native
  trait MapperWithNamespace[R] extends StObject {
    
    def apply[Map /* <: Record[String, String] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: R}
      */ typings.vuex.vuexStrings.MapperWithNamespace with TopLevel[js.Any] = js.native
    def apply[Key /* <: String */](namespace: String, map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in Key ]: R}
      */ typings.vuex.vuexStrings.MapperWithNamespace with TopLevel[js.Any] = js.native
  }
  
  type MutationMethod = js.Function1[/* repeated */ js.Any, Unit]
  
  @js.native
  trait NamespacedMappers extends StObject {
    
    def mapActions[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: vuex.vuex/types/helpers.ActionMethod}
      */ typings.vuex.vuexStrings.NamespacedMappers with TopLevel[js.Any] = js.native
    def mapActions[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in Key ]: vuex.vuex/types/helpers.ActionMethod}
      */ typings.vuex.vuexStrings.NamespacedMappers with TopLevel[js.Any] = js.native
    @JSName("mapActions")
    def mapActions_Map_RecordStringThisFunction2CustomVueDispatchWildcardWildcard[Map /* <: Record[
        String, 
        js.ThisFunction2[/* this */ CustomVue, /* dispatch */ Dispatch, /* repeated */ _, _]
      ] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineMethod<Map[K]>}
      */ typings.vuex.vuexStrings.NamespacedMappers with TopLevel[Map] = js.native
    @JSName("mapActions")
    var mapActions_Original: Mapper[ActionMethod] with MapperForAction = js.native
    
    def mapGetters[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: vuex.vuex/types/helpers.Computed}
      */ typings.vuex.vuexStrings.NamespacedMappers with TopLevel[js.Any] = js.native
    def mapGetters[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in Key ]: vuex.vuex/types/helpers.Computed}
      */ typings.vuex.vuexStrings.NamespacedMappers with TopLevel[js.Any] = js.native
    @JSName("mapGetters")
    var mapGetters_Original: Mapper[Computed] = js.native
    
    def mapMutations[Map /* <: Record[
        String, 
        js.ThisFunction2[/* this */ CustomVue, /* commit */ Commit, /* repeated */ _, _]
      ] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineMethod<Map[K]>}
      */ typings.vuex.vuexStrings.NamespacedMappers with TopLevel[Map] = js.native
    def mapMutations[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in Key ]: vuex.vuex/types/helpers.MutationMethod}
      */ typings.vuex.vuexStrings.NamespacedMappers with TopLevel[js.Any] = js.native
    @JSName("mapMutations")
    def mapMutations_Map_RecordStringString[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: vuex.vuex/types/helpers.MutationMethod}
      */ typings.vuex.vuexStrings.NamespacedMappers with TopLevel[js.Any] = js.native
    @JSName("mapMutations")
    var mapMutations_Original: Mapper[MutationMethod] with MapperForMutation = js.native
    
    def mapState[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: vuex.vuex/types/helpers.Computed}
      */ typings.vuex.vuexStrings.NamespacedMappers with TopLevel[js.Any] = js.native
    def mapState[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in Key ]: vuex.vuex/types/helpers.Computed}
      */ typings.vuex.vuexStrings.NamespacedMappers with TopLevel[js.Any] = js.native
    @JSName("mapState")
    var mapState_Original: Mapper[Computed] with MapperForState = js.native
    @JSName("mapState")
    def mapState_SMap_RecordStringThisFunction2CustomVueSWildcardWildcard[S, Map /* <: Record[String, js.ThisFunction2[/* this */ CustomVue, /* state */ S, /* getters */ _, _]] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineComputed<Map[K]>}
      */ typings.vuex.vuexStrings.NamespacedMappers with TopLevel[Map] = js.native
  }
}
