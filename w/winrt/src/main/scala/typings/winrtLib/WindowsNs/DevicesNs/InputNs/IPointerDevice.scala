package typings
package winrtLib.WindowsNs.DevicesNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPointerDevice extends js.Object {
  var isIntegrated: scala.Boolean
  var maxContacts: scala.Double
  var physicalDeviceRect: winrtLib.WindowsNs.FoundationNs.Rect
  var pointerDeviceType: PointerDeviceType
  var screenRect: winrtLib.WindowsNs.FoundationNs.Rect
  var supportedUsages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PointerDeviceUsage]
}

