package typings
package winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBackgroundExecutionManagerStatics extends js.Object {
  def getAccessStatus(): BackgroundAccessStatus = js.native
  def getAccessStatus(applicationId: java.lang.String): BackgroundAccessStatus = js.native
  def removeAccess(): scala.Unit = js.native
  def removeAccess(applicationId: java.lang.String): scala.Unit = js.native
  def requestAccessAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[BackgroundAccessStatus] = js.native
  def requestAccessAsync(applicationId: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[BackgroundAccessStatus] = js.native
}

