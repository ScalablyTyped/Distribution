package typings.vuex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def createLogger[S](): typings.vuex.mod.Plugin[S] = typings.vuex.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createLogger")().asInstanceOf[typings.vuex.mod.Plugin[S]]
@scala.inline
def createLogger[S](option: typings.vuex.loggerMod.LoggerOption[S]): typings.vuex.mod.Plugin[S] = typings.vuex.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createLogger")(option.asInstanceOf[js.Any]).asInstanceOf[typings.vuex.mod.Plugin[S]]

@scala.inline
def createNamespacedHelpers(namespace: java.lang.String): typings.vuex.helpersMod.NamespacedMappers = typings.vuex.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createNamespacedHelpers")(namespace.asInstanceOf[js.Any]).asInstanceOf[typings.vuex.helpersMod.NamespacedMappers]

@scala.inline
def install(Vue: typings.vue.vueMod.VueConstructor[typings.vue.vueMod.Vue]): scala.Unit = typings.vuex.mod.^.asInstanceOf[js.Dynamic].applyDynamic("install")(Vue.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def mapActions: typings.vuex.helpersMod.Mapper[typings.vuex.helpersMod.ActionMethod] & typings.vuex.helpersMod.MapperWithNamespace[typings.vuex.helpersMod.ActionMethod] & typings.vuex.helpersMod.MapperForAction & typings.vuex.helpersMod.MapperForActionWithNamespace = typings.vuex.mod.^.asInstanceOf[js.Dynamic].selectDynamic("mapActions").asInstanceOf[typings.vuex.helpersMod.Mapper[typings.vuex.helpersMod.ActionMethod] & typings.vuex.helpersMod.MapperWithNamespace[typings.vuex.helpersMod.ActionMethod] & typings.vuex.helpersMod.MapperForAction & typings.vuex.helpersMod.MapperForActionWithNamespace]

@scala.inline
def mapGetters: typings.vuex.helpersMod.Mapper[typings.vuex.helpersMod.Computed] & typings.vuex.helpersMod.MapperWithNamespace[typings.vuex.helpersMod.Computed] = typings.vuex.mod.^.asInstanceOf[js.Dynamic].selectDynamic("mapGetters").asInstanceOf[typings.vuex.helpersMod.Mapper[typings.vuex.helpersMod.Computed] & typings.vuex.helpersMod.MapperWithNamespace[typings.vuex.helpersMod.Computed]]

@scala.inline
def mapMutations: typings.vuex.helpersMod.Mapper[typings.vuex.helpersMod.MutationMethod] & typings.vuex.helpersMod.MapperWithNamespace[typings.vuex.helpersMod.MutationMethod] & typings.vuex.helpersMod.MapperForMutation & typings.vuex.helpersMod.MapperForMutationWithNamespace = typings.vuex.mod.^.asInstanceOf[js.Dynamic].selectDynamic("mapMutations").asInstanceOf[typings.vuex.helpersMod.Mapper[typings.vuex.helpersMod.MutationMethod] & typings.vuex.helpersMod.MapperWithNamespace[typings.vuex.helpersMod.MutationMethod] & typings.vuex.helpersMod.MapperForMutation & typings.vuex.helpersMod.MapperForMutationWithNamespace]

@scala.inline
def mapState: typings.vuex.helpersMod.Mapper[typings.vuex.helpersMod.Computed] & typings.vuex.helpersMod.MapperWithNamespace[typings.vuex.helpersMod.Computed] & typings.vuex.helpersMod.MapperForState & typings.vuex.helpersMod.MapperForStateWithNamespace = typings.vuex.mod.^.asInstanceOf[js.Dynamic].selectDynamic("mapState").asInstanceOf[typings.vuex.helpersMod.Mapper[typings.vuex.helpersMod.Computed] & typings.vuex.helpersMod.MapperWithNamespace[typings.vuex.helpersMod.Computed] & typings.vuex.helpersMod.MapperForState & typings.vuex.helpersMod.MapperForStateWithNamespace]

type Action[S, R] = (typings.vuex.mod.ActionHandler[S, R]) | (typings.vuex.mod.ActionObject[S, R])

type ActionErrorSubscriber[P, S] = js.Function3[/* action */ P, /* state */ S, /* error */ typings.std.Error, js.Any]

type ActionHandler[S, R] = js.ThisFunction2[
/* this */ typings.vuex.mod.Store[R], 
/* injectee */ typings.vuex.mod.ActionContext[S, R], 
/* payload */ js.UndefOr[js.Any], 
js.Any]

type ActionSubscriber[P, S] = js.Function2[/* action */ P, /* state */ S, js.Any]

type ActionTree[S, R] = org.scalablytyped.runtime.StringDictionary[typings.vuex.mod.Action[S, R]]

type Getter[S, R] = js.Function4[/* state */ S, /* getters */ js.Any, /* rootState */ R, /* rootGetters */ js.Any, js.Any]

type GetterTree[S, R] = org.scalablytyped.runtime.StringDictionary[typings.vuex.mod.Getter[S, R]]

type ModuleTree[R] = org.scalablytyped.runtime.StringDictionary[typings.vuex.mod.Module[js.Any, R]]

type Mutation[S] = js.Function2[/* state */ S, /* payload */ js.UndefOr[js.Any], js.Any]

type MutationTree[S] = org.scalablytyped.runtime.StringDictionary[typings.vuex.mod.Mutation[S]]

type Plugin[S] = js.Function1[/* store */ typings.vuex.mod.Store[S], js.Any]

type SubscribeActionOptions[P, S] = (typings.vuex.mod.ActionSubscriber[P, S]) | (typings.vuex.mod.ActionSubscribersObject[P, S])
