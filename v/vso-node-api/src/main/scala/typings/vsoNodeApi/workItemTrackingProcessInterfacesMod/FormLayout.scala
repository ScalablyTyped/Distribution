package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormLayout extends StObject {
  
  /**
    * Gets and sets extensions list
    */
  var extensions: js.Array[Extension]
  
  /**
    * Top level tabs of the layout.
    */
  var pages: js.Array[Page]
  
  /**
    * Headers controls of the layout.
    */
  var systemControls: js.Array[Control]
}
object FormLayout {
  
  inline def apply(extensions: js.Array[Extension], pages: js.Array[Page], systemControls: js.Array[Control]): FormLayout = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], systemControls = systemControls.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormLayout]
  }
  
  extension [Self <: FormLayout](x: Self) {
    
    inline def setExtensions(value: js.Array[Extension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setPages(value: js.Array[Page]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesVarargs(value: Page*): Self = StObject.set(x, "pages", js.Array(value*))
    
    inline def setSystemControls(value: js.Array[Control]): Self = StObject.set(x, "systemControls", value.asInstanceOf[js.Any])
    
    inline def setSystemControlsVarargs(value: Control*): Self = StObject.set(x, "systemControls", js.Array(value*))
  }
}
