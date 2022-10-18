package typings.wonderFrp.distCommonjsMod

import typings.wonderFrp.distCommonjsObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "SkipUntilSourceObserver")
@js.native
open class SkipUntilSourceObserver protected ()
  extends typings.wonderFrp.distCommonjsObserverSkipUntilSourceObserverMod.SkipUntilSourceObserver {
  def this(
    prevObserver: IObserver,
    skipUntilStream: typings.wonderFrp.distCommonjsStreamSkipUntilStreamMod.SkipUntilStream
  ) = this()
}
/* static members */
object SkipUntilSourceObserver {
  
  @JSImport("wonder-frp/dist/commonjs", "SkipUntilSourceObserver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    prevObserver: IObserver,
    skipUntilStream: typings.wonderFrp.distCommonjsStreamSkipUntilStreamMod.SkipUntilStream
  ): typings.wonderFrp.distCommonjsObserverSkipUntilSourceObserverMod.SkipUntilSourceObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(prevObserver.asInstanceOf[js.Any], skipUntilStream.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distCommonjsObserverSkipUntilSourceObserverMod.SkipUntilSourceObserver]
}
