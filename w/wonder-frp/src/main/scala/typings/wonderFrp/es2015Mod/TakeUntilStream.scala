package typings.wonderFrp.es2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "TakeUntilStream")
@js.native
open class TakeUntilStream protected ()
  extends typings.wonderFrp.streamTakeUntilStreamMod.TakeUntilStream {
  def this(
    source: typings.wonderFrp.coreStreamMod.Stream,
    otherStream: typings.wonderFrp.coreStreamMod.Stream
  ) = this()
}
/* static members */
object TakeUntilStream {
  
  @JSImport("wonder-frp/dist/es2015", "TakeUntilStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(source: typings.wonderFrp.coreStreamMod.Stream, otherSteam: typings.wonderFrp.coreStreamMod.Stream): typings.wonderFrp.streamTakeUntilStreamMod.TakeUntilStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], otherSteam.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.streamTakeUntilStreamMod.TakeUntilStream]
}
