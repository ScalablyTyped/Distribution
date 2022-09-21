package typings.wonderFrp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "SkipUntilStream")
@js.native
open class SkipUntilStream protected ()
  extends typings.wonderFrp.skipUntilStreamMod.SkipUntilStream {
  def this(source: typings.wonderFrp.streamMod.Stream, otherStream: typings.wonderFrp.streamMod.Stream) = this()
}
/* static members */
object SkipUntilStream {
  
  @JSImport("wonder-frp/dist/commonjs", "SkipUntilStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(source: typings.wonderFrp.streamMod.Stream, otherSteam: typings.wonderFrp.streamMod.Stream): typings.wonderFrp.skipUntilStreamMod.SkipUntilStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], otherSteam.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.skipUntilStreamMod.SkipUntilStream]
}
