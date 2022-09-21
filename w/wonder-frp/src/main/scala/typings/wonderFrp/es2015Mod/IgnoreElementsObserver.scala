package typings.wonderFrp.es2015Mod

import typings.wonderFrp.observerIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "IgnoreElementsObserver")
@js.native
open class IgnoreElementsObserver protected ()
  extends typings.wonderFrp.observerIgnoreElementsObserverMod.IgnoreElementsObserver {
  def this(currentObserver: IObserver) = this()
}
/* static members */
object IgnoreElementsObserver {
  
  @JSImport("wonder-frp/dist/es2015", "IgnoreElementsObserver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(currentObserver: IObserver): typings.wonderFrp.observerIgnoreElementsObserverMod.IgnoreElementsObserver = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(currentObserver.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.observerIgnoreElementsObserverMod.IgnoreElementsObserver]
}
