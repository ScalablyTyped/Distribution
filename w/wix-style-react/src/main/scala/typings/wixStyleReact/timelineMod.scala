package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timelineMod {
  
  @JSImport("wix-style-react/dist/es/src/Timeline", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[TimelineProps, js.Object, js.Any]
  
  type Timeline = PureComponent[TimelineProps, js.Object, js.Any]
  
  trait TimelineItem extends StObject {
    
    var customPrefix: js.UndefOr[ReactNode] = js.undefined
    
    var label: ReactNode
    
    var labelAction: js.UndefOr[ReactNode] = js.undefined
    
    var suffix: js.UndefOr[ReactNode | String] = js.undefined
  }
  object TimelineItem {
    
    @scala.inline
    def apply(): TimelineItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimelineItem]
    }
    
    @scala.inline
    implicit class TimelineItemMutableBuilder[Self <: TimelineItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomPrefix(value: ReactNode): Self = StObject.set(x, "customPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomPrefixUndefined: Self = StObject.set(x, "customPrefix", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelAction(value: ReactNode): Self = StObject.set(x, "labelAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelActionUndefined: Self = StObject.set(x, "labelAction", js.undefined)
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setSuffix(value: ReactNode | String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
  
  trait TimelineProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var items: js.Array[TimelineItem]
  }
  object TimelineProps {
    
    @scala.inline
    def apply(items: js.Array[TimelineItem]): TimelineProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimelineProps]
    }
    
    @scala.inline
    implicit class TimelinePropsMutableBuilder[Self <: TimelineProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[TimelineItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: TimelineItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    }
  }
}
