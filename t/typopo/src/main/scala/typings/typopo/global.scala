package typings.typopo

import typings.typopo.mod.Configuration
import typings.typopo.mod.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object typopo {
    
    @JSGlobal("typopo")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fixTypos(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fixTypos")(string.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def fixTypos(string: String, locale: Unit, configuration: Configuration): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fixTypos")(string.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def fixTypos(string: String, locale: Locale): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fixTypos")(string.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def fixTypos(string: String, locale: Locale, configuration: Configuration): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fixTypos")(string.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
