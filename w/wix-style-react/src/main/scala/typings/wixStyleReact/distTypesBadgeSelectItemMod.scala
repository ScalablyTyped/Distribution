package typings.wixStyleReact

import typings.react.mod.ReactNode
import typings.wixStyleReact.anon.IdOverrideOptionStyle
import typings.wixStyleReact.anon.Skin
import typings.wixStyleReact.distTypesBadgeMod.BadgeSkin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBadgeSelectItemMod {
  
  @JSImport("wix-style-react/dist/types/BadgeSelectItem", "badgeSelectItemBuilder")
  @js.native
  val badgeSelectItemBuilder: BadgeSelectItemBuilderFn = js.native
  
  type BadgeSelectItem = BadgeSelectOption
  
  type BadgeSelectItemBuilderFn = js.Function1[/* data */ Skin, IdOverrideOptionStyle]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.small
    - typings.wixStyleReact.wixStyleReactStrings.medium
  */
  trait BadgeSelectItemSizes extends StObject
  object BadgeSelectItemSizes {
    
    inline def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.general
    - typings.wixStyleReact.wixStyleReactStrings.secondaryText
    - typings.wixStyleReact.wixStyleReactStrings.danger
    - typings.wixStyleReact.wixStyleReactStrings.standard
    - typings.wixStyleReact.wixStyleReactStrings.backgroundSecondary
    - typings.wixStyleReact.wixStyleReactStrings.primaryLightText
    - typings.wixStyleReact.wixStyleReactStrings.success
    - typings.wixStyleReact.wixStyleReactStrings.warning
    - typings.wixStyleReact.wixStyleReactStrings.urgent
    - typings.wixStyleReact.wixStyleReactStrings.neutral
    - typings.wixStyleReact.wixStyleReactStrings.neutralStandard
    - typings.wixStyleReact.wixStyleReactStrings.mainMutedHover
    - typings.wixStyleReact.wixStyleReactStrings.neutralSuccess
    - typings.wixStyleReact.wixStyleReactStrings.successMutedHover
    - typings.wixStyleReact.wixStyleReactStrings.neutralDanger
    - typings.wixStyleReact.wixStyleReactStrings.dangerMutedHover
    - typings.wixStyleReact.wixStyleReactStrings.neutralLight
    - typings.wixStyleReact.wixStyleReactStrings.warningLight
    - typings.wixStyleReact.wixStyleReactStrings.premium
  */
  trait BadgeSelectItemSkin extends StObject
  object BadgeSelectItemSkin {
    
    inline def backgroundSecondary: typings.wixStyleReact.wixStyleReactStrings.backgroundSecondary = "backgroundSecondary".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.backgroundSecondary]
    
    inline def danger: typings.wixStyleReact.wixStyleReactStrings.danger = "danger".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.danger]
    
    inline def dangerMutedHover: typings.wixStyleReact.wixStyleReactStrings.dangerMutedHover = "dangerMutedHover".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.dangerMutedHover]
    
    inline def general: typings.wixStyleReact.wixStyleReactStrings.general = "general".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.general]
    
    inline def mainMutedHover: typings.wixStyleReact.wixStyleReactStrings.mainMutedHover = "mainMutedHover".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.mainMutedHover]
    
    inline def neutral: typings.wixStyleReact.wixStyleReactStrings.neutral = "neutral".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.neutral]
    
    inline def neutralDanger: typings.wixStyleReact.wixStyleReactStrings.neutralDanger = "neutralDanger".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.neutralDanger]
    
    inline def neutralLight: typings.wixStyleReact.wixStyleReactStrings.neutralLight = "neutralLight".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.neutralLight]
    
    inline def neutralStandard: typings.wixStyleReact.wixStyleReactStrings.neutralStandard = "neutralStandard".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.neutralStandard]
    
    inline def neutralSuccess: typings.wixStyleReact.wixStyleReactStrings.neutralSuccess = "neutralSuccess".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.neutralSuccess]
    
    inline def premium: typings.wixStyleReact.wixStyleReactStrings.premium = "premium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.premium]
    
    inline def primaryLightText: typings.wixStyleReact.wixStyleReactStrings.primaryLightText = "primaryLightText".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.primaryLightText]
    
    inline def secondaryText: typings.wixStyleReact.wixStyleReactStrings.secondaryText = "secondaryText".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.secondaryText]
    
    inline def standard: typings.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.standard]
    
    inline def success: typings.wixStyleReact.wixStyleReactStrings.success = "success".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.success]
    
    inline def successMutedHover: typings.wixStyleReact.wixStyleReactStrings.successMutedHover = "successMutedHover".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.successMutedHover]
    
    inline def urgent: typings.wixStyleReact.wixStyleReactStrings.urgent = "urgent".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.urgent]
    
    inline def warning: typings.wixStyleReact.wixStyleReactStrings.warning = "warning".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.warning]
    
    inline def warningLight: typings.wixStyleReact.wixStyleReactStrings.warningLight = "warningLight".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.warningLight]
  }
  
  trait BadgeSelectOption extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var ellipsis: js.UndefOr[Boolean] = js.undefined
    
    var highlighted: js.UndefOr[Boolean] = js.undefined
    
    var id: String
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[BadgeSelectItemSizes] = js.undefined
    
    var skin: BadgeSkin
    
    var subtitle: js.UndefOr[String] = js.undefined
    
    var suffix: js.UndefOr[ReactNode] = js.undefined
    
    var text: ReactNode
  }
  object BadgeSelectOption {
    
    inline def apply(id: String, skin: BadgeSkin): BadgeSelectOption = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], skin = skin.asInstanceOf[js.Any])
      __obj.asInstanceOf[BadgeSelectOption]
    }
    
    extension [Self <: BadgeSelectOption](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEllipsis(value: Boolean): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      inline def setHighlighted(value: Boolean): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
      
      inline def setHighlightedUndefined: Self = StObject.set(x, "highlighted", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSize(value: BadgeSelectItemSizes): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSkin(value: BadgeSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setSuffix(value: ReactNode): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setText(value: ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
