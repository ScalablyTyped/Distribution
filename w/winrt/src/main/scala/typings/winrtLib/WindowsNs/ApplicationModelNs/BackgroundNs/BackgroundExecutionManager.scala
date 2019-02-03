package typings
package winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Background.BackgroundExecutionManager")
@js.native
class BackgroundExecutionManager () extends js.Object

/* static members */
@JSGlobal("Windows.ApplicationModel.Background.BackgroundExecutionManager")
@js.native
object BackgroundExecutionManager extends js.Object {
  def getAccessStatus(): winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundAccessStatus = js.native
  def getAccessStatus(applicationId: java.lang.String): winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundAccessStatus = js.native
  def removeAccess(): scala.Unit = js.native
  def removeAccess(applicationId: java.lang.String): scala.Unit = js.native
  def requestAccessAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundAccessStatus] = js.native
  def requestAccessAsync(applicationId: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundAccessStatus] = js.native
}

