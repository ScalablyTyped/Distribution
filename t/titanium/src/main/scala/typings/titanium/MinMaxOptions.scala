package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object for setting `min`/`max` value pairs.
  */
@js.native
trait MinMaxOptions extends StObject {
  
  /**
    * Maximum value
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * Minimum value
    */
  var min: js.UndefOr[Double] = js.native
}
object MinMaxOptions {
  
  @scala.inline
  def apply(): MinMaxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinMaxOptions]
  }
  
  @scala.inline
  implicit class MinMaxOptionsMutableBuilder[Self <: MinMaxOptions] (val x: Self) extends AnyVal {
    
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
