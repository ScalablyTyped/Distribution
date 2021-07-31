package typings.wampy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishAdvancedOptions
  extends StObject
     with AdvancedOptions {
  
  var eligible_authid: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var eligible_authrole: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var exclude_authid: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var exclude_authrole: js.UndefOr[String | js.Array[String]] = js.undefined
}
object PublishAdvancedOptions {
  
  @scala.inline
  def apply(): PublishAdvancedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishAdvancedOptions]
  }
  
  @scala.inline
  implicit class PublishAdvancedOptionsMutableBuilder[Self <: PublishAdvancedOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEligible_authid(value: String | js.Array[String]): Self = StObject.set(x, "eligible_authid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEligible_authidUndefined: Self = StObject.set(x, "eligible_authid", js.undefined)
    
    @scala.inline
    def setEligible_authidVarargs(value: String*): Self = StObject.set(x, "eligible_authid", js.Array(value :_*))
    
    @scala.inline
    def setEligible_authrole(value: String | js.Array[String]): Self = StObject.set(x, "eligible_authrole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEligible_authroleUndefined: Self = StObject.set(x, "eligible_authrole", js.undefined)
    
    @scala.inline
    def setEligible_authroleVarargs(value: String*): Self = StObject.set(x, "eligible_authrole", js.Array(value :_*))
    
    @scala.inline
    def setExclude_authid(value: String | js.Array[String]): Self = StObject.set(x, "exclude_authid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclude_authidUndefined: Self = StObject.set(x, "exclude_authid", js.undefined)
    
    @scala.inline
    def setExclude_authidVarargs(value: String*): Self = StObject.set(x, "exclude_authid", js.Array(value :_*))
    
    @scala.inline
    def setExclude_authrole(value: String | js.Array[String]): Self = StObject.set(x, "exclude_authrole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclude_authroleUndefined: Self = StObject.set(x, "exclude_authrole", js.undefined)
    
    @scala.inline
    def setExclude_authroleVarargs(value: String*): Self = StObject.set(x, "exclude_authrole", js.Array(value :_*))
  }
}
