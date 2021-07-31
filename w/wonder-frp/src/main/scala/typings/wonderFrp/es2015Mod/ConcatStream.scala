package typings.wonderFrp.es2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "ConcatStream")
@js.native
class ConcatStream protected ()
  extends typings.wonderFrp.streamConcatStreamMod.ConcatStream {
  def this(sources: js.Array[typings.wonderFrp.coreStreamMod.Stream]) = this()
}
/* static members */
object ConcatStream {
  
  @JSImport("wonder-frp/dist/es2015", "ConcatStream")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(sources: js.Array[typings.wonderFrp.coreStreamMod.Stream]): typings.wonderFrp.streamConcatStreamMod.ConcatStream = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(sources.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.streamConcatStreamMod.ConcatStream]
}
