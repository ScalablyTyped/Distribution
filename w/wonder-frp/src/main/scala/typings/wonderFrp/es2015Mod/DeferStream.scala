package typings.wonderFrp.es2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "DeferStream")
@js.native
class DeferStream protected ()
  extends typings.wonderFrp.streamDeferStreamMod.DeferStream {
  def this(buildStreamFunc: js.Function) = this()
}
/* static members */
object DeferStream {
  
  @JSImport("wonder-frp/dist/es2015", "DeferStream")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(buildStreamFunc: js.Function): typings.wonderFrp.streamDeferStreamMod.DeferStream = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(buildStreamFunc.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.streamDeferStreamMod.DeferStream]
}
