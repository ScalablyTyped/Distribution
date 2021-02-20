package typings.validator.mod.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsFloatOptions extends StObject {
  
  /**
    * greater than
    */
  var gt: js.UndefOr[Double] = js.native
  
  /**
    * FloatLocale
    */
  var locale: js.UndefOr[FloatLocale] = js.native
  
  /**
    * less than
    */
  var lt: js.UndefOr[Double] = js.native
  
  /**
    * greater or equal
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * less or equal
    */
  var min: js.UndefOr[Double] = js.native
}
object IsFloatOptions {
  
  @scala.inline
  def apply(): IsFloatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsFloatOptions]
  }
  
  @scala.inline
  implicit class IsFloatOptionsMutableBuilder[Self <: IsFloatOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGt(value: Double): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGtUndefined: Self = StObject.set(x, "gt", js.undefined)
    
    @scala.inline
    def setLocale(value: FloatLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setLt(value: Double): Self = StObject.set(x, "lt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLtUndefined: Self = StObject.set(x, "lt", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
