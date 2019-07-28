package typings.wonderDashFrp.distEs2015DisposableInnerSubscriptionMod

import typings.wonderDashFrp.distEs2015CoreObserverMod.Observer
import typings.wonderDashFrp.distEs2015DisposableIDisposableMod.IDisposable
import typings.wonderDashFrp.distEs2015SubjectGeneratorSubjectMod.GeneratorSubject
import typings.wonderDashFrp.distEs2015SubjectSubjectMod.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/Disposable/InnerSubscription", "InnerSubscription")
@js.native
class InnerSubscription protected () extends IDisposable {
  def this(subject: GeneratorSubject, observer: Observer) = this()
  def this(subject: Subject, observer: Observer) = this()
  var _observer: js.Any = js.native
  var _subject: js.Any = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

/* static members */
@JSImport("wonder-frp/dist/es2015/Disposable/InnerSubscription", "InnerSubscription")
@js.native
object InnerSubscription extends js.Object {
  def create(subject: GeneratorSubject, observer: Observer): InnerSubscription = js.native
  def create(subject: Subject, observer: Observer): InnerSubscription = js.native
}

