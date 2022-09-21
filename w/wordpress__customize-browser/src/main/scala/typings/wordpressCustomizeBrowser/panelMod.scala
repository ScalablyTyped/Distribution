package typings.wordpressCustomizeBrowser

import typings.wordpressCustomizeBrowser.containerMod.Container
import typings.wordpressCustomizeBrowser.sectionMod.Section
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelMod {
  
  @JSImport("@wordpress/customize-browser/Panel", "Panel")
  @js.native
  open class Panel protected () extends Container {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
    def attachEvents(): Unit = js.native
    
    def embed(): Unit = js.native
    
    def renderContent(): Unit = js.native
    
    def sections(): js.Array[Section] = js.native
  }
}
