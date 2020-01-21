package typings.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "BloomFilter")
@js.native
class BloomFilter protected ()
  extends typings.typescriptServices.TypeScript.BloomFilter {
  def this(expectedCount: Double) = this()
}

/* static members */
@JSImport("typescript-services", "BloomFilter")
@js.native
object BloomFilter extends js.Object {
  var falsePositiveProbability: Double = js.native
  def computeK(expectedCount: Double): Double = js.native
  def computeM(expectedCount: Double): Double = js.native
  def isEquivalent(array1: js.Array[Boolean], array2: js.Array[Boolean]): Boolean = js.native
}

