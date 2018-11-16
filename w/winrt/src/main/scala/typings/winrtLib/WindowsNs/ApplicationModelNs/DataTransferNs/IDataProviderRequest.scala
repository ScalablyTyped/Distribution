package typings
package winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDataProviderRequest extends js.Object {
  var deadline: stdLib.Date
  var formatId: java.lang.String
  def getDeferral(): DataProviderDeferral
  def setData(value: js.Any): scala.Unit
}

