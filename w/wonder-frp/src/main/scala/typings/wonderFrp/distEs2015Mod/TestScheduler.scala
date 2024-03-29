package typings.wonderFrp.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "TestScheduler")
@js.native
open class TestScheduler protected ()
  extends typings.wonderFrp.distEs2015TestingTestSchedulerMod.TestScheduler {
  def this(isReset: Boolean) = this()
}
/* static members */
object TestScheduler {
  
  @JSImport("wonder-frp/dist/es2015", "TestScheduler")
  @js.native
  val ^ : js.Any = js.native
  
  inline def completed(tick: Any): typings.wonderFrp.distEs2015TestingRecordMod.Record = ^.asInstanceOf[js.Dynamic].applyDynamic("completed")(tick.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.distEs2015TestingRecordMod.Record]
  
  inline def create(): typings.wonderFrp.distEs2015TestingTestSchedulerMod.TestScheduler = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.wonderFrp.distEs2015TestingTestSchedulerMod.TestScheduler]
  inline def create(isReset: Boolean): typings.wonderFrp.distEs2015TestingTestSchedulerMod.TestScheduler = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(isReset.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.distEs2015TestingTestSchedulerMod.TestScheduler]
  
  inline def error(tick: Any, error: Any): typings.wonderFrp.distEs2015TestingRecordMod.Record = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(tick.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distEs2015TestingRecordMod.Record]
  
  inline def next(tick: Any, value: Any): typings.wonderFrp.distEs2015TestingRecordMod.Record = (^.asInstanceOf[js.Dynamic].applyDynamic("next")(tick.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distEs2015TestingRecordMod.Record]
}
