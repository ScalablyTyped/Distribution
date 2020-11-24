package typings.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.BloomFilter")
@js.native
class BloomFilter protected ()
  extends typings.typescriptServices.TypeScript.BloomFilter {
  def this(expectedCount: Double) = this()
}
/* static members */
@JSGlobal("TypeScript.BloomFilter")
@js.native
object BloomFilter extends js.Object {
  
  def computeK(expectedCount: Double): Double = js.native
  
  def computeM(expectedCount: Double): Double = js.native
  
  var falsePositiveProbability: Double = js.native
  
  def isEquivalent(array1: js.Array[Boolean], array2: js.Array[Boolean]): Boolean = js.native
}
