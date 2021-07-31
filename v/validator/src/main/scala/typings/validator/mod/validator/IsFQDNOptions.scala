package typings.validator.mod.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsFQDNOptions extends StObject {
  
  /**
    * @default false
    */
  var allow_trailing_dot: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default false
    */
  var allow_underscores: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default true
    */
  var require_tld: js.UndefOr[Boolean] = js.undefined
}
object IsFQDNOptions {
  
  @scala.inline
  def apply(): IsFQDNOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsFQDNOptions]
  }
  
  @scala.inline
  implicit class IsFQDNOptionsMutableBuilder[Self <: IsFQDNOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow_trailing_dot(value: Boolean): Self = StObject.set(x, "allow_trailing_dot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_trailing_dotUndefined: Self = StObject.set(x, "allow_trailing_dot", js.undefined)
    
    @scala.inline
    def setAllow_underscores(value: Boolean): Self = StObject.set(x, "allow_underscores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_underscoresUndefined: Self = StObject.set(x, "allow_underscores", js.undefined)
    
    @scala.inline
    def setRequire_tld(value: Boolean): Self = StObject.set(x, "require_tld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequire_tldUndefined: Self = StObject.set(x, "require_tld", js.undefined)
  }
}
