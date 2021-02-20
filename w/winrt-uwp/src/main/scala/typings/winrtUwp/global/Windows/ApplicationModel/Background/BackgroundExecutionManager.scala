package typings.winrtUwp.global.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides methods that let an app ask to be added to the lock screen's apps list or query its current access to background activity and badge updates on the lock screen. */
@JSGlobal("Windows.ApplicationModel.Background.BackgroundExecutionManager")
@js.native
abstract class BackgroundExecutionManager ()
  extends typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundExecutionManager
object BackgroundExecutionManager {
  
  /**
    * Gets the ability of the calling lock screen app to perform background activity and update its badge.
    * @return One of the enumeration values that specify the app's capabilities on the lock screen.
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Background.BackgroundExecutionManager.getAccessStatus")
  @js.native
  def getAccessStatus(): typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundAccessStatus = js.native
  /**
    * Gets the ability of a specific lock screen app to perform background activity and update its badge.
    * @param applicationId The Package Relative Application ID (PRAID) of the app whose capabilities are being retrieved. The specified app must be in the same package as the calling app.
    * @return One of the enumeration values that specify the app's capabilities on the lock screen.
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Background.BackgroundExecutionManager.getAccessStatus")
  @js.native
  def getAccessStatus(applicationId: String): typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundAccessStatus = js.native
  
  /** Removes the calling app from the lock screen's apps list. */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Background.BackgroundExecutionManager.removeAccess")
  @js.native
  def removeAccess(): Unit = js.native
  /**
    * Removes a specific app from the lock screen's apps list.
    * @param applicationId The Package Relative Application ID (PRAID) of the app to be removed from the lock screen. The specified app must be in the same package as the calling app.
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Background.BackgroundExecutionManager.removeAccess")
  @js.native
  def removeAccess(applicationId: String): Unit = js.native
  
  /**
    * Requests access for an app to run background tasks.
    * @return The object, bound to the calling app, that is used to request that the app be added to the lock screen's apps list. When the operation completes, it returns a member of the BackgroundAccessStatus enumeration that specifies the outcome.
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Background.BackgroundExecutionManager.requestAccessAsync")
  @js.native
  def requestAccessAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundAccessStatus] = js.native
  /**
    * Requests access for an app to run background tasks.
    * @param applicationId The Package Relative Application ID (PRAID) of the app to be added to the lock screen. The specified app must be in the same package as the calling app.
    * @return The object, bound to the app specified by applicationId, that is used to request that the app be added to the lock screen's apps list. When the operation completes, it returns a member of the BackgroundAccessStatus enumeration that specifies the outcome.
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Background.BackgroundExecutionManager.requestAccessAsync")
  @js.native
  def requestAccessAsync(applicationId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundAccessStatus] = js.native
}
