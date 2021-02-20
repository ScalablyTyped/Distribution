package typings.wordpressWordcount

import typings.std.RegExp
import typings.wordpressWordcount.mod.CountType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@wordpress/wordcount.@wordpress/wordcount.Settings> */
  @js.native
  trait PartialSettings extends StObject {
    
    var HTMLEntityRegExp: js.UndefOr[RegExp] = js.native
    
    var HTMLRegExp: js.UndefOr[RegExp] = js.native
    
    var HTMLcommentRegExp: js.UndefOr[RegExp] = js.native
    
    var astralRegExp: js.UndefOr[RegExp] = js.native
    
    var characters_excluding_spacesRegExp: js.UndefOr[RegExp] = js.native
    
    var characters_including_spacesRegExp: js.UndefOr[RegExp] = js.native
    
    var connectorRegExp: js.UndefOr[RegExp] = js.native
    
    var l10n: js.UndefOr[Shortcodes] = js.native
    
    var removeRegExp: js.UndefOr[RegExp] = js.native
    
    var spaceRegExp: js.UndefOr[RegExp] = js.native
    
    var wordsRegExp: js.UndefOr[RegExp] = js.native
  }
  object PartialSettings {
    
    @scala.inline
    def apply(): PartialSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSettings]
    }
    
    @scala.inline
    implicit class PartialSettingsMutableBuilder[Self <: PartialSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAstralRegExp(value: RegExp): Self = StObject.set(x, "astralRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAstralRegExpUndefined: Self = StObject.set(x, "astralRegExp", js.undefined)
      
      @scala.inline
      def setCharacters_excluding_spacesRegExp(value: RegExp): Self = StObject.set(x, "characters_excluding_spacesRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacters_excluding_spacesRegExpUndefined: Self = StObject.set(x, "characters_excluding_spacesRegExp", js.undefined)
      
      @scala.inline
      def setCharacters_including_spacesRegExp(value: RegExp): Self = StObject.set(x, "characters_including_spacesRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacters_including_spacesRegExpUndefined: Self = StObject.set(x, "characters_including_spacesRegExp", js.undefined)
      
      @scala.inline
      def setConnectorRegExp(value: RegExp): Self = StObject.set(x, "connectorRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectorRegExpUndefined: Self = StObject.set(x, "connectorRegExp", js.undefined)
      
      @scala.inline
      def setHTMLEntityRegExp(value: RegExp): Self = StObject.set(x, "HTMLEntityRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHTMLEntityRegExpUndefined: Self = StObject.set(x, "HTMLEntityRegExp", js.undefined)
      
      @scala.inline
      def setHTMLRegExp(value: RegExp): Self = StObject.set(x, "HTMLRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHTMLRegExpUndefined: Self = StObject.set(x, "HTMLRegExp", js.undefined)
      
      @scala.inline
      def setHTMLcommentRegExp(value: RegExp): Self = StObject.set(x, "HTMLcommentRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHTMLcommentRegExpUndefined: Self = StObject.set(x, "HTMLcommentRegExp", js.undefined)
      
      @scala.inline
      def setL10n(value: Shortcodes): Self = StObject.set(x, "l10n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setL10nUndefined: Self = StObject.set(x, "l10n", js.undefined)
      
      @scala.inline
      def setRemoveRegExp(value: RegExp): Self = StObject.set(x, "removeRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveRegExpUndefined: Self = StObject.set(x, "removeRegExp", js.undefined)
      
      @scala.inline
      def setSpaceRegExp(value: RegExp): Self = StObject.set(x, "spaceRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceRegExpUndefined: Self = StObject.set(x, "spaceRegExp", js.undefined)
      
      @scala.inline
      def setWordsRegExp(value: RegExp): Self = StObject.set(x, "wordsRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordsRegExpUndefined: Self = StObject.set(x, "wordsRegExp", js.undefined)
    }
  }
  
  @js.native
  trait Shortcodes extends StObject {
    
    /** Array of known shortcode names */
    var shortcodes: js.UndefOr[js.Array[String]] = js.native
    
    var `type`: js.UndefOr[CountType] = js.native
  }
  object Shortcodes {
    
    @scala.inline
    def apply(): Shortcodes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Shortcodes]
    }
    
    @scala.inline
    implicit class ShortcodesMutableBuilder[Self <: Shortcodes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShortcodes(value: js.Array[String]): Self = StObject.set(x, "shortcodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortcodesUndefined: Self = StObject.set(x, "shortcodes", js.undefined)
      
      @scala.inline
      def setShortcodesVarargs(value: String*): Self = StObject.set(x, "shortcodes", js.Array(value :_*))
      
      @scala.inline
      def setType(value: CountType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
