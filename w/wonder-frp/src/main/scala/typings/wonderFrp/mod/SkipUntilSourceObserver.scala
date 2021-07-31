package typings.wonderFrp.mod

import typings.wonderFrp.iobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "SkipUntilSourceObserver")
@js.native
class SkipUntilSourceObserver protected ()
  extends typings.wonderFrp.skipUntilSourceObserverMod.SkipUntilSourceObserver {
  def this(prevObserver: IObserver, skipUntilStream: typings.wonderFrp.skipUntilStreamMod.SkipUntilStream) = this()
}
/* static members */
object SkipUntilSourceObserver {
  
  @JSImport("wonder-frp/dist/commonjs", "SkipUntilSourceObserver")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(prevObserver: IObserver, skipUntilStream: typings.wonderFrp.skipUntilStreamMod.SkipUntilStream): typings.wonderFrp.skipUntilSourceObserverMod.SkipUntilSourceObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(prevObserver.asInstanceOf[js.Any], skipUntilStream.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.skipUntilSourceObserverMod.SkipUntilSourceObserver]
}
