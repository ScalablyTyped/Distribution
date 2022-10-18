package typings.wonderFrp.distCommonjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "InnerSubscription")
@js.native
open class InnerSubscription protected ()
  extends typings.wonderFrp.distCommonjsDisposableInnerSubscriptionMod.InnerSubscription {
  def this(
    subject: typings.wonderFrp.distCommonjsSubjectGeneratorSubjectMod.GeneratorSubject,
    observer: typings.wonderFrp.distCommonjsCoreObserverMod.Observer
  ) = this()
  def this(
    subject: typings.wonderFrp.distCommonjsSubjectSubjectMod.Subject,
    observer: typings.wonderFrp.distCommonjsCoreObserverMod.Observer
  ) = this()
}
/* static members */
object InnerSubscription {
  
  @JSImport("wonder-frp/dist/commonjs", "InnerSubscription")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    subject: typings.wonderFrp.distCommonjsSubjectGeneratorSubjectMod.GeneratorSubject,
    observer: typings.wonderFrp.distCommonjsCoreObserverMod.Observer
  ): typings.wonderFrp.distCommonjsDisposableInnerSubscriptionMod.InnerSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(subject.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distCommonjsDisposableInnerSubscriptionMod.InnerSubscription]
  inline def create(
    subject: typings.wonderFrp.distCommonjsSubjectSubjectMod.Subject,
    observer: typings.wonderFrp.distCommonjsCoreObserverMod.Observer
  ): typings.wonderFrp.distCommonjsDisposableInnerSubscriptionMod.InnerSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(subject.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distCommonjsDisposableInnerSubscriptionMod.InnerSubscription]
}
