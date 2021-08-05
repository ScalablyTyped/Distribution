package typings.wixUiCore

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.stylableRuntime.typesMod.RuntimeStylesheet
import typings.wixUiCore.anon.DictotherPropName
import typings.wixUiCore.anon.IsTooltipActivated
import typings.wixUiCore.anon.ShowTooltip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsEllipsisTooltipEllipsisTooltipMod {
  
  @JSImport("wix-ui-core/src/components/ellipsis-tooltip/EllipsisTooltip", "EllipsisTooltip")
  @js.native
  class EllipsisTooltip protected ()
    extends Component[EllipsisTooltipProps, EllipsisTooltipState, js.Any] {
    def this(props: EllipsisTooltipProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: EllipsisTooltipProps, context: js.Any) = this()
    
    var _debouncedUpdate: js.Any = js.native
    
    def _isOverflowing(): Boolean = js.native
    
    def _loadTooltip(): js.Promise[Unit] = js.native
    
    def _loadTooltipStyle(): js.Promise[Unit] = js.native
    
    def _renderChildren(): Element = js.native
    
    def _updateEllipsisState(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MEllipsisTooltip(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MEllipsisTooltip(prevProps: js.Any): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MEllipsisTooltip(): Unit = js.native
    
    var dynamicAssetsLoadingTriggered: Boolean = js.native
    
    @JSName("state")
    var state_EllipsisTooltip: IsTooltipActivated = js.native
    
    var textNode: HTMLElement = js.native
  }
  /* static members */
  object EllipsisTooltip {
    
    @JSImport("wix-ui-core/src/components/ellipsis-tooltip/EllipsisTooltip", "EllipsisTooltip")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/src/components/ellipsis-tooltip/EllipsisTooltip", "EllipsisTooltip.defaultProps")
    @js.native
    def defaultProps: ShowTooltip = js.native
    inline def defaultProps_=(x: ShowTooltip): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait EllipsisTooltipProps extends StObject {
    
    /** a children render prop - usually a text component */
    def children(childrenProps: js.Any): DictotherPropName
    
    var className: js.UndefOr[String] = js.undefined
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    /** truncate the text but don't display a tooltip */
    var showTooltip: js.UndefOr[Boolean] = js.undefined
  }
  object EllipsisTooltipProps {
    
    inline def apply(children: js.Any => DictotherPropName): EllipsisTooltipProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[EllipsisTooltipProps]
    }
    
    extension [Self <: EllipsisTooltipProps](x: Self) {
      
      inline def setChildren(value: js.Any => DictotherPropName): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      inline def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      inline def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      inline def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
    }
  }
  
  trait EllipsisTooltipState extends StObject {
    
    var Tooltip: ComponentClass[js.Object, ComponentState]
    
    var isTooltipActivated: Boolean
    
    var tooltipStyles: RuntimeStylesheet
  }
  object EllipsisTooltipState {
    
    inline def apply(
      Tooltip: ComponentClass[js.Object, ComponentState],
      isTooltipActivated: Boolean,
      tooltipStyles: RuntimeStylesheet
    ): EllipsisTooltipState = {
      val __obj = js.Dynamic.literal(Tooltip = Tooltip.asInstanceOf[js.Any], isTooltipActivated = isTooltipActivated.asInstanceOf[js.Any], tooltipStyles = tooltipStyles.asInstanceOf[js.Any])
      __obj.asInstanceOf[EllipsisTooltipState]
    }
    
    extension [Self <: EllipsisTooltipState](x: Self) {
      
      inline def setIsTooltipActivated(value: Boolean): Self = StObject.set(x, "isTooltipActivated", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: ComponentClass[js.Object, ComponentState]): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipStyles(value: RuntimeStylesheet): Self = StObject.set(x, "tooltipStyles", value.asInstanceOf[js.Any])
    }
  }
}
