package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BloomFilter extends StObject {
  
  def add(value: String): Unit
  
  def addKeys(keys: IIndexable[js.Any]): Unit
  
  /* private */ var bitArray: js.Any
  
  /* private */ def computeHash(key: js.Any, seed: js.Any): js.Any
  
  /* private */ var hashFunctionCount: js.Any
  
  def isEquivalent(filter: BloomFilter): Boolean
  
  def probablyContains(value: String): Boolean
}
object BloomFilter {
  
  inline def apply(
    add: String => Unit,
    addKeys: IIndexable[js.Any] => Unit,
    bitArray: js.Any,
    computeHash: (js.Any, js.Any) => js.Any,
    hashFunctionCount: js.Any,
    isEquivalent: BloomFilter => Boolean,
    probablyContains: String => Boolean
  ): BloomFilter = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addKeys = js.Any.fromFunction1(addKeys), bitArray = bitArray.asInstanceOf[js.Any], computeHash = js.Any.fromFunction2(computeHash), hashFunctionCount = hashFunctionCount.asInstanceOf[js.Any], isEquivalent = js.Any.fromFunction1(isEquivalent), probablyContains = js.Any.fromFunction1(probablyContains))
    __obj.asInstanceOf[BloomFilter]
  }
  
  extension [Self <: BloomFilter](x: Self) {
    
    inline def setAdd(value: String => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setAddKeys(value: IIndexable[js.Any] => Unit): Self = StObject.set(x, "addKeys", js.Any.fromFunction1(value))
    
    inline def setBitArray(value: js.Any): Self = StObject.set(x, "bitArray", value.asInstanceOf[js.Any])
    
    inline def setComputeHash(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "computeHash", js.Any.fromFunction2(value))
    
    inline def setHashFunctionCount(value: js.Any): Self = StObject.set(x, "hashFunctionCount", value.asInstanceOf[js.Any])
    
    inline def setIsEquivalent(value: BloomFilter => Boolean): Self = StObject.set(x, "isEquivalent", js.Any.fromFunction1(value))
    
    inline def setProbablyContains(value: String => Boolean): Self = StObject.set(x, "probablyContains", js.Any.fromFunction1(value))
  }
}
