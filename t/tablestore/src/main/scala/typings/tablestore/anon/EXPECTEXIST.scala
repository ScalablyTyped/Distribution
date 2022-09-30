package typings.tablestore.anon

import typings.tablestore.tablestoreInts.`0`
import typings.tablestore.tablestoreInts.`1`
import typings.tablestore.tablestoreInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EXPECTEXIST extends StObject {
  
  var EXPECT_EXIST: `1`
  
  var EXPECT_NOT_EXIST: `2`
  
  var IGNORE: `0`
}
object EXPECTEXIST {
  
  inline def apply(): EXPECTEXIST = {
    val __obj = js.Dynamic.literal(EXPECT_EXIST = 1, EXPECT_NOT_EXIST = 2, IGNORE = 0)
    __obj.asInstanceOf[EXPECTEXIST]
  }
  
  extension [Self <: EXPECTEXIST](x: Self) {
    
    inline def setEXPECT_EXIST(value: `1`): Self = StObject.set(x, "EXPECT_EXIST", value.asInstanceOf[js.Any])
    
    inline def setEXPECT_NOT_EXIST(value: `2`): Self = StObject.set(x, "EXPECT_NOT_EXIST", value.asInstanceOf[js.Any])
    
    inline def setIGNORE(value: `0`): Self = StObject.set(x, "IGNORE", value.asInstanceOf[js.Any])
  }
}
