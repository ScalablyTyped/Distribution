package typings.typeorm.anon

import typings.typeorm.typeormStrings.all
import typings.typeorm.typeormStrings.each
import typings.typeorm.typeormStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transaction extends StObject {
  
  var transaction: js.UndefOr[all | none | each] = js.undefined
}
object Transaction {
  
  inline def apply(): Transaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transaction]
  }
  
  extension [Self <: Transaction](x: Self) {
    
    inline def setTransaction(value: all | none | each): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
