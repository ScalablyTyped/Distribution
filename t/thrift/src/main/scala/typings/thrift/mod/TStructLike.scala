package typings.thrift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TStructLike extends StObject {
  
  def read(input: TProtocol): Unit
  
  def write(output: TProtocol): Unit
}
object TStructLike {
  
  inline def apply(read: TProtocol => Unit, write: TProtocol => Unit): TStructLike = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[TStructLike]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TStructLike] (val x: Self) extends AnyVal {
    
    inline def setRead(value: TProtocol => Unit): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    
    inline def setWrite(value: TProtocol => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
  }
}
