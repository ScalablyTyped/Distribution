package typings.wonderFrp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "MergeStream")
@js.native
class MergeStream protected ()
  extends typings.wonderFrp.mergeStreamMod.MergeStream {
  def this(source: typings.wonderFrp.streamMod.Stream, maxConcurrent: Double) = this()
}
/* static members */
object MergeStream {
  
  @JSImport("wonder-frp/dist/commonjs", "MergeStream")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(source: typings.wonderFrp.streamMod.Stream, maxConcurrent: Double): typings.wonderFrp.mergeStreamMod.MergeStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], maxConcurrent.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.mergeStreamMod.MergeStream]
}
