package typings.wonderFrp.es2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "TestStream")
@js.native
class TestStream protected ()
  extends typings.wonderFrp.testingTestStreamMod.TestStream {
  def this(
    messages: js.Array[typings.wonderFrp.testingRecordMod.Record],
    scheduler: typings.wonderFrp.testingTestSchedulerMod.TestScheduler
  ) = this()
}
/* static members */
object TestStream {
  
  @JSImport("wonder-frp/dist/es2015", "TestStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    messages: js.Array[typings.wonderFrp.testingRecordMod.Record],
    scheduler: typings.wonderFrp.testingTestSchedulerMod.TestScheduler
  ): typings.wonderFrp.testingTestStreamMod.TestStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(messages.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.testingTestStreamMod.TestStream]
}
