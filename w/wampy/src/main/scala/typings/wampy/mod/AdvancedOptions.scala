package typings.wampy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvancedOptions extends StObject {
  
  var disclose_me: js.UndefOr[Boolean] = js.undefined
  
  var eligible: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var exclude: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var exclude_me: js.UndefOr[Boolean] = js.undefined
}
object AdvancedOptions {
  
  @scala.inline
  def apply(): AdvancedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvancedOptions]
  }
  
  @scala.inline
  implicit class AdvancedOptionsMutableBuilder[Self <: AdvancedOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisclose_me(value: Boolean): Self = StObject.set(x, "disclose_me", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisclose_meUndefined: Self = StObject.set(x, "disclose_me", js.undefined)
    
    @scala.inline
    def setEligible(value: Double | js.Array[Double]): Self = StObject.set(x, "eligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEligibleUndefined: Self = StObject.set(x, "eligible", js.undefined)
    
    @scala.inline
    def setEligibleVarargs(value: Double*): Self = StObject.set(x, "eligible", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: Double | js.Array[Double]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: Double*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude_me(value: Boolean): Self = StObject.set(x, "exclude_me", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclude_meUndefined: Self = StObject.set(x, "exclude_me", js.undefined)
  }
}
