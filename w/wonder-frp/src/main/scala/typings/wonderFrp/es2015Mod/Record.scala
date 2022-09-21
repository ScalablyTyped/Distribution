package typings.wonderFrp.es2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "Record")
@js.native
open class Record protected ()
  extends typings.wonderFrp.testingRecordMod.Record {
  def this(
    time: Any,
    value: Any,
    actionType: typings.wonderFrp.testingActionTypeMod.ActionType,
    comparer: js.Function
  ) = this()
}
/* static members */
object Record {
  
  @JSImport("wonder-frp/dist/es2015", "Record")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(time: Double, value: Any): typings.wonderFrp.testingRecordMod.Record = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(time.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.testingRecordMod.Record]
  inline def create(time: Double, value: Any, actionType: Unit, comparer: js.Function): typings.wonderFrp.testingRecordMod.Record = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(time.asInstanceOf[js.Any], value.asInstanceOf[js.Any], actionType.asInstanceOf[js.Any], comparer.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.testingRecordMod.Record]
  inline def create(time: Double, value: Any, actionType: typings.wonderFrp.testingActionTypeMod.ActionType): typings.wonderFrp.testingRecordMod.Record = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(time.asInstanceOf[js.Any], value.asInstanceOf[js.Any], actionType.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.testingRecordMod.Record]
  inline def create(
    time: Double,
    value: Any,
    actionType: typings.wonderFrp.testingActionTypeMod.ActionType,
    comparer: js.Function
  ): typings.wonderFrp.testingRecordMod.Record = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(time.asInstanceOf[js.Any], value.asInstanceOf[js.Any], actionType.asInstanceOf[js.Any], comparer.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.testingRecordMod.Record]
}
