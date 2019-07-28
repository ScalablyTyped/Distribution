package typings.atUifabricUtilities.libMathMod

import typings.atUifabricUtilities.libIPointMod.IPoint
import typings.atUifabricUtilities.libISizeMod.ISize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/math", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def calculatePrecision(value: String): Double = js.native
  def calculatePrecision(value: Double): Double = js.native
  def fitContentToBounds(options: IFitContentToBoundsOptions): ISize = js.native
  def getDistanceBetweenPoints(point1: IPoint, point2: IPoint): Double = js.native
  def precisionRound(value: Double, precision: Double): Double = js.native
  def precisionRound(value: Double, precision: Double, base: Double): Double = js.native
}

