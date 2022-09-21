package typings.wonderFrp

import typings.wonderFrp.actionTypeMod.ActionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recordMod {
  
  @JSImport("wonder-frp/dist/commonjs/testing/Record", "Record")
  @js.native
  open class Record protected () extends StObject {
    def this(time: Any, value: Any, actionType: ActionType, comparer: js.Function) = this()
    
    /* private */ var _actionType: Any = js.native
    
    /* private */ var _comparer: Any = js.native
    
    /* private */ var _time: Any = js.native
    
    /* private */ var _value: Any = js.native
    
    var actionType: ActionType = js.native
    
    var time: Double = js.native
    
    var value: Double = js.native
  }
  /* static members */
  object Record {
    
    @JSImport("wonder-frp/dist/commonjs/testing/Record", "Record")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(time: Double, value: Any): Record = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(time.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Record]
    inline def create(time: Double, value: Any, actionType: Unit, comparer: js.Function): Record = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(time.asInstanceOf[js.Any], value.asInstanceOf[js.Any], actionType.asInstanceOf[js.Any], comparer.asInstanceOf[js.Any])).asInstanceOf[Record]
    inline def create(time: Double, value: Any, actionType: ActionType): Record = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(time.asInstanceOf[js.Any], value.asInstanceOf[js.Any], actionType.asInstanceOf[js.Any])).asInstanceOf[Record]
    inline def create(time: Double, value: Any, actionType: ActionType, comparer: js.Function): Record = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(time.asInstanceOf[js.Any], value.asInstanceOf[js.Any], actionType.asInstanceOf[js.Any], comparer.asInstanceOf[js.Any])).asInstanceOf[Record]
  }
}
