package typings.winrt.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUriEscapeStatics extends StObject {
  
  def escapeComponent(toEscape: String): String
  
  def unescapeComponent(toUnescape: String): String
}
object IUriEscapeStatics {
  
  inline def apply(escapeComponent: String => String, unescapeComponent: String => String): IUriEscapeStatics = {
    val __obj = js.Dynamic.literal(escapeComponent = js.Any.fromFunction1(escapeComponent), unescapeComponent = js.Any.fromFunction1(unescapeComponent))
    __obj.asInstanceOf[IUriEscapeStatics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IUriEscapeStatics] (val x: Self) extends AnyVal {
    
    inline def setEscapeComponent(value: String => String): Self = StObject.set(x, "escapeComponent", js.Any.fromFunction1(value))
    
    inline def setUnescapeComponent(value: String => String): Self = StObject.set(x, "unescapeComponent", js.Any.fromFunction1(value))
  }
}
