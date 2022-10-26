package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.wixStyleReact.anon.DisabledDisabledMessage
import typings.wixStyleReact.anon.HTMLAttributesHTMLDivElem
import typings.wixStyleReact.anon.`4`
import typings.wixStyleReact.wixStyleReactStrings.medium
import typings.wixStyleReact.wixStyleReactStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCardGalleryItemMod {
  
  @JSImport("wix-style-react/dist/types/CardGalleryItem", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[CardGalleryItemProps, js.Object, Any]
  
  type CardGalleryItem = PureComponent[CardGalleryItemProps, js.Object, Any]
  
  trait CardGalleryItemProps extends StObject {
    
    var aspectRatio: js.UndefOr[Double | String] = js.undefined
    
    var backgroundImageNode: js.UndefOr[ReactNode] = js.undefined
    
    var backgroundImageUrl: js.UndefOr[String] = js.undefined
    
    var badge: js.UndefOr[ReactNode] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var dragDisabled: js.UndefOr[Boolean] = js.undefined
    
    var dragHandleProps: js.UndefOr[HTMLAttributesHTMLDivElem] = js.undefined
    
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    var dragging: js.UndefOr[Boolean] = js.undefined
    
    var droppable: js.UndefOr[Boolean] = js.undefined
    
    var primaryActionProps: DisabledDisabledMessage
    
    var secondaryActionProps: js.UndefOr[`4`] = js.undefined
    
    var settingsMenu: js.UndefOr[ReactNode] = js.undefined
    
    var size: js.UndefOr[small | medium] = js.undefined
    
    var subtitle: js.UndefOr[ReactNode] = js.undefined
    
    var suffix: js.UndefOr[ReactNode] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object CardGalleryItemProps {
    
    inline def apply(primaryActionProps: DisabledDisabledMessage): CardGalleryItemProps = {
      val __obj = js.Dynamic.literal(primaryActionProps = primaryActionProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardGalleryItemProps]
    }
    
    extension [Self <: CardGalleryItemProps](x: Self) {
      
      inline def setAspectRatio(value: Double | String): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      inline def setBackgroundImageNode(value: ReactNode): Self = StObject.set(x, "backgroundImageNode", value.asInstanceOf[js.Any])
      
      inline def setBackgroundImageNodeUndefined: Self = StObject.set(x, "backgroundImageNode", js.undefined)
      
      inline def setBackgroundImageUrl(value: String): Self = StObject.set(x, "backgroundImageUrl", value.asInstanceOf[js.Any])
      
      inline def setBackgroundImageUrlUndefined: Self = StObject.set(x, "backgroundImageUrl", js.undefined)
      
      inline def setBadge(value: ReactNode): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDragDisabled(value: Boolean): Self = StObject.set(x, "dragDisabled", value.asInstanceOf[js.Any])
      
      inline def setDragDisabledUndefined: Self = StObject.set(x, "dragDisabled", js.undefined)
      
      inline def setDragHandleProps(value: HTMLAttributesHTMLDivElem): Self = StObject.set(x, "dragHandleProps", value.asInstanceOf[js.Any])
      
      inline def setDragHandlePropsUndefined: Self = StObject.set(x, "dragHandleProps", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      inline def setDraggingUndefined: Self = StObject.set(x, "dragging", js.undefined)
      
      inline def setDroppable(value: Boolean): Self = StObject.set(x, "droppable", value.asInstanceOf[js.Any])
      
      inline def setDroppableUndefined: Self = StObject.set(x, "droppable", js.undefined)
      
      inline def setPrimaryActionProps(value: DisabledDisabledMessage): Self = StObject.set(x, "primaryActionProps", value.asInstanceOf[js.Any])
      
      inline def setSecondaryActionProps(value: `4`): Self = StObject.set(x, "secondaryActionProps", value.asInstanceOf[js.Any])
      
      inline def setSecondaryActionPropsUndefined: Self = StObject.set(x, "secondaryActionProps", js.undefined)
      
      inline def setSettingsMenu(value: ReactNode): Self = StObject.set(x, "settingsMenu", value.asInstanceOf[js.Any])
      
      inline def setSettingsMenuUndefined: Self = StObject.set(x, "settingsMenu", js.undefined)
      
      inline def setSize(value: small | medium): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setSuffix(value: ReactNode): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
