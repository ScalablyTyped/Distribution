package typings.twineSugarcube.extensionsMod.global

import typings.twineSugarcube.twineSugarcubeStrings.`false`
import typings.twineSugarcube.twineSugarcubeStrings.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryAriaClickOptions extends js.Object {
  
  /**
    * Value for the aria-controls attribute.
    */
  var controls: js.UndefOr[java.lang.String] = js.native
  
  /**
    * Data to be passed to the handler in event.data when an event is triggered.
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /**
    * Value for the aria-label and title attributes.
    */
  var label: js.UndefOr[java.lang.String] = js.native
  
  /**
    * A period-separated list of event namespaces.
    */
  var namespace: js.UndefOr[java.lang.String] = js.native
  
  /**
    * Whether the clickables are single-use—i.e., the handler callback runs only once and then removes itself.
    * If omitted, defaults to false.
    */
  var one: js.UndefOr[Boolean] = js.native
  
  /**
    * Value for the aria-pressed attribute (valid values: "true", "false").
    */
  var pressed: js.UndefOr[`true` | `false`] = js.native
  
  /**
    * A selector applied to the target element(s) to filter the descendants that triggered the event. If omitted or
    * null, the event is always handled when it reaches the target element(s)
    */
  var selector: js.UndefOr[java.lang.String] = js.native
}
object JQueryAriaClickOptions {
  
  @scala.inline
  def apply(): JQueryAriaClickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryAriaClickOptions]
  }
  
  @scala.inline
  implicit class JQueryAriaClickOptionsOps[Self <: JQueryAriaClickOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setControls(value: java.lang.String): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setLabel(value: java.lang.String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setNamespace(value: java.lang.String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    
    @scala.inline
    def setOne(value: Boolean): Self = this.set("one", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOne: Self = this.set("one", js.undefined)
    
    @scala.inline
    def setPressed(value: `true` | `false`): Self = this.set("pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePressed: Self = this.set("pressed", js.undefined)
    
    @scala.inline
    def setSelector(value: java.lang.String): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
  }
}
