package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Write extends StObject {
  
  var write: Any
}
object Write {
  
  inline def apply(write: Any): Write = {
    val __obj = js.Dynamic.literal(write = write.asInstanceOf[js.Any])
    __obj.asInstanceOf[Write]
  }
  
  extension [Self <: Write](x: Self) {
    
    inline def setWrite(value: Any): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
  }
}
