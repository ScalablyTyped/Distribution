package typings.wonderFrp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "MockPromise")
@js.native
class MockPromise protected ()
  extends typings.wonderFrp.mockPromiseMod.MockPromise {
  def this(
    scheduler: typings.wonderFrp.testSchedulerMod.TestScheduler,
    messages: js.Array[typings.wonderFrp.recordMod.Record]
  ) = this()
}
/* static members */
object MockPromise {
  
  @JSImport("wonder-frp/dist/commonjs", "MockPromise")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    scheduler: typings.wonderFrp.testSchedulerMod.TestScheduler,
    messages: js.Array[typings.wonderFrp.recordMod.Record]
  ): typings.wonderFrp.mockPromiseMod.MockPromise = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(scheduler.asInstanceOf[js.Any], messages.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.mockPromiseMod.MockPromise]
}
