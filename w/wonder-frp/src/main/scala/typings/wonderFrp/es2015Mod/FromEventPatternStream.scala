package typings.wonderFrp.es2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "FromEventPatternStream")
@js.native
class FromEventPatternStream protected ()
  extends typings.wonderFrp.streamFromEventPatternStreamMod.FromEventPatternStream {
  def this(addHandler: js.Function, removeHandler: js.Function) = this()
}
/* static members */
object FromEventPatternStream {
  
  @JSImport("wonder-frp/dist/es2015", "FromEventPatternStream")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(addHandler: js.Function, removeHandler: js.Function): typings.wonderFrp.streamFromEventPatternStreamMod.FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(addHandler.asInstanceOf[js.Any], removeHandler.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.streamFromEventPatternStreamMod.FromEventPatternStream]
}
