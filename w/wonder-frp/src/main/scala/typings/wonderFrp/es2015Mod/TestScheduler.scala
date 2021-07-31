package typings.wonderFrp.es2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "TestScheduler")
@js.native
class TestScheduler protected ()
  extends typings.wonderFrp.testingTestSchedulerMod.TestScheduler {
  def this(isReset: Boolean) = this()
}
/* static members */
object TestScheduler {
  
  @JSImport("wonder-frp/dist/es2015", "TestScheduler")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def completed(tick: js.Any): typings.wonderFrp.testingRecordMod.Record = ^.asInstanceOf[js.Dynamic].applyDynamic("completed")(tick.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.testingRecordMod.Record]
  
  @scala.inline
  def create(): typings.wonderFrp.testingTestSchedulerMod.TestScheduler = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.wonderFrp.testingTestSchedulerMod.TestScheduler]
  @scala.inline
  def create(isReset: Boolean): typings.wonderFrp.testingTestSchedulerMod.TestScheduler = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(isReset.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.testingTestSchedulerMod.TestScheduler]
  
  @scala.inline
  def error(tick: js.Any, error: js.Any): typings.wonderFrp.testingRecordMod.Record = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(tick.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.testingRecordMod.Record]
  
  @scala.inline
  def next(tick: js.Any, value: js.Any): typings.wonderFrp.testingRecordMod.Record = (^.asInstanceOf[js.Dynamic].applyDynamic("next")(tick.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.testingRecordMod.Record]
}
