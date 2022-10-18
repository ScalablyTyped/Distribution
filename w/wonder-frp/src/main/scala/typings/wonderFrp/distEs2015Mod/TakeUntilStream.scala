package typings.wonderFrp.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "TakeUntilStream")
@js.native
open class TakeUntilStream protected ()
  extends typings.wonderFrp.distEs2015StreamTakeUntilStreamMod.TakeUntilStream {
  def this(
    source: typings.wonderFrp.distEs2015CoreStreamMod.Stream,
    otherStream: typings.wonderFrp.distEs2015CoreStreamMod.Stream
  ) = this()
}
/* static members */
object TakeUntilStream {
  
  @JSImport("wonder-frp/dist/es2015", "TakeUntilStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    source: typings.wonderFrp.distEs2015CoreStreamMod.Stream,
    otherSteam: typings.wonderFrp.distEs2015CoreStreamMod.Stream
  ): typings.wonderFrp.distEs2015StreamTakeUntilStreamMod.TakeUntilStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], otherSteam.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distEs2015StreamTakeUntilStreamMod.TakeUntilStream]
}
