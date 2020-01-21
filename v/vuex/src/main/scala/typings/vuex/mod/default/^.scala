package typings.vuex.mod.default

import org.scalablytyped.runtime.Instantiable1
import typings.std.Record
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
import typings.vuex.mod.Commit
import typings.vuex.mod.Dispatch
import typings.vuex.mod.StoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vuex", JSImport.Default)
@js.native
object ^ extends js.Object {
  var Store: Instantiable1[
    /* options */ StoreOptions[/* import warning: RewrittenClass.unapply cls was tparam S */ js.Any], 
    typings.vuex.mod.Store[js.Object]
  ] = js.native
  @JSName("createNamespacedHelpers")
  var createNamespacedHelpers_Original: js.Function1[/* namespace */ String, NamespacedMappers] = js.native
  @JSName("install")
  var install_Original: js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof _Vue */ /* Vue */ js.Any, 
    Unit
  ] = js.native
  @JSName("mapActions")
  var mapActions_Original: Mapper[ActionMethod] with MapperWithNamespace[ActionMethod] with MapperForAction with MapperForActionWithNamespace = js.native
  @JSName("mapGetters")
  var mapGetters_Original: Mapper[Computed] with MapperWithNamespace[Computed] = js.native
  @JSName("mapMutations")
  var mapMutations_Original: Mapper[MutationMethod] with MapperWithNamespace[MutationMethod] with MapperForMutation with MapperForMutationWithNamespace = js.native
  @JSName("mapState")
  var mapState_Original: Mapper[Computed] with MapperWithNamespace[Computed] with MapperForState with MapperForStateWithNamespace = js.native
  def createNamespacedHelpers(namespace: String): NamespacedMappers = js.native
  def install(Vue: /* import warning: importer.ImportType#apply Failed type conversion: typeof _Vue */ js.Any): Unit = js.native
  def mapActions[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.ActionMethod}
    */ typings.vuex.vuexStrings.^  with js.Any = js.native
  def mapActions[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.ActionMethod}
    */ typings.vuex.vuexStrings.^  with js.Any = js.native
  def mapActions[Map /* <: Record[String, String] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.ActionMethod}
    */ typings.vuex.vuexStrings.^  with js.Any = js.native
  def mapActions[Key /* <: String */](namespace: String, map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.ActionMethod}
    */ typings.vuex.vuexStrings.^  with js.Any = js.native
  @JSName("mapActions")
  def mapActions_Map_RecordStringThisFunction2CustomVueDispatchWildcardWildcard[Map /* <: Record[
    String, 
    js.ThisFunction2[/* this */ CustomVue, /* dispatch */ Dispatch, /* repeated */ _, _]
  ] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineMethod<Map[K]>}
    */ typings.vuex.vuexStrings.^  with Map = js.native
  @JSName("mapActions")
  def mapActions_Map_RecordStringThisFunction2CustomVueDispatchWildcardWildcard[Map /* <: Record[
    String, 
    js.ThisFunction2[/* this */ CustomVue, /* dispatch */ Dispatch, /* repeated */ _, _]
  ] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineMethod<Map[K]>}
    */ typings.vuex.vuexStrings.^  with Map = js.native
  def mapGetters[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.Computed}
    */ typings.vuex.vuexStrings.^  with js.Any = js.native
  def mapGetters[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.Computed}
    */ typings.vuex.vuexStrings.^  with js.Any = js.native
  def mapGetters[Map /* <: Record[String, String] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.Computed}
    */ typings.vuex.vuexStrings.^  with js.Any = js.native
  def mapGetters[Key /* <: String */](namespace: String, map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.Computed}
    */ typings.vuex.vuexStrings.^  with js.Any = js.native
  def mapMutations[Map /* <: Record[
    String, 
    js.ThisFunction2[/* this */ CustomVue, /* commit */ Commit, /* repeated */ _, _]
  ] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineMethod<Map[K]>}
    */ typings.vuex.vuexStrings.^  with Map = js.native
  def mapMutations[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.MutationMethod}
    */ typings.vuex.vuexStrings.^  with js.Any = js.native
  def mapMutations[Map /* <: Record[
    String, 
    js.ThisFunction2[/* this */ CustomVue, /* commit */ Commit, /* repeated */ _, _]
  ] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineMethod<Map[K]>}
    */ typings.vuex.vuexStrings.^  with Map = js.native
  def mapMutations[Key /* <: String */](namespace: String, map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.MutationMethod}
    */ typings.vuex.vuexStrings.^  with js.Any = js.native
  @JSName("mapMutations")
  def mapMutations_Map_RecordStringString[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.MutationMethod}
    */ typings.vuex.vuexStrings.^  with js.Any = js.native
  @JSName("mapMutations")
  def mapMutations_Map_RecordStringString[Map /* <: Record[String, String] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.MutationMethod}
    */ typings.vuex.vuexStrings.^  with js.Any = js.native
  def mapState[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.Computed}
    */ typings.vuex.vuexStrings.^  with js.Any = js.native
  def mapState[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.Computed}
    */ typings.vuex.vuexStrings.^  with js.Any = js.native
  def mapState[Map /* <: Record[String, String] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.Computed}
    */ typings.vuex.vuexStrings.^  with js.Any = js.native
  def mapState[Key /* <: String */](namespace: String, map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.Computed}
    */ typings.vuex.vuexStrings.^  with js.Any = js.native
  @JSName("mapState")
  def mapState_SMap_RecordStringThisFunction2CustomVueSWildcardWildcard[S, Map /* <: Record[String, js.ThisFunction2[/* this */ CustomVue, /* state */ S, /* getters */ _, _]] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineComputed<Map[K]>}
    */ typings.vuex.vuexStrings.^  with Map = js.native
  @JSName("mapState")
  def mapState_SMap_RecordStringThisFunction2CustomVueSWildcardWildcard[S, Map /* <: Record[String, js.ThisFunction2[/* this */ CustomVue, /* state */ S, /* getters */ _, _]] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineComputed<Map[K]>}
    */ typings.vuex.vuexStrings.^  with Map = js.native
}

