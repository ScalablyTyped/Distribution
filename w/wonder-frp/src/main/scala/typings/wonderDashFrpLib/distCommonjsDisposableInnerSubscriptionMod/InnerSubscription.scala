package typings
package wonderDashFrpLib.distCommonjsDisposableInnerSubscriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/Disposable/InnerSubscription", "InnerSubscription")
@js.native
class InnerSubscription protected ()
  extends wonderDashFrpLib.distCommonjsDisposableIDisposableMod.IDisposable {
  def this(subject: wonderDashFrpLib.distCommonjsSubjectGeneratorSubjectMod.GeneratorSubject, observer: wonderDashFrpLib.distCommonjsCoreObserverMod.Observer) = this()
  def this(subject: wonderDashFrpLib.distCommonjsSubjectSubjectMod.Subject, observer: wonderDashFrpLib.distCommonjsCoreObserverMod.Observer) = this()
  var _observer: js.Any = js.native
  var _subject: js.Any = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/Disposable/InnerSubscription", "InnerSubscription")
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

