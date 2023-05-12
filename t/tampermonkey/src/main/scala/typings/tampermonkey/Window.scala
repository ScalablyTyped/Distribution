package typings.tampermonkey

import typings.tampermonkey.anon.Url
import typings.tampermonkey.tampermonkeyStrings.urlchange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Patched onurlchange attribute based on document {@link https://www.tampermonkey.net/documentation.php#meta:grant}
  * @url https://www.tampermonkey.net/documentation.php#meta:grant
  */
trait Window extends StObject {
  
  @JSName("addEventListener")
  def addEventListener_urlchange(`type`: urlchange, listener: js.Function1[/* urlObject */ Url, Unit]): Unit
  
  /**
    * check before use addEventListener
    *
    * According to the documentation and code, the value can currently only be of type null
    * @url https://www.tampermonkey.net/documentation.php#meta:grant
    * @example
    * if (window.onurlchange === null) {
    *   window.addEventListener('urlchange', (info) => console.log(info));
    * }
    */
  var onurlchange: Null
}
object Window {
  
  inline def apply(addEventListener: (urlchange, js.Function1[/* urlObject */ Url, Unit]) => Unit, onurlchange: Null): Window = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), onurlchange = onurlchange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    inline def setAddEventListener(value: (urlchange, js.Function1[/* urlObject */ Url, Unit]) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    
    inline def setOnurlchange(value: Null): Self = StObject.set(x, "onurlchange", value.asInstanceOf[js.Any])
  }
}
