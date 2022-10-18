package typings.wonderFrp.distCommonjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "RepeatStream")
@js.native
open class RepeatStream protected ()
  extends typings.wonderFrp.distCommonjsStreamRepeatStreamMod.RepeatStream {
  def this(source: typings.wonderFrp.distCommonjsCoreStreamMod.Stream, count: Double) = this()
}
/* static members */
object RepeatStream {
  
  @JSImport("wonder-frp/dist/commonjs", "RepeatStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(source: typings.wonderFrp.distCommonjsCoreStreamMod.Stream, count: Double): typings.wonderFrp.distCommonjsStreamRepeatStreamMod.RepeatStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distCommonjsStreamRepeatStreamMod.RepeatStream]
}
