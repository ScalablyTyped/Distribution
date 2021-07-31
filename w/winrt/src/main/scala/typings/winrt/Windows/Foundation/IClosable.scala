package typings.winrt.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClosable extends StObject {
  
  def close(): Unit
}
object IClosable {
  
  @scala.inline
  def apply(close: () => Unit): IClosable = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
    __obj.asInstanceOf[IClosable]
  }
  
  @scala.inline
  implicit class IClosableMutableBuilder[Self <: IClosable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
  }
}
