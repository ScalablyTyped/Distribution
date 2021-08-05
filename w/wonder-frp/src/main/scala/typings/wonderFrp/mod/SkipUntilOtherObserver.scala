package typings.wonderFrp.mod

import typings.wonderFrp.iobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "SkipUntilOtherObserver")
@js.native
class SkipUntilOtherObserver protected ()
  extends typings.wonderFrp.skipUntilOtherObserverMod.SkipUntilOtherObserver {
  def this(prevObserver: IObserver, skipUntilStream: typings.wonderFrp.skipUntilStreamMod.SkipUntilStream) = this()
}
/* static members */
object SkipUntilOtherObserver {
  
  @JSImport("wonder-frp/dist/commonjs", "SkipUntilOtherObserver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(prevObserver: IObserver, skipUntilStream: typings.wonderFrp.skipUntilStreamMod.SkipUntilStream): typings.wonderFrp.skipUntilOtherObserverMod.SkipUntilOtherObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(prevObserver.asInstanceOf[js.Any], skipUntilStream.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.skipUntilOtherObserverMod.SkipUntilOtherObserver]
}
