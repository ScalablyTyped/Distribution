package typings.switchery.mod.Switchery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * class name for the switch element (by default styled in switchery.css)
    * @default 'switchery'
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * color of the switch element (HEX or RGB value)
    * @default '#64bd63'
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * enable or disable click events and changing the state of the switch (boolean value)
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * opacity of the switch when it's disabled (0 to 1)
    * @default 0.5
    */
  var disabledOpacity: js.UndefOr[Double] = js.native
  
  /**
    * color of the jack/handle element
    * @default '#fff'
    */
  var jackColor: js.UndefOr[String] = js.native
  
  /**
    * color of unchecked jack/handle element
    * @default 'null'
    */
  var jackSecondaryColor: js.UndefOr[String] = js.native
  
  /**
    * secondary color for background color and border, when the switch is off
    * @default '#dfdfdf'
    */
  var secondaryColor: js.UndefOr[String] = js.native
  
  /**
    * size of the switch element (small or large)
    * @default 'default'
    */
  var size: js.UndefOr[String] = js.native
  
  /**
    * length of time that the transition will take, ex. '0.4s', '1s', '2.2s' (Note: transition speed of the handle is twice shorter)
    * @default '0.1s'
    */
  var speed: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDisabledOpacity(value: Double): Self = this.set("disabledOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledOpacity: Self = this.set("disabledOpacity", js.undefined)
    
    @scala.inline
    def setJackColor(value: String): Self = this.set("jackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJackColor: Self = this.set("jackColor", js.undefined)
    
    @scala.inline
    def setJackSecondaryColor(value: String): Self = this.set("jackSecondaryColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJackSecondaryColor: Self = this.set("jackSecondaryColor", js.undefined)
    
    @scala.inline
    def setSecondaryColor(value: String): Self = this.set("secondaryColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryColor: Self = this.set("secondaryColor", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSpeed(value: String): Self = this.set("speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
  }
}
