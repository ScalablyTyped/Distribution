package typings.wonderFrp.distCommonjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "MergeStream")
@js.native
open class MergeStream protected ()
  extends typings.wonderFrp.distCommonjsStreamMergeStreamMod.MergeStream {
  def this(source: typings.wonderFrp.distCommonjsCoreStreamMod.Stream, maxConcurrent: Double) = this()
}
/* static members */
object MergeStream {
  
  @JSImport("wonder-frp/dist/commonjs", "MergeStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(source: typings.wonderFrp.distCommonjsCoreStreamMod.Stream, maxConcurrent: Double): typings.wonderFrp.distCommonjsStreamMergeStreamMod.MergeStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], maxConcurrent.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distCommonjsStreamMergeStreamMod.MergeStream]
}
