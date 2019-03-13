package typings
package tampermonkeyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TampermonkeyNs {
  type NotificationOnClick = js.ThisFunction0[/* this */ NotificationThis, scala.Unit]
  /** `clicked` is `true` when `text` was set */
  type NotificationOnDone = js.ThisFunction1[/* this */ NotificationThis, /* clicked */ scala.Boolean, scala.Unit]
  type RequestEventListener[TResponse] = js.ThisFunction1[/* this */ TResponse, /* response */ TResponse, scala.Unit]
  type ValueChangeListener = js.Function4[
    /* name */ java.lang.String, 
    /* oldValue */ js.Any, 
    /* newValue */ js.Any, 
    /* remote */ scala.Boolean, 
    scala.Unit
  ]
}
