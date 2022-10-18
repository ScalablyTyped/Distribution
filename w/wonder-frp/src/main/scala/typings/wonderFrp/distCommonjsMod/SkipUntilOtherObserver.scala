package typings.wonderFrp.distCommonjsMod

import typings.wonderFrp.distCommonjsObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "SkipUntilOtherObserver")
@js.native
open class SkipUntilOtherObserver protected ()
  extends typings.wonderFrp.distCommonjsObserverSkipUntilOtherObserverMod.SkipUntilOtherObserver {
  def this(
    prevObserver: IObserver,
    skipUntilStream: typings.wonderFrp.distCommonjsStreamSkipUntilStreamMod.SkipUntilStream
  ) = this()
}
/* static members */
object SkipUntilOtherObserver {
  
  @JSImport("wonder-frp/dist/commonjs", "SkipUntilOtherObserver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    prevObserver: IObserver,
    skipUntilStream: typings.wonderFrp.distCommonjsStreamSkipUntilStreamMod.SkipUntilStream
  ): typings.wonderFrp.distCommonjsObserverSkipUntilOtherObserverMod.SkipUntilOtherObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(prevObserver.asInstanceOf[js.Any], skipUntilStream.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distCommonjsObserverSkipUntilOtherObserverMod.SkipUntilOtherObserver]
}
