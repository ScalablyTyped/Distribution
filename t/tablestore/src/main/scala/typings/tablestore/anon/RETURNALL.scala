package typings.tablestore.anon

import typings.tablestore.tablestoreInts.`1`
import typings.tablestore.tablestoreInts.`2`
import typings.tablestore.tablestoreInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RETURNALL extends StObject {
  
  var RETURN_ALL: `1`
  
  var RETURN_NONE: `3`
  
  var RETURN_SPECIFIED: `2`
}
object RETURNALL {
  
  inline def apply(): RETURNALL = {
    val __obj = js.Dynamic.literal(RETURN_ALL = 1, RETURN_NONE = 3, RETURN_SPECIFIED = 2)
    __obj.asInstanceOf[RETURNALL]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RETURNALL] (val x: Self) extends AnyVal {
    
    inline def setRETURN_ALL(value: `1`): Self = StObject.set(x, "RETURN_ALL", value.asInstanceOf[js.Any])
    
    inline def setRETURN_NONE(value: `3`): Self = StObject.set(x, "RETURN_NONE", value.asInstanceOf[js.Any])
    
    inline def setRETURN_SPECIFIED(value: `2`): Self = StObject.set(x, "RETURN_SPECIFIED", value.asInstanceOf[js.Any])
  }
}
