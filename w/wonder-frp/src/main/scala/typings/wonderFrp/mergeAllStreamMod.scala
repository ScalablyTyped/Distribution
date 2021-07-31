package typings.wonderFrp

import typings.wonderFrp.baseStreamMod.BaseStream
import typings.wonderFrp.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeAllStreamMod {
  
  @JSImport("wonder-frp/dist/commonjs/stream/MergeAllStream", "MergeAllStream")
  @js.native
  class MergeAllStream protected () extends BaseStream {
    def this(source: Stream) = this()
    
    var _source: js.Any = js.native
  }
  /* static members */
  object MergeAllStream {
    
    @JSImport("wonder-frp/dist/commonjs/stream/MergeAllStream", "MergeAllStream")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(source: Stream): MergeAllStream = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any]).asInstanceOf[MergeAllStream]
  }
}
