package typings.wordpressCustomizeBrowser

import typings.wordpressCustomizeBrowser.containerMod.Container
import typings.wordpressCustomizeBrowser.sectionMod.Section
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/customize-browser/Panel", JSImport.Namespace)
@js.native
object panelMod extends js.Object {
  
  @js.native
  class Panel () extends Container {
    
    def attachEvents(): Unit = js.native
    
    def embed(): Unit = js.native
    
    def renderContent(): Unit = js.native
    
    def sections(): js.Array[Section] = js.native
  }
}
