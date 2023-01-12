package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Read extends StObject {
  
  var read: Any
}
object Read {
  
  inline def apply(read: Any): Read = {
    val __obj = js.Dynamic.literal(read = read.asInstanceOf[js.Any])
    __obj.asInstanceOf[Read]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Read] (val x: Self) extends AnyVal {
    
    inline def setRead(value: Any): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
  }
}
