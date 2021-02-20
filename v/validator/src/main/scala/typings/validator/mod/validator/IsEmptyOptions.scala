package typings.validator.mod.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsEmptyOptions extends StObject {
  
  /**
    * @default false
    */
  var ignore_whitespace: js.UndefOr[Boolean] = js.native
}
object IsEmptyOptions {
  
  @scala.inline
  def apply(): IsEmptyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsEmptyOptions]
  }
  
  @scala.inline
  implicit class IsEmptyOptionsMutableBuilder[Self <: IsEmptyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnore_whitespace(value: Boolean): Self = StObject.set(x, "ignore_whitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnore_whitespaceUndefined: Self = StObject.set(x, "ignore_whitespace", js.undefined)
  }
}
