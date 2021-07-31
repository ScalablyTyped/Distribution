package typings.wonderFrp.es2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "Operator")
@js.native
class Operator ()
  extends typings.wonderFrp.globalOperatorMod.Operator
/* static members */
object Operator {
  
  @JSImport("wonder-frp/dist/es2015", "Operator")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createStream(subscribeFunc: js.Any): typings.wonderFrp.streamAnonymousStreamMod.AnonymousStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createStream")(subscribeFunc.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.streamAnonymousStreamMod.AnonymousStream]
  
  @scala.inline
  def empty(): typings.wonderFrp.streamAnonymousStreamMod.AnonymousStream = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typings.wonderFrp.streamAnonymousStreamMod.AnonymousStream]
  
  @scala.inline
  def fromArray(array: js.Array[js.Any]): typings.wonderFrp.streamFromArrayStreamMod.FromArrayStream = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.streamFromArrayStreamMod.FromArrayStream]
  @scala.inline
  def fromArray(array: js.Array[js.Any], scheduler: typings.wonderFrp.coreSchedulerMod.Scheduler): typings.wonderFrp.streamFromArrayStreamMod.FromArrayStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.streamFromArrayStreamMod.FromArrayStream]
}
