package typings.wdioTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Write extends StObject {
  
  def write(content: Any): Boolean
}
object Write {
  
  inline def apply(write: Any => Boolean): Write = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[Write]
  }
  
  extension [Self <: Write](x: Self) {
    
    inline def setWrite(value: Any => Boolean): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
  }
}
