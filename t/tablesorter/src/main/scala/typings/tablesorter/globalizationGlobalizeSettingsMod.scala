package typings.tablesorter

import typings.globalize.distGlobalizeMod.DateFormatterOptions
import typings.globalize.distGlobalizeMod.Globalize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalizationGlobalizeSettingsMod {
  
  trait GlobalizeSettings
    extends StObject
       with DateFormatterOptions {
    
    /**
      * The `Globalize`-object to use for localization.
      */
    var Globalize: typings.globalize.distGlobalizeMod.Globalize
    
    /**
      * The language to localize the dates to.
      */
    var lang: String
  }
  object GlobalizeSettings {
    
    inline def apply(Globalize: Globalize, lang: String): GlobalizeSettings = {
      val __obj = js.Dynamic.literal(Globalize = Globalize.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalizeSettings]
    }
    
    extension [Self <: GlobalizeSettings](x: Self) {
      
      inline def setGlobalize(value: Globalize): Self = StObject.set(x, "Globalize", value.asInstanceOf[js.Any])
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    }
  }
}
