package typings.wonderFrp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "AnonymousStream")
@js.native
class AnonymousStream protected ()
  extends typings.wonderFrp.anonymousStreamMod.AnonymousStream {
  def this(subscribeFunc: js.Function) = this()
}
/* static members */
object AnonymousStream {
  
  @JSImport("wonder-frp/dist/commonjs", "AnonymousStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(subscribeFunc: js.Function): typings.wonderFrp.anonymousStreamMod.AnonymousStream = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(subscribeFunc.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.anonymousStreamMod.AnonymousStream]
}
