package typings.wonderFrp.es2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "AnonymousStream")
@js.native
class AnonymousStream protected ()
  extends typings.wonderFrp.streamAnonymousStreamMod.AnonymousStream {
  def this(subscribeFunc: js.Function) = this()
}
/* static members */
object AnonymousStream {
  
  @JSImport("wonder-frp/dist/es2015", "AnonymousStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(subscribeFunc: js.Function): typings.wonderFrp.streamAnonymousStreamMod.AnonymousStream = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(subscribeFunc.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.streamAnonymousStreamMod.AnonymousStream]
}
