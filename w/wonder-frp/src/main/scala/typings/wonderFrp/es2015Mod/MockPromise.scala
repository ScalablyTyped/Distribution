package typings.wonderFrp.es2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "MockPromise")
@js.native
class MockPromise protected ()
  extends typings.wonderFrp.testingMockPromiseMod.MockPromise {
  def this(
    scheduler: typings.wonderFrp.testingTestSchedulerMod.TestScheduler,
    messages: js.Array[typings.wonderFrp.testingRecordMod.Record]
  ) = this()
}
/* static members */
object MockPromise {
  
  @JSImport("wonder-frp/dist/es2015", "MockPromise")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    scheduler: typings.wonderFrp.testingTestSchedulerMod.TestScheduler,
    messages: js.Array[typings.wonderFrp.testingRecordMod.Record]
  ): typings.wonderFrp.testingMockPromiseMod.MockPromise = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(scheduler.asInstanceOf[js.Any], messages.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.testingMockPromiseMod.MockPromise]
}
