package typings.writeGood

import org.scalablytyped.runtime.StringDictionary
import typings.writeGood.anon.Explanation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns a list of violations in the supplied `text`.
    */
  inline def apply(text: String): js.Array[Problem] = ^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[Problem]]
  inline def apply(text: String, options: Options): js.Array[Problem] = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Problem]]
  
  @JSImport("write-good", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type CustomChecks = StringDictionary[Explanation]
  
  trait DefaultChecks extends StObject {
    
    /** Checks for adverbs that can weaken meaning: really, very, extremely, etc. Enabled by default */
    var adverb: js.UndefOr[Boolean] = js.undefined
    
    /** Checks for common cliches. Enabled by default */
    var cliches: js.UndefOr[Boolean] = js.undefined
    
    /** Checks for {@link https://en.wikipedia.org/wiki/E-Prime|"to-be"} verbs. **Disabled** by default */
    var eprime: js.UndefOr[Boolean] = js.undefined
    
    /** Checks for lexical illusions – cases where a word is repeated. Enabled by default */
    var illusion: js.UndefOr[Boolean] = js.undefined
    
    /** Checks for passive voice. Enabled by default */
    var passive: js.UndefOr[Boolean] = js.undefined
    
    /** Checks for so at the beginning of the sentence. Enabled by default */
    var so: js.UndefOr[Boolean] = js.undefined
    
    /** Checks for there is or there are at the beginning of the sentence. Enabled by default */
    var thereIs: js.UndefOr[Boolean] = js.undefined
    
    /** Checks for wordy phrases and unnecessary words.. Enabled by default */
    var tooWordy: js.UndefOr[Boolean] = js.undefined
    
    /** Checks for "weasel words." Enabled by default */
    var weasel: js.UndefOr[Boolean] = js.undefined
  }
  object DefaultChecks {
    
    inline def apply(): DefaultChecks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultChecks]
    }
    
    extension [Self <: DefaultChecks](x: Self) {
      
      inline def setAdverb(value: Boolean): Self = StObject.set(x, "adverb", value.asInstanceOf[js.Any])
      
      inline def setAdverbUndefined: Self = StObject.set(x, "adverb", js.undefined)
      
      inline def setCliches(value: Boolean): Self = StObject.set(x, "cliches", value.asInstanceOf[js.Any])
      
      inline def setClichesUndefined: Self = StObject.set(x, "cliches", js.undefined)
      
      inline def setEprime(value: Boolean): Self = StObject.set(x, "eprime", value.asInstanceOf[js.Any])
      
      inline def setEprimeUndefined: Self = StObject.set(x, "eprime", js.undefined)
      
      inline def setIllusion(value: Boolean): Self = StObject.set(x, "illusion", value.asInstanceOf[js.Any])
      
      inline def setIllusionUndefined: Self = StObject.set(x, "illusion", js.undefined)
      
      inline def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
      
      inline def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
      
      inline def setSo(value: Boolean): Self = StObject.set(x, "so", value.asInstanceOf[js.Any])
      
      inline def setSoUndefined: Self = StObject.set(x, "so", js.undefined)
      
      inline def setThereIs(value: Boolean): Self = StObject.set(x, "thereIs", value.asInstanceOf[js.Any])
      
      inline def setThereIsUndefined: Self = StObject.set(x, "thereIs", js.undefined)
      
      inline def setTooWordy(value: Boolean): Self = StObject.set(x, "tooWordy", value.asInstanceOf[js.Any])
      
      inline def setTooWordyUndefined: Self = StObject.set(x, "tooWordy", js.undefined)
      
      inline def setWeasel(value: Boolean): Self = StObject.set(x, "weasel", value.asInstanceOf[js.Any])
      
      inline def setWeaselUndefined: Self = StObject.set(x, "weasel", js.undefined)
    }
  }
  
  trait Options
    extends StObject
       with DefaultChecks {
    
    /** Custom rules */
    var checks: js.UndefOr[CustomChecks] = js.undefined
    
    /**
      * A list of strings to whitelist from suggestions. For example, normally "only"
      * would be picked up as a bad word, but you might want to exempt "read-only"
      */
    var whitelist: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setChecks(value: CustomChecks): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
      
      inline def setChecksUndefined: Self = StObject.set(x, "checks", js.undefined)
      
      inline def setWhitelist(value: js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      inline def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      inline def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
    }
  }
  
  trait Problem extends StObject {
    
    /** The position of the match in the input text */
    var index: Double
    
    /** The length of the match */
    var offset: Double
    
    /** An explaination of the problem */
    var reason: String
  }
  object Problem {
    
    inline def apply(index: Double, offset: Double, reason: String): Problem = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[Problem]
    }
    
    extension [Self <: Problem](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
}
