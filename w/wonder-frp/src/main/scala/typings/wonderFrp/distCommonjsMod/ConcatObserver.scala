package typings.wonderFrp.distCommonjsMod

import typings.wonderFrp.distCommonjsObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "ConcatObserver")
@js.native
open class ConcatObserver protected ()
  extends typings.wonderFrp.distCommonjsObserverConcatObserverMod.ConcatObserver {
  def this(currentObserver: IObserver, startNextStream: js.Function) = this()
}
/* static members */
object ConcatObserver {
  
  @JSImport("wonder-frp/dist/commonjs", "ConcatObserver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(currentObserver: IObserver, startNextStream: js.Function): typings.wonderFrp.distCommonjsObserverConcatObserverMod.ConcatObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(currentObserver.asInstanceOf[js.Any], startNextStream.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distCommonjsObserverConcatObserverMod.ConcatObserver]
}
