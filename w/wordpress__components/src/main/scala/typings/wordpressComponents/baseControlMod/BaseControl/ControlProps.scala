package typings.wordpressComponents.baseControlMod.BaseControl

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControlProps extends js.Object {
  
  /**
    * The class that will be added with `"components-base-control"` to
    * the classes of the wrapper div. If undefined, only
    * `"components-base-control"` is used.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * If this property is added, a help text will be generated using help
    * property as the content.
    */
  var help: js.UndefOr[ReactNode] = js.native
  
  /**
    * If true, the label will only be visible to screen readers.
    */
  var hideLabelFromVision: js.UndefOr[Boolean] = js.native
  
  /**
    * If this property is added, a label will be generated using label
    * property as the content.
    */
  var label: js.UndefOr[ReactNode] = js.native
}
object ControlProps {
  
  @scala.inline
  def apply(): ControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlProps]
  }
  
  @scala.inline
  implicit class ControlPropsOps[Self <: ControlProps] (val x: Self) extends AnyVal {
    
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
    def setHelp(value: ReactNode): Self = this.set("help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelp: Self = this.set("help", js.undefined)
    
    @scala.inline
    def setHideLabelFromVision(value: Boolean): Self = this.set("hideLabelFromVision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideLabelFromVision: Self = this.set("hideLabelFromVision", js.undefined)
    
    @scala.inline
    def setLabel(value: ReactNode): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
}
