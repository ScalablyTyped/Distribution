package typings.wordpressComponents.customSelectControlMod.CustomSelectControl

import typings.downshift.mod.UseSelectStateChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  /**
    * Used to visually hide the label. It will always be visible to screen readers.
    *
    * @defaultValue false
    */
  var hideLabelFromVision: js.UndefOr[Boolean] = js.native
  
  /**
    * The label for the control.
    */
  var label: String = js.native
  
  /**
    * Function called with the control's internal state changes. The `selectedItem` property contains the next selected item.
    */
  var onChange: js.UndefOr[js.Function1[/* changes */ UseSelectStateChange[Option], Unit]] = js.native
  
  /**
    * The options that can be chosen from.
    */
  var options: js.Array[Option] = js.native
  
  /**
    * Can be used to externally control the value of the control.
    */
  var value: js.UndefOr[Option] = js.native
}
object Props {
  
  @scala.inline
  def apply(label: String, options: js.Array[Option]): Props = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsVarargs(value: Option*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[Option]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setHideLabelFromVision(value: Boolean): Self = this.set("hideLabelFromVision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideLabelFromVision: Self = this.set("hideLabelFromVision", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* changes */ UseSelectStateChange[Option] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setValue(value: Option): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
