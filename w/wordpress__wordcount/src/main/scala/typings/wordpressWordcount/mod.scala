package typings.wordpressWordcount

import typings.std.RegExp
import typings.wordpressWordcount.anon.PartialSettings
import typings.wordpressWordcount.anon.Shortcodes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/wordcount", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def count(text: String, `type`: CountType): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("count")(text.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def count(text: String, `type`: CountType, userSettings: PartialSettings): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("count")(text.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], userSettings.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wordpressWordcount.wordpressWordcountStrings.words
    - typings.wordpressWordcount.wordpressWordcountStrings.characters_excluding_spaces
    - typings.wordpressWordcount.wordpressWordcountStrings.characters_including_spaces
  */
  trait CountType extends StObject
  object CountType {
    
    @scala.inline
    def characters_excluding_spaces: typings.wordpressWordcount.wordpressWordcountStrings.characters_excluding_spaces = "characters_excluding_spaces".asInstanceOf[typings.wordpressWordcount.wordpressWordcountStrings.characters_excluding_spaces]
    
    @scala.inline
    def characters_including_spaces: typings.wordpressWordcount.wordpressWordcountStrings.characters_including_spaces = "characters_including_spaces".asInstanceOf[typings.wordpressWordcount.wordpressWordcountStrings.characters_including_spaces]
    
    @scala.inline
    def words: typings.wordpressWordcount.wordpressWordcountStrings.words = "words".asInstanceOf[typings.wordpressWordcount.wordpressWordcountStrings.words]
  }
  
  trait Settings extends StObject {
    
    var HTMLEntityRegExp: RegExp
    
    var HTMLRegExp: RegExp
    
    var HTMLcommentRegExp: RegExp
    
    var astralRegExp: RegExp
    
    var characters_excluding_spacesRegExp: RegExp
    
    var characters_including_spacesRegExp: RegExp
    
    var connectorRegExp: RegExp
    
    var l10n: Shortcodes
    
    /** Characters to be removed from input text. */
    var removeRegExp: RegExp
    
    var spaceRegExp: RegExp
    
    var wordsRegExp: RegExp
  }
  object Settings {
    
    @scala.inline
    def apply(
      HTMLEntityRegExp: RegExp,
      HTMLRegExp: RegExp,
      HTMLcommentRegExp: RegExp,
      astralRegExp: RegExp,
      characters_excluding_spacesRegExp: RegExp,
      characters_including_spacesRegExp: RegExp,
      connectorRegExp: RegExp,
      l10n: Shortcodes,
      removeRegExp: RegExp,
      spaceRegExp: RegExp,
      wordsRegExp: RegExp
    ): Settings = {
      val __obj = js.Dynamic.literal(HTMLEntityRegExp = HTMLEntityRegExp.asInstanceOf[js.Any], HTMLRegExp = HTMLRegExp.asInstanceOf[js.Any], HTMLcommentRegExp = HTMLcommentRegExp.asInstanceOf[js.Any], astralRegExp = astralRegExp.asInstanceOf[js.Any], characters_excluding_spacesRegExp = characters_excluding_spacesRegExp.asInstanceOf[js.Any], characters_including_spacesRegExp = characters_including_spacesRegExp.asInstanceOf[js.Any], connectorRegExp = connectorRegExp.asInstanceOf[js.Any], l10n = l10n.asInstanceOf[js.Any], removeRegExp = removeRegExp.asInstanceOf[js.Any], spaceRegExp = spaceRegExp.asInstanceOf[js.Any], wordsRegExp = wordsRegExp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAstralRegExp(value: RegExp): Self = StObject.set(x, "astralRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacters_excluding_spacesRegExp(value: RegExp): Self = StObject.set(x, "characters_excluding_spacesRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacters_including_spacesRegExp(value: RegExp): Self = StObject.set(x, "characters_including_spacesRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectorRegExp(value: RegExp): Self = StObject.set(x, "connectorRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHTMLEntityRegExp(value: RegExp): Self = StObject.set(x, "HTMLEntityRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHTMLRegExp(value: RegExp): Self = StObject.set(x, "HTMLRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHTMLcommentRegExp(value: RegExp): Self = StObject.set(x, "HTMLcommentRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setL10n(value: Shortcodes): Self = StObject.set(x, "l10n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveRegExp(value: RegExp): Self = StObject.set(x, "removeRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceRegExp(value: RegExp): Self = StObject.set(x, "spaceRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordsRegExp(value: RegExp): Self = StObject.set(x, "wordsRegExp", value.asInstanceOf[js.Any])
    }
  }
}
