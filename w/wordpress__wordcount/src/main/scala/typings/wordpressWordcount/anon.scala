package typings.wordpressWordcount

import typings.wordpressWordcount.mod.CountType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@wordpress/wordcount.@wordpress/wordcount.Settings> */
  trait PartialSettings extends StObject {
    
    var HTMLEntityRegExp: js.UndefOr[js.RegExp] = js.undefined
    
    var HTMLRegExp: js.UndefOr[js.RegExp] = js.undefined
    
    var HTMLcommentRegExp: js.UndefOr[js.RegExp] = js.undefined
    
    var astralRegExp: js.UndefOr[js.RegExp] = js.undefined
    
    var characters_excluding_spacesRegExp: js.UndefOr[js.RegExp] = js.undefined
    
    var characters_including_spacesRegExp: js.UndefOr[js.RegExp] = js.undefined
    
    var connectorRegExp: js.UndefOr[js.RegExp] = js.undefined
    
    var l10n: js.UndefOr[Shortcodes] = js.undefined
    
    var removeRegExp: js.UndefOr[js.RegExp] = js.undefined
    
    var spaceRegExp: js.UndefOr[js.RegExp] = js.undefined
    
    var wordsRegExp: js.UndefOr[js.RegExp] = js.undefined
  }
  object PartialSettings {
    
    inline def apply(): PartialSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialSettings] (val x: Self) extends AnyVal {
      
      inline def setAstralRegExp(value: js.RegExp): Self = StObject.set(x, "astralRegExp", value.asInstanceOf[js.Any])
      
      inline def setAstralRegExpUndefined: Self = StObject.set(x, "astralRegExp", js.undefined)
      
      inline def setCharacters_excluding_spacesRegExp(value: js.RegExp): Self = StObject.set(x, "characters_excluding_spacesRegExp", value.asInstanceOf[js.Any])
      
      inline def setCharacters_excluding_spacesRegExpUndefined: Self = StObject.set(x, "characters_excluding_spacesRegExp", js.undefined)
      
      inline def setCharacters_including_spacesRegExp(value: js.RegExp): Self = StObject.set(x, "characters_including_spacesRegExp", value.asInstanceOf[js.Any])
      
      inline def setCharacters_including_spacesRegExpUndefined: Self = StObject.set(x, "characters_including_spacesRegExp", js.undefined)
      
      inline def setConnectorRegExp(value: js.RegExp): Self = StObject.set(x, "connectorRegExp", value.asInstanceOf[js.Any])
      
      inline def setConnectorRegExpUndefined: Self = StObject.set(x, "connectorRegExp", js.undefined)
      
      inline def setHTMLEntityRegExp(value: js.RegExp): Self = StObject.set(x, "HTMLEntityRegExp", value.asInstanceOf[js.Any])
      
      inline def setHTMLEntityRegExpUndefined: Self = StObject.set(x, "HTMLEntityRegExp", js.undefined)
      
      inline def setHTMLRegExp(value: js.RegExp): Self = StObject.set(x, "HTMLRegExp", value.asInstanceOf[js.Any])
      
      inline def setHTMLRegExpUndefined: Self = StObject.set(x, "HTMLRegExp", js.undefined)
      
      inline def setHTMLcommentRegExp(value: js.RegExp): Self = StObject.set(x, "HTMLcommentRegExp", value.asInstanceOf[js.Any])
      
      inline def setHTMLcommentRegExpUndefined: Self = StObject.set(x, "HTMLcommentRegExp", js.undefined)
      
      inline def setL10n(value: Shortcodes): Self = StObject.set(x, "l10n", value.asInstanceOf[js.Any])
      
      inline def setL10nUndefined: Self = StObject.set(x, "l10n", js.undefined)
      
      inline def setRemoveRegExp(value: js.RegExp): Self = StObject.set(x, "removeRegExp", value.asInstanceOf[js.Any])
      
      inline def setRemoveRegExpUndefined: Self = StObject.set(x, "removeRegExp", js.undefined)
      
      inline def setSpaceRegExp(value: js.RegExp): Self = StObject.set(x, "spaceRegExp", value.asInstanceOf[js.Any])
      
      inline def setSpaceRegExpUndefined: Self = StObject.set(x, "spaceRegExp", js.undefined)
      
      inline def setWordsRegExp(value: js.RegExp): Self = StObject.set(x, "wordsRegExp", value.asInstanceOf[js.Any])
      
      inline def setWordsRegExpUndefined: Self = StObject.set(x, "wordsRegExp", js.undefined)
    }
  }
  
  trait Shortcodes extends StObject {
    
    /** Array of known shortcode names */
    var shortcodes: js.UndefOr[js.Array[String]] = js.undefined
    
    var `type`: js.UndefOr[CountType] = js.undefined
  }
  object Shortcodes {
    
    inline def apply(): Shortcodes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Shortcodes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Shortcodes] (val x: Self) extends AnyVal {
      
      inline def setShortcodes(value: js.Array[String]): Self = StObject.set(x, "shortcodes", value.asInstanceOf[js.Any])
      
      inline def setShortcodesUndefined: Self = StObject.set(x, "shortcodes", js.undefined)
      
      inline def setShortcodesVarargs(value: String*): Self = StObject.set(x, "shortcodes", js.Array(value*))
      
      inline def setType(value: CountType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
