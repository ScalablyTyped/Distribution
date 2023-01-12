package typings.validator.mod.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsEmptyOptions extends StObject {
  
  /**
    * @default false
    */
  var ignore_whitespace: js.UndefOr[Boolean] = js.undefined
}
object IsEmptyOptions {
  
  inline def apply(): IsEmptyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsEmptyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsEmptyOptions] (val x: Self) extends AnyVal {
    
    inline def setIgnore_whitespace(value: Boolean): Self = StObject.set(x, "ignore_whitespace", value.asInstanceOf[js.Any])
    
    inline def setIgnore_whitespaceUndefined: Self = StObject.set(x, "ignore_whitespace", js.undefined)
  }
}
