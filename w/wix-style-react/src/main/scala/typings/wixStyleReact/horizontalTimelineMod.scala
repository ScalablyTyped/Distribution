package typings.wixStyleReact

import typings.csstype.mod.WidthProperty
import typings.react.mod.FC
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object horizontalTimelineMod {
  
  @JSImport("wix-style-react/dist/es/src/HorizontalTimeline", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[HorizontalTimelineProps, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/es/src/HorizontalTimeline", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/es/src/HorizontalTimeline", "default.ActiveIcon")
    @js.native
    def ActiveIcon: FC[js.Object] = js.native
    inline def ActiveIcon_=(x: FC[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ActiveIcon")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/es/src/HorizontalTimeline", "default.CompleteIcon")
    @js.native
    def CompleteIcon: FC[js.Object] = js.native
    inline def CompleteIcon_=(x: FC[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CompleteIcon")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/es/src/HorizontalTimeline", "default.DefaultIcon")
    @js.native
    def DefaultIcon: FC[js.Object] = js.native
    inline def DefaultIcon_=(x: FC[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultIcon")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/es/src/HorizontalTimeline", "default.DestructiveIcon")
    @js.native
    def DestructiveIcon: FC[js.Object] = js.native
    inline def DestructiveIcon_=(x: FC[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DestructiveIcon")(x.asInstanceOf[js.Any])
  }
  
  type HorizontalTimeline = PureComponent[HorizontalTimelineProps, js.Object, js.Any]
  
  trait HorizontalTimelineItem extends StObject {
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var label: String
    
    var skin: js.UndefOr[HorizontalTimelineItemSkin] = js.undefined
    
    var width: js.UndefOr[WidthProperty[String | Double]] = js.undefined
  }
  object HorizontalTimelineItem {
    
    inline def apply(label: String): HorizontalTimelineItem = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[HorizontalTimelineItem]
    }
    
    extension [Self <: HorizontalTimelineItem](x: Self) {
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setSkin(value: HorizontalTimelineItemSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setWidth(value: WidthProperty[String | Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
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
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var items: js.Array[HorizontalTimelineItem]
  }
  object HorizontalTimelineProps {
    
    inline def apply(items: js.Array[HorizontalTimelineItem]): HorizontalTimelineProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[HorizontalTimelineProps]
    }
    
    extension [Self <: HorizontalTimelineProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setItems(value: js.Array[HorizontalTimelineItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: HorizontalTimelineItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    }
  }
}
