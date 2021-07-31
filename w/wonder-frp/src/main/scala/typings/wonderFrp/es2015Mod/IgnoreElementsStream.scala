package typings.wonderFrp.es2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "IgnoreElementsStream")
@js.native
class IgnoreElementsStream protected ()
  extends typings.wonderFrp.streamIgnoreElementsStreamMod.IgnoreElementsStream {
  def this(source: typings.wonderFrp.coreStreamMod.Stream) = this()
}
/* static members */
object IgnoreElementsStream {
  
  @JSImport("wonder-frp/dist/es2015", "IgnoreElementsStream")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(source: typings.wonderFrp.coreStreamMod.Stream): typings.wonderFrp.streamIgnoreElementsStreamMod.IgnoreElementsStream = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.streamIgnoreElementsStreamMod.IgnoreElementsStream]
}
