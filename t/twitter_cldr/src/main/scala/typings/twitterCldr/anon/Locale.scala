package typings.twitterCldr.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Locale extends StObject {
  
  def locale(): String
}
object Locale {
  
  inline def apply(locale: () => String): Locale = {
    val __obj = js.Dynamic.literal(locale = js.Any.fromFunction0(locale))
    __obj.asInstanceOf[Locale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
    
    inline def setLocale(value: () => String): Self = StObject.set(x, "locale", js.Any.fromFunction0(value))
  }
}
