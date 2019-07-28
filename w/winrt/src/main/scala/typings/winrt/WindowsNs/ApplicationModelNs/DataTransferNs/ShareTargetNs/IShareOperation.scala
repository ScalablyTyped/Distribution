package typings.winrt.WindowsNs.ApplicationModelNs.DataTransferNs.ShareTargetNs

import typings.winrt.WindowsNs.ApplicationModelNs.DataTransferNs.DataPackageView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShareOperation extends js.Object {
  var data: DataPackageView = js.native
  var quickLinkId: String = js.native
  def removeThisQuickLink(): Unit = js.native
  def reportCompleted(): Unit = js.native
  def reportCompleted(quicklink: QuickLink): Unit = js.native
  def reportDataRetrieved(): Unit = js.native
  def reportError(value: String): Unit = js.native
  def reportStarted(): Unit = js.native
  def reportSubmittedBackgroundTask(): Unit = js.native
}

