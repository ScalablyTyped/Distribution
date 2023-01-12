package typings.xregexp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Replacement details used in an array for replacing multiple items.
  */
trait ReplacementDetail extends StObject {
  
  /**
    * What to search for.
    */
  var `0`: Pattern
  
  /**
    * The replacement string or function
    */
  var `1`: ReplacementValue
  
  /**
    * Replacement scope. If not explicitly specified and `regex` uses flag g,
    * `scope` is 'all'.
    */
  var `2`: js.UndefOr[MatchScope | Null] = js.undefined
}
object ReplacementDetail {
  
  inline def apply(`0`: Pattern, `1`: ReplacementValue): ReplacementDetail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplacementDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplacementDetail] (val x: Self) extends AnyVal {
    
    inline def set0(value: Pattern): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: ReplacementValue): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    inline def set2(value: MatchScope): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
    
    inline def set2Null: Self = StObject.set(x, "2", null)
    
    inline def set2Undefined: Self = StObject.set(x, "2", js.undefined)
  }
}
