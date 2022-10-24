package typings.wixStyleReact

import typings.react.mod.Component
import typings.wixStyleReact.anon.PopoverProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesColorInputComponentsColorViewerMod {
  
  @JSImport("wix-style-react/dist/types/ColorInput/components/ColorViewer", "ColorViewer")
  @js.native
  open class ColorViewer protected () extends Component[Any, Any, Any] {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
    
    def onChange(_color: Any): Unit = js.native
  }
  /* static members */
  object ColorViewer {
    
    @JSImport("wix-style-react/dist/types/ColorInput/components/ColorViewer", "ColorViewer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/ColorInput/components/ColorViewer", "ColorViewer.defaultProps")
    @js.native
    def defaultProps: PopoverProps = js.native
    inline def defaultProps_=(x: PopoverProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
