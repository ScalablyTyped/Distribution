package typings.urqlCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object subscriptionMod {
  type SubscriptionForwarder = js.Function1[
    /* operation */ typings.urqlCore.subscriptionMod.SubscriptionOperation, 
    typings.urqlCore.subscriptionMod.ObservableLike[typings.urqlCore.anon.ExecutionResultkeystringa]
  ]
}
