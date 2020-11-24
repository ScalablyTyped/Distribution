package typings.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.IntegerUtilities")
@js.native
object IntegerUtilities extends js.Object {
  
  def integerDivide(numerator: Double, denominator: Double): Double = js.native
  
  def integerMultiplyHigh32Bits(n1: Double, n2: Double): Double = js.native
  
  def integerMultiplyLow32Bits(n1: Double, n2: Double): Double = js.native
  
  def isHexInteger(text: String): Boolean = js.native
  
  def isInteger(text: String): Boolean = js.native
}
