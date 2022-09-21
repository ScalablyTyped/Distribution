package typings.wonderFrp.es2015Mod

import typings.wonderFrp.observerIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "ConcatObserver")
@js.native
open class ConcatObserver protected ()
  extends typings.wonderFrp.observerConcatObserverMod.ConcatObserver {
  def this(currentObserver: IObserver, startNextStream: js.Function) = this()
}
/* static members */
object ConcatObserver {
  
  @JSImport("wonder-frp/dist/es2015", "ConcatObserver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(currentObserver: IObserver, startNextStream: js.Function): typings.wonderFrp.observerConcatObserverMod.ConcatObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(currentObserver.asInstanceOf[js.Any], startNextStream.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.observerConcatObserverMod.ConcatObserver]
}
