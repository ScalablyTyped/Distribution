package typings.xregexp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Value names for recursive matching parts.
  */
trait MatchRecursiveValueNames extends StObject {
  
  /**
    * Name for the unmatched portion of string leading up to `left` delimiter.
    */
  var `0`: String | Null
  
  /**
    * Name for the `left` delimiter.
    */
  var `1`: String | Null
  
  /**
    * Name for the portion of the string inside the `left` and `right` delimiters.
    */
  var `2`: String | Null
  
  /**
    * Name for the `right` delimiter.
    */
  var `3`: String | Null
}
object MatchRecursiveValueNames {
  
  inline def apply(): MatchRecursiveValueNames = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(null)
    __obj.updateDynamic("1")(null)
    __obj.updateDynamic("2")(null)
    __obj.updateDynamic("3")(null)
    __obj.asInstanceOf[MatchRecursiveValueNames]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MatchRecursiveValueNames] (val x: Self) extends AnyVal {
    
    inline def set0(value: String): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set0Null: Self = StObject.set(x, "0", null)
    
    inline def set1(value: String): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    inline def set1Null: Self = StObject.set(x, "1", null)
    
    inline def set2(value: String): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
    
    inline def set2Null: Self = StObject.set(x, "2", null)
    
    inline def set3(value: String): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
    
    inline def set3Null: Self = StObject.set(x, "3", null)
  }
}
