package typings.wonderFrp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "InnerSubscription")
@js.native
open class InnerSubscription protected ()
  extends typings.wonderFrp.innerSubscriptionMod.InnerSubscription {
  def this(
    subject: typings.wonderFrp.generatorSubjectMod.GeneratorSubject,
    observer: typings.wonderFrp.observerMod.Observer
  ) = this()
  def this(subject: typings.wonderFrp.subjectMod.Subject, observer: typings.wonderFrp.observerMod.Observer) = this()
}
/* static members */
object InnerSubscription {
  
  @JSImport("wonder-frp/dist/commonjs", "InnerSubscription")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    subject: typings.wonderFrp.generatorSubjectMod.GeneratorSubject,
    observer: typings.wonderFrp.observerMod.Observer
  ): typings.wonderFrp.innerSubscriptionMod.InnerSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(subject.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.innerSubscriptionMod.InnerSubscription]
  inline def create(subject: typings.wonderFrp.subjectMod.Subject, observer: typings.wonderFrp.observerMod.Observer): typings.wonderFrp.innerSubscriptionMod.InnerSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(subject.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.innerSubscriptionMod.InnerSubscription]
}
