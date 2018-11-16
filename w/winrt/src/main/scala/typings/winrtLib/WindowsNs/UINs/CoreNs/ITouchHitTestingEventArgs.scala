package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITouchHitTestingEventArgs extends ICoreWindowEventArgs {
  var boundingBox: winrtLib.WindowsNs.FoundationNs.Rect = js.native
  var point: winrtLib.WindowsNs.FoundationNs.Point = js.native
  var proximityEvaluation: CoreProximityEvaluation = js.native
  def evaluateProximity(controlBoundingBox: winrtLib.WindowsNs.FoundationNs.Rect): CoreProximityEvaluation = js.native
  def evaluateProximity(controlVertices: js.Array[winrtLib.WindowsNs.FoundationNs.Point]): CoreProximityEvaluation = js.native
}

