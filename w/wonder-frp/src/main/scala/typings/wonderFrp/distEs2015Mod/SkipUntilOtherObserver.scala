package typings.wonderFrp.distEs2015Mod

import typings.wonderFrp.distEs2015ObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "SkipUntilOtherObserver")
@js.native
open class SkipUntilOtherObserver protected ()
  extends typings.wonderFrp.distEs2015ObserverSkipUntilOtherObserverMod.SkipUntilOtherObserver {
  def this(
    prevObserver: IObserver,
    skipUntilStream: typings.wonderFrp.distEs2015StreamSkipUntilStreamMod.SkipUntilStream
  ) = this()
}
/* static members */
object SkipUntilOtherObserver {
  
  @JSImport("wonder-frp/dist/es2015", "SkipUntilOtherObserver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    prevObserver: IObserver,
    skipUntilStream: typings.wonderFrp.distEs2015StreamSkipUntilStreamMod.SkipUntilStream
  ): typings.wonderFrp.distEs2015ObserverSkipUntilOtherObserverMod.SkipUntilOtherObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(prevObserver.asInstanceOf[js.Any], skipUntilStream.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distEs2015ObserverSkipUntilOtherObserverMod.SkipUntilOtherObserver]
}
