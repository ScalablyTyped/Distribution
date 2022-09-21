package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashableObject extends StObject {
  
  def updateHash(arg0: Hash): Unit
}
object HashableObject {
  
  inline def apply(updateHash: Hash => Unit): HashableObject = {
    val __obj = js.Dynamic.literal(updateHash = js.Any.fromFunction1(updateHash))
    __obj.asInstanceOf[HashableObject]
  }
  
  extension [Self <: HashableObject](x: Self) {
    
    inline def setUpdateHash(value: Hash => Unit): Self = StObject.set(x, "updateHash", js.Any.fromFunction1(value))
  }
}
