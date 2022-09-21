package typings.vuex.mod

import org.scalablytyped.runtime.StringDictionary
import typings.vueRuntimeCore.mod.InjectionKey
import typings.vuex.helpersMod.ActionMethod
import typings.vuex.helpersMod.Computed
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
import typings.vuex.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createLogger[S](): Plugin[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLogger")().asInstanceOf[Plugin[S]]
inline def createLogger[S](option: LoggerOption[S]): Plugin[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLogger")(option.asInstanceOf[js.Any]).asInstanceOf[Plugin[S]]

inline def createNamespacedHelpers(namespace: String): NamespacedMappers = ^.asInstanceOf[js.Dynamic].applyDynamic("createNamespacedHelpers")(namespace.asInstanceOf[js.Any]).asInstanceOf[NamespacedMappers]

inline def createStore[S](options: StoreOptions[S]): Store[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStore")(options.asInstanceOf[js.Any]).asInstanceOf[Store[S]]

inline def mapActions: Mapper[ActionMethod] & MapperWithNamespace[ActionMethod] & MapperForAction & MapperForActionWithNamespace = ^.asInstanceOf[js.Dynamic].selectDynamic("mapActions").asInstanceOf[Mapper[ActionMethod] & MapperWithNamespace[ActionMethod] & MapperForAction & MapperForActionWithNamespace]

inline def mapGetters: Mapper[Computed] & MapperWithNamespace[Computed] = ^.asInstanceOf[js.Dynamic].selectDynamic("mapGetters").asInstanceOf[Mapper[Computed] & MapperWithNamespace[Computed]]

inline def mapMutations: Mapper[MutationMethod] & MapperWithNamespace[MutationMethod] & MapperForMutation & MapperForMutationWithNamespace = ^.asInstanceOf[js.Dynamic].selectDynamic("mapMutations").asInstanceOf[Mapper[MutationMethod] & MapperWithNamespace[MutationMethod] & MapperForMutation & MapperForMutationWithNamespace]

inline def mapState: Mapper[Computed] & MapperWithNamespace[Computed] & MapperForState & MapperForStateWithNamespace = ^.asInstanceOf[js.Dynamic].selectDynamic("mapState").asInstanceOf[Mapper[Computed] & MapperWithNamespace[Computed] & MapperForState & MapperForStateWithNamespace]

inline def storeKey: String = ^.asInstanceOf[js.Dynamic].selectDynamic("storeKey").asInstanceOf[String]

inline def useStore[S](): Store[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("useStore")().asInstanceOf[Store[S]]
inline def useStore[S](injectKey: String): Store[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("useStore")(injectKey.asInstanceOf[js.Any]).asInstanceOf[Store[S]]
inline def useStore[S](injectKey: InjectionKey[Store[S]]): Store[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("useStore")(injectKey.asInstanceOf[js.Any]).asInstanceOf[Store[S]]

type Action[S, R] = (ActionHandler[S, R]) | (ActionObject[S, R])

type ActionErrorSubscriber[P, S] = js.Function3[/* action */ P, /* state */ S, /* error */ js.Error, Any]

type ActionHandler[S, R] = js.ThisFunction2[
/* this */ Store[R], 
/* injectee */ ActionContext[S, R], 
/* payload */ js.UndefOr[Any], 
Any]

type ActionSubscriber[P, S] = js.Function2[/* action */ P, /* state */ S, Any]

type ActionTree[S, R] = StringDictionary[Action[S, R]]

type Getter[S, R] = js.Function4[/* state */ S, /* getters */ Any, /* rootState */ R, /* rootGetters */ Any, Any]

type GetterTree[S, R] = StringDictionary[Getter[S, R]]

type ModuleTree[R] = StringDictionary[Module[Any, R]]

type Mutation[S] = js.Function2[/* state */ S, /* payload */ js.UndefOr[Any], Any]

type MutationTree[S] = StringDictionary[Mutation[S]]

type Plugin[S] = js.Function1[/* store */ Store[S], Any]

type SubscribeActionOptions[P, S] = (ActionSubscriber[P, S]) | (ActionSubscribersObject[P, S])
