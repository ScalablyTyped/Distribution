package typings.wonderFrp.es2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "SkipUntilStream")
@js.native
class SkipUntilStream protected ()
  extends typings.wonderFrp.streamSkipUntilStreamMod.SkipUntilStream {
  def this(
    source: typings.wonderFrp.coreStreamMod.Stream,
    otherStream: typings.wonderFrp.coreStreamMod.Stream
  ) = this()
}
/* static members */
object SkipUntilStream {
  
  @JSImport("wonder-frp/dist/es2015", "SkipUntilStream")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(source: typings.wonderFrp.coreStreamMod.Stream, otherSteam: typings.wonderFrp.coreStreamMod.Stream): typings.wonderFrp.streamSkipUntilStreamMod.SkipUntilStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], otherSteam.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.streamSkipUntilStreamMod.SkipUntilStream]
}
