package typings
package winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs.ShareTargetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShareOperation extends js.Object {
  var data: winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs.DataPackageView = js.native
  var quickLinkId: java.lang.String = js.native
  def removeThisQuickLink(): scala.Unit = js.native
  def reportCompleted(): scala.Unit = js.native
  def reportCompleted(quicklink: QuickLink): scala.Unit = js.native
  def reportDataRetrieved(): scala.Unit = js.native
  def reportError(value: java.lang.String): scala.Unit = js.native
  def reportStarted(): scala.Unit = js.native
  def reportSubmittedBackgroundTask(): scala.Unit = js.native
}

