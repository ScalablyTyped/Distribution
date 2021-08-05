package typings.wixStyleReact

import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.wixStyleReact.calendarPanelMod.SelectedDaysType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarPanelFooterMod {
  
  @JSImport("wix-style-react/dist/es/src/CalendarPanelFooter", JSImport.Default)
  @js.native
  class default ()
    extends Component[CalendarPanelFooterProps, js.Object, js.Any]
  
  type CalendarPanelFooter = Component[CalendarPanelFooterProps, js.Object, js.Any]
  
  trait CalendarPanelFooterItem extends StObject {
    
    var buttonType: js.UndefOr[CalendarPanelFooterItemButtonType] = js.undefined
    
    var collapseLabel: js.UndefOr[ReactNode] = js.undefined
    
    var content: js.UndefOr[ReactNode] = js.undefined
    
    var expandLabel: js.UndefOr[ReactNode] = js.undefined
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object CalendarPanelFooterItem {
    
    inline def apply(): CalendarPanelFooterItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarPanelFooterItem]
    }
    
    extension [Self <: CalendarPanelFooterItem](x: Self) {
      
      inline def setButtonType(value: CalendarPanelFooterItemButtonType): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
      
      inline def setButtonTypeUndefined: Self = StObject.set(x, "buttonType", js.undefined)
      
      inline def setCollapseLabel(value: ReactNode): Self = StObject.set(x, "collapseLabel", value.asInstanceOf[js.Any])
      
      inline def setCollapseLabelUndefined: Self = StObject.set(x, "collapseLabel", js.undefined)
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setExpandLabel(value: ReactNode): Self = StObject.set(x, "expandLabel", value.asInstanceOf[js.Any])
      
      inline def setExpandLabelUndefined: Self = StObject.set(x, "expandLabel", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.textButton
    - typings.wixStyleReact.wixStyleReactStrings.button
  */
  trait CalendarPanelFooterItemButtonType extends StObject
  object CalendarPanelFooterItemButtonType {
    
    inline def button: typings.wixStyleReact.wixStyleReactStrings.button = "button".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.button]
    
    inline def textButton: typings.wixStyleReact.wixStyleReactStrings.textButton = "textButton".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.textButton]
  }
  
  trait CalendarPanelFooterProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    def dateToString(selectedDays: SelectedDaysType): String
    
    var primaryActionDisabled: Boolean
    
    var primaryActionLabel: String
    
    var primaryActionOnClick: MouseEventHandler[HTMLButtonElement]
    
    var secondaryActionLabel: String
    
    var secondaryActionOnClick: MouseEventHandler[HTMLButtonElement]
    
    var selectedDays: js.UndefOr[SelectedDaysType] = js.undefined
  }
  object CalendarPanelFooterProps {
    
    inline def apply(
      dateToString: SelectedDaysType => String,
      primaryActionDisabled: Boolean,
      primaryActionLabel: String,
      primaryActionOnClick: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit,
      secondaryActionLabel: String,
      secondaryActionOnClick: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit
    ): CalendarPanelFooterProps = {
      val __obj = js.Dynamic.literal(dateToString = js.Any.fromFunction1(dateToString), primaryActionDisabled = primaryActionDisabled.asInstanceOf[js.Any], primaryActionLabel = primaryActionLabel.asInstanceOf[js.Any], primaryActionOnClick = js.Any.fromFunction1(primaryActionOnClick), secondaryActionLabel = secondaryActionLabel.asInstanceOf[js.Any], secondaryActionOnClick = js.Any.fromFunction1(secondaryActionOnClick))
      __obj.asInstanceOf[CalendarPanelFooterProps]
    }
    
    extension [Self <: CalendarPanelFooterProps](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDateToString(value: SelectedDaysType => String): Self = StObject.set(x, "dateToString", js.Any.fromFunction1(value))
      
      inline def setPrimaryActionDisabled(value: Boolean): Self = StObject.set(x, "primaryActionDisabled", value.asInstanceOf[js.Any])
      
      inline def setPrimaryActionLabel(value: String): Self = StObject.set(x, "primaryActionLabel", value.asInstanceOf[js.Any])
      
      inline def setPrimaryActionOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "primaryActionOnClick", js.Any.fromFunction1(value))
      
      inline def setSecondaryActionLabel(value: String): Self = StObject.set(x, "secondaryActionLabel", value.asInstanceOf[js.Any])
      
      inline def setSecondaryActionOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "secondaryActionOnClick", js.Any.fromFunction1(value))
      
      inline def setSelectedDays(value: SelectedDaysType): Self = StObject.set(x, "selectedDays", value.asInstanceOf[js.Any])
      
      inline def setSelectedDaysUndefined: Self = StObject.set(x, "selectedDays", js.undefined)
    }
  }
}
