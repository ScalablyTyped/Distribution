package typings
package winrtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AsyncInfoAsyncStatusCompletedGetResultsProgress extends js.Object {
  @JSName("completed")
  var completed_Original: winrtLib.WindowsNs.FoundationNs.AsyncOperationCompletedHandler[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.DevicesNs.SmsNs.ISmsMessage]
  ] = js.native
  @JSName("progress")
  var progress_Original: winrtLib.WindowsNs.FoundationNs.AsyncOperationProgressHandler[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.DevicesNs.SmsNs.ISmsMessage], 
    scala.Double
  ] = js.native
  def completed(
    asyncInfo: winrtLib.WindowsNs.FoundationNs.IAsyncOperation[
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.DevicesNs.SmsNs.ISmsMessage]
    ],
    asyncStatus: winrtLib.WindowsNs.FoundationNs.AsyncStatus
  ): scala.Unit = js.native
  def getResults(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.DevicesNs.SmsNs.ISmsMessage] = js.native
  def progress(
    asyncInfo: winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.DevicesNs.SmsNs.ISmsMessage], 
      scala.Double
    ],
    progressInfo: scala.Double
  ): scala.Unit = js.native
}

