package typings.winrt.global.Windows.ApplicationModel

import typings.winrt.Windows.ApplicationModel.Background.BackgroundAccessStatus
import typings.winrt.Windows.ApplicationModel.Background.IBackgroundTaskRegistration
import typings.winrt.Windows.ApplicationModel.Background.IBackgroundTrigger
import typings.winrt.Windows.ApplicationModel.Background.SystemConditionType
import typings.winrt.Windows.ApplicationModel.Background.SystemTriggerType
import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Background")
@js.native
object Background extends js.Object {
  @js.native
  class BackgroundExecutionManager ()
    extends typings.winrt.Windows.ApplicationModel.Background.BackgroundExecutionManager
  
  @js.native
  class BackgroundTaskBuilder ()
    extends typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskBuilder
  
  @js.native
  class BackgroundTaskCompletedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskCompletedEventArgs
  
  @js.native
  class BackgroundTaskDeferral ()
    extends typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskDeferral
  
  @js.native
  class BackgroundTaskProgressEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskProgressEventArgs
  
  @js.native
  class BackgroundTaskRegistration ()
    extends typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskRegistration
  
  @js.native
  class MaintenanceTrigger protected ()
    extends typings.winrt.Windows.ApplicationModel.Background.MaintenanceTrigger {
    def this(freshnessTime: Double, oneShot: Boolean) = this()
  }
  
  @js.native
  class NetworkOperatorHotspotAuthenticationTrigger () extends IBackgroundTrigger
  
  @js.native
  class NetworkOperatorNotificationTrigger protected ()
    extends typings.winrt.Windows.ApplicationModel.Background.NetworkOperatorNotificationTrigger {
    def this(networkAccountId: String) = this()
  }
  
  @js.native
  class PushNotificationTrigger () extends IBackgroundTrigger {
    def this(applicationId: String) = this()
  }
  
  @js.native
  class SystemCondition protected ()
    extends typings.winrt.Windows.ApplicationModel.Background.SystemCondition {
    def this(conditionType: SystemConditionType) = this()
  }
  
  @js.native
  class SystemTrigger protected ()
    extends typings.winrt.Windows.ApplicationModel.Background.SystemTrigger {
    def this(triggerType: SystemTriggerType, oneShot: Boolean) = this()
  }
  
  @js.native
  class TimeTrigger protected ()
    extends typings.winrt.Windows.ApplicationModel.Background.TimeTrigger {
    def this(freshnessTime: Double, oneShot: Boolean) = this()
  }
  
  @js.native
  object BackgroundAccessStatus extends js.Object {
    /* 2 */ val allowedMayUseActiveRealTimeConnectivity: typings.winrt.Windows.ApplicationModel.Background.BackgroundAccessStatus.allowedMayUseActiveRealTimeConnectivity with Double = js.native
    /* 1 */ val allowedWithAlwaysOnRealTimeConnectivity: typings.winrt.Windows.ApplicationModel.Background.BackgroundAccessStatus.allowedWithAlwaysOnRealTimeConnectivity with Double = js.native
    /* 3 */ val denied: typings.winrt.Windows.ApplicationModel.Background.BackgroundAccessStatus.denied with Double = js.native
    /* 0 */ val unspecified: typings.winrt.Windows.ApplicationModel.Background.BackgroundAccessStatus.unspecified with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.ApplicationModel.Background.BackgroundAccessStatus with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object BackgroundExecutionManager extends js.Object {
    def getAccessStatus(): BackgroundAccessStatus = js.native
    def getAccessStatus(applicationId: String): BackgroundAccessStatus = js.native
    def removeAccess(): Unit = js.native
    def removeAccess(applicationId: String): Unit = js.native
    def requestAccessAsync(): IAsyncOperation[BackgroundAccessStatus] = js.native
    def requestAccessAsync(applicationId: String): IAsyncOperation[BackgroundAccessStatus] = js.native
  }
  
  @js.native
  object BackgroundTaskCancellationReason extends js.Object {
    /* 0 */ val abort: typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.abort with Double = js.native
    /* 2 */ val loggingOff: typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.loggingOff with Double = js.native
    /* 3 */ val servicingUpdate: typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.servicingUpdate with Double = js.native
    /* 1 */ val terminating: typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.terminating with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object BackgroundTaskRegistration extends js.Object {
    var allTasks: IMapView[String, IBackgroundTaskRegistration] = js.native
  }
  
  @js.native
  object SystemConditionType extends js.Object {
    /* 3 */ val internetAvailable: typings.winrt.Windows.ApplicationModel.Background.SystemConditionType.internetAvailable with Double = js.native
    /* 4 */ val internetNotAvailable: typings.winrt.Windows.ApplicationModel.Background.SystemConditionType.internetNotAvailable with Double = js.native
    /* 0 */ val invalid: typings.winrt.Windows.ApplicationModel.Background.SystemConditionType.invalid with Double = js.native
    /* 5 */ val sessionConnected: typings.winrt.Windows.ApplicationModel.Background.SystemConditionType.sessionConnected with Double = js.native
    /* 6 */ val sessionDisconnected: typings.winrt.Windows.ApplicationModel.Background.SystemConditionType.sessionDisconnected with Double = js.native
    /* 2 */ val userNotPresent: typings.winrt.Windows.ApplicationModel.Background.SystemConditionType.userNotPresent with Double = js.native
    /* 1 */ val userPresent: typings.winrt.Windows.ApplicationModel.Background.SystemConditionType.userPresent with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.ApplicationModel.Background.SystemConditionType with Double
      ] = js.native
  }
  
  @js.native
  object SystemTriggerType extends js.Object {
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
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.ApplicationModel.Background.SystemTriggerType with Double] = js.native
  }
  
}

