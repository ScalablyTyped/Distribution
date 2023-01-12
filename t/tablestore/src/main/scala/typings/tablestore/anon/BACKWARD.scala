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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BACKWARD] (val x: Self) extends AnyVal {
    
    inline def setBACKWARD(value: typings.tablestore.tablestoreStrings.BACKWARD): Self = StObject.set(x, "BACKWARD", value.asInstanceOf[js.Any])
    
    inline def setFORWARD(value: FORWARD): Self = StObject.set(x, "FORWARD", value.asInstanceOf[js.Any])
  }
}
