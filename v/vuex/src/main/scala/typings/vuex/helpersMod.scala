package typings.vuex

import org.scalablytyped.runtime.TopLevel
import typings.std.Record
import typings.vueRuntimeCore.mod.ComponentOptionsBase
import typings.vueRuntimeCore.mod.ComponentPublicInstance
import typings.vuex.mod.Commit
import typings.vuex.mod.Dispatch
import typings.vuex.vuexBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("vuex/types/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createNamespacedHelpers(namespace: String): NamespacedMappers = ^.asInstanceOf[js.Dynamic].applyDynamic("createNamespacedHelpers")(namespace.asInstanceOf[js.Any]).asInstanceOf[NamespacedMappers]
  
  @JSImport("vuex/types/helpers", "mapActions")
  @js.native
  val mapActions: Mapper[ActionMethod] & MapperWithNamespace[ActionMethod] & MapperForAction & MapperForActionWithNamespace = js.native
  
  @JSImport("vuex/types/helpers", "mapGetters")
  @js.native
  val mapGetters: Mapper[Computed] & MapperWithNamespace[Computed] = js.native
  
  @JSImport("vuex/types/helpers", "mapMutations")
  @js.native
  val mapMutations: Mapper[MutationMethod] & MapperWithNamespace[MutationMethod] & MapperForMutation & MapperForMutationWithNamespace = js.native
  
  @JSImport("vuex/types/helpers", "mapState")
  @js.native
  val mapState: Mapper[Computed] & MapperWithNamespace[Computed] & MapperForState & MapperForStateWithNamespace = js.native
  
  @js.native
  trait ActionMethod extends StObject {
    
    def apply(args: Any*): js.Promise[Any] = js.native
  }
  
  type Computed = js.Function0[Any]
  
  type CustomVue = (ComponentPublicInstance[
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    `false`, 
    ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
  ]) & (Record[String, Any])
  
  type InlineComputed[T /* <: js.Function */] = js.Function0[Any]
  
  type InlineMethod[T /* <: js.Function2[/* fn */ Any, /* repeated */ Any, Any] */] = js.Function1[/* args */ Any, Any]
  
  @js.native
  trait Mapper[R] extends StObject {
    
    def apply[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: R}
      */ typings.vuex.vuexStrings.Mapper & TopLevel[Any] = js.native
    def apply[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in Key ]: R}
      */ typings.vuex.vuexStrings.Mapper & TopLevel[Any] = js.native
  }
  
  type MapperForAction = js.Function1[
    /* map */ Record[
      String, 
      js.ThisFunction2[/* this */ CustomVue, /* dispatch */ Dispatch, /* repeated */ Any, Any]
    ], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof std.Record<string, (this : vuex.vuex/types/helpers.CustomVue, dispatch : vuex.vuex.Dispatch, args : ...any): any> ]: vuex.vuex/types/helpers.InlineMethod<std.Record<string, (this : vuex.vuex/types/helpers.CustomVue, dispatch : vuex.vuex.Dispatch, args : ...any): any>[K]>}
    */ typings.vuex.vuexStrings.MapperForAction & (TopLevel[
      Record[
        String, 
        js.ThisFunction2[/* this */ CustomVue, /* dispatch */ Dispatch, /* repeated */ Any, Any]
      ]
    ])
  ]
  
  type MapperForActionWithNamespace = js.Function2[
    /* namespace */ String, 
    /* map */ Record[
      String, 
      js.ThisFunction2[/* this */ CustomVue, /* dispatch */ Dispatch, /* repeated */ Any, Any]
    ], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof std.Record<string, (this : vuex.vuex/types/helpers.CustomVue, dispatch : vuex.vuex.Dispatch, args : ...any): any> ]: vuex.vuex/types/helpers.InlineMethod<std.Record<string, (this : vuex.vuex/types/helpers.CustomVue, dispatch : vuex.vuex.Dispatch, args : ...any): any>[K]>}
    */ typings.vuex.vuexStrings.MapperForActionWithNamespace & (TopLevel[
      Record[
        String, 
        js.ThisFunction2[/* this */ CustomVue, /* dispatch */ Dispatch, /* repeated */ Any, Any]
      ]
    ])
  ]
  
  type MapperForMutation = js.Function1[
    /* map */ Record[
      String, 
      js.ThisFunction2[/* this */ CustomVue, /* commit */ Commit, /* repeated */ Any, Any]
    ], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof std.Record<string, (this : vuex.vuex/types/helpers.CustomVue, commit : vuex.vuex.Commit, args : ...any): any> ]: vuex.vuex/types/helpers.InlineMethod<std.Record<string, (this : vuex.vuex/types/helpers.CustomVue, commit : vuex.vuex.Commit, args : ...any): any>[K]>}
    */ typings.vuex.vuexStrings.MapperForMutation & (TopLevel[
      Record[
        String, 
        js.ThisFunction2[/* this */ CustomVue, /* commit */ Commit, /* repeated */ Any, Any]
      ]
    ])
  ]
  
  type MapperForMutationWithNamespace = js.Function2[
    /* namespace */ String, 
    /* map */ Record[
      String, 
      js.ThisFunction2[/* this */ CustomVue, /* commit */ Commit, /* repeated */ Any, Any]
    ], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof std.Record<string, (this : vuex.vuex/types/helpers.CustomVue, commit : vuex.vuex.Commit, args : ...any): any> ]: vuex.vuex/types/helpers.InlineMethod<std.Record<string, (this : vuex.vuex/types/helpers.CustomVue, commit : vuex.vuex.Commit, args : ...any): any>[K]>}
    */ typings.vuex.vuexStrings.MapperForMutationWithNamespace & (TopLevel[
      Record[
        String, 
        js.ThisFunction2[/* this */ CustomVue, /* commit */ Commit, /* repeated */ Any, Any]
      ]
    ])
  ]
  
  type MapperForState = js.Function1[
    /* map */ js.Object, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof {} ]: vuex.vuex/types/helpers.InlineComputed<{}[K]>}
    */ typings.vuex.vuexStrings.MapperForState & TopLevel[Any]
  ]
  
  type MapperForStateWithNamespace = js.Function2[
    /* namespace */ String, 
    /* map */ js.Object, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof {} ]: vuex.vuex/types/helpers.InlineComputed<{}[K]>}
    */ typings.vuex.vuexStrings.MapperForStateWithNamespace & TopLevel[Any]
  ]
  
  @js.native
  trait MapperWithNamespace[R] extends StObject {
    
    def apply[Map /* <: Record[String, String] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: R}
      */ typings.vuex.vuexStrings.MapperWithNamespace & TopLevel[Any] = js.native
    def apply[Key /* <: String */](namespace: String, map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in Key ]: R}
      */ typings.vuex.vuexStrings.MapperWithNamespace & TopLevel[Any] = js.native
  }
  
  @js.native
  trait MutationMethod extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
  
  trait NamespacedMappers extends StObject {
    
    def mapActions[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: vuex.vuex/types/helpers.ActionMethod}
      */ typings.vuex.vuexStrings.NamespacedMappers & TopLevel[Any]
    def mapActions[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in Key ]: vuex.vuex/types/helpers.ActionMethod}
      */ typings.vuex.vuexStrings.NamespacedMappers & TopLevel[Any]
    @JSName("mapActions")
    var mapActions_Original: Mapper[ActionMethod] & MapperForAction
    
    def mapGetters[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: vuex.vuex/types/helpers.Computed}
      */ typings.vuex.vuexStrings.NamespacedMappers & TopLevel[Any]
    def mapGetters[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in Key ]: vuex.vuex/types/helpers.Computed}
      */ typings.vuex.vuexStrings.NamespacedMappers & TopLevel[Any]
    @JSName("mapGetters")
    var mapGetters_Original: Mapper[Computed]
    
    def mapMutations[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: vuex.vuex/types/helpers.MutationMethod}
      */ typings.vuex.vuexStrings.NamespacedMappers & TopLevel[Any]
    def mapMutations[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in Key ]: vuex.vuex/types/helpers.MutationMethod}
      */ typings.vuex.vuexStrings.NamespacedMappers & TopLevel[Any]
    @JSName("mapMutations")
    var mapMutations_Original: Mapper[MutationMethod] & MapperForMutation
    
    def mapState[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: vuex.vuex/types/helpers.Computed}
      */ typings.vuex.vuexStrings.NamespacedMappers & TopLevel[Any]
    def mapState[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in Key ]: vuex.vuex/types/helpers.Computed}
      */ typings.vuex.vuexStrings.NamespacedMappers & TopLevel[Any]
    @JSName("mapState")
    var mapState_Original: Mapper[Computed] & MapperForState
    @JSName("mapState")
    def mapState_SMap[S, Map /* <: Record[
        String, 
        js.ThisFunction2[/* this */ CustomVue, /* state */ S, /* getters */ Any, Any]
      ] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineComputed<Map[K]>}
      */ typings.vuex.vuexStrings.NamespacedMappers & TopLevel[Map]
  }
  object NamespacedMappers {
    
    inline def apply(
      mapActions: Mapper[ActionMethod] & MapperForAction,
      mapGetters: Mapper[Computed],
      mapMutations: Mapper[MutationMethod] & MapperForMutation,
      mapState: Mapper[Computed] & MapperForState
    ): NamespacedMappers = {
      val __obj = js.Dynamic.literal(mapActions = mapActions.asInstanceOf[js.Any], mapGetters = mapGetters.asInstanceOf[js.Any], mapMutations = mapMutations.asInstanceOf[js.Any], mapState = mapState.asInstanceOf[js.Any])
      __obj.asInstanceOf[NamespacedMappers]
    }
    
    extension [Self <: NamespacedMappers](x: Self) {
      
      inline def setMapActions(value: Mapper[ActionMethod] & MapperForAction): Self = StObject.set(x, "mapActions", value.asInstanceOf[js.Any])
      
      inline def setMapGetters(value: Mapper[Computed]): Self = StObject.set(x, "mapGetters", value.asInstanceOf[js.Any])
      
      inline def setMapMutations(value: Mapper[MutationMethod] & MapperForMutation): Self = StObject.set(x, "mapMutations", value.asInstanceOf[js.Any])
      
      inline def setMapState(value: Mapper[Computed] & MapperForState): Self = StObject.set(x, "mapState", value.asInstanceOf[js.Any])
    }
  }
}
