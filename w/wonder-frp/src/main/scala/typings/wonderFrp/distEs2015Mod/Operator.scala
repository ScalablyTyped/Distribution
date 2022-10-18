package typings.wonderFrp.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "Operator")
@js.native
open class Operator ()
  extends typings.wonderFrp.distEs2015GlobalOperatorMod.Operator
/* static members */
object Operator {
  
  @JSImport("wonder-frp/dist/es2015", "Operator")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createStream(subscribeFunc: Any): typings.wonderFrp.distEs2015StreamAnonymousStreamMod.AnonymousStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createStream")(subscribeFunc.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.distEs2015StreamAnonymousStreamMod.AnonymousStream]
  
  inline def empty(): typings.wonderFrp.distEs2015StreamAnonymousStreamMod.AnonymousStream = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typings.wonderFrp.distEs2015StreamAnonymousStreamMod.AnonymousStream]
  
  inline def fromArray(array: js.Array[Any]): typings.wonderFrp.distEs2015StreamFromArrayStreamMod.FromArrayStream = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.distEs2015StreamFromArrayStreamMod.FromArrayStream]
  inline def fromArray(array: js.Array[Any], scheduler: typings.wonderFrp.distEs2015CoreSchedulerMod.Scheduler): typings.wonderFrp.distEs2015StreamFromArrayStreamMod.FromArrayStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distEs2015StreamFromArrayStreamMod.FromArrayStream]
}
