package typings.wonderFrp.es2015Mod

import typings.wonderFrp.observerIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "SkipUntilOtherObserver")
@js.native
class SkipUntilOtherObserver protected ()
  extends typings.wonderFrp.observerSkipUntilOtherObserverMod.SkipUntilOtherObserver {
  def this(
    prevObserver: IObserver,
    skipUntilStream: typings.wonderFrp.streamSkipUntilStreamMod.SkipUntilStream
  ) = this()
}
/* static members */
object SkipUntilOtherObserver {
  
  @JSImport("wonder-frp/dist/es2015", "SkipUntilOtherObserver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    prevObserver: IObserver,
    skipUntilStream: typings.wonderFrp.streamSkipUntilStreamMod.SkipUntilStream
  ): typings.wonderFrp.observerSkipUntilOtherObserverMod.SkipUntilOtherObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(prevObserver.asInstanceOf[js.Any], skipUntilStream.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.observerSkipUntilOtherObserverMod.SkipUntilOtherObserver]
}
