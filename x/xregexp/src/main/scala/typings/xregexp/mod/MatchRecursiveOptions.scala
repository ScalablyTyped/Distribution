package typings.xregexp.mod

import typings.xregexp.xregexpStrings.`skip-lazy`
import typings.xregexp.xregexpStrings.error
import typings.xregexp.xregexpStrings.skip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for when doing recursive matching.
  */
trait MatchRecursiveOptions extends StObject {
  
  /**
    * The escape character to use.
    *
    * **Must be exactly one character long.**
    */
  var escapeChar: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Handling mode for unbalanced delimiters.
    */
  var unbalanced: js.UndefOr[error | skip | `skip-lazy`] = js.undefined
  
  /**
    * The value names to associate with the matches.
    *
    * Specifying a value here will cause the `XRegExp.matchRecursive` method to
    * return and array of `XRegExp.MatchRecursiveValueNameMatch`
    */
  var valueNames: js.UndefOr[MatchRecursiveValueNames | Null] = js.undefined
}
object MatchRecursiveOptions {
  
  inline def apply(): MatchRecursiveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchRecursiveOptions]
  }
  
  extension [Self <: MatchRecursiveOptions](x: Self) {
    
    inline def setEscapeChar(value: String): Self = StObject.set(x, "escapeChar", value.asInstanceOf[js.Any])
    
    inline def setEscapeCharNull: Self = StObject.set(x, "escapeChar", null)
    
    inline def setEscapeCharUndefined: Self = StObject.set(x, "escapeChar", js.undefined)
    
    inline def setUnbalanced(value: error | skip | `skip-lazy`): Self = StObject.set(x, "unbalanced", value.asInstanceOf[js.Any])
    
    inline def setUnbalancedUndefined: Self = StObject.set(x, "unbalanced", js.undefined)
    
    inline def setValueNames(value: MatchRecursiveValueNames): Self = StObject.set(x, "valueNames", value.asInstanceOf[js.Any])
    
    inline def setValueNamesNull: Self = StObject.set(x, "valueNames", null)
    
    inline def setValueNamesUndefined: Self = StObject.set(x, "valueNames", js.undefined)
  }
}
