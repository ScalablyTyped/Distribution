package typings.wonderFrp.distEs2015Mod

import typings.wonderFrp.distEs2015ObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "AnonymousObserver")
@js.native
open class AnonymousObserver protected ()
  extends typings.wonderFrp.distEs2015ObserverAnonymousObserverMod.AnonymousObserver {
  def this(observer: IObserver) = this()
  def this(onNext: js.Function, onError: js.Function, onCompleted: js.Function) = this()
}
/* static members */
object AnonymousObserver {
  
  @JSImport("wonder-frp/dist/es2015", "AnonymousObserver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(onNext: js.Function, onError: js.Function, onCompleted: js.Function): typings.wonderFrp.distEs2015ObserverAnonymousObserverMod.AnonymousObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompleted.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distEs2015ObserverAnonymousObserverMod.AnonymousObserver]
}
