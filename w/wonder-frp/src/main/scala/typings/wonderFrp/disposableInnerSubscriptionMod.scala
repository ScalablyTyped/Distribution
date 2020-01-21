package typings.wonderFrp

import typings.wonderFrp.coreObserverMod.Observer
import typings.wonderFrp.disposableIdisposableMod.IDisposable
import typings.wonderFrp.subjectGeneratorSubjectMod.GeneratorSubject
import typings.wonderFrp.subjectSubjectMod.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/Disposable/InnerSubscription", JSImport.Namespace)
@js.native
object disposableInnerSubscriptionMod extends js.Object {
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
  @js.native
  object InnerSubscription extends js.Object {
    def create(subject: GeneratorSubject, observer: Observer): InnerSubscription = js.native
    def create(subject: Subject, observer: Observer): InnerSubscription = js.native
  }
  
}

