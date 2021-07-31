package typings.wonderFrp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "Operator")
@js.native
class Operator ()
  extends typings.wonderFrp.operatorMod.Operator
/* static members */
object Operator {
  
  @JSImport("wonder-frp/dist/commonjs", "Operator")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createStream(subscribeFunc: js.Any): typings.wonderFrp.anonymousStreamMod.AnonymousStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createStream")(subscribeFunc.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.anonymousStreamMod.AnonymousStream]
  
  @scala.inline
  def empty(): typings.wonderFrp.anonymousStreamMod.AnonymousStream = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typings.wonderFrp.anonymousStreamMod.AnonymousStream]
  
  @scala.inline
  def fromArray(array: js.Array[js.Any]): typings.wonderFrp.fromArrayStreamMod.FromArrayStream = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.fromArrayStreamMod.FromArrayStream]
  @scala.inline
  def fromArray(array: js.Array[js.Any], scheduler: typings.wonderFrp.schedulerMod.Scheduler): typings.wonderFrp.fromArrayStreamMod.FromArrayStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.fromArrayStreamMod.FromArrayStream]
}
