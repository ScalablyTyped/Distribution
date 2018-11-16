package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IPointerEventArgs extends ICoreWindowEventArgs {
  var currentPoint: winrtLib.WindowsNs.UINs.InputNs.PointerPoint
  var keyModifiers: winrtLib.WindowsNs.SystemNs.VirtualKeyModifiers
  def getIntermediatePoints(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtLib.WindowsNs.UINs.InputNs.PointerPoint]
}

