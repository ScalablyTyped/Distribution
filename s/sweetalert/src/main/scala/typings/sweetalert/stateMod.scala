package typings.sweetalert

import org.scalablytyped.runtime.StringDictionary
import typings.sweetalert.anon.CloseModal
import typings.sweetalert.anon.Reject
import typings.sweetalert.anon.Value
import typings.sweetalert.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @scala.inline
  def resetState(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetState")().asInstanceOf[Unit]
  
  @scala.inline
  def setActionOptionsFor(buttonKey: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setActionOptionsFor")(buttonKey.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def setActionOptionsFor(buttonKey: String, hasCloseModal: `0`): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setActionOptionsFor")(buttonKey.asInstanceOf[js.Any], hasCloseModal.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setActionValue(opts: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setActionValue")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def setActionValue(opts: ActionOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setActionValue")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type ActionOptions = StringDictionary[Value]
  
  trait SwalState extends StObject {
    
    var actions: StringDictionary[CloseModal]
    
    var isOpen: Boolean
    
    var promise: Reject
    
    var timer: Double
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
