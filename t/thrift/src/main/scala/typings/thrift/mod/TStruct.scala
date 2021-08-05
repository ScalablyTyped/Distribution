package typings.thrift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TStruct extends StObject {
  
  var fname: String
}
object TStruct {
  
  inline def apply(fname: String): TStruct = {
    val __obj = js.Dynamic.literal(fname = fname.asInstanceOf[js.Any])
    __obj.asInstanceOf[TStruct]
  }
  
  extension [Self <: TStruct](x: Self) {
    
    inline def setFname(value: String): Self = StObject.set(x, "fname", value.asInstanceOf[js.Any])
  }
}
