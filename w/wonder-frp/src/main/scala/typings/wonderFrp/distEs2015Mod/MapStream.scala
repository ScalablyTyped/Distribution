package typings.wonderFrp.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "MapStream")
@js.native
open class MapStream protected ()
  extends typings.wonderFrp.distEs2015StreamMapStreamMod.MapStream {
  def this(source: typings.wonderFrp.distEs2015CoreStreamMod.Stream, selector: js.Function) = this()
}
/* static members */
object MapStream {
  
  @JSImport("wonder-frp/dist/es2015", "MapStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(source: typings.wonderFrp.distEs2015CoreStreamMod.Stream, selector: js.Function): typings.wonderFrp.distEs2015StreamMapStreamMod.MapStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distEs2015StreamMapStreamMod.MapStream]
}
