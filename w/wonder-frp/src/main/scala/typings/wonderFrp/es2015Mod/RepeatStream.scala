package typings.wonderFrp.es2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "RepeatStream")
@js.native
class RepeatStream protected ()
  extends typings.wonderFrp.streamRepeatStreamMod.RepeatStream {
  def this(source: typings.wonderFrp.coreStreamMod.Stream, count: Double) = this()
}
/* static members */
object RepeatStream {
  
  @JSImport("wonder-frp/dist/es2015", "RepeatStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(source: typings.wonderFrp.coreStreamMod.Stream, count: Double): typings.wonderFrp.streamRepeatStreamMod.RepeatStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.streamRepeatStreamMod.RepeatStream]
}
