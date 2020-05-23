package typings.winrtUwp.global.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Requests permission from the user to set alarms, and retrieves the status of user permission for the app to set alarms. */
@JSGlobal("Windows.ApplicationModel.Background.AlarmApplicationManager")
@js.native
abstract class AlarmApplicationManager ()
  extends typings.winrtUwp.Windows.ApplicationModel.Background.AlarmApplicationManager

/* static members */
@JSGlobal("Windows.ApplicationModel.Background.AlarmApplicationManager")
@js.native
object AlarmApplicationManager extends js.Object {
  /**
    * Retrieves the status of user permission for the app to set alarms.
    * @return Indicates whether the user has granted permission to set alarms.
    */
  def getAccessStatus(): typings.winrtUwp.Windows.ApplicationModel.Background.AlarmAccessStatus = js.native
  /**
    * Requests permission from the user to set alarms.
    * @return This method returns an AlarmAccessStatus value when it completes.
    */
  def requestAccessAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Background.AlarmAccessStatus] = js.native
}

