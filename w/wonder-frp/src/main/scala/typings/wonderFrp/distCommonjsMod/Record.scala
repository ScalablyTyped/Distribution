package typings.wonderFrp.distCommonjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "Record")
@js.native
open class Record protected ()
  extends typings.wonderFrp.distCommonjsTestingRecordMod.Record {
  def this(
    time: Any,
    value: Any,
    actionType: typings.wonderFrp.distCommonjsTestingActionTypeMod.ActionType,
    comparer: js.Function
  ) = this()
}
/* static members */
object Record {
  
  @JSImport("wonder-frp/dist/commonjs", "Record")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(time: Double, value: Any): typings.wonderFrp.distCommonjsTestingRecordMod.Record = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(time.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distCommonjsTestingRecordMod.Record]
  inline def create(time: Double, value: Any, actionType: Unit, comparer: js.Function): typings.wonderFrp.distCommonjsTestingRecordMod.Record = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(time.asInstanceOf[js.Any], value.asInstanceOf[js.Any], actionType.asInstanceOf[js.Any], comparer.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distCommonjsTestingRecordMod.Record]
  inline def create(
    time: Double,
    value: Any,
    actionType: typings.wonderFrp.distCommonjsTestingActionTypeMod.ActionType
  ): typings.wonderFrp.distCommonjsTestingRecordMod.Record = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(time.asInstanceOf[js.Any], value.asInstanceOf[js.Any], actionType.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distCommonjsTestingRecordMod.Record]
  inline def create(
    time: Double,
    value: Any,
    actionType: typings.wonderFrp.distCommonjsTestingActionTypeMod.ActionType,
    comparer: js.Function
  ): typings.wonderFrp.distCommonjsTestingRecordMod.Record = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(time.asInstanceOf[js.Any], value.asInstanceOf[js.Any], actionType.asInstanceOf[js.Any], comparer.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distCommonjsTestingRecordMod.Record]
}
