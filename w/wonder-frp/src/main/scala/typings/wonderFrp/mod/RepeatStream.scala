package typings.wonderFrp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "RepeatStream")
@js.native
class RepeatStream protected ()
  extends typings.wonderFrp.repeatStreamMod.RepeatStream {
  def this(source: typings.wonderFrp.streamMod.Stream, count: Double) = this()
}
/* static members */
object RepeatStream {
  
  @JSImport("wonder-frp/dist/commonjs", "RepeatStream")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(source: typings.wonderFrp.streamMod.Stream, count: Double): typings.wonderFrp.repeatStreamMod.RepeatStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.repeatStreamMod.RepeatStream]
}
