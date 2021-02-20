package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BloomFilter extends StObject {
  
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
  implicit class BloomFilterMutableBuilder[Self <: BloomFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: String => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddKeys(value: IIndexable[_] => Unit): Self = StObject.set(x, "addKeys", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBitArray(value: js.Any): Self = StObject.set(x, "bitArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeHash(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "computeHash", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHashFunctionCount(value: js.Any): Self = StObject.set(x, "hashFunctionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEquivalent(value: BloomFilter => Boolean): Self = StObject.set(x, "isEquivalent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProbablyContains(value: String => Boolean): Self = StObject.set(x, "probablyContains", js.Any.fromFunction1(value))
  }
}
