package typings.wonderFrp.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "InnerSubscription")
@js.native
open class InnerSubscription protected ()
  extends typings.wonderFrp.distEs2015DisposableInnerSubscriptionMod.InnerSubscription {
  def this(
    subject: typings.wonderFrp.distEs2015SubjectGeneratorSubjectMod.GeneratorSubject,
    observer: typings.wonderFrp.distEs2015CoreObserverMod.Observer
  ) = this()
  def this(
    subject: typings.wonderFrp.distEs2015SubjectSubjectMod.Subject,
    observer: typings.wonderFrp.distEs2015CoreObserverMod.Observer
  ) = this()
}
/* static members */
object InnerSubscription {
  
  @JSImport("wonder-frp/dist/es2015", "InnerSubscription")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    subject: typings.wonderFrp.distEs2015SubjectGeneratorSubjectMod.GeneratorSubject,
    observer: typings.wonderFrp.distEs2015CoreObserverMod.Observer
  ): typings.wonderFrp.distEs2015DisposableInnerSubscriptionMod.InnerSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(subject.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distEs2015DisposableInnerSubscriptionMod.InnerSubscription]
  inline def create(
    subject: typings.wonderFrp.distEs2015SubjectSubjectMod.Subject,
    observer: typings.wonderFrp.distEs2015CoreObserverMod.Observer
  ): typings.wonderFrp.distEs2015DisposableInnerSubscriptionMod.InnerSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(subject.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distEs2015DisposableInnerSubscriptionMod.InnerSubscription]
}
