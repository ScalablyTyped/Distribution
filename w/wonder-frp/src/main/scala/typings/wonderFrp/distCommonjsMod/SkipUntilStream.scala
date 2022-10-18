package typings.wonderFrp.distCommonjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "SkipUntilStream")
@js.native
open class SkipUntilStream protected ()
  extends typings.wonderFrp.distCommonjsStreamSkipUntilStreamMod.SkipUntilStream {
  def this(
    source: typings.wonderFrp.distCommonjsCoreStreamMod.Stream,
    otherStream: typings.wonderFrp.distCommonjsCoreStreamMod.Stream
  ) = this()
}
/* static members */
object SkipUntilStream {
  
  @JSImport("wonder-frp/dist/commonjs", "SkipUntilStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    source: typings.wonderFrp.distCommonjsCoreStreamMod.Stream,
    otherSteam: typings.wonderFrp.distCommonjsCoreStreamMod.Stream
  ): typings.wonderFrp.distCommonjsStreamSkipUntilStreamMod.SkipUntilStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], otherSteam.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distCommonjsStreamSkipUntilStreamMod.SkipUntilStream]
}
