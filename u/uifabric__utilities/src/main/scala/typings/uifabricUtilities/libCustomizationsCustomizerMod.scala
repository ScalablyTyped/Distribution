package typings.uifabricUtilities

import typings.react.mod.Component
import typings.uifabricUtilities.libCustomizationsCustomizerDottypesMod.ICustomizerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCustomizationsCustomizerMod {
  
  @JSImport("@uifabric/utilities/lib/customizations/Customizer", "Customizer")
  @js.native
  open class Customizer protected ()
    extends Component[ICustomizerProps, js.Object, Any] {
    def this(props: ICustomizerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ICustomizerProps, context: Any) = this()
    
    /* private */ var _onCustomizationChange: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MCustomizer(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MCustomizer(): Unit = js.native
  }
}
