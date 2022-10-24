package typings.wixStyleReact

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComposerSidebarMod {
  
  @JSImport("wix-style-react/dist/types/ComposerSidebar", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[ComposerSidebarProps, js.Object, Any]
  
  type ComposerSidebar = PureComponent[ComposerSidebarProps, js.Object, Any]
  
  trait ComposerSidebarItem extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[Any] = js.undefined
    
    var id: String | Double
    
    var label: String
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var sectionTitle: js.UndefOr[String] = js.undefined
  }
  object ComposerSidebarItem {
    
    inline def apply(id: String | Double, label: String): ComposerSidebarItem = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComposerSidebarItem]
    }
    
    extension [Self <: ComposerSidebarItem](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(value: Any): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setSectionTitle(value: String): Self = StObject.set(x, "sectionTitle", value.asInstanceOf[js.Any])
      
      inline def setSectionTitleUndefined: Self = StObject.set(x, "sectionTitle", js.undefined)
    }
  }
  
  trait ComposerSidebarProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var items: js.UndefOr[js.Array[ComposerSidebarItem]] = js.undefined
    
    var labelPlacement: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: wix-style-react.wix-style-react/dist/types/ToggleButton.ToggleButtonProps['labelPlacement'] */ js.Any
      ] = js.undefined
    
    var labelTooltipProps: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: wix-style-react.wix-style-react/dist/types/ToggleButton.ToggleButtonProps['tooltipProps'] */ js.Any
      ] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var selectedId: js.UndefOr[Double | String] = js.undefined
    
    var size: js.UndefOr[String] = js.undefined
  }
  object ComposerSidebarProps {
    
    inline def apply(): ComposerSidebarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComposerSidebarProps]
    }
    
    extension [Self <: ComposerSidebarProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setItems(value: js.Array[ComposerSidebarItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: ComposerSidebarItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLabelPlacement(
        value: /* import warning: importer.ImportType#apply Failed type conversion: wix-style-react.wix-style-react/dist/types/ToggleButton.ToggleButtonProps['labelPlacement'] */ js.Any
      ): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
      
      inline def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
      
      inline def setLabelTooltipProps(
        value: /* import warning: importer.ImportType#apply Failed type conversion: wix-style-react.wix-style-react/dist/types/ToggleButton.ToggleButtonProps['tooltipProps'] */ js.Any
      ): Self = StObject.set(x, "labelTooltipProps", value.asInstanceOf[js.Any])
      
      inline def setLabelTooltipPropsUndefined: Self = StObject.set(x, "labelTooltipProps", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setSelectedId(value: Double | String): Self = StObject.set(x, "selectedId", value.asInstanceOf[js.Any])
      
      inline def setSelectedIdUndefined: Self = StObject.set(x, "selectedId", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
