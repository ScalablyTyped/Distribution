package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormLayout extends js.Object {
  
  /**
    * Gets and sets extensions list
    */
  var extensions: js.Array[Extension] = js.native
  
  /**
    * Top level tabs of the layout.
    */
  var pages: js.Array[Page] = js.native
  
  /**
    * Headers controls of the layout.
    */
  var systemControls: js.Array[Control] = js.native
}
object FormLayout {
  
  @scala.inline
  def apply(extensions: js.Array[Extension], pages: js.Array[Page], systemControls: js.Array[Control]): FormLayout = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], systemControls = systemControls.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormLayout]
  }
  
  @scala.inline
  implicit class FormLayoutOps[Self <: FormLayout] (val x: Self) extends AnyVal {
    
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
    def setExtensionsVarargs(value: Extension*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: js.Array[Extension]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesVarargs(value: Page*): Self = this.set("pages", js.Array(value :_*))
    
    @scala.inline
    def setPages(value: js.Array[Page]): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemControlsVarargs(value: Control*): Self = this.set("systemControls", js.Array(value :_*))
    
    @scala.inline
    def setSystemControls(value: js.Array[Control]): Self = this.set("systemControls", value.asInstanceOf[js.Any])
  }
}
