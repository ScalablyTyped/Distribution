package typings
package winrtLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISmsTextMessage extends ISmsMessage {
  var body: java.lang.String
  var encoding: SmsEncoding
  var from: java.lang.String
  var partCount: scala.Double
  var partNumber: scala.Double
  var partReferenceId: scala.Double
  var timestamp: stdLib.Date
  var to: java.lang.String
  def toBinaryMessages(format: SmsDataFormat): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ISmsBinaryMessage]
}

