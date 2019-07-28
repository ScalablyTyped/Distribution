package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.BloomFilter")
@js.native
class BloomFilter protected () extends js.Object {
  def this(expectedCount: Double) = this()
  var bitArray: js.Any = js.native
  var hashFunctionCount: js.Any = js.native
  def add(value: String): Unit = js.native
  def addKeys(keys: IIndexable[_]): Unit = js.native
  /* private */ def computeHash(key: js.Any, seed: js.Any): js.Any = js.native
  def isEquivalent(filter: BloomFilter): Boolean = js.native
  def probablyContains(value: String): Boolean = js.native
}

/* static members */
@JSGlobal("TypeScript.BloomFilter")
@js.native
object BloomFilter extends js.Object {
  var falsePositiveProbability: Double = js.native
  def computeK(expectedCount: Double): Double = js.native
  def computeM(expectedCount: Double): Double = js.native
  def isEquivalent(array1: js.Array[Boolean], array2: js.Array[Boolean]): Boolean = js.native
}

