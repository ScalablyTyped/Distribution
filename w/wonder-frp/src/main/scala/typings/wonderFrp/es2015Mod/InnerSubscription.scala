package typings.wonderFrp.es2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object InnerSubscription {
  
  @JSImport("wonder-frp/dist/es2015", "InnerSubscription")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    subject: typings.wonderFrp.subjectGeneratorSubjectMod.GeneratorSubject,
    observer: typings.wonderFrp.coreObserverMod.Observer
  ): typings.wonderFrp.disposableInnerSubscriptionMod.InnerSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(subject.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.disposableInnerSubscriptionMod.InnerSubscription]
  inline def create(
    subject: typings.wonderFrp.subjectSubjectMod.Subject,
    observer: typings.wonderFrp.coreObserverMod.Observer
  ): typings.wonderFrp.disposableInnerSubscriptionMod.InnerSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(subject.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.disposableInnerSubscriptionMod.InnerSubscription]
}
