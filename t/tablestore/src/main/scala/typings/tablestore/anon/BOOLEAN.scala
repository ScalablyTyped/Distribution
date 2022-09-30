package typings.tablestore.anon

import typings.tablestore.tablestoreInts.`1`
import typings.tablestore.tablestoreInts.`2`
import typings.tablestore.tablestoreInts.`3`
import typings.tablestore.tablestoreInts.`4`
import typings.tablestore.tablestoreInts.`5`
import typings.tablestore.tablestoreInts.`6`
import typings.tablestore.tablestoreInts.`7`
import typings.tablestore.tablestoreInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BOOLEAN extends StObject {
  
  var BOOLEAN: `3`
  
  var DATE: `8`
  
  var DOUBLE: `2`
  
  var GEO_POINT: `7`
  
  var KEYWORD: `4`
  
  var LONG: `1`
  
  var NESTED: `6`
  
  var TEXT: `5`
}
object BOOLEAN {
  
  inline def apply(): BOOLEAN = {
    val __obj = js.Dynamic.literal(BOOLEAN = 3, DATE = 8, DOUBLE = 2, GEO_POINT = 7, KEYWORD = 4, LONG = 1, NESTED = 6, TEXT = 5)
    __obj.asInstanceOf[BOOLEAN]
  }
  
  extension [Self <: BOOLEAN](x: Self) {
    
    inline def setBOOLEAN(value: `3`): Self = StObject.set(x, "BOOLEAN", value.asInstanceOf[js.Any])
    
    inline def setDATE(value: `8`): Self = StObject.set(x, "DATE", value.asInstanceOf[js.Any])
    
    inline def setDOUBLE(value: `2`): Self = StObject.set(x, "DOUBLE", value.asInstanceOf[js.Any])
    
    inline def setGEO_POINT(value: `7`): Self = StObject.set(x, "GEO_POINT", value.asInstanceOf[js.Any])
    
    inline def setKEYWORD(value: `4`): Self = StObject.set(x, "KEYWORD", value.asInstanceOf[js.Any])
    
    inline def setLONG(value: `1`): Self = StObject.set(x, "LONG", value.asInstanceOf[js.Any])
    
    inline def setNESTED(value: `6`): Self = StObject.set(x, "NESTED", value.asInstanceOf[js.Any])
    
    inline def setTEXT(value: `5`): Self = StObject.set(x, "TEXT", value.asInstanceOf[js.Any])
  }
}
