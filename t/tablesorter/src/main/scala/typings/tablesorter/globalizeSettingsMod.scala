package typings.tablesorter

import typings.globalize.globalizeMod.DateFormatterOptions
import typings.globalize.globalizeMod.Globalize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalizeSettingsMod {
  
  @js.native
  trait GlobalizeSettings extends DateFormatterOptions {
    
    /**
      * The `Globalize`-object to use for localization.
      */
    var Globalize: typings.globalize.globalizeMod.Globalize = js.native
    
    /**
      * The language to localize the dates to.
      */
    var lang: String = js.native
  }
  object GlobalizeSettings {
    
    @scala.inline
    def apply(Globalize: Globalize, lang: String): GlobalizeSettings = {
      val __obj = js.Dynamic.literal(Globalize = Globalize.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalizeSettings]
    }
    
    @scala.inline
    implicit class GlobalizeSettingsMutableBuilder[Self <: GlobalizeSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobalize(value: Globalize): Self = StObject.set(x, "Globalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    }
  }
}
