package typings.tablestore.anon

import typings.tablestore.tablestoreInts.`0`
import typings.tablestore.tablestoreInts.`1`
import typings.tablestore.tablestoreInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SORTMODEAVG extends StObject {
  
  var SORT_MODE_AVG: `2`
  
  var SORT_MODE_MAX: `1`
  
  var SORT_MODE_MIN: `0`
}
object SORTMODEAVG {
  
  inline def apply(): SORTMODEAVG = {
    val __obj = js.Dynamic.literal(SORT_MODE_AVG = 2, SORT_MODE_MAX = 1, SORT_MODE_MIN = 0)
    __obj.asInstanceOf[SORTMODEAVG]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SORTMODEAVG] (val x: Self) extends AnyVal {
    
    inline def setSORT_MODE_AVG(value: `2`): Self = StObject.set(x, "SORT_MODE_AVG", value.asInstanceOf[js.Any])
    
    inline def setSORT_MODE_MAX(value: `1`): Self = StObject.set(x, "SORT_MODE_MAX", value.asInstanceOf[js.Any])
    
    inline def setSORT_MODE_MIN(value: `0`): Self = StObject.set(x, "SORT_MODE_MIN", value.asInstanceOf[js.Any])
  }
}
