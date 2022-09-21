package typings.wonderFrp.es2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "MergeAllStream")
@js.native
open class MergeAllStream protected ()
  extends typings.wonderFrp.streamMergeAllStreamMod.MergeAllStream {
  def this(source: typings.wonderFrp.coreStreamMod.Stream) = this()
}
/* static members */
object MergeAllStream {
  
  @JSImport("wonder-frp/dist/es2015", "MergeAllStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(source: typings.wonderFrp.coreStreamMod.Stream): typings.wonderFrp.streamMergeAllStreamMod.MergeAllStream = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.streamMergeAllStreamMod.MergeAllStream]
}
