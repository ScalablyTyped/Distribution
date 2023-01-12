package typings.victoryCore

import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.ContextType
import typings.react.mod.ReactElement
import typings.victoryCore.anon.GroupComponent
import typings.victoryCore.anon.GroupComponentElement
import typings.victoryCore.libVictoryPortalPortalContextMod.PortalContextValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVictoryPortalVictoryPortalMod {
  
  @JSImport("victory-core/lib/victory-portal/victory-portal", "VictoryPortal")
  @js.native
  open class VictoryPortal protected ()
    extends Component[VictoryPortalProps, js.Object, Any] {
    def this(props: VictoryPortalProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: VictoryPortalProps, context: Any) = this()
    
    /* private */ var checkedContext: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MVictoryPortal(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MVictoryPortal(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MVictoryPortal(): Unit = js.native
    
    @JSName("context")
    var context_VictoryPortal: ContextType[Context[PortalContextValue]] = js.native
    
    /* private */ var element: Any = js.native
    
    /* private */ var portalKey: Any = js.native
    
    /* private */ var renderInPlace: Any = js.native
    
    def renderPortal(child: ReactElement): ReactElement | Null = js.native
  }
  /* static members */
  object VictoryPortal {
    
    @JSImport("victory-core/lib/victory-portal/victory-portal", "VictoryPortal")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-core/lib/victory-portal/victory-portal", "VictoryPortal.contextType")
    @js.native
    def contextType: Context[PortalContextValue] = js.native
    inline def contextType_=(x: Context[PortalContextValue]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-portal/victory-portal", "VictoryPortal.defaultProps")
    @js.native
    def defaultProps: GroupComponentElement = js.native
    inline def defaultProps_=(x: GroupComponentElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-portal/victory-portal", "VictoryPortal.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-portal/victory-portal", "VictoryPortal.propTypes")
    @js.native
    def propTypes: GroupComponent = js.native
    inline def propTypes_=(x: GroupComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-portal/victory-portal", "VictoryPortal.role")
    @js.native
    def role: String = js.native
    inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
  }
  
  trait VictoryPortalProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.undefined
    
    var groupComponent: js.UndefOr[ReactElement] = js.undefined
  }
  object VictoryPortalProps {
    
    inline def apply(): VictoryPortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryPortalProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VictoryPortalProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setGroupComponent(value: ReactElement): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
      
      inline def setGroupComponentUndefined: Self = StObject.set(x, "groupComponent", js.undefined)
    }
  }
}
