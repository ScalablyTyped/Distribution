package typings.wonderFrp.es2015Mod

import typings.wonderFrp.observerIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "SkipUntilSourceObserver")
@js.native
class SkipUntilSourceObserver protected ()
  extends typings.wonderFrp.observerSkipUntilSourceObserverMod.SkipUntilSourceObserver {
  def this(
    prevObserver: IObserver,
    skipUntilStream: typings.wonderFrp.streamSkipUntilStreamMod.SkipUntilStream
  ) = this()
}
/* static members */
object SkipUntilSourceObserver {
  
  @JSImport("wonder-frp/dist/es2015", "SkipUntilSourceObserver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    prevObserver: IObserver,
    skipUntilStream: typings.wonderFrp.streamSkipUntilStreamMod.SkipUntilStream
  ): typings.wonderFrp.observerSkipUntilSourceObserverMod.SkipUntilSourceObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(prevObserver.asInstanceOf[js.Any], skipUntilStream.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.observerSkipUntilSourceObserverMod.SkipUntilSourceObserver]
}
