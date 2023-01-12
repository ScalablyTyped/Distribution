package typings.tablestore.anon

import typings.tablestore.tablestoreInts.`1`
import typings.tablestore.tablestoreInts.`2`
import typings.tablestore.tablestoreInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BINARY extends StObject {
  
  var BINARY: `3`
  
  var INTEGER: `1`
  
  var STRING: `2`
}
object BINARY {
  
  inline def apply(): BINARY = {
    val __obj = js.Dynamic.literal(BINARY = 3, INTEGER = 1, STRING = 2)
    __obj.asInstanceOf[BINARY]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BINARY] (val x: Self) extends AnyVal {
    
    inline def setBINARY(value: `3`): Self = StObject.set(x, "BINARY", value.asInstanceOf[js.Any])
    
    inline def setINTEGER(value: `1`): Self = StObject.set(x, "INTEGER", value.asInstanceOf[js.Any])
    
    inline def setSTRING(value: `2`): Self = StObject.set(x, "STRING", value.asInstanceOf[js.Any])
  }
}
