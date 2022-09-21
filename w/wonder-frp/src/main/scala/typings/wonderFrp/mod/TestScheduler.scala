package typings.wonderFrp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "TestScheduler")
@js.native
open class TestScheduler protected ()
  extends typings.wonderFrp.testSchedulerMod.TestScheduler {
  def this(isReset: Boolean) = this()
}
/* static members */
object TestScheduler {
  
  @JSImport("wonder-frp/dist/commonjs", "TestScheduler")
  @js.native
  val ^ : js.Any = js.native
  
  inline def completed(tick: Any): typings.wonderFrp.recordMod.Record = ^.asInstanceOf[js.Dynamic].applyDynamic("completed")(tick.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.recordMod.Record]
  
  inline def create(): typings.wonderFrp.testSchedulerMod.TestScheduler = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.wonderFrp.testSchedulerMod.TestScheduler]
  inline def create(isReset: Boolean): typings.wonderFrp.testSchedulerMod.TestScheduler = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(isReset.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.testSchedulerMod.TestScheduler]
  
  inline def error(tick: Any, error: Any): typings.wonderFrp.recordMod.Record = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(tick.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.recordMod.Record]
  
  inline def next(tick: Any, value: Any): typings.wonderFrp.recordMod.Record = (^.asInstanceOf[js.Dynamic].applyDynamic("next")(tick.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.recordMod.Record]
}
