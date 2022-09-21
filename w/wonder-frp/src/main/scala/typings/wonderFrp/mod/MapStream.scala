package typings.wonderFrp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "MapStream")
@js.native
open class MapStream protected ()
  extends typings.wonderFrp.mapStreamMod.MapStream {
  def this(source: typings.wonderFrp.streamMod.Stream, selector: js.Function) = this()
}
/* static members */
object MapStream {
  
  @JSImport("wonder-frp/dist/commonjs", "MapStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(source: typings.wonderFrp.streamMod.Stream, selector: js.Function): typings.wonderFrp.mapStreamMod.MapStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.mapStreamMod.MapStream]
}
