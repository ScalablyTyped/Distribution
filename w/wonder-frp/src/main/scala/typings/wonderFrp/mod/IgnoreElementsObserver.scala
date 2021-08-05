package typings.wonderFrp.mod

import typings.wonderFrp.iobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "IgnoreElementsObserver")
@js.native
class IgnoreElementsObserver protected ()
  extends typings.wonderFrp.ignoreElementsObserverMod.IgnoreElementsObserver {
  def this(currentObserver: IObserver) = this()
}
/* static members */
object IgnoreElementsObserver {
  
  @JSImport("wonder-frp/dist/commonjs", "IgnoreElementsObserver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(currentObserver: IObserver): typings.wonderFrp.ignoreElementsObserverMod.IgnoreElementsObserver = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(currentObserver.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.ignoreElementsObserverMod.IgnoreElementsObserver]
}
