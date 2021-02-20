package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICoordSystem extends StObject {
  
  def getDistance(point1: js.Array[Double], point2: js.Array[Double]): Double = js.native
  
  def solveDirectProblem(startPoint: js.Array[Double], direction: js.Array[Double], distance: Double): js.Object = js.native
  
  def solveInverseProblem(startPoint: js.Array[Double], endPoint: js.Array[Double]): js.Object = js.native
  def solveInverseProblem(startPoint: js.Array[Double], endPoint: js.Array[Double], reverseDirection: Boolean): js.Object = js.native
}
