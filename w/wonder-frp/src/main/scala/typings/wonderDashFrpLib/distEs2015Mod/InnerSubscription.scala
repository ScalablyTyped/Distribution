package typings
package wonderDashFrpLib.distEs2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "InnerSubscription")
@js.native
class InnerSubscription protected ()
  extends wonderDashFrpLib.distEs2015DisposableInnerSubscriptionMod.InnerSubscription {
  def this(subject: wonderDashFrpLib.distEs2015SubjectGeneratorSubjectMod.GeneratorSubject, observer: wonderDashFrpLib.distEs2015CoreObserverMod.Observer) = this()
  def this(subject: wonderDashFrpLib.distEs2015SubjectSubjectMod.Subject, observer: wonderDashFrpLib.distEs2015CoreObserverMod.Observer) = this()
}

@JSImport("wonder-frp/dist/es2015", "InnerSubscription")
@js.native
object InnerSubscription extends js.Object {
  def create(
    subject: wonderDashFrpLib.distEs2015SubjectGeneratorSubjectMod.GeneratorSubject,
    observer: wonderDashFrpLib.distEs2015CoreObserverMod.Observer
  ): wonderDashFrpLib.distEs2015DisposableInnerSubscriptionMod.InnerSubscription = js.native
  def create(
    subject: wonderDashFrpLib.distEs2015SubjectSubjectMod.Subject,
    observer: wonderDashFrpLib.distEs2015CoreObserverMod.Observer
  ): wonderDashFrpLib.distEs2015DisposableInnerSubscriptionMod.InnerSubscription = js.native
}

