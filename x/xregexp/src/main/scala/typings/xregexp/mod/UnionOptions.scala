package typings.xregexp.mod

import typings.xregexp.xregexpStrings.none
import typings.xregexp.xregexpStrings.or
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Additional options for when doing a RegExp union.
  */
trait UnionOptions extends StObject {
  
  /**
    * The conjunction to use for the union. Default is `none`.
    */
  var conjunction: js.UndefOr[or | none | Null] = js.undefined
}
object UnionOptions {
  
  inline def apply(): UnionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnionOptions] (val x: Self) extends AnyVal {
    
    inline def setConjunction(value: or | none): Self = StObject.set(x, "conjunction", value.asInstanceOf[js.Any])
    
    inline def setConjunctionNull: Self = StObject.set(x, "conjunction", null)
    
    inline def setConjunctionUndefined: Self = StObject.set(x, "conjunction", js.undefined)
  }
}
