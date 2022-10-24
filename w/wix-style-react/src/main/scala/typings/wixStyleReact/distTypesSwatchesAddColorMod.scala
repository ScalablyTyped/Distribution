package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.wixStyleReact.anon.Shown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSwatchesAddColorMod {
  
  @JSImport("wix-style-react/dist/types/Swatches/AddColor", JSImport.Default)
  @js.native
  open class default protected () extends AddColor {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  
  @js.native
  trait AddColor extends PureComponent[Any, Any, Any] {
    
    def cancel(): Unit = js.native
    
    def confirm(): Unit = js.native
    
    def hideColorPicker(): Unit = js.native
    
    def setColor(color: Any): Unit = js.native
    
    @JSName("state")
    var state_AddColor: Shown = js.native
    
    def toggleColorPicker(): Unit = js.native
  }
}
