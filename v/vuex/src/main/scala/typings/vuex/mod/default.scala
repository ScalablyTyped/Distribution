package typings.vuex.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.std.Record
import typings.vuex.anon.FnCall
import typings.vuex.helpersMod.ActionMethod
import typings.vuex.helpersMod.Computed
import typings.vuex.helpersMod.CustomVue
import typings.vuex.helpersMod.Mapper
import typings.vuex.helpersMod.MapperForAction
import typings.vuex.helpersMod.MapperForActionWithNamespace
import typings.vuex.helpersMod.MapperForMutation
import typings.vuex.helpersMod.MapperForMutationWithNamespace
import typings.vuex.helpersMod.MapperForState
import typings.vuex.helpersMod.MapperForStateWithNamespace
import typings.vuex.helpersMod.MapperWithNamespace
import typings.vuex.helpersMod.MutationMethod
import typings.vuex.helpersMod.NamespacedMappers
import typings.vuex.loggerMod.LoggerOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object default {
  
  @JSImport("vuex", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vuex", "default.Store")
  @js.native
  def Store: Instantiable1[
    /* options */ StoreOptions[/* import warning: RewrittenClass.unapply cls was tparam S */ Any], 
    typings.vuex.mod.Store[js.Object]
  ] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("vuex", "default.Store")
  @js.native
  open class StoreCls[S] protected () extends Store[S] {
    def this(options: StoreOptions[/* import warning: RewrittenClass.unapply cls was tparam S */ Any]) = this()
  }
  
  inline def Store_=(
    x: Instantiable1[
      /* options */ StoreOptions[/* import warning: RewrittenClass.unapply cls was tparam S */ Any], 
      Store[js.Object]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Store")(x.asInstanceOf[js.Any])
  
  inline def createLogger[S](): Plugin[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLogger")().asInstanceOf[Plugin[S]]
  inline def createLogger[S](option: LoggerOption[S]): Plugin[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLogger")(option.asInstanceOf[js.Any]).asInstanceOf[Plugin[S]]
  @JSImport("vuex", "default.createLogger")
  @js.native
  def createLogger_Fdefault: FnCall = js.native
  
  inline def createLogger_Fdefault_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createLogger")(x.asInstanceOf[js.Any])
  
  @JSImport("vuex", "default.createNamespacedHelpers")
  @js.native
  def createNamespacedHelpers: js.Function1[/* namespace */ String, NamespacedMappers] = js.native
  inline def createNamespacedHelpers(namespace: String): NamespacedMappers = ^.asInstanceOf[js.Dynamic].applyDynamic("createNamespacedHelpers")(namespace.asInstanceOf[js.Any]).asInstanceOf[NamespacedMappers]
  inline def createNamespacedHelpers_=(x: js.Function1[/* namespace */ String, NamespacedMappers]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createNamespacedHelpers")(x.asInstanceOf[js.Any])
  
  @JSImport("vuex", "default.mapActions")
  @js.native
  def mapActions: Mapper[ActionMethod] & MapperWithNamespace[ActionMethod] & MapperForAction & MapperForActionWithNamespace = js.native
  inline def mapActions[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.ActionMethod}
    */ typings.vuex.vuexStrings.mapActions & TopLevel[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapActions")(map.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.ActionMethod}
    */ typings.vuex.vuexStrings.mapActions & TopLevel[Any]]
  inline def mapActions[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.ActionMethod}
    */ typings.vuex.vuexStrings.mapActions & TopLevel[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapActions")(map.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.ActionMethod}
    */ typings.vuex.vuexStrings.mapActions & TopLevel[Any]]
  inline def mapActions[Map /* <: Record[String, String] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.ActionMethod}
    */ typings.vuex.vuexStrings.mapActions & TopLevel[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapActions")(namespace.asInstanceOf[js.Any], map.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.ActionMethod}
    */ typings.vuex.vuexStrings.mapActions & TopLevel[Any]]
  inline def mapActions[Key /* <: String */](namespace: String, map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.ActionMethod}
    */ typings.vuex.vuexStrings.mapActions & TopLevel[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapActions")(namespace.asInstanceOf[js.Any], map.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.ActionMethod}
    */ typings.vuex.vuexStrings.mapActions & TopLevel[Any]]
  inline def mapActions_=(
    x: Mapper[ActionMethod] & MapperWithNamespace[ActionMethod] & MapperForAction & MapperForActionWithNamespace
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mapActions")(x.asInstanceOf[js.Any])
  
  @JSImport("vuex", "default.mapGetters")
  @js.native
  def mapGetters: Mapper[Computed] & MapperWithNamespace[Computed] = js.native
  inline def mapGetters[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.Computed}
    */ typings.vuex.vuexStrings.mapGetters & TopLevel[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapGetters")(map.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.Computed}
    */ typings.vuex.vuexStrings.mapGetters & TopLevel[Any]]
  inline def mapGetters[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.Computed}
    */ typings.vuex.vuexStrings.mapGetters & TopLevel[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapGetters")(map.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.Computed}
    */ typings.vuex.vuexStrings.mapGetters & TopLevel[Any]]
  inline def mapGetters[Map /* <: Record[String, String] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.Computed}
    */ typings.vuex.vuexStrings.mapGetters & TopLevel[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapGetters")(namespace.asInstanceOf[js.Any], map.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.Computed}
    */ typings.vuex.vuexStrings.mapGetters & TopLevel[Any]]
  inline def mapGetters[Key /* <: String */](namespace: String, map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.Computed}
    */ typings.vuex.vuexStrings.mapGetters & TopLevel[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapGetters")(namespace.asInstanceOf[js.Any], map.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.Computed}
    */ typings.vuex.vuexStrings.mapGetters & TopLevel[Any]]
  inline def mapGetters_=(x: Mapper[Computed] & MapperWithNamespace[Computed]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mapGetters")(x.asInstanceOf[js.Any])
  
  @JSImport("vuex", "default.mapMutations")
  @js.native
  def mapMutations: Mapper[MutationMethod] & MapperWithNamespace[MutationMethod] & MapperForMutation & MapperForMutationWithNamespace = js.native
  inline def mapMutations[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.MutationMethod}
    */ typings.vuex.vuexStrings.mapMutations & TopLevel[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapMutations")(map.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.MutationMethod}
    */ typings.vuex.vuexStrings.mapMutations & TopLevel[Any]]
  inline def mapMutations[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.MutationMethod}
    */ typings.vuex.vuexStrings.mapMutations & TopLevel[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapMutations")(map.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.MutationMethod}
    */ typings.vuex.vuexStrings.mapMutations & TopLevel[Any]]
  inline def mapMutations[Map /* <: Record[String, String] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.MutationMethod}
    */ typings.vuex.vuexStrings.mapMutations & TopLevel[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapMutations")(namespace.asInstanceOf[js.Any], map.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.MutationMethod}
    */ typings.vuex.vuexStrings.mapMutations & TopLevel[Any]]
  inline def mapMutations[Key /* <: String */](namespace: String, map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.MutationMethod}
    */ typings.vuex.vuexStrings.mapMutations & TopLevel[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapMutations")(namespace.asInstanceOf[js.Any], map.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.MutationMethod}
    */ typings.vuex.vuexStrings.mapMutations & TopLevel[Any]]
  inline def mapMutations_=(
    x: Mapper[MutationMethod] & MapperWithNamespace[MutationMethod] & MapperForMutation & MapperForMutationWithNamespace
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mapMutations")(x.asInstanceOf[js.Any])
  
  @JSImport("vuex", "default.mapState")
  @js.native
  def mapState: Mapper[Computed] & MapperWithNamespace[Computed] & MapperForState & MapperForStateWithNamespace = js.native
  inline def mapState[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.Computed}
    */ typings.vuex.vuexStrings.mapState & TopLevel[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapState")(map.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.Computed}
    */ typings.vuex.vuexStrings.mapState & TopLevel[Any]]
  inline def mapState[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.Computed}
    */ typings.vuex.vuexStrings.mapState & TopLevel[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapState")(map.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.Computed}
    */ typings.vuex.vuexStrings.mapState & TopLevel[Any]]
  inline def mapState[Map /* <: Record[String, String] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.Computed}
    */ typings.vuex.vuexStrings.mapState & TopLevel[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapState")(namespace.asInstanceOf[js.Any], map.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.Computed}
    */ typings.vuex.vuexStrings.mapState & TopLevel[Any]]
  inline def mapState[Key /* <: String */](namespace: String, map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.Computed}
    */ typings.vuex.vuexStrings.mapState & TopLevel[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapState")(namespace.asInstanceOf[js.Any], map.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.Computed}
    */ typings.vuex.vuexStrings.mapState & TopLevel[Any]]
  inline def mapState_=(x: Mapper[Computed] & MapperWithNamespace[Computed] & MapperForState & MapperForStateWithNamespace): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mapState")(x.asInstanceOf[js.Any])
  
  inline def mapState_SMap[S, Map /* <: Record[
    String, 
    js.ThisFunction2[/* this */ CustomVue, /* state */ S, /* getters */ Any, Any]
  ] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineComputed<Map[K]>}
    */ typings.vuex.vuexStrings.mapState & TopLevel[Map] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapState")(map.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineComputed<Map[K]>}
    */ typings.vuex.vuexStrings.mapState & TopLevel[Map]]
  inline def mapState_SMap[S, Map /* <: Record[
    String, 
    js.ThisFunction2[/* this */ CustomVue, /* state */ S, /* getters */ Any, Any]
  ] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineComputed<Map[K]>}
    */ typings.vuex.vuexStrings.mapState & TopLevel[Map] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapState")(namespace.asInstanceOf[js.Any], map.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineComputed<Map[K]>}
    */ typings.vuex.vuexStrings.mapState & TopLevel[Map]]
}
