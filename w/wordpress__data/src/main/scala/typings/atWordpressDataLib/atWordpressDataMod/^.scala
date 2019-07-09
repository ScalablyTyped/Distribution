package typings
package atWordpressDataLib.atWordpressDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/data", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val RegistryConsumer: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Consumer<DataRegistry> */ js.Any = js.native
  val RegistryProvider: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Provider<DataRegistry> */ js.Any = js.native
  val subscribe: Subscriber = js.native
  def combineReducers[T /* <: reduxLib.reduxMod.ReducersMapObject[_, _] */](reducers: T): reduxLib.reduxMod.Reducer[
    reduxLib.reduxMod.InferStateType[T], 
    reduxLib.reduxMod.InferActionTypes[reduxLib.reduxMod.InferReducerTypes[T]]
  ] = js.native
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
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<P & IP & DP> */ /* component */ js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<P> */ _
  ] = js.native
  def withRegistry[P](
    component: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<P> */ js.Any
  ): js.Any = js.native
  def withSelect[SP, P, IP](
    mapSelectToProps: js.Function2[
      /* sel */ js.Function1[/* key */ java.lang.String, SelectorMap], 
      /* ownProps */ P with IP, 
      SP
    ]
  ): js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<P & IP & SP> */ /* component */ js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<P> */ _
  ] = js.native
}

