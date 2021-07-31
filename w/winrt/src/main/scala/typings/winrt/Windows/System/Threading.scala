package typings.winrt.Windows.System

import typings.winrt.Windows.Foundation.IAsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Threading {
  
  @js.native
  sealed trait WorkItemOptions extends StObject
  @JSGlobal("Windows.System.Threading.WorkItemOptions")
  @js.native
  object WorkItemOptions extends StObject {
    
    @js.native
    sealed trait none
      extends StObject
         with WorkItemOptions
    
    @js.native
    sealed trait timeSliced
      extends StObject
         with WorkItemOptions
  }
  
  @js.native
  sealed trait WorkItemPriority extends StObject
  @JSGlobal("Windows.System.Threading.WorkItemPriority")
  @js.native
  object WorkItemPriority extends StObject {
    
    @js.native
    sealed trait high
      extends StObject
         with WorkItemPriority
    
    @js.native
    sealed trait low
      extends StObject
         with WorkItemPriority
    
    @js.native
    sealed trait normal
      extends StObject
         with WorkItemPriority
  }
  
  object Core {
    
    trait IPreallocatedWorkItem extends StObject {
      
      def runAsync(): IAsyncAction
    }
    object IPreallocatedWorkItem {
      
      @scala.inline
      def apply(runAsync: () => IAsyncAction): IPreallocatedWorkItem = {
        val __obj = js.Dynamic.literal(runAsync = js.Any.fromFunction0(runAsync))
        __obj.asInstanceOf[IPreallocatedWorkItem]
      }
      
      @scala.inline
      implicit class IPreallocatedWorkItemMutableBuilder[Self <: IPreallocatedWorkItem] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRunAsync(value: () => IAsyncAction): Self = StObject.set(x, "runAsync", js.Any.fromFunction0(value))
      }
    }
    
    trait IPreallocatedWorkItemFactory extends StObject {
      
      def createWorkItem(handler: WorkItemHandler): PreallocatedWorkItem
      
      def createWorkItemWithPriority(handler: WorkItemHandler, priority: WorkItemPriority): PreallocatedWorkItem
      
      def createWorkItemWithPriorityAndOptions(handler: WorkItemHandler, priority: WorkItemPriority, options: WorkItemOptions): PreallocatedWorkItem
    }
    object IPreallocatedWorkItemFactory {
      
      @scala.inline
      def apply(
        createWorkItem: WorkItemHandler => PreallocatedWorkItem,
        createWorkItemWithPriority: (WorkItemHandler, WorkItemPriority) => PreallocatedWorkItem,
        createWorkItemWithPriorityAndOptions: (WorkItemHandler, WorkItemPriority, WorkItemOptions) => PreallocatedWorkItem
      ): IPreallocatedWorkItemFactory = {
        val __obj = js.Dynamic.literal(createWorkItem = js.Any.fromFunction1(createWorkItem), createWorkItemWithPriority = js.Any.fromFunction2(createWorkItemWithPriority), createWorkItemWithPriorityAndOptions = js.Any.fromFunction3(createWorkItemWithPriorityAndOptions))
        __obj.asInstanceOf[IPreallocatedWorkItemFactory]
      }
      
      @scala.inline
      implicit class IPreallocatedWorkItemFactoryMutableBuilder[Self <: IPreallocatedWorkItemFactory] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCreateWorkItem(value: WorkItemHandler => PreallocatedWorkItem): Self = StObject.set(x, "createWorkItem", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCreateWorkItemWithPriority(value: (WorkItemHandler, WorkItemPriority) => PreallocatedWorkItem): Self = StObject.set(x, "createWorkItemWithPriority", js.Any.fromFunction2(value))
        
        @scala.inline
        def setCreateWorkItemWithPriorityAndOptions(value: (WorkItemHandler, WorkItemPriority, WorkItemOptions) => PreallocatedWorkItem): Self = StObject.set(x, "createWorkItemWithPriorityAndOptions", js.Any.fromFunction3(value))
      }
    }
    
    trait ISignalNotifier extends StObject {
      
      def enable(): Unit
      
      def terminate(): Unit
    }
    object ISignalNotifier {
      
      @scala.inline
      def apply(enable: () => Unit, terminate: () => Unit): ISignalNotifier = {
        val __obj = js.Dynamic.literal(enable = js.Any.fromFunction0(enable), terminate = js.Any.fromFunction0(terminate))
        __obj.asInstanceOf[ISignalNotifier]
      }
      
      @scala.inline
      implicit class ISignalNotifierMutableBuilder[Self <: ISignalNotifier] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
        
        @scala.inline
        def setTerminate(value: () => Unit): Self = StObject.set(x, "terminate", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait ISignalNotifierStatics extends StObject {
      
      def attachToEvent(name: String, handler: SignalHandler): SignalNotifier = js.native
      def attachToEvent(name: String, handler: SignalHandler, timeout: Double): SignalNotifier = js.native
      
      def attachToSemaphore(name: String, handler: SignalHandler): SignalNotifier = js.native
      def attachToSemaphore(name: String, handler: SignalHandler, timeout: Double): SignalNotifier = js.native
    }
    
    trait PreallocatedWorkItem
      extends StObject
         with IPreallocatedWorkItem
    object PreallocatedWorkItem {
      
      @scala.inline
      def apply(runAsync: () => IAsyncAction): PreallocatedWorkItem = {
        val __obj = js.Dynamic.literal(runAsync = js.Any.fromFunction0(runAsync))
        __obj.asInstanceOf[PreallocatedWorkItem]
      }
    }
    
    type SignalHandler = js.Function2[/* signalNotifier */ SignalNotifier, /* timedOut */ Boolean, Unit]
    
    trait SignalNotifier
      extends StObject
         with ISignalNotifier
    object SignalNotifier {
      
      @scala.inline
      def apply(enable: () => Unit, terminate: () => Unit): SignalNotifier = {
        val __obj = js.Dynamic.literal(enable = js.Any.fromFunction0(enable), terminate = js.Any.fromFunction0(terminate))
        __obj.asInstanceOf[SignalNotifier]
      }
    }
  }
  
  @js.native
  trait IThreadPoolStatics extends StObject {
    
    def runAsync(handler: WorkItemHandler): IAsyncAction = js.native
    def runAsync(handler: WorkItemHandler, priority: WorkItemPriority): IAsyncAction = js.native
    def runAsync(handler: WorkItemHandler, priority: WorkItemPriority, options: WorkItemOptions): IAsyncAction = js.native
  }
  
  trait IThreadPoolTimer extends StObject {
    
    def cancel(): Unit
    
    var delay: Double
    
    var period: Double
  }
  object IThreadPoolTimer {
    
    @scala.inline
    def apply(cancel: () => Unit, delay: Double, period: Double): IThreadPoolTimer = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), delay = delay.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any])
      __obj.asInstanceOf[IThreadPoolTimer]
    }
    
    @scala.inline
    implicit class IThreadPoolTimerMutableBuilder[Self <: IThreadPoolTimer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IThreadPoolTimerStatics extends StObject {
    
    def createPeriodicTimer(handler: TimerElapsedHandler, period: Double): ThreadPoolTimer = js.native
    def createPeriodicTimer(handler: TimerElapsedHandler, period: Double, destroyed: TimerDestroyedHandler): ThreadPoolTimer = js.native
    
    def createTimer(handler: TimerElapsedHandler, delay: Double): ThreadPoolTimer = js.native
    def createTimer(handler: TimerElapsedHandler, delay: Double, destroyed: TimerDestroyedHandler): ThreadPoolTimer = js.native
  }
  
  trait ThreadPool extends StObject
  
  trait ThreadPoolTimer
    extends StObject
       with IThreadPoolTimer
  object ThreadPoolTimer {
    
    @scala.inline
    def apply(cancel: () => Unit, delay: Double, period: Double): ThreadPoolTimer = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), delay = delay.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThreadPoolTimer]
    }
  }
  
  type TimerDestroyedHandler = js.Function1[/* timer */ ThreadPoolTimer, Unit]
  
  type TimerElapsedHandler = js.Function1[/* timer */ ThreadPoolTimer, Unit]
  
  type WorkItemHandler = js.Function1[/* operation */ IAsyncAction, Unit]
}
