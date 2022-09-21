package typings.wonderFrp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "IgnoreElementsStream")
@js.native
open class IgnoreElementsStream protected ()
  extends typings.wonderFrp.ignoreElementsStreamMod.IgnoreElementsStream {
  def this(source: typings.wonderFrp.streamMod.Stream) = this()
}
/* static members */
object IgnoreElementsStream {
  
  @JSImport("wonder-frp/dist/commonjs", "IgnoreElementsStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(source: typings.wonderFrp.streamMod.Stream): typings.wonderFrp.ignoreElementsStreamMod.IgnoreElementsStream = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.ignoreElementsStreamMod.IgnoreElementsStream]
}
