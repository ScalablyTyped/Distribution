package typings.wonderFrp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "Record")
@js.native
class Record protected ()
  extends typings.wonderFrp.recordMod.Record {
  def this(
    time: js.Any,
    value: js.Any,
    actionType: typings.wonderFrp.actionTypeMod.ActionType,
    comparer: js.Function
  ) = this()
}
/* static members */
object Record {
  
  @JSImport("wonder-frp/dist/commonjs", "Record")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(time: Double, value: js.Any): typings.wonderFrp.recordMod.Record = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(time.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.recordMod.Record]
  inline def create(time: Double, value: js.Any, actionType: Unit, comparer: js.Function): typings.wonderFrp.recordMod.Record = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(time.asInstanceOf[js.Any], value.asInstanceOf[js.Any], actionType.asInstanceOf[js.Any], comparer.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.recordMod.Record]
  inline def create(time: Double, value: js.Any, actionType: typings.wonderFrp.actionTypeMod.ActionType): typings.wonderFrp.recordMod.Record = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(time.asInstanceOf[js.Any], value.asInstanceOf[js.Any], actionType.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.recordMod.Record]
  inline def create(
    time: Double,
    value: js.Any,
    actionType: typings.wonderFrp.actionTypeMod.ActionType,
    comparer: js.Function
  ): typings.wonderFrp.recordMod.Record = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(time.asInstanceOf[js.Any], value.asInstanceOf[js.Any], actionType.asInstanceOf[js.Any], comparer.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.recordMod.Record]
}
