package typings.wordpressCustomizeBrowser

import typings.wordpressCustomizeBrowser.containerMod.Container
import typings.wordpressCustomizeBrowser.containerMod.ContainerParams
import typings.wordpressCustomizeBrowser.controlMod.Control
import typings.wordpressCustomizeBrowser.valueMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sectionMod {
  
  @JSImport("@wordpress/customize-browser/Section", "Section")
  @js.native
  open class Section protected () extends Container {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
    def attachEvents(): Unit = js.native
    
    var containerPaneParent: String = js.native
    
    var containerParent: String = js.native
    
    def controls(): js.Array[Control] = js.native
    
    def embed(): Unit = js.native
    
    var id: String = js.native
    
    def initialize(id: String, options: SectionParams): Unit = js.native
    def initialize(id: Unit, options: SectionParams): Unit = js.native
    
    var panel: Value[String] = js.native
  }
  
  trait SectionParams
    extends StObject
       with ContainerParams {
    
    var customizeAction: js.UndefOr[String] = js.undefined
    
    var panel: js.UndefOr[String | Null] = js.undefined
  }
  object SectionParams {
    
    inline def apply(title: String): SectionParams = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[SectionParams]
    }
    
    extension [Self <: SectionParams](x: Self) {
      
      inline def setCustomizeAction(value: String): Self = StObject.set(x, "customizeAction", value.asInstanceOf[js.Any])
      
      inline def setCustomizeActionUndefined: Self = StObject.set(x, "customizeAction", js.undefined)
      
      inline def setPanel(value: String): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
      
      inline def setPanelNull: Self = StObject.set(x, "panel", null)
      
      inline def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
    }
  }
}
