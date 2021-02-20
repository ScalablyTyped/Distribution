package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormLayout extends StObject {
  
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
  implicit class FormLayoutMutableBuilder[Self <: FormLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtensions(value: js.Array[Extension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setPages(value: js.Array[Page]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesVarargs(value: Page*): Self = StObject.set(x, "pages", js.Array(value :_*))
    
    @scala.inline
    def setSystemControls(value: js.Array[Control]): Self = StObject.set(x, "systemControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemControlsVarargs(value: Control*): Self = StObject.set(x, "systemControls", js.Array(value :_*))
  }
}
