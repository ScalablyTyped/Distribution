package typings.xregexp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for when doing recursive matching.
  */
@js.native
trait MatchRecursiveOptions extends StObject {
  
  /**
    * The escape character to use.
    *
    * **Must be exactly one character long.**
    */
  var escapeChar: js.UndefOr[String | Null] = js.native
  
  /**
    * The value names to associate with the matches.
    *
    * Specifying a value here will cause the `XRegExp.matchRecursive` method to
    * return and array of `XRegExp.MatchRecursiveValueNameMatch`
    */
  var valueNames: js.UndefOr[MatchRecursiveValueNames | Null] = js.native
}
object MatchRecursiveOptions {
  
  @scala.inline
  def apply(): MatchRecursiveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchRecursiveOptions]
  }
  
  @scala.inline
  implicit class MatchRecursiveOptionsMutableBuilder[Self <: MatchRecursiveOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEscapeChar(value: String): Self = StObject.set(x, "escapeChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEscapeCharNull: Self = StObject.set(x, "escapeChar", null)
    
    @scala.inline
    def setEscapeCharUndefined: Self = StObject.set(x, "escapeChar", js.undefined)
    
    @scala.inline
    def setValueNames(value: MatchRecursiveValueNames): Self = StObject.set(x, "valueNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNamesNull: Self = StObject.set(x, "valueNames", null)
    
    @scala.inline
    def setValueNamesUndefined: Self = StObject.set(x, "valueNames", js.undefined)
  }
}
