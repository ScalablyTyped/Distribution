package typings
package vuexLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Action[S, R] = (ActionHandler[S, R]) | (ActionObject[S, R])
  type ActionHandler[S, R] = js.Function2[/* injectee */ ActionContext[S, R], /* payload */ js.Any, js.Any]
  type Getter[S, R] = js.Function4[/* state */ S, /* getters */ js.Any, /* rootState */ R, /* rootGetters */ js.Any, js.Any]
  type Mutation[S] = js.Function2[/* state */ S, /* payload */ js.Any, js.Any]
  type Plugin[S] = js.Function1[/* store */ Store[S], js.Any]
}
