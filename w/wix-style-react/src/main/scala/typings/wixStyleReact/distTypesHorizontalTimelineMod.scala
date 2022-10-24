package typings.wixStyleReact

import typings.csstype.mod.Property.Width
import typings.react.mod.FC
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHorizontalTimelineMod {
  
  @JSImport("wix-style-react/dist/types/HorizontalTimeline", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[HorizontalTimelineProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/HorizontalTimeline", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/HorizontalTimeline", "default.ActiveIcon")
    @js.native
    def ActiveIcon: FC[HorizontalTimelineIcon] = js.native
    inline def ActiveIcon_=(x: FC[HorizontalTimelineIcon]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ActiveIcon")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/HorizontalTimeline", "default.BoundaryIcon")
    @js.native
    def BoundaryIcon: FC[HorizontalTimelineIcon] = js.native
    inline def BoundaryIcon_=(x: FC[HorizontalTimelineIcon]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BoundaryIcon")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/HorizontalTimeline", "default.CompleteIcon")
    @js.native
    def CompleteIcon: FC[HorizontalTimelineIcon] = js.native
    inline def CompleteIcon_=(x: FC[HorizontalTimelineIcon]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CompleteIcon")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/HorizontalTimeline", "default.DefaultIcon")
    @js.native
    def DefaultIcon: FC[HorizontalTimelineIcon] = js.native
    inline def DefaultIcon_=(x: FC[HorizontalTimelineIcon]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultIcon")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/HorizontalTimeline", "default.DestructiveIcon")
    @js.native
    def DestructiveIcon: FC[js.Object] = js.native
    inline def DestructiveIcon_=(x: FC[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DestructiveIcon")(x.asInstanceOf[js.Any])
  }
  
  type HorizontalTimeline = PureComponent[HorizontalTimelineProps, js.Object, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.center
    - typings.wixStyleReact.wixStyleReactStrings.start
  */
  trait HorizontalTimelineAlignLabel extends StObject
  object HorizontalTimelineAlignLabel {
    
    inline def center: typings.wixStyleReact.wixStyleReactStrings.center = "center".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.center]
    
    inline def start: typings.wixStyleReact.wixStyleReactStrings.start = "start".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.start]
  }
  
  trait HorizontalTimelineIcon extends StObject {
    
    var skin: js.UndefOr[HorizontalTimelineSkin] = js.undefined
  }
  object HorizontalTimelineIcon {
    
    inline def apply(): HorizontalTimelineIcon = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HorizontalTimelineIcon]
    }
    
    extension [Self <: HorizontalTimelineIcon](x: Self) {
      
      inline def setSkin(value: HorizontalTimelineSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    }
  }
  
  trait HorizontalTimelineItem extends StObject {
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var labelEllipsis: js.UndefOr[Boolean] = js.undefined
    
    var line: js.UndefOr[HorizontalTimelineItemLine] = js.undefined
    
    var skin: js.UndefOr[HorizontalTimelineItemSkin] = js.undefined
    
    var width: js.UndefOr[Width[String | Double]] = js.undefined
  }
  object HorizontalTimelineItem {
    
    inline def apply(): HorizontalTimelineItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HorizontalTimelineItem]
    }
    
    extension [Self <: HorizontalTimelineItem](x: Self) {
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelEllipsis(value: Boolean): Self = StObject.set(x, "labelEllipsis", value.asInstanceOf[js.Any])
      
      inline def setLabelEllipsisUndefined: Self = StObject.set(x, "labelEllipsis", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLine(value: HorizontalTimelineItemLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setSkin(value: HorizontalTimelineItemSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setWidth(value: Width[String | Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.filled
    - typings.wixStyleReact.wixStyleReactStrings.dashed
  */
  trait HorizontalTimelineItemLine extends StObject
  object HorizontalTimelineItemLine {
    
    inline def dashed: typings.wixStyleReact.wixStyleReactStrings.dashed = "dashed".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.dashed]
    
    inline def filled: typings.wixStyleReact.wixStyleReactStrings.filled = "filled".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.filled]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.dark
    - typings.wixStyleReact.wixStyleReactStrings.light
  */
  trait HorizontalTimelineItemSkin extends StObject
  object HorizontalTimelineItemSkin {
    
    inline def dark: typings.wixStyleReact.wixStyleReactStrings.dark = "dark".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.dark]
    
    inline def light: typings.wixStyleReact.wixStyleReactStrings.light = "light".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.light]
  }
  
  trait HorizontalTimelineProps extends StObject {
    
    var alignLabel: js.UndefOr[HorizontalTimelineAlignLabel] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var items: js.UndefOr[js.Array[HorizontalTimelineItem]] = js.undefined
    
    var skin: js.UndefOr[HorizontalTimelineSkin] = js.undefined
  }
  object HorizontalTimelineProps {
    
    inline def apply(): HorizontalTimelineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HorizontalTimelineProps]
    }
    
    extension [Self <: HorizontalTimelineProps](x: Self) {
      
      inline def setAlignLabel(value: HorizontalTimelineAlignLabel): Self = StObject.set(x, "alignLabel", value.asInstanceOf[js.Any])
      
      inline def setAlignLabelUndefined: Self = StObject.set(x, "alignLabel", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setItems(value: js.Array[HorizontalTimelineItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: HorizontalTimelineItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setSkin(value: HorizontalTimelineSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.dark
    - typings.wixStyleReact.wixStyleReactStrings.standard
  */
  trait HorizontalTimelineSkin extends StObject
  object HorizontalTimelineSkin {
    
    inline def dark: typings.wixStyleReact.wixStyleReactStrings.dark = "dark".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.dark]
    
    inline def standard: typings.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.standard]
  }
}
