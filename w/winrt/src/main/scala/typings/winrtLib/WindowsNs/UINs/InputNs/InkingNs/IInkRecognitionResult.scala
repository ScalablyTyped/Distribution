package typings
package winrtLib.WindowsNs.UINs.InputNs.InkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IInkRecognitionResult extends js.Object {
  var boundingRect: winrtLib.WindowsNs.FoundationNs.Rect
  def getStrokes(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkStroke]
  def getTextCandidates(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String]
}

