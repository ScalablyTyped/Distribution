package typings.xummSdk.distSrcTypesXummApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: unknown} */ trait XummJsonTransaction extends StObject {
  
  var TransactionType: XummTransactionType | XrplTransactionType
}
object XummJsonTransaction {
  
  inline def apply(TransactionType: XummTransactionType | XrplTransactionType): XummJsonTransaction = {
    val __obj = js.Dynamic.literal(TransactionType = TransactionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[XummJsonTransaction]
  }
  
  extension [Self <: XummJsonTransaction](x: Self) {
    
    inline def setTransactionType(value: XummTransactionType | XrplTransactionType): Self = StObject.set(x, "TransactionType", value.asInstanceOf[js.Any])
  }
}
