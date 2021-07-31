package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "MathUtils")
@js.native
class MathUtils ()
  extends typings.wonderJs.mathUtilsMod.MathUtils
/* static members */
object MathUtils {
  
  @JSImport("wonder.js/dist/es2015", "MathUtils")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def bigThan(num: Double, below: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bigThan")(num.asInstanceOf[js.Any], below.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def clamp(num: Double, below: Double, up: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(num.asInstanceOf[js.Any], below.asInstanceOf[js.Any], up.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def generateInteger(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("generateInteger")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def generateMinToMax(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("generateMinToMax")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def generateZeroToOne(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("generateZeroToOne")().asInstanceOf[Double]
  
  @scala.inline
  def maxFloorIntegralMultiple(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("maxFloorIntegralMultiple")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def mod(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
}
