package typings.validator.mod.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsISSNOptions extends StObject {
  
  /**
    * If `case_sensitive` is `true`, ISSNs with a lowercase `x` as the check digit are rejected.
    *
    * @default false
    */
  var case_sensitive: js.UndefOr[Boolean] = js.native
  
  /**
    * @default false
    */
  var require_hyphen: js.UndefOr[Boolean] = js.native
}
object IsISSNOptions {
  
  @scala.inline
  def apply(): IsISSNOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsISSNOptions]
  }
  
  @scala.inline
  implicit class IsISSNOptionsMutableBuilder[Self <: IsISSNOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCase_sensitive(value: Boolean): Self = StObject.set(x, "case_sensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCase_sensitiveUndefined: Self = StObject.set(x, "case_sensitive", js.undefined)
    
    @scala.inline
    def setRequire_hyphen(value: Boolean): Self = StObject.set(x, "require_hyphen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequire_hyphenUndefined: Self = StObject.set(x, "require_hyphen", js.undefined)
  }
}
