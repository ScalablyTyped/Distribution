package typings.wonderFrp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "MergeAllStream")
@js.native
class MergeAllStream protected ()
  extends typings.wonderFrp.mergeAllStreamMod.MergeAllStream {
  def this(source: typings.wonderFrp.streamMod.Stream) = this()
}
/* static members */
object MergeAllStream {
  
  @JSImport("wonder-frp/dist/commonjs", "MergeAllStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(source: typings.wonderFrp.streamMod.Stream): typings.wonderFrp.mergeAllStreamMod.MergeAllStream = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.mergeAllStreamMod.MergeAllStream]
}
