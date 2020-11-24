package typings.winrt.global.Windows.System

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.System.Threading.Core.SignalHandler
import typings.winrt.Windows.System.Threading.TimerDestroyedHandler
import typings.winrt.Windows.System.Threading.TimerElapsedHandler
import typings.winrt.Windows.System.Threading.WorkItemHandler
import typings.winrt.Windows.System.Threading.WorkItemOptions
import typings.winrt.Windows.System.Threading.WorkItemPriority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.System.Threading")
@js.native
object Threading extends js.Object {
  
  @js.native
  object Core extends js.Object {
    
    @js.native
    class PreallocatedWorkItem protected ()
      extends typings.winrt.Windows.System.Threading.Core.PreallocatedWorkItem {
      def this(handler: WorkItemHandler) = this()
      def this(handler: WorkItemHandler, priority: WorkItemPriority) = this()
      def this(handler: WorkItemHandler, priority: WorkItemPriority, options: WorkItemOptions) = this()
    }
    
    @js.native
    class SignalNotifier ()
      extends typings.winrt.Windows.System.Threading.Core.SignalNotifier
    /* static members */
    @js.native
    object SignalNotifier extends js.Object {
      
      def attachToEvent(name: String, handler: SignalHandler): typings.winrt.Windows.System.Threading.Core.SignalNotifier = js.native
      def attachToEvent(name: String, handler: SignalHandler, timeout: Double): typings.winrt.Windows.System.Threading.Core.SignalNotifier = js.native
      
      def attachToSemaphore(name: String, handler: SignalHandler): typings.winrt.Windows.System.Threading.Core.SignalNotifier = js.native
      def attachToSemaphore(name: String, handler: SignalHandler, timeout: Double): typings.winrt.Windows.System.Threading.Core.SignalNotifier = js.native
    }
  }
  
  @js.native
  class ThreadPool ()
    extends typings.winrt.Windows.System.Threading.ThreadPool
  /* static members */
  @js.native
  object ThreadPool extends js.Object {
    
    def runAsync(handler: WorkItemHandler): IAsyncAction = js.native
    def runAsync(handler: WorkItemHandler, priority: WorkItemPriority): IAsyncAction = js.native
    def runAsync(handler: WorkItemHandler, priority: WorkItemPriority, options: WorkItemOptions): IAsyncAction = js.native
  }
  
  @js.native
  class ThreadPoolTimer ()
    extends typings.winrt.Windows.System.Threading.ThreadPoolTimer
  /* static members */
  @js.native
  object ThreadPoolTimer extends js.Object {
    
    def createPeriodicTimer(handler: TimerElapsedHandler, period: Double): typings.winrt.Windows.System.Threading.ThreadPoolTimer = js.native
    def createPeriodicTimer(handler: TimerElapsedHandler, period: Double, destroyed: TimerDestroyedHandler): typings.winrt.Windows.System.Threading.ThreadPoolTimer = js.native
    
    def createTimer(handler: TimerElapsedHandler, delay: Double): typings.winrt.Windows.System.Threading.ThreadPoolTimer = js.native
    def createTimer(handler: TimerElapsedHandler, delay: Double, destroyed: TimerDestroyedHandler): typings.winrt.Windows.System.Threading.ThreadPoolTimer = js.native
  }
  
  @js.native
  object WorkItemOptions extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.System.Threading.WorkItemOptions with Double] = js.native
    
    /* 0 */ val none: typings.winrt.Windows.System.Threading.WorkItemOptions.none with Double = js.native
    
    /* 1 */ val timeSliced: typings.winrt.Windows.System.Threading.WorkItemOptions.timeSliced with Double = js.native
  }
  
  @js.native
  object WorkItemPriority extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.System.Threading.WorkItemPriority with Double] = js.native
    
    /* 2 */ val high: typings.winrt.Windows.System.Threading.WorkItemPriority.high with Double = js.native
    
    /* 0 */ val low: typings.winrt.Windows.System.Threading.WorkItemPriority.low with Double = js.native
    
    /* 1 */ val normal: typings.winrt.Windows.System.Threading.WorkItemPriority.normal with Double = js.native
  }
}
