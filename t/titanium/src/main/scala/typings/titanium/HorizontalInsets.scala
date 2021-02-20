package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary object of parameters for horizontal-only insets applied to [Table](Titanium.UI.TableView) and [List](Titanium.UI.ListView) views. Only `left` and `right` properties are used (see <Padding>).
  */
@js.native
trait HorizontalInsets extends StObject {
  
  /**
    * Left padding/inset
    */
  var left: js.UndefOr[Double] = js.native
  
  /**
    * Right padding/inset
    */
  var right: js.UndefOr[Double] = js.native
}
object HorizontalInsets {
  
  @scala.inline
  def apply(): HorizontalInsets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HorizontalInsets]
  }
  
  @scala.inline
  implicit class HorizontalInsetsMutableBuilder[Self <: HorizontalInsets] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
  }
}
