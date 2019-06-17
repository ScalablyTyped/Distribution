package typings
package atWordpressDataLib.atWordpressDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/data", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val RegistryConsumer: reactLib.reactMod.Consumer[DataRegistry] = js.native
  val RegistryProvider: reactLib.reactMod.Provider[DataRegistry] = js.native
  val subscribe: Subscriber = js.native
  def combineReducers[S](reducers: reduxLib.reduxMod.ReducersMapObject[S, _]): reduxLib.reduxMod.Reducer[S, reduxLib.reduxMod.AnyAction] = js.native
  @JSName("combineReducers")
  def combineReducers_SAAction[S, A /* <: reduxLib.reduxMod.Action[_] */](reducers: reduxLib.reduxMod.ReducersMapObject[S, A]): reduxLib.reduxMod.Reducer[S, A] = js.native
  def createRegistry(): DataRegistry = js.native
  def createRegistry(storeConfigs: js.Object): DataRegistry = js.native
  def createRegistry(storeConfigs: js.Object, parent: DataRegistry): DataRegistry = js.native
  def createRegistryControl[R /* <: DataRegistry */, T](
    registryControl: js.Function1[
      /* registry */ R, 
      js.Function1[/* args */ org.scalablytyped.runtime.StringDictionary[_], T]
    ]
  ): R = js.native
  def createRegistrySelector[S /* <: js.Function1[/* key */ java.lang.String, SelectorMap] */, T](registrySelector: js.Function1[/* select */ S, js.Function2[/* state */ _, /* repeated */ _, T]]): S = js.native
  def dispatch(key: java.lang.String): DispatcherMap = js.native
  def registerGenericStore(key: java.lang.String, config: GenericStoreConfig): scala.Unit = js.native
  def registerStore[T](key: java.lang.String, config: StoreConfig[T]): scala.Unit = js.native
  def select(key: java.lang.String): SelectorMap = js.native
  def use[T](plugin: Plugin[T], options: T): DataRegistry = js.native
  def useDispatch(): js.Function1[/* key */ java.lang.String, DispatcherMap] = js.native
  def useDispatch(storeName: java.lang.String): DispatcherMap = js.native
  def useRegistry(): DataRegistry = js.native
  def useSelect[T](mapSelect: js.Function1[/* s */ js.Function1[/* key */ java.lang.String, SelectorMap], T]): T = js.native
  def useSelect[T](
    mapSelect: js.Function1[/* s */ js.Function1[/* key */ java.lang.String, SelectorMap], T],
    deps: js.Array[_]
  ): T = js.native
  def withDispatch[DP, P, IP](
    mapDispatchToProps: js.Function3[
      /* disp */ js.Function1[/* key */ java.lang.String, DispatcherMap], 
      /* ownProps */ P with IP, 
      /* registry */ atWordpressDataLib.Anon_Key, 
      DP
    ]
  ): js.Function1[
    /* component */ reactLib.reactMod.ComponentType[P with IP with DP], 
    reactLib.reactMod.ComponentType[P]
  ] = js.native
  def withRegistry[P](component: reactLib.reactMod.ComponentType[P]): reactLib.reactMod.ComponentType[P with atWordpressDataLib.Anon_Registry] = js.native
  def withSelect[SP, P, IP](
    mapSelectToProps: js.Function2[
      /* sel */ js.Function1[/* key */ java.lang.String, SelectorMap], 
      /* ownProps */ P with IP, 
      SP
    ]
  ): js.Function1[
    /* component */ reactLib.reactMod.ComponentType[P with IP with SP], 
    reactLib.reactMod.ComponentType[P]
  ] = js.native
}

