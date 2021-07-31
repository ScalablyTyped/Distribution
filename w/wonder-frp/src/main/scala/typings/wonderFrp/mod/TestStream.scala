package typings.wonderFrp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "TestStream")
@js.native
class TestStream protected ()
  extends typings.wonderFrp.testStreamMod.TestStream {
  def this(
    messages: js.Array[typings.wonderFrp.recordMod.Record],
    scheduler: typings.wonderFrp.testSchedulerMod.TestScheduler
  ) = this()
}
/* static members */
object TestStream {
  
  @JSImport("wonder-frp/dist/commonjs", "TestStream")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(
    messages: js.Array[typings.wonderFrp.recordMod.Record],
    scheduler: typings.wonderFrp.testSchedulerMod.TestScheduler
  ): typings.wonderFrp.testStreamMod.TestStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(messages.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.testStreamMod.TestStream]
}
