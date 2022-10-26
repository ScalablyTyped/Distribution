package typings.wixStyleReact

import typings.react.mod.EventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.wixStyleReact.distTypesCommonMod.IconElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBadgeMod {
  
  @JSImport("wix-style-react/dist/types/Badge", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[BadgeProps, js.Object, Any]
  
  /* Inlined {[ key in wix-style-react.wix-style-react/dist/types/Badge.BadgeSize ]: wix-style-react.wix-style-react/dist/types/Badge.BadgeSize} */
  object SIZE {
    
    @JSImport("wix-style-react/dist/types/Badge", "SIZE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Badge", "SIZE.medium")
    @js.native
    def medium: BadgeSize = js.native
    inline def medium_=(x: BadgeSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("medium")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Badge", "SIZE.small")
    @js.native
    def small: BadgeSize = js.native
    inline def small_=(x: BadgeSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("small")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Badge", "SIZE.tiny")
    @js.native
    def tiny: BadgeSize = js.native
    inline def tiny_=(x: BadgeSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tiny")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined {[ key in wix-style-react.wix-style-react/dist/types/Badge.BadgeSkin ]: wix-style-react.wix-style-react/dist/types/Badge.BadgeSkin} */
  object SKIN {
    
    @JSImport("wix-style-react/dist/types/Badge", "SKIN")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Badge", "SKIN.danger")
    @js.native
    def danger: BadgeSkin = js.native
    inline def danger_=(x: BadgeSkin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("danger")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Badge", "SKIN.general")
    @js.native
    def general: BadgeSkin = js.native
    inline def general_=(x: BadgeSkin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("general")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Badge", "SKIN.neutral")
    @js.native
    def neutral: BadgeSkin = js.native
    
    @JSImport("wix-style-react/dist/types/Badge", "SKIN.neutralDanger")
    @js.native
    def neutralDanger: BadgeSkin = js.native
    inline def neutralDanger_=(x: BadgeSkin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("neutralDanger")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Badge", "SKIN.neutralLight")
    @js.native
    def neutralLight: BadgeSkin = js.native
    inline def neutralLight_=(x: BadgeSkin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("neutralLight")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Badge", "SKIN.neutralStandard")
    @js.native
    def neutralStandard: BadgeSkin = js.native
    inline def neutralStandard_=(x: BadgeSkin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("neutralStandard")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Badge", "SKIN.neutralSuccess")
    @js.native
    def neutralSuccess: BadgeSkin = js.native
    inline def neutralSuccess_=(x: BadgeSkin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("neutralSuccess")(x.asInstanceOf[js.Any])
    
    inline def neutral_=(x: BadgeSkin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("neutral")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Badge", "SKIN.premium")
    @js.native
    def premium: BadgeSkin = js.native
    inline def premium_=(x: BadgeSkin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("premium")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Badge", "SKIN.standard")
    @js.native
    def standard: BadgeSkin = js.native
    inline def standard_=(x: BadgeSkin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("standard")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Badge", "SKIN.success")
    @js.native
    def success: BadgeSkin = js.native
    inline def success_=(x: BadgeSkin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("success")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Badge", "SKIN.urgent")
    @js.native
    def urgent: BadgeSkin = js.native
    inline def urgent_=(x: BadgeSkin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("urgent")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Badge", "SKIN.warning")
    @js.native
    def warning: BadgeSkin = js.native
    
    @JSImport("wix-style-react/dist/types/Badge", "SKIN.warningLight")
    @js.native
    def warningLight: BadgeSkin = js.native
    inline def warningLight_=(x: BadgeSkin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warningLight")(x.asInstanceOf[js.Any])
    
    inline def warning_=(x: BadgeSkin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warning")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined {[ key in wix-style-react.wix-style-react/dist/types/Badge.BadgeType ]: wix-style-react.wix-style-react/dist/types/Badge.BadgeType} */
  object TYPE {
    
    @JSImport("wix-style-react/dist/types/Badge", "TYPE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Badge", "TYPE.outlined")
    @js.native
    def outlined: BadgeType = js.native
    inline def outlined_=(x: BadgeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outlined")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Badge", "TYPE.solid")
    @js.native
    def solid: BadgeType = js.native
    inline def solid_=(x: BadgeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("solid")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Badge", "TYPE.transparent")
    @js.native
    def transparent: BadgeType = js.native
    inline def transparent_=(x: BadgeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transparent")(x.asInstanceOf[js.Any])
  }
  
  type Badge = PureComponent[BadgeProps, js.Object, Any]
  
  trait BadgeProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var noPadding: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[EventHandler[MouseEvent[HTMLElement, NativeMouseEvent]]] = js.undefined
    
    var prefixIcon: js.UndefOr[IconElement] = js.undefined
    
    var size: js.UndefOr[BadgeSize] = js.undefined
    
    var skin: js.UndefOr[BadgeSkin] = js.undefined
    
    var suffixIcon: js.UndefOr[IconElement] = js.undefined
    
    var `type`: js.UndefOr[BadgeType] = js.undefined
    
    var uppercase: js.UndefOr[Boolean] = js.undefined
  }
  object BadgeProps {
    
    inline def apply(): BadgeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BadgeProps]
    }
    
    extension [Self <: BadgeProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setNoPadding(value: Boolean): Self = StObject.set(x, "noPadding", value.asInstanceOf[js.Any])
      
      inline def setNoPaddingUndefined: Self = StObject.set(x, "noPadding", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPrefixIcon(value: IconElement): Self = StObject.set(x, "prefixIcon", value.asInstanceOf[js.Any])
      
      inline def setPrefixIconUndefined: Self = StObject.set(x, "prefixIcon", js.undefined)
      
      inline def setSize(value: BadgeSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSkin(value: BadgeSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setSuffixIcon(value: IconElement): Self = StObject.set(x, "suffixIcon", value.asInstanceOf[js.Any])
      
      inline def setSuffixIconUndefined: Self = StObject.set(x, "suffixIcon", js.undefined)
      
      inline def setType(value: BadgeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUppercase(value: Boolean): Self = StObject.set(x, "uppercase", value.asInstanceOf[js.Any])
      
      inline def setUppercaseUndefined: Self = StObject.set(x, "uppercase", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.medium
    - typings.wixStyleReact.wixStyleReactStrings.small
    - typings.wixStyleReact.wixStyleReactStrings.tiny
  */
  trait BadgeSize extends StObject
  object BadgeSize {
    
    inline def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
    
    inline def tiny: typings.wixStyleReact.wixStyleReactStrings.tiny = "tiny".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.tiny]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.general
    - typings.wixStyleReact.wixStyleReactStrings.standard
    - typings.wixStyleReact.wixStyleReactStrings.danger
    - typings.wixStyleReact.wixStyleReactStrings.success
    - typings.wixStyleReact.wixStyleReactStrings.neutral
    - typings.wixStyleReact.wixStyleReactStrings.neutralLight
    - typings.wixStyleReact.wixStyleReactStrings.warning
    - typings.wixStyleReact.wixStyleReactStrings.warningLight
    - typings.wixStyleReact.wixStyleReactStrings.urgent
    - typings.wixStyleReact.wixStyleReactStrings.neutralStandard
    - typings.wixStyleReact.wixStyleReactStrings.neutralSuccess
    - typings.wixStyleReact.wixStyleReactStrings.neutralDanger
    - typings.wixStyleReact.wixStyleReactStrings.premium
  */
  trait BadgeSkin extends StObject
  object BadgeSkin {
    
    inline def danger: typings.wixStyleReact.wixStyleReactStrings.danger = "danger".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.danger]
    
    inline def general: typings.wixStyleReact.wixStyleReactStrings.general = "general".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.general]
    
    inline def neutral: typings.wixStyleReact.wixStyleReactStrings.neutral = "neutral".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.neutral]
    
    inline def neutralDanger: typings.wixStyleReact.wixStyleReactStrings.neutralDanger = "neutralDanger".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.neutralDanger]
    
    inline def neutralLight: typings.wixStyleReact.wixStyleReactStrings.neutralLight = "neutralLight".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.neutralLight]
    
    inline def neutralStandard: typings.wixStyleReact.wixStyleReactStrings.neutralStandard = "neutralStandard".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.neutralStandard]
    
    inline def neutralSuccess: typings.wixStyleReact.wixStyleReactStrings.neutralSuccess = "neutralSuccess".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.neutralSuccess]
    
    inline def premium: typings.wixStyleReact.wixStyleReactStrings.premium = "premium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.premium]
    
    inline def standard: typings.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.standard]
    
    inline def success: typings.wixStyleReact.wixStyleReactStrings.success = "success".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.success]
    
    inline def urgent: typings.wixStyleReact.wixStyleReactStrings.urgent = "urgent".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.urgent]
    
    inline def warning: typings.wixStyleReact.wixStyleReactStrings.warning = "warning".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.warning]
    
    inline def warningLight: typings.wixStyleReact.wixStyleReactStrings.warningLight = "warningLight".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.warningLight]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.solid
    - typings.wixStyleReact.wixStyleReactStrings.outlined
    - typings.wixStyleReact.wixStyleReactStrings.transparent
  */
  trait BadgeType extends StObject
  object BadgeType {
    
    inline def outlined: typings.wixStyleReact.wixStyleReactStrings.outlined = "outlined".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.outlined]
    
    inline def solid: typings.wixStyleReact.wixStyleReactStrings.solid = "solid".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.solid]
    
    inline def transparent: typings.wixStyleReact.wixStyleReactStrings.transparent = "transparent".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.transparent]
  }
}
