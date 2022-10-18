package typings.wonderFrp.distCommonjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "ConcatStream")
@js.native
open class ConcatStream protected ()
  extends typings.wonderFrp.distCommonjsStreamConcatStreamMod.ConcatStream {
  def this(sources: js.Array[typings.wonderFrp.distCommonjsCoreStreamMod.Stream]) = this()
}
/* static members */
object ConcatStream {
  
  @JSImport("wonder-frp/dist/commonjs", "ConcatStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(sources: js.Array[typings.wonderFrp.distCommonjsCoreStreamMod.Stream]): typings.wonderFrp.distCommonjsStreamConcatStreamMod.ConcatStream = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(sources.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.distCommonjsStreamConcatStreamMod.ConcatStream]
}
