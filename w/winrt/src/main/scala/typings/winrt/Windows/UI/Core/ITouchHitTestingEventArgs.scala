package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.Foundation.Point
import typings.winrt.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITouchHitTestingEventArgs
  extends StObject
     with ICoreWindowEventArgs {
  
  var boundingBox: Rect = js.native
  
  def evaluateProximity(controlBoundingBox: Rect): CoreProximityEvaluation = js.native
  def evaluateProximity(controlVertices: js.Array[Point]): CoreProximityEvaluation = js.native
  
  var point: Point = js.native
  
  var proximityEvaluation: CoreProximityEvaluation = js.native
}
