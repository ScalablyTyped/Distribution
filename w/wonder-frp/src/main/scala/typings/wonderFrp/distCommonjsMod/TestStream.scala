package typings.wonderFrp.distCommonjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "TestStream")
@js.native
open class TestStream protected ()
  extends typings.wonderFrp.distCommonjsTestingTestStreamMod.TestStream {
  def this(
    messages: js.Array[typings.wonderFrp.distCommonjsTestingRecordMod.Record],
    scheduler: typings.wonderFrp.distCommonjsTestingTestSchedulerMod.TestScheduler
  ) = this()
}
/* static members */
object TestStream {
  
  @JSImport("wonder-frp/dist/commonjs", "TestStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    messages: js.Array[typings.wonderFrp.distCommonjsTestingRecordMod.Record],
    scheduler: typings.wonderFrp.distCommonjsTestingTestSchedulerMod.TestScheduler
  ): typings.wonderFrp.distCommonjsTestingTestStreamMod.TestStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(messages.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distCommonjsTestingTestStreamMod.TestStream]
}
