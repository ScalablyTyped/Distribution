package typings
package winrtLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAsyncInfo extends js.Object {
  var errorCode: scala.Double
  var id: scala.Double
  var status: AsyncStatus
  def cancel(): scala.Unit
  def close(): scala.Unit
}

