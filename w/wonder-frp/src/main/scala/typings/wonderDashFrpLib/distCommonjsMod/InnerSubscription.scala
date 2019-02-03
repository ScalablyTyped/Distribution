package typings
package wonderDashFrpLib.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "InnerSubscription")
@js.native
class InnerSubscription protected ()
  extends wonderDashFrpLib.distCommonjsDisposableInnerSubscriptionMod.InnerSubscription {
  def this(subject: wonderDashFrpLib.distCommonjsSubjectGeneratorSubjectMod.GeneratorSubject, observer: wonderDashFrpLib.distCommonjsCoreObserverMod.Observer) = this()
  def this(subject: wonderDashFrpLib.distCommonjsSubjectSubjectMod.Subject, observer: wonderDashFrpLib.distCommonjsCoreObserverMod.Observer) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "InnerSubscription")
@js.native
object InnerSubscription extends js.Object {
  def create(
    subject: wonderDashFrpLib.distCommonjsSubjectGeneratorSubjectMod.GeneratorSubject,
    observer: wonderDashFrpLib.distCommonjsCoreObserverMod.Observer
  ): wonderDashFrpLib.distCommonjsDisposableInnerSubscriptionMod.InnerSubscription = js.native
  def create(
    subject: wonderDashFrpLib.distCommonjsSubjectSubjectMod.Subject,
    observer: wonderDashFrpLib.distCommonjsCoreObserverMod.Observer
  ): wonderDashFrpLib.distCommonjsDisposableInnerSubscriptionMod.InnerSubscription = js.native
}

