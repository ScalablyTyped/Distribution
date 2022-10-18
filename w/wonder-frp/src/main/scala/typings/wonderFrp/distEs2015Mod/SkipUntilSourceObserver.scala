package typings.wonderFrp.distEs2015Mod

import typings.wonderFrp.distEs2015ObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "SkipUntilSourceObserver")
@js.native
open class SkipUntilSourceObserver protected ()
  extends typings.wonderFrp.distEs2015ObserverSkipUntilSourceObserverMod.SkipUntilSourceObserver {
  def this(
    prevObserver: IObserver,
    skipUntilStream: typings.wonderFrp.distEs2015StreamSkipUntilStreamMod.SkipUntilStream
  ) = this()
}
/* static members */
object SkipUntilSourceObserver {
  
  @JSImport("wonder-frp/dist/es2015", "SkipUntilSourceObserver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    prevObserver: IObserver,
    skipUntilStream: typings.wonderFrp.distEs2015StreamSkipUntilStreamMod.SkipUntilStream
  ): typings.wonderFrp.distEs2015ObserverSkipUntilSourceObserverMod.SkipUntilSourceObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(prevObserver.asInstanceOf[js.Any], skipUntilStream.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distEs2015ObserverSkipUntilSourceObserverMod.SkipUntilSourceObserver]
}
