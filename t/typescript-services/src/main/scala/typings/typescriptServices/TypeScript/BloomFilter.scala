package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BloomFilter extends js.Object {
  
  def add(value: String): Unit = js.native
  
  def addKeys(keys: IIndexable[_]): Unit = js.native
  
  var bitArray: js.Any = js.native
  
  /* private */ def computeHash(key: js.Any, seed: js.Any): js.Any = js.native
  
  var hashFunctionCount: js.Any = js.native
  
  def isEquivalent(filter: BloomFilter): Boolean = js.native
  
  def probablyContains(value: String): Boolean = js.native
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
  
  @scala.inline
  implicit class BloomFilterOps[Self <: BloomFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(value: String => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddKeys(value: IIndexable[_] => Unit): Self = this.set("addKeys", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBitArray(value: js.Any): Self = this.set("bitArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeHash(value: (js.Any, js.Any) => js.Any): Self = this.set("computeHash", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHashFunctionCount(value: js.Any): Self = this.set("hashFunctionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEquivalent(value: BloomFilter => Boolean): Self = this.set("isEquivalent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProbablyContains(value: String => Boolean): Self = this.set("probablyContains", js.Any.fromFunction1(value))
  }
}
