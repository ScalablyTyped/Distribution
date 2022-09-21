package typings.systemLocale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Get the [locale](https://en.wikipedia.org/wiki/Locale_(computer_software)) from your operating system.
    * Support macOS, Linux & Windows.
    *
    * @example
    * import locale = require('system-locale');
    *
    * locale().then(console.log);
    * // => 'en_DE'
    */
  inline def apply(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[String]]
  
  @JSImport("system-locale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get the [locale](https://en.wikipedia.org/wiki/Locale_(computer_software)) from your operating system.
    * Support macOS, Linux & Windows.
    *
    * @example
    * import locale = require('system-locale');
    *
    * console.log(locale.sync());
    * // => 'en_DE'
    */
  inline def sync(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")().asInstanceOf[String]
}
