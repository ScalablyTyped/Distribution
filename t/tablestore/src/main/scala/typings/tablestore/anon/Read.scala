package typings.tablestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Read extends StObject {
  
  var read: Double
  
  var write: Double
}
object Read {
  
  inline def apply(read: Double, write: Double): Read = {
    val __obj = js.Dynamic.literal(read = read.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
    __obj.asInstanceOf[Read]
  }
  
  extension [Self <: Read](x: Self) {
    
    inline def setRead(value: Double): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setWrite(value: Double): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
  }
}
