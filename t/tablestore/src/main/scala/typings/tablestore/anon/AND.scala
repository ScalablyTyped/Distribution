package typings.tablestore.anon

import typings.tablestore.tablestoreInts.`1`
import typings.tablestore.tablestoreInts.`2`
import typings.tablestore.tablestoreInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AND extends StObject {
  
  var AND: `2`
  
  var NOT: `1`
  
  var OR: `3`
}
object AND {
  
  inline def apply(): AND = {
    val __obj = js.Dynamic.literal(AND = 2, NOT = 1, OR = 3)
    __obj.asInstanceOf[AND]
  }
  
  extension [Self <: AND](x: Self) {
    
    inline def setAND(value: `2`): Self = StObject.set(x, "AND", value.asInstanceOf[js.Any])
    
    inline def setNOT(value: `1`): Self = StObject.set(x, "NOT", value.asInstanceOf[js.Any])
    
    inline def setOR(value: `3`): Self = StObject.set(x, "OR", value.asInstanceOf[js.Any])
  }
}
