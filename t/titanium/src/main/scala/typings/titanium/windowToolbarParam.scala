package typings.titanium

import typings.titanium.Titanium.UI.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary of options for the <Titanium.UI.Window.setToolbar> method.
  */
@js.native
trait windowToolbarParam extends StObject {
  
  /**
    * Defines if the toolbar appearance is animated.
    */
  var animated: js.UndefOr[Boolean] = js.native
  
  /**
    * Background color for the toolbar, as a color name or hex triplet.
    */
  var barColor: js.UndefOr[String | Color] = js.native
  
  /**
    * The tintColor to apply to the tool bar.
    */
  var tintColor: js.UndefOr[String | Color] = js.native
  
  /**
    * Defines if the toolbar is translucent.
    */
  var translucent: js.UndefOr[Boolean] = js.native
}
object windowToolbarParam {
  
  @scala.inline
  def apply(): windowToolbarParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[windowToolbarParam]
  }
  
  @scala.inline
  implicit class windowToolbarParamMutableBuilder[Self <: windowToolbarParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    @scala.inline
    def setBarColor(value: String | Color): Self = StObject.set(x, "barColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarColorUndefined: Self = StObject.set(x, "barColor", js.undefined)
    
    @scala.inline
    def setTintColor(value: String | Color): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    @scala.inline
    def setTranslucent(value: Boolean): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
  }
}
