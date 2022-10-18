package typings.victoryCore

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.DOMAttributes
import typings.react.mod.ReactElement
import typings.react.mod.Ref
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.victoryCore.anon.Arialabelledby
import typings.victoryCore.anon.PortalComponent
import typings.victoryCore.anon.TransitionTimer
import typings.victoryCore.anon.`0`
import typings.victoryCore.libVictoryLabelVictoryLabelMod.OriginType
import typings.victoryCore.libVictoryThemeTypesMod.VictoryThemeDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVictoryContainerVictoryContainerMod {
  
  @JSImport("victory-core/lib/victory-container/victory-container", "VictoryContainer")
  @js.native
  open class VictoryContainer protected ()
    extends Component[VictoryContainerProps, js.Object, Any] {
    def this(props: VictoryContainerProps) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MVictoryContainer(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MVictoryContainer(): Unit = js.native
    
    /* private */ var containerId: Any = js.native
    
    /* private */ var containerRef: Any = js.native
    
    def getChildren(props: Any): Any = js.native
    
    def getIdForElement(elementName: Any): String = js.native
    
    def getOUIAProps(props: Any): Any = js.native
    
    def handleWheel(e: Any): Any = js.native
    
    def portalDeregister(key: Any): Unit = js.native
    
    /* private */ var portalRef: Any = js.native
    
    def portalRegister(): Double = js.native
    
    def portalUpdate(key: Any, el: Any): Unit = js.native
    
    def renderContainer(props: Any, svgProps: Any, style: Any): Element = js.native
    
    def saveContainerRef(container: HTMLElement): HTMLElement = js.native
    
    def savePortalRef(portal: Any): Any = js.native
    
    /* private */ var shouldHandleWheel: Any = js.native
  }
  /* static members */
  object VictoryContainer {
    
    @JSImport("victory-core/lib/victory-container/victory-container", "VictoryContainer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-core/lib/victory-container/victory-container", "VictoryContainer.contextType")
    @js.native
    def contextType: Context[TransitionTimer] = js.native
    inline def contextType_=(x: Context[TransitionTimer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-container/victory-container", "VictoryContainer.defaultProps")
    @js.native
    def defaultProps: PortalComponent = js.native
    inline def defaultProps_=(x: PortalComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-container/victory-container", "VictoryContainer.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-container/victory-container", "VictoryContainer.propTypes")
    @js.native
    def propTypes: Arialabelledby = js.native
    inline def propTypes_=(x: Arialabelledby): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-container/victory-container", "VictoryContainer.role")
    @js.native
    def role: String = js.native
    inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
  }
  
  trait VictoryContainerProps extends StObject {
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var containerId: js.UndefOr[Double | String] = js.undefined
    
    var containerRef: js.UndefOr[Ref[HTMLElement]] = js.undefined
    
    var desc: js.UndefOr[String] = js.undefined
    
    var events: js.UndefOr[DOMAttributes[Any]] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var origin: js.UndefOr[OriginType] = js.undefined
    
    var ouiaId: js.UndefOr[Double | String] = js.undefined
    
    var ouiaSafe: js.UndefOr[Boolean] = js.undefined
    
    var ouiaType: js.UndefOr[String] = js.undefined
    
    var polar: js.UndefOr[Boolean] = js.undefined
    
    var portalComponent: js.UndefOr[ReactElement] = js.undefined
    
    var portalZIndex: js.UndefOr[Double] = js.undefined
    
    var preserveAspectRatio: js.UndefOr[String] = js.undefined
    
    var responsive: js.UndefOr[Boolean] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var scale: js.UndefOr[`0`] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var theme: js.UndefOr[VictoryThemeDefinition] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object VictoryContainerProps {
    
    inline def apply(): VictoryContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryContainerProps]
    }
    
    extension [Self <: VictoryContainerProps](x: Self) {
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def setChildren(value: ReactElement | js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContainerId(value: Double | String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
      
      inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
      
      inline def setContainerRef(value: Ref[HTMLElement]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
      
      inline def setContainerRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "containerRef", js.Any.fromFunction1(value))
      
      inline def setContainerRefNull: Self = StObject.set(x, "containerRef", null)
      
      inline def setContainerRefUndefined: Self = StObject.set(x, "containerRef", js.undefined)
      
      inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
      
      inline def setEvents(value: DOMAttributes[Any]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOrigin(value: OriginType): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setOuiaId(value: Double | String): Self = StObject.set(x, "ouiaId", value.asInstanceOf[js.Any])
      
      inline def setOuiaIdUndefined: Self = StObject.set(x, "ouiaId", js.undefined)
      
      inline def setOuiaSafe(value: Boolean): Self = StObject.set(x, "ouiaSafe", value.asInstanceOf[js.Any])
      
      inline def setOuiaSafeUndefined: Self = StObject.set(x, "ouiaSafe", js.undefined)
      
      inline def setOuiaType(value: String): Self = StObject.set(x, "ouiaType", value.asInstanceOf[js.Any])
      
      inline def setOuiaTypeUndefined: Self = StObject.set(x, "ouiaType", js.undefined)
      
      inline def setPolar(value: Boolean): Self = StObject.set(x, "polar", value.asInstanceOf[js.Any])
      
      inline def setPolarUndefined: Self = StObject.set(x, "polar", js.undefined)
      
      inline def setPortalComponent(value: ReactElement): Self = StObject.set(x, "portalComponent", value.asInstanceOf[js.Any])
      
      inline def setPortalComponentUndefined: Self = StObject.set(x, "portalComponent", js.undefined)
      
      inline def setPortalZIndex(value: Double): Self = StObject.set(x, "portalZIndex", value.asInstanceOf[js.Any])
      
      inline def setPortalZIndexUndefined: Self = StObject.set(x, "portalZIndex", js.undefined)
      
      inline def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
      
      inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setScale(value: `0`): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTheme(value: VictoryThemeDefinition): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
