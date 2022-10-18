package typings.wonderFrp.distCommonjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "MockPromise")
@js.native
open class MockPromise protected ()
  extends typings.wonderFrp.distCommonjsTestingMockPromiseMod.MockPromise {
  def this(
    scheduler: typings.wonderFrp.distCommonjsTestingTestSchedulerMod.TestScheduler,
    messages: js.Array[typings.wonderFrp.distCommonjsTestingRecordMod.Record]
  ) = this()
}
/* static members */
object MockPromise {
  
  @JSImport("wonder-frp/dist/commonjs", "MockPromise")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    scheduler: typings.wonderFrp.distCommonjsTestingTestSchedulerMod.TestScheduler,
    messages: js.Array[typings.wonderFrp.distCommonjsTestingRecordMod.Record]
  ): typings.wonderFrp.distCommonjsTestingMockPromiseMod.MockPromise = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(scheduler.asInstanceOf[js.Any], messages.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distCommonjsTestingMockPromiseMod.MockPromise]
}
