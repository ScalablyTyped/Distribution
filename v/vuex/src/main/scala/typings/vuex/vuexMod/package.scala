package typings.vuex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vuexMod {
  import org.scalablytyped.runtime.StringDictionary

  type Action[S, R] = (ActionHandler[S, R]) | (ActionObject[S, R])
  type ActionHandler[S, R] = js.ThisFunction2[
    /* this */ Store[R], 
    /* injectee */ ActionContext[S, R], 
    /* payload */ js.UndefOr[js.Any], 
    js.Any
  ]
  type ActionSubscriber[P, S] = js.Function2[/* action */ P, /* state */ S, js.Any]
  type ActionTree[S, R] = StringDictionary[Action[S, R]]
  type Getter[S, R] = js.Function4[/* state */ S, /* getters */ js.Any, /* rootState */ R, /* rootGetters */ js.Any, js.Any]
  type GetterTree[S, R] = StringDictionary[Getter[S, R]]
  type ModuleTree[R] = StringDictionary[Module[js.Any, R]]
  type Mutation[S] = js.Function2[/* state */ S, /* payload */ js.UndefOr[js.Any], js.Any]
  type MutationTree[S] = StringDictionary[Mutation[S]]
  type Plugin[S] = js.Function1[/* store */ Store[S], js.Any]
  type SubscribeActionOptions[P, S] = (ActionSubscriber[P, S]) | (ActionSubscribersObject[P, S])
}
