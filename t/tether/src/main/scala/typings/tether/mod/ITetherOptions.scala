package typings.tether.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITetherOptions extends js.Object {
  
  var attachment: String = js.native
  
  var bodyElement: js.UndefOr[HTMLElement] = js.native
  
  var classPrefix: js.UndefOr[String] = js.native
  
  var classes: js.UndefOr[StringDictionary[Boolean | String]] = js.native
  
  var constraints: js.UndefOr[js.Array[ITetherConstraint]] = js.native
  
  var element: js.UndefOr[HTMLElement | String | js.Any] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[String] = js.native
  
  var optimizations: js.UndefOr[js.Any] = js.native
  
  var target: js.UndefOr[HTMLElement | String | js.Any] = js.native
  
  var targetAttachment: js.UndefOr[String] = js.native
  
  var targetModifier: js.UndefOr[String] = js.native
  
  var targetOffset: js.UndefOr[String] = js.native
}
object ITetherOptions {
  
  @scala.inline
  def apply(attachment: String): ITetherOptions = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITetherOptions]
  }
  
  @scala.inline
  implicit class ITetherOptionsOps[Self <: ITetherOptions] (val x: Self) extends AnyVal {
    
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
    def setAttachment(value: String): Self = this.set("attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyElement(value: HTMLElement): Self = this.set("bodyElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyElement: Self = this.set("bodyElement", js.undefined)
    
    @scala.inline
    def setClassPrefix(value: String): Self = this.set("classPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassPrefix: Self = this.set("classPrefix", js.undefined)
    
    @scala.inline
    def setClasses(value: StringDictionary[Boolean | String]): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    
    @scala.inline
    def setConstraintsVarargs(value: ITetherConstraint*): Self = this.set("constraints", js.Array(value :_*))
    
    @scala.inline
    def setConstraints(value: js.Array[ITetherConstraint]): Self = this.set("constraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstraints: Self = this.set("constraints", js.undefined)
    
    @scala.inline
    def setElement(value: HTMLElement | String | js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setOffset(value: String): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOptimizations(value: js.Any): Self = this.set("optimizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimizations: Self = this.set("optimizations", js.undefined)
    
    @scala.inline
    def setTarget(value: HTMLElement | String | js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTargetAttachment(value: String): Self = this.set("targetAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetAttachment: Self = this.set("targetAttachment", js.undefined)
    
    @scala.inline
    def setTargetModifier(value: String): Self = this.set("targetModifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetModifier: Self = this.set("targetModifier", js.undefined)
    
    @scala.inline
    def setTargetOffset(value: String): Self = this.set("targetOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetOffset: Self = this.set("targetOffset", js.undefined)
  }
}
