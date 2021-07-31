package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.wixStyleReact.anon.DisabledMessage
import typings.wixStyleReact.anon.Label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardGalleryItemMod {
  
  @JSImport("wix-style-react/dist/es/src/CardGalleryItem", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[CardGalleryItemProps, js.Object, js.Any]
  
  type CardGalleryItem = PureComponent[CardGalleryItemProps, js.Object, js.Any]
  
  trait CardGalleryItemProps extends StObject {
    
    var backgroundImageNode: js.UndefOr[ReactNode] = js.undefined
    
    var backgroundImageUrl: js.UndefOr[String] = js.undefined
    
    var badge: js.UndefOr[ReactNode] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var primaryActionProps: DisabledMessage
    
    var secondaryActionProps: js.UndefOr[Label] = js.undefined
    
    var settingsMenu: js.UndefOr[ReactNode] = js.undefined
    
    var subtitle: js.UndefOr[ReactNode] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object CardGalleryItemProps {
    
    @scala.inline
    def apply(primaryActionProps: DisabledMessage): CardGalleryItemProps = {
      val __obj = js.Dynamic.literal(primaryActionProps = primaryActionProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardGalleryItemProps]
    }
    
    @scala.inline
    implicit class CardGalleryItemPropsMutableBuilder[Self <: CardGalleryItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundImageNode(value: ReactNode): Self = StObject.set(x, "backgroundImageNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundImageNodeUndefined: Self = StObject.set(x, "backgroundImageNode", js.undefined)
      
      @scala.inline
      def setBackgroundImageUrl(value: String): Self = StObject.set(x, "backgroundImageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundImageUrlUndefined: Self = StObject.set(x, "backgroundImageUrl", js.undefined)
      
      @scala.inline
      def setBadge(value: ReactNode): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setPrimaryActionProps(value: DisabledMessage): Self = StObject.set(x, "primaryActionProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryActionProps(value: Label): Self = StObject.set(x, "secondaryActionProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryActionPropsUndefined: Self = StObject.set(x, "secondaryActionProps", js.undefined)
      
      @scala.inline
      def setSettingsMenu(value: ReactNode): Self = StObject.set(x, "settingsMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettingsMenuUndefined: Self = StObject.set(x, "settingsMenu", js.undefined)
      
      @scala.inline
      def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
