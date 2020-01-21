package typings.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "InnerSubscription")
@js.native
class InnerSubscription protected ()
  extends typings.wonderFrp.disposableInnerSubscriptionMod.InnerSubscription {
  def this(
    subject: typings.wonderFrp.subjectGeneratorSubjectMod.GeneratorSubject,
    observer: typings.wonderFrp.coreObserverMod.Observer
  ) = this()
  def this(
    subject: typings.wonderFrp.subjectSubjectMod.Subject,
    observer: typings.wonderFrp.coreObserverMod.Observer
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "InnerSubscription")
@js.native
object InnerSubscription extends js.Object {
  def create(
    subject: typings.wonderFrp.subjectGeneratorSubjectMod.GeneratorSubject,
    observer: typings.wonderFrp.coreObserverMod.Observer
  ): typings.wonderFrp.disposableInnerSubscriptionMod.InnerSubscription = js.native
  def create(
    subject: typings.wonderFrp.subjectSubjectMod.Subject,
    observer: typings.wonderFrp.coreObserverMod.Observer
  ): typings.wonderFrp.disposableInnerSubscriptionMod.InnerSubscription = js.native
}

