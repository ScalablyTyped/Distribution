package typings.winrt.Windows.Storage.Streams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBufferFactory extends StObject {
  
  def create(capacity: Double): Buffer
}
object IBufferFactory {
  
  inline def apply(create: Double => Buffer): IBufferFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[IBufferFactory]
  }
  
  extension [Self <: IBufferFactory](x: Self) {
    
    inline def setCreate(value: Double => Buffer): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
