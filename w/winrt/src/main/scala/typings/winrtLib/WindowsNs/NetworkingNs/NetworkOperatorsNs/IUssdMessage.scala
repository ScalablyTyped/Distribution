package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IUssdMessage extends js.Object {
  var dataCodingScheme: scala.Double
  var payloadAsText: java.lang.String
  def getPayload(): stdLib.Uint8Array
  def setPayload(value: stdLib.Uint8Array): scala.Unit
}

