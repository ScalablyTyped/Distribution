package typings.wonderFrp.distCommonjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "Operator")
@js.native
open class Operator ()
  extends typings.wonderFrp.distCommonjsGlobalOperatorMod.Operator
/* static members */
object Operator {
  
  @JSImport("wonder-frp/dist/commonjs", "Operator")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createStream(subscribeFunc: Any): typings.wonderFrp.distCommonjsStreamAnonymousStreamMod.AnonymousStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createStream")(subscribeFunc.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.distCommonjsStreamAnonymousStreamMod.AnonymousStream]
  
  inline def empty(): typings.wonderFrp.distCommonjsStreamAnonymousStreamMod.AnonymousStream = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typings.wonderFrp.distCommonjsStreamAnonymousStreamMod.AnonymousStream]
  
  inline def fromArray(array: js.Array[Any]): typings.wonderFrp.distCommonjsStreamFromArrayStreamMod.FromArrayStream = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.distCommonjsStreamFromArrayStreamMod.FromArrayStream]
  inline def fromArray(array: js.Array[Any], scheduler: typings.wonderFrp.distCommonjsCoreSchedulerMod.Scheduler): typings.wonderFrp.distCommonjsStreamFromArrayStreamMod.FromArrayStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distCommonjsStreamFromArrayStreamMod.FromArrayStream]
}
