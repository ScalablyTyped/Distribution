package typings.validator.mod.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsByteLengthOptions extends StObject {
  
  /**
    * @default undefined
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * @default 0
    */
  var min: js.UndefOr[Double] = js.native
}
object IsByteLengthOptions {
  
  @scala.inline
  def apply(): IsByteLengthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsByteLengthOptions]
  }
  
  @scala.inline
  implicit class IsByteLengthOptionsMutableBuilder[Self <: IsByteLengthOptions] (val x: Self) extends AnyVal {
    
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
