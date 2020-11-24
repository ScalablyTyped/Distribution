package typings.titanium

import typings.titanium.Titanium.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary of options for the <Titanium.UI.Window.setToolbar> method.
  */
@js.native
trait windowToolbarParam extends js.Object {
  
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
  implicit class windowToolbarParamOps[Self <: windowToolbarParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    
    @scala.inline
    def setBarColor(value: String | Color): Self = this.set("barColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarColor: Self = this.set("barColor", js.undefined)
    
    @scala.inline
    def setTintColor(value: String | Color): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
    
    @scala.inline
    def setTranslucent(value: Boolean): Self = this.set("translucent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslucent: Self = this.set("translucent", js.undefined)
  }
}
