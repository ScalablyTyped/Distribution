package typings.tuyaPanelKit.mod

import typings.reactNative.mod.TextProps
import typings.tuyaPanelKit.tuyaPanelKitStrings.center
import typings.tuyaPanelKit.tuyaPanelKitStrings.heading
import typings.tuyaPanelKit.tuyaPanelKitStrings.large
import typings.tuyaPanelKit.tuyaPanelKitStrings.left
import typings.tuyaPanelKit.tuyaPanelKitStrings.normal
import typings.tuyaPanelKit.tuyaPanelKitStrings.paragraph
import typings.tuyaPanelKit.tuyaPanelKitStrings.right
import typings.tuyaPanelKit.tuyaPanelKitStrings.small
import typings.tuyaPanelKit.tuyaPanelKitStrings.title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TYTextProps
  extends StObject
     with TextProps {
  
  var align: js.UndefOr[left | center | right] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[large | normal | small | Double] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[heading | title | paragraph] = js.undefined
  
  var weight: js.UndefOr[Double | String] = js.undefined
}
object TYTextProps {
  
  @scala.inline
  def apply(): TYTextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TYTextProps]
  }
  
  @scala.inline
  implicit class TYTextPropsMutableBuilder[Self <: TYTextProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: left | center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setSize(value: large | normal | small | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setType(value: heading | title | paragraph): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWeight(value: Double | String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
