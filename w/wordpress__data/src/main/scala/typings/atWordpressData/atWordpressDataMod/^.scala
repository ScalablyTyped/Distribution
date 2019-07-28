package typings.atWordpressData.atWordpressDataMod

import org.scalablytyped.runtime.StringDictionary
import typings.atWordpressData.Anon_Key
import typings.redux.reduxMod.Action
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Reducer
import typings.redux.reduxMod.ReducersMapObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/data", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val RegistryConsumer: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Consumer<DataRegistry> */ js.Any = js.native
  val RegistryProvider: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Provider<DataRegistry> */ js.Any = js.native
  val subscribe: Subscriber = js.native
  def combineReducers[S](reducers: ReducersMapObject[S, _]): Reducer[S, AnyAction] = js.native
  @JSName("combineReducers")
  def combineReducers_SA_ActionWildcard[S, A /* <: Action[_] */](reducers: ReducersMapObject[S, A]): Reducer[S, A] = js.native
  def createRegistry(): DataRegistry = js.native
  def createRegistry(storeConfigs: js.Object): DataRegistry = js.native
  def createRegistry(storeConfigs: js.Object, parent: DataRegistry): DataRegistry = js.native
  def createRegistryControl[R /* <: DataRegistry */, T](registryControl: js.Function1[/* registry */ R, js.Function1[/* args */ StringDictionary[_], T]]): R = js.native
  def createRegistrySelector[S /* <: js.Function1[/* key */ String, SelectorMap] */, T](registrySelector: js.Function1[/* select */ S, js.Function2[/* state */ _, /* repeated */ _, T]]): S = js.native
  def dispatch(key: String): DispatcherMap = js.native
  def registerGenericStore(key: String, config: GenericStoreConfig): Unit = js.native
  def registerStore[T](key: String, config: StoreConfig[T]): Unit = js.native
  def select(key: String): SelectorMap = js.native
  def use[T](plugin: Plugin[T], options: T): DataRegistry = js.native
  def useDispatch(): js.Function1[/* key */ String, DispatcherMap] = js.native
  def useDispatch(storeName: String): DispatcherMap = js.native
  def useRegistry(): DataRegistry = js.native
  def useSelect[T](mapSelect: js.Function1[/* s */ js.Function1[/* key */ String, SelectorMap], T]): T = js.native
  def useSelect[T](mapSelect: js.Function1[/* s */ js.Function1[/* key */ String, SelectorMap], T], deps: js.Array[_]): T = js.native
  def withDispatch[DP, P, IP](
    mapDispatchToProps: js.Function3[
      /* disp */ js.Function1[/* key */ String, DispatcherMap], 
      /* ownProps */ P with IP, 
      /* registry */ Anon_Key, 
      DP
    ]
  ): js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<P & IP & DP> */ /* component */ js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<P> */ _
  ] = js.native
  def withRegistry[P](
    component: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<P> */ js.Any
  ): js.Any = js.native
  def withSelect[SP, P, IP](
    mapSelectToProps: js.Function2[/* sel */ js.Function1[/* key */ String, SelectorMap], /* ownProps */ P with IP, SP]
  ): js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<P & IP & SP> */ /* component */ js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<P> */ _
  ] = js.native
}

