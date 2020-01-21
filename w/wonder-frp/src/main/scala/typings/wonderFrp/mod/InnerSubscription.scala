package typings.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "InnerSubscription")
@js.native
class InnerSubscription protected ()
  extends typings.wonderFrp.innerSubscriptionMod.InnerSubscription {
  def this(
    subject: typings.wonderFrp.generatorSubjectMod.GeneratorSubject,
    observer: typings.wonderFrp.observerMod.Observer
  ) = this()
  def this(subject: typings.wonderFrp.subjectMod.Subject, observer: typings.wonderFrp.observerMod.Observer) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "InnerSubscription")
@js.native
object InnerSubscription extends js.Object {
  def create(
    subject: typings.wonderFrp.generatorSubjectMod.GeneratorSubject,
    observer: typings.wonderFrp.observerMod.Observer
  ): typings.wonderFrp.innerSubscriptionMod.InnerSubscription = js.native
  def create(subject: typings.wonderFrp.subjectMod.Subject, observer: typings.wonderFrp.observerMod.Observer): typings.wonderFrp.innerSubscriptionMod.InnerSubscription = js.native
}

