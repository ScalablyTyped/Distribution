package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See [TextView.setLineSpacing](https://developer.android.com/reference/android/widget/TextView#setLineSpacing(float,%20float))
  */
@js.native
trait LabelLineSpacing extends StObject {
  
  /**
    * The value in pixels that should be added to each line other than the last line. This will be applied after the multiplier
    */
  var add: js.UndefOr[Double] = js.native
  
  /**
    * The value by which each line height other than the last line will be multiplied by
    */
  var multiply: js.UndefOr[Double] = js.native
}
object LabelLineSpacing {
  
  @scala.inline
  def apply(): LabelLineSpacing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelLineSpacing]
  }
  
  @scala.inline
  implicit class LabelLineSpacingMutableBuilder[Self <: LabelLineSpacing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: Double): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    @scala.inline
    def setMultiply(value: Double): Self = StObject.set(x, "multiply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiplyUndefined: Self = StObject.set(x, "multiply", js.undefined)
  }
}
