package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.IIndexable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.BloomFilter")
@js.native
class BloomFilter protected ()
  extends typings.typescriptServices.TypeScript.BloomFilter {
  def this(expectedCount: Double) = this()
  /* CompleteClass */
  override var bitArray: js.Any = js.native
  /* CompleteClass */
  override var hashFunctionCount: js.Any = js.native
  /* CompleteClass */
  override def add(value: String): Unit = js.native
  /* CompleteClass */
  override def addKeys(keys: IIndexable[_]): Unit = js.native
  /* CompleteClass */
  /* private */ override def computeHash(key: js.Any, seed: js.Any): js.Any = js.native
  /* CompleteClass */
  override def isEquivalent(filter: typings.typescriptServices.TypeScript.BloomFilter): Boolean = js.native
  /* CompleteClass */
  override def probablyContains(value: String): Boolean = js.native
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

