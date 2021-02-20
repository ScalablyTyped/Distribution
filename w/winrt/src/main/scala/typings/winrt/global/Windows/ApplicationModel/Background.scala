package typings.winrt.global.Windows.ApplicationModel

import typings.winrt.Windows.ApplicationModel.Background.BackgroundAccessStatus
import typings.winrt.Windows.ApplicationModel.Background.IBackgroundTaskRegistration
import typings.winrt.Windows.ApplicationModel.Background.IBackgroundTrigger
import typings.winrt.Windows.ApplicationModel.Background.SystemConditionType
import typings.winrt.Windows.ApplicationModel.Background.SystemTriggerType
import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Background {
  
  @JSGlobal("Windows.ApplicationModel.Background.BackgroundAccessStatus")
  @js.native
  object BackgroundAccessStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.ApplicationModel.Background.BackgroundAccessStatus with Double
      ] = js.native
    
    /* 2 */ val allowedMayUseActiveRealTimeConnectivity: typings.winrt.Windows.ApplicationModel.Background.BackgroundAccessStatus.allowedMayUseActiveRealTimeConnectivity with Double = js.native
    
    /* 1 */ val allowedWithAlwaysOnRealTimeConnectivity: typings.winrt.Windows.ApplicationModel.Background.BackgroundAccessStatus.allowedWithAlwaysOnRealTimeConnectivity with Double = js.native
    
    /* 3 */ val denied: typings.winrt.Windows.ApplicationModel.Background.BackgroundAccessStatus.denied with Double = js.native
    
    /* 0 */ val unspecified: typings.winrt.Windows.ApplicationModel.Background.BackgroundAccessStatus.unspecified with Double = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Background.BackgroundExecutionManager")
  @js.native
  class BackgroundExecutionManager ()
    extends typings.winrt.Windows.ApplicationModel.Background.BackgroundExecutionManager
  /* static members */
  object BackgroundExecutionManager {
    
    @JSGlobal("Windows.ApplicationModel.Background.BackgroundExecutionManager.getAccessStatus")
    @js.native
    def getAccessStatus(): BackgroundAccessStatus = js.native
    @JSGlobal("Windows.ApplicationModel.Background.BackgroundExecutionManager.getAccessStatus")
    @js.native
    def getAccessStatus(applicationId: String): BackgroundAccessStatus = js.native
    
    @JSGlobal("Windows.ApplicationModel.Background.BackgroundExecutionManager.removeAccess")
    @js.native
    def removeAccess(): Unit = js.native
    @JSGlobal("Windows.ApplicationModel.Background.BackgroundExecutionManager.removeAccess")
    @js.native
    def removeAccess(applicationId: String): Unit = js.native
    
    @JSGlobal("Windows.ApplicationModel.Background.BackgroundExecutionManager.requestAccessAsync")
    @js.native
    def requestAccessAsync(): IAsyncOperation[BackgroundAccessStatus] = js.native
    @JSGlobal("Windows.ApplicationModel.Background.BackgroundExecutionManager.requestAccessAsync")
    @js.native
    def requestAccessAsync(applicationId: String): IAsyncOperation[BackgroundAccessStatus] = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskBuilder")
  @js.native
  class BackgroundTaskBuilder ()
    extends typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskBuilder
  
  @JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskCancellationReason")
  @js.native
  object BackgroundTaskCancellationReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason with Double
      ] = js.native
    
    /* 0 */ val abort: typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.abort with Double = js.native
    
    /* 2 */ val loggingOff: typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.loggingOff with Double = js.native
    
    /* 3 */ val servicingUpdate: typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.servicingUpdate with Double = js.native
    
    /* 1 */ val terminating: typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.terminating with Double = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskCompletedEventArgs")
  @js.native
  class BackgroundTaskCompletedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskCompletedEventArgs
  
  @JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskDeferral")
  @js.native
  class BackgroundTaskDeferral ()
    extends typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskDeferral
  
  @JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskProgressEventArgs")
  @js.native
  class BackgroundTaskProgressEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskProgressEventArgs
  
  @JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskRegistration")
  @js.native
  class BackgroundTaskRegistration ()
    extends typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskRegistration
  /* static members */
  object BackgroundTaskRegistration {
    
    @JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskRegistration")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskRegistration.allTasks")
    @js.native
    def allTasks: IMapView[String, IBackgroundTaskRegistration] = js.native
    @scala.inline
    def allTasks_=(x: IMapView[String, IBackgroundTaskRegistration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allTasks")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.ApplicationModel.Background.MaintenanceTrigger")
  @js.native
  class MaintenanceTrigger protected ()
    extends typings.winrt.Windows.ApplicationModel.Background.MaintenanceTrigger {
    def this(freshnessTime: Double, oneShot: Boolean) = this()
  }
  
  @JSGlobal("Windows.ApplicationModel.Background.NetworkOperatorHotspotAuthenticationTrigger")
  @js.native
  class NetworkOperatorHotspotAuthenticationTrigger ()
    extends typings.winrt.Windows.ApplicationModel.Background.NetworkOperatorHotspotAuthenticationTrigger
  
  @JSGlobal("Windows.ApplicationModel.Background.NetworkOperatorNotificationTrigger")
  @js.native
  class NetworkOperatorNotificationTrigger protected ()
    extends typings.winrt.Windows.ApplicationModel.Background.NetworkOperatorNotificationTrigger {
    def this(networkAccountId: String) = this()
  }
  
  @JSGlobal("Windows.ApplicationModel.Background.PushNotificationTrigger")
  @js.native
  class PushNotificationTrigger () extends IBackgroundTrigger {
    def this(applicationId: String) = this()
  }
  
  @JSGlobal("Windows.ApplicationModel.Background.SystemCondition")
  @js.native
  class SystemCondition protected ()
    extends typings.winrt.Windows.ApplicationModel.Background.SystemCondition {
    def this(conditionType: SystemConditionType) = this()
  }
  
  @JSGlobal("Windows.ApplicationModel.Background.SystemConditionType")
  @js.native
  object SystemConditionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.ApplicationModel.Background.SystemConditionType with Double
      ] = js.native
    
    /* 3 */ val internetAvailable: typings.winrt.Windows.ApplicationModel.Background.SystemConditionType.internetAvailable with Double = js.native
    
    /* 4 */ val internetNotAvailable: typings.winrt.Windows.ApplicationModel.Background.SystemConditionType.internetNotAvailable with Double = js.native
    
    /* 0 */ val invalid: typings.winrt.Windows.ApplicationModel.Background.SystemConditionType.invalid with Double = js.native
    
    /* 5 */ val sessionConnected: typings.winrt.Windows.ApplicationModel.Background.SystemConditionType.sessionConnected with Double = js.native
    
    /* 6 */ val sessionDisconnected: typings.winrt.Windows.ApplicationModel.Background.SystemConditionType.sessionDisconnected with Double = js.native
    
    /* 2 */ val userNotPresent: typings.winrt.Windows.ApplicationModel.Background.SystemConditionType.userNotPresent with Double = js.native
    
    /* 1 */ val userPresent: typings.winrt.Windows.ApplicationModel.Background.SystemConditionType.userPresent with Double = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Background.SystemTrigger")
  @js.native
  class SystemTrigger protected ()
    extends typings.winrt.Windows.ApplicationModel.Background.SystemTrigger {
    def this(triggerType: SystemTriggerType, oneShot: Boolean) = this()
  }
  
  @JSGlobal("Windows.ApplicationModel.Background.SystemTriggerType")
  @js.native
  object SystemTriggerType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.ApplicationModel.Background.SystemTriggerType with Double] = js.native
    
    /* 5 */ val controlChannelReset: typings.winrt.Windows.ApplicationModel.Background.SystemTriggerType.controlChannelReset with Double = js.native
    
    /* 6 */ val internetAvailable: typings.winrt.Windows.ApplicationModel.Background.SystemTriggerType.internetAvailable with Double = js.native
    
    /* 0 */ val invalid: typings.winrt.Windows.ApplicationModel.Background.SystemTriggerType.invalid with Double = js.native
    
    /* 9 */ val lockScreenApplicationAdded: typings.winrt.Windows.ApplicationModel.Background.SystemTriggerType.lockScreenApplicationAdded with Double = js.native
    
    /* 10 */ val lockScreenApplicationRemoved: typings.winrt.Windows.ApplicationModel.Background.SystemTriggerType.lockScreenApplicationRemoved with Double = js.native
    
    /* 4 */ val networkStateChange: typings.winrt.Windows.ApplicationModel.Background.SystemTriggerType.networkStateChange with Double = js.native
    
    /* 12 */ val onlineIdConnectedStateChange: typings.winrt.Windows.ApplicationModel.Background.SystemTriggerType.onlineIdConnectedStateChange with Double = js.native
    
    /* 8 */ val servicingComplete: typings.winrt.Windows.ApplicationModel.Background.SystemTriggerType.servicingComplete with Double = js.native
    
    /* 7 */ val sessionConnected: typings.winrt.Windows.ApplicationModel.Background.SystemTriggerType.sessionConnected with Double = js.native
    
    /* 1 */ val smsReceived: typings.winrt.Windows.ApplicationModel.Background.SystemTriggerType.smsReceived with Double = js.native
    
    /* 11 */ val timeZoneChange: typings.winrt.Windows.ApplicationModel.Background.SystemTriggerType.timeZoneChange with Double = js.native
    
    /* 3 */ val userAway: typings.winrt.Windows.ApplicationModel.Background.SystemTriggerType.userAway with Double = js.native
    
    /* 2 */ val userPresent: typings.winrt.Windows.ApplicationModel.Background.SystemTriggerType.userPresent with Double = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Background.TimeTrigger")
  @js.native
  class TimeTrigger protected ()
    extends typings.winrt.Windows.ApplicationModel.Background.TimeTrigger {
    def this(freshnessTime: Double, oneShot: Boolean) = this()
  }
}
