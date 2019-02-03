package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.BloomFilter")
@js.native
class BloomFilter protected () extends js.Object {
  def this(expectedCount: scala.Double) = this()
  var bitArray: js.Any = js.native
  var hashFunctionCount: js.Any = js.native
  def add(value: java.lang.String): scala.Unit = js.native
  def addKeys(keys: IIndexable[_]): scala.Unit = js.native
  /* private */ def computeHash(key: js.Any, seed: js.Any): js.Any = js.native
  def isEquivalent(filter: BloomFilter): scala.Boolean = js.native
  def probablyContains(value: java.lang.String): scala.Boolean = js.native
}

/* static members */
@JSGlobal("TypeScript.BloomFilter")
@js.native
object BloomFilter extends js.Object {
  var falsePositiveProbability: scala.Double = js.native
  def computeK(expectedCount: scala.Double): scala.Double = js.native
  def computeM(expectedCount: scala.Double): scala.Double = js.native
  def isEquivalent(array1: js.Array[scala.Boolean], array2: js.Array[scala.Boolean]): scala.Boolean = js.native
}

