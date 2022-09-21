package typings.webcryptoCore.mod

import typings.std.KeyType
import typings.std.KeyUsage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CryptoKey * / any */ trait CryptoKey1 extends StObject {
  
  var algorithm: KeyAlgorithm
  
  var extractable: Boolean
  
  var `type`: KeyType
  
  var usages: KeyUsages
}
object CryptoKey1 {
  
  inline def apply(algorithm: KeyAlgorithm, extractable: Boolean, `type`: KeyType, usages: KeyUsages): CryptoKey1 = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], extractable = extractable.asInstanceOf[js.Any], usages = usages.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKey1]
  }
  
  extension [Self <: CryptoKey1](x: Self) {
    
    inline def setAlgorithm(value: KeyAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setExtractable(value: Boolean): Self = StObject.set(x, "extractable", value.asInstanceOf[js.Any])
    
    inline def setType(value: KeyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUsages(value: KeyUsages): Self = StObject.set(x, "usages", value.asInstanceOf[js.Any])
    
    inline def setUsagesVarargs(value: KeyUsage*): Self = StObject.set(x, "usages", js.Array(value*))
  }
}
