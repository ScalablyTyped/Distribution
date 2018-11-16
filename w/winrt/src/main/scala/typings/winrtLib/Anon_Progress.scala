package typings
package winrtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Progress extends js.Object {
  var completed: winrtLib.WindowsNs.FoundationNs.AsyncOperationCompletedHandler[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.DevicesNs.SmsNs.ISmsMessage]
  ]
  var progress: winrtLib.WindowsNs.FoundationNs.AsyncOperationProgressHandler[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.DevicesNs.SmsNs.ISmsMessage], 
    scala.Double
  ]
  def getResults(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.DevicesNs.SmsNs.ISmsMessage]
}

