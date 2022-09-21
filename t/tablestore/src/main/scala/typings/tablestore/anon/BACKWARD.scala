package typings.tablestore.anon

import typings.tablestore.tablestoreStrings.FORWARD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BACKWARD extends StObject {
  
  var BACKWARD: typings.tablestore.tablestoreStrings.BACKWARD
  
  var FORWARD: typings.tablestore.tablestoreStrings.FORWARD
}
object BACKWARD {
  
  inline def apply(): BACKWARD = {
    val __obj = js.Dynamic.literal(BACKWARD = "BACKWARD", FORWARD = "FORWARD")
    __obj.asInstanceOf[BACKWARD]
  }
  
  extension [Self <: BACKWARD](x: Self) {
    
    inline def setBACKWARD(value: typings.tablestore.tablestoreStrings.BACKWARD): Self = StObject.set(x, "BACKWARD", value.asInstanceOf[js.Any])
    
    inline def setFORWARD(value: FORWARD): Self = StObject.set(x, "FORWARD", value.asInstanceOf[js.Any])
  }
}
