package typings.wordpressComponents.colorPickerMod.ColorPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  /**
    * Machine-readable color value.
    * @defaultValue "0071a1"
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * Should alpha be disabled?
    */
  var disableAlpha: js.UndefOr[Boolean] = js.native
  
  /**
    * A reference to the hue of the previous color, otherwise
    * dragging the saturation to zero will reset the current
    * hue to zero as well.
    *
    * @see https://github.com/casesandberg/react-color/issues/29#issuecomment-132686909.
    */
  var oldHue: js.UndefOr[Double] = js.native
  
  /**
    * Function to be called when color value changes.
    */
  def onChangeComplete(value: OnChangeCompleteValue): Unit = js.native
}
object Props {
  
  @scala.inline
  def apply(onChangeComplete: OnChangeCompleteValue => Unit): Props = {
    val __obj = js.Dynamic.literal(onChangeComplete = js.Any.fromFunction1(onChangeComplete))
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    def setOnChangeComplete(value: OnChangeCompleteValue => Unit): Self = this.set("onChangeComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDisableAlpha(value: Boolean): Self = this.set("disableAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableAlpha: Self = this.set("disableAlpha", js.undefined)
    
    @scala.inline
    def setOldHue(value: Double): Self = this.set("oldHue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldHue: Self = this.set("oldHue", js.undefined)
  }
}
