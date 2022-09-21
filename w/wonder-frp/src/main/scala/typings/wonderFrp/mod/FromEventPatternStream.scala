package typings.wonderFrp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "FromEventPatternStream")
@js.native
open class FromEventPatternStream protected ()
  extends typings.wonderFrp.fromEventPatternStreamMod.FromEventPatternStream {
  def this(addHandler: js.Function, removeHandler: js.Function) = this()
}
/* static members */
object FromEventPatternStream {
  
  @JSImport("wonder-frp/dist/commonjs", "FromEventPatternStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(addHandler: js.Function, removeHandler: js.Function): typings.wonderFrp.fromEventPatternStreamMod.FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(addHandler.asInstanceOf[js.Any], removeHandler.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.fromEventPatternStreamMod.FromEventPatternStream]
}
