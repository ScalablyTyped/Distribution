package typings.wonderFrp.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "MergeStream")
@js.native
open class MergeStream protected ()
  extends typings.wonderFrp.distEs2015StreamMergeStreamMod.MergeStream {
  def this(source: typings.wonderFrp.distEs2015CoreStreamMod.Stream, maxConcurrent: Double) = this()
}
/* static members */
object MergeStream {
  
  @JSImport("wonder-frp/dist/es2015", "MergeStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(source: typings.wonderFrp.distEs2015CoreStreamMod.Stream, maxConcurrent: Double): typings.wonderFrp.distEs2015StreamMergeStreamMod.MergeStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], maxConcurrent.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distEs2015StreamMergeStreamMod.MergeStream]
}
