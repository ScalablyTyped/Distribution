package typings.wonderFrp.distCommonjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "DeferStream")
@js.native
open class DeferStream protected ()
  extends typings.wonderFrp.distCommonjsStreamDeferStreamMod.DeferStream {
  def this(buildStreamFunc: js.Function) = this()
}
/* static members */
object DeferStream {
  
  @JSImport("wonder-frp/dist/commonjs", "DeferStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(buildStreamFunc: js.Function): typings.wonderFrp.distCommonjsStreamDeferStreamMod.DeferStream = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(buildStreamFunc.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.distCommonjsStreamDeferStreamMod.DeferStream]
}
