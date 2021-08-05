package typings.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IntegerUtilities {
  
  @JSImport("typescript-services", "IntegerUtilities")
  @js.native
  val ^ : js.Any = js.native
  
  inline def integerDivide(numerator: Double, denominator: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("integerDivide")(numerator.asInstanceOf[js.Any], denominator.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def integerMultiplyHigh32Bits(n1: Double, n2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("integerMultiplyHigh32Bits")(n1.asInstanceOf[js.Any], n2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def integerMultiplyLow32Bits(n1: Double, n2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("integerMultiplyLow32Bits")(n1.asInstanceOf[js.Any], n2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isHexInteger(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHexInteger")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isInteger(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteger")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
