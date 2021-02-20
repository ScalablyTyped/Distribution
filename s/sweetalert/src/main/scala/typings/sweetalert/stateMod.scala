package typings.sweetalert

import org.scalablytyped.runtime.StringDictionary
import typings.sweetalert.anon.CloseModal
import typings.sweetalert.anon.Reject
import typings.sweetalert.anon.Value
import typings.sweetalert.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateMod {
  
  @JSImport("sweetalert/typings/modules/state", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sweetalert/typings/modules/state", JSImport.Default)
  @js.native
  def default: SwalState = js.native
  @scala.inline
  def default_=(x: SwalState): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  @JSImport("sweetalert/typings/modules/state", "resetState")
  @js.native
  def resetState(): Unit = js.native
  
  @JSImport("sweetalert/typings/modules/state", "setActionOptionsFor")
  @js.native
  def setActionOptionsFor(buttonKey: String): Unit = js.native
  @JSImport("sweetalert/typings/modules/state", "setActionOptionsFor")
  @js.native
  def setActionOptionsFor(buttonKey: String, hasCloseModal: `0`): Unit = js.native
  
  @JSImport("sweetalert/typings/modules/state", "setActionValue")
  @js.native
  def setActionValue(opts: String): Unit = js.native
  @JSImport("sweetalert/typings/modules/state", "setActionValue")
  @js.native
  def setActionValue(opts: ActionOptions): Unit = js.native
  
  type ActionOptions = StringDictionary[Value]
  
  @js.native
  trait SwalState extends StObject {
    
    var actions: StringDictionary[CloseModal] = js.native
    
    var isOpen: Boolean = js.native
    
    var promise: Reject = js.native
    
    var timer: Double = js.native
  }
  object SwalState {
    
    @scala.inline
    def apply(actions: StringDictionary[CloseModal], isOpen: Boolean, promise: Reject, timer: Double): SwalState = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], timer = timer.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwalState]
    }
    
    @scala.inline
    implicit class SwalStateMutableBuilder[Self <: SwalState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: StringDictionary[CloseModal]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromise(value: Reject): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimer(value: Double): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
    }
  }
}
