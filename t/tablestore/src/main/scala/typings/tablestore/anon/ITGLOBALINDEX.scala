package typings.tablestore.anon

import typings.tablestore.tablestoreInts.`0`
import typings.tablestore.tablestoreInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITGLOBALINDEX extends StObject {
  
  var IT_GLOBAL_INDEX: `0`
  
  var IT_LOCAL_INDEX: `1`
}
object ITGLOBALINDEX {
  
  inline def apply(): ITGLOBALINDEX = {
    val __obj = js.Dynamic.literal(IT_GLOBAL_INDEX = 0, IT_LOCAL_INDEX = 1)
    __obj.asInstanceOf[ITGLOBALINDEX]
  }
  
  extension [Self <: ITGLOBALINDEX](x: Self) {
    
    inline def setIT_GLOBAL_INDEX(value: `0`): Self = StObject.set(x, "IT_GLOBAL_INDEX", value.asInstanceOf[js.Any])
    
    inline def setIT_LOCAL_INDEX(value: `1`): Self = StObject.set(x, "IT_LOCAL_INDEX", value.asInstanceOf[js.Any])
  }
}
