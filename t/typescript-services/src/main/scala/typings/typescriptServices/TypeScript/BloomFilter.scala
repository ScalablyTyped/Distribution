package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BloomFilter extends js.Object {
  var bitArray: js.Any
  var hashFunctionCount: js.Any
  def add(value: String): Unit
  def addKeys(keys: IIndexable[_]): Unit
  /* private */ def computeHash(key: js.Any, seed: js.Any): js.Any
  def isEquivalent(filter: BloomFilter): Boolean
  def probablyContains(value: String): Boolean
}

object BloomFilter {
  @scala.inline
  def apply(
    add: String => Unit,
    addKeys: IIndexable[_] => Unit,
    bitArray: js.Any,
    computeHash: (js.Any, js.Any) => js.Any,
    hashFunctionCount: js.Any,
    isEquivalent: BloomFilter => Boolean,
    probablyContains: String => Boolean
  ): BloomFilter = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addKeys = js.Any.fromFunction1(addKeys), bitArray = bitArray.asInstanceOf[js.Any], computeHash = js.Any.fromFunction2(computeHash), hashFunctionCount = hashFunctionCount.asInstanceOf[js.Any], isEquivalent = js.Any.fromFunction1(isEquivalent), probablyContains = js.Any.fromFunction1(probablyContains))
    __obj.asInstanceOf[BloomFilter]
  }
}

