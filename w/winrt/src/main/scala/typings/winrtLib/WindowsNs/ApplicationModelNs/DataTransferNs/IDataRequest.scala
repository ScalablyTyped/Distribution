package typings
package winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDataRequest extends js.Object {
  var data: DataPackage
  var deadline: stdLib.Date
  def failWithDisplayText(value: java.lang.String): scala.Unit
  def getDeferral(): DataRequestDeferral
}

