package typings.xterm.mod

import typings.std.DocumentFragment
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBufferElementProvider extends StObject {
  
  /**
    * Provides a document fragment or HTMLElement containing the buffer elements.
    */
  def provideBufferElements(): DocumentFragment | HTMLElement
}
object IBufferElementProvider {
  
  inline def apply(provideBufferElements: () => DocumentFragment | HTMLElement): IBufferElementProvider = {
    val __obj = js.Dynamic.literal(provideBufferElements = js.Any.fromFunction0(provideBufferElements))
    __obj.asInstanceOf[IBufferElementProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBufferElementProvider] (val x: Self) extends AnyVal {
    
    inline def setProvideBufferElements(value: () => DocumentFragment | HTMLElement): Self = StObject.set(x, "provideBufferElements", js.Any.fromFunction0(value))
  }
}
