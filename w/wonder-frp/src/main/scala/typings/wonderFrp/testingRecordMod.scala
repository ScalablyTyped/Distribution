package typings.wonderFrp

import typings.wonderFrp.testingActionTypeMod.ActionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingRecordMod {
  
  @JSImport("wonder-frp/dist/es2015/testing/Record", "Record")
  @js.native
  class Record protected () extends StObject {
    def this(time: js.Any, value: js.Any, actionType: ActionType, comparer: js.Function) = this()
    
    var _actionType: js.Any = js.native
    
    var _comparer: js.Any = js.native
    
    var _time: js.Any = js.native
    
    var _value: js.Any = js.native
    
    var actionType: ActionType = js.native
    
    def equals(other: js.Any): js.Any = js.native
    
    var time: Double = js.native
    
    var value: Double = js.native
  }
  /* static members */
  object Record {
    
    @JSImport("wonder-frp/dist/es2015/testing/Record", "Record")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(time: Double, value: js.Any): Record = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(time.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Record]
    @scala.inline
    def create(time: Double, value: js.Any, actionType: Unit, comparer: js.Function): Record = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(time.asInstanceOf[js.Any], value.asInstanceOf[js.Any], actionType.asInstanceOf[js.Any], comparer.asInstanceOf[js.Any])).asInstanceOf[Record]
    @scala.inline
    def create(time: Double, value: js.Any, actionType: ActionType): Record = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(time.asInstanceOf[js.Any], value.asInstanceOf[js.Any], actionType.asInstanceOf[js.Any])).asInstanceOf[Record]
    @scala.inline
    def create(time: Double, value: js.Any, actionType: ActionType, comparer: js.Function): Record = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(time.asInstanceOf[js.Any], value.asInstanceOf[js.Any], actionType.asInstanceOf[js.Any], comparer.asInstanceOf[js.Any])).asInstanceOf[Record]
  }
}
