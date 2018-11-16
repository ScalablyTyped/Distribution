package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISetVersionRequest extends js.Object {
  var currentVersion: scala.Double
  var desiredVersion: scala.Double
  def getDeferral(): SetVersionDeferral
}

