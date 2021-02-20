package typings.xregexp.mod

import typings.xregexp.xregexpStrings.none
import typings.xregexp.xregexpStrings.or
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Additional options for when doing a RegExp union.
  */
@js.native
trait UnionOptions extends StObject {
  
  /**
    * The conjunction to use for the union. Default is `none`.
    */
  var conjunction: js.UndefOr[or | none | Null] = js.native
}
object UnionOptions {
  
  @scala.inline
  def apply(): UnionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnionOptions]
  }
  
  @scala.inline
  implicit class UnionOptionsMutableBuilder[Self <: UnionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConjunction(value: or | none): Self = StObject.set(x, "conjunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConjunctionNull: Self = StObject.set(x, "conjunction", null)
    
    @scala.inline
    def setConjunctionUndefined: Self = StObject.set(x, "conjunction", js.undefined)
  }
}
