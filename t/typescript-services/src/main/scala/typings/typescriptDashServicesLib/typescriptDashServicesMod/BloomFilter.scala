package typings
package typescriptDashServicesLib.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "BloomFilter")
@js.native
class BloomFilter protected ()
  extends typescriptDashServicesLib.TypeScriptNs.BloomFilter {
  def this(expectedCount: scala.Double) = this()
}

/* static members */
@JSImport("typescript-services", "BloomFilter")
@js.native
object BloomFilter extends js.Object {
  var falsePositiveProbability: scala.Double = js.native
  def computeK(expectedCount: scala.Double): scala.Double = js.native
  def computeM(expectedCount: scala.Double): scala.Double = js.native
  def isEquivalent(array1: js.Array[scala.Boolean], array2: js.Array[scala.Boolean]): scala.Boolean = js.native
}

