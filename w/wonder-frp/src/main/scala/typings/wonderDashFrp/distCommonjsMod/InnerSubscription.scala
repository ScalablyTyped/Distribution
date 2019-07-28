package typings.wonderDashFrp.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "InnerSubscription")
@js.native
class InnerSubscription protected ()
  extends typings.wonderDashFrp.distCommonjsDisposableInnerSubscriptionMod.InnerSubscription {
  def this(
    subject: typings.wonderDashFrp.distCommonjsSubjectGeneratorSubjectMod.GeneratorSubject,
    observer: typings.wonderDashFrp.distCommonjsCoreObserverMod.Observer
  ) = this()
  def this(
    subject: typings.wonderDashFrp.distCommonjsSubjectSubjectMod.Subject,
    observer: typings.wonderDashFrp.distCommonjsCoreObserverMod.Observer
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "InnerSubscription")
@js.native
object InnerSubscription extends js.Object {
  def create(
    subject: typings.wonderDashFrp.distCommonjsSubjectGeneratorSubjectMod.GeneratorSubject,
    observer: typings.wonderDashFrp.distCommonjsCoreObserverMod.Observer
  ): typings.wonderDashFrp.distCommonjsDisposableInnerSubscriptionMod.InnerSubscription = js.native
  def create(
    subject: typings.wonderDashFrp.distCommonjsSubjectSubjectMod.Subject,
    observer: typings.wonderDashFrp.distCommonjsCoreObserverMod.Observer
  ): typings.wonderDashFrp.distCommonjsDisposableInnerSubscriptionMod.InnerSubscription = js.native
}

