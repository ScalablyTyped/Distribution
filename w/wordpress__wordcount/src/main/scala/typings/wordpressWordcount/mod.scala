package typings.wordpressWordcount

import typings.wordpressWordcount.anon.PartialSettings
import typings.wordpressWordcount.anon.Shortcodes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/wordcount", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def count(text: String, `type`: CountType): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("count")(text.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def count(text: String, `type`: CountType, userSettings: PartialSettings): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("count")(text.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], userSettings.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wordpressWordcount.wordpressWordcountStrings.words
    - typings.wordpressWordcount.wordpressWordcountStrings.characters_excluding_spaces
    - typings.wordpressWordcount.wordpressWordcountStrings.characters_including_spaces
  */
  trait CountType extends StObject
  object CountType {
    
    inline def characters_excluding_spaces: typings.wordpressWordcount.wordpressWordcountStrings.characters_excluding_spaces = "characters_excluding_spaces".asInstanceOf[typings.wordpressWordcount.wordpressWordcountStrings.characters_excluding_spaces]
    
    inline def characters_including_spaces: typings.wordpressWordcount.wordpressWordcountStrings.characters_including_spaces = "characters_including_spaces".asInstanceOf[typings.wordpressWordcount.wordpressWordcountStrings.characters_including_spaces]
    
    inline def words: typings.wordpressWordcount.wordpressWordcountStrings.words = "words".asInstanceOf[typings.wordpressWordcount.wordpressWordcountStrings.words]
  }
  
  trait Settings extends StObject {
    
    var HTMLEntityRegExp: js.RegExp
    
    var HTMLRegExp: js.RegExp
    
    var HTMLcommentRegExp: js.RegExp
    
    var astralRegExp: js.RegExp
    
    var characters_excluding_spacesRegExp: js.RegExp
    
    var characters_including_spacesRegExp: js.RegExp
    
    var connectorRegExp: js.RegExp
    
    var l10n: Shortcodes
    
    /** Characters to be removed from input text. */
    var removeRegExp: js.RegExp
    
    var spaceRegExp: js.RegExp
    
    var wordsRegExp: js.RegExp
  }
  object Settings {
    
    inline def apply(
      HTMLEntityRegExp: js.RegExp,
      HTMLRegExp: js.RegExp,
      HTMLcommentRegExp: js.RegExp,
      astralRegExp: js.RegExp,
      characters_excluding_spacesRegExp: js.RegExp,
      characters_including_spacesRegExp: js.RegExp,
      connectorRegExp: js.RegExp,
      l10n: Shortcodes,
      removeRegExp: js.RegExp,
      spaceRegExp: js.RegExp,
      wordsRegExp: js.RegExp
    ): Settings = {
      val __obj = js.Dynamic.literal(HTMLEntityRegExp = HTMLEntityRegExp.asInstanceOf[js.Any], HTMLRegExp = HTMLRegExp.asInstanceOf[js.Any], HTMLcommentRegExp = HTMLcommentRegExp.asInstanceOf[js.Any], astralRegExp = astralRegExp.asInstanceOf[js.Any], characters_excluding_spacesRegExp = characters_excluding_spacesRegExp.asInstanceOf[js.Any], characters_including_spacesRegExp = characters_including_spacesRegExp.asInstanceOf[js.Any], connectorRegExp = connectorRegExp.asInstanceOf[js.Any], l10n = l10n.asInstanceOf[js.Any], removeRegExp = removeRegExp.asInstanceOf[js.Any], spaceRegExp = spaceRegExp.asInstanceOf[js.Any], wordsRegExp = wordsRegExp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Settings]
    }
    
    extension [Self <: Settings](x: Self) {
      
      inline def setAstralRegExp(value: js.RegExp): Self = StObject.set(x, "astralRegExp", value.asInstanceOf[js.Any])
      
      inline def setCharacters_excluding_spacesRegExp(value: js.RegExp): Self = StObject.set(x, "characters_excluding_spacesRegExp", value.asInstanceOf[js.Any])
      
      inline def setCharacters_including_spacesRegExp(value: js.RegExp): Self = StObject.set(x, "characters_including_spacesRegExp", value.asInstanceOf[js.Any])
      
      inline def setConnectorRegExp(value: js.RegExp): Self = StObject.set(x, "connectorRegExp", value.asInstanceOf[js.Any])
      
      inline def setHTMLEntityRegExp(value: js.RegExp): Self = StObject.set(x, "HTMLEntityRegExp", value.asInstanceOf[js.Any])
      
      inline def setHTMLRegExp(value: js.RegExp): Self = StObject.set(x, "HTMLRegExp", value.asInstanceOf[js.Any])
      
      inline def setHTMLcommentRegExp(value: js.RegExp): Self = StObject.set(x, "HTMLcommentRegExp", value.asInstanceOf[js.Any])
      
      inline def setL10n(value: Shortcodes): Self = StObject.set(x, "l10n", value.asInstanceOf[js.Any])
      
      inline def setRemoveRegExp(value: js.RegExp): Self = StObject.set(x, "removeRegExp", value.asInstanceOf[js.Any])
      
      inline def setSpaceRegExp(value: js.RegExp): Self = StObject.set(x, "spaceRegExp", value.asInstanceOf[js.Any])
      
      inline def setWordsRegExp(value: js.RegExp): Self = StObject.set(x, "wordsRegExp", value.asInstanceOf[js.Any])
    }
  }
}
