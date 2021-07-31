package typings.victory.anon

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flyout extends StObject {
  
  var data: js.UndefOr[CSSProperties] = js.undefined
  
  var flyout: js.UndefOr[CSSProperties] = js.undefined
  
  var labels: js.UndefOr[CSSProperties] = js.undefined
}
object Flyout {
  
  @scala.inline
  def apply(): Flyout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Flyout]
  }
  
  @scala.inline
  implicit class FlyoutMutableBuilder[Self <: Flyout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: CSSProperties): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setFlyout(value: CSSProperties): Self = StObject.set(x, "flyout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlyoutUndefined: Self = StObject.set(x, "flyout", js.undefined)
    
    @scala.inline
    def setLabels(value: CSSProperties): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
  }
}
