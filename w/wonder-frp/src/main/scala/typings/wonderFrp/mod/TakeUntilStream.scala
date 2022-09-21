package typings.wonderFrp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "TakeUntilStream")
@js.native
open class TakeUntilStream protected ()
  extends typings.wonderFrp.takeUntilStreamMod.TakeUntilStream {
  def this(source: typings.wonderFrp.streamMod.Stream, otherStream: typings.wonderFrp.streamMod.Stream) = this()
}
/* static members */
object TakeUntilStream {
  
  @JSImport("wonder-frp/dist/commonjs", "TakeUntilStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(source: typings.wonderFrp.streamMod.Stream, otherSteam: typings.wonderFrp.streamMod.Stream): typings.wonderFrp.takeUntilStreamMod.TakeUntilStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], otherSteam.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.takeUntilStreamMod.TakeUntilStream]
}
