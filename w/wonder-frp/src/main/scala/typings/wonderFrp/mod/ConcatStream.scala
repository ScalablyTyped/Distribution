package typings.wonderFrp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "ConcatStream")
@js.native
class ConcatStream protected ()
  extends typings.wonderFrp.concatStreamMod.ConcatStream {
  def this(sources: js.Array[typings.wonderFrp.streamMod.Stream]) = this()
}
/* static members */
object ConcatStream {
  
  @JSImport("wonder-frp/dist/commonjs", "ConcatStream")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(sources: js.Array[typings.wonderFrp.streamMod.Stream]): typings.wonderFrp.concatStreamMod.ConcatStream = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(sources.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.concatStreamMod.ConcatStream]
}
