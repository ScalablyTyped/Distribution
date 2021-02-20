package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An extension of <Dimension> where Android returns additional absolute X/Y values/properties for <Titanium.UI.View.rect>
  */
@js.native
trait DimensionWithAbsolutes extends Dimension {
  
  /**
    * The x-axis coordinate of the position relative to the main window.
    */
  var absoluteX: js.UndefOr[Double] = js.native
  
  /**
    * The y-axis coordinate of the position relative to the main window.
    */
  var absoluteY: js.UndefOr[Double] = js.native
}
object DimensionWithAbsolutes {
  
  @scala.inline
  def apply(): DimensionWithAbsolutes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionWithAbsolutes]
  }
  
  @scala.inline
  implicit class DimensionWithAbsolutesMutableBuilder[Self <: DimensionWithAbsolutes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsoluteX(value: Double): Self = StObject.set(x, "absoluteX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsoluteXUndefined: Self = StObject.set(x, "absoluteX", js.undefined)
    
    @scala.inline
    def setAbsoluteY(value: Double): Self = StObject.set(x, "absoluteY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsoluteYUndefined: Self = StObject.set(x, "absoluteY", js.undefined)
  }
}
