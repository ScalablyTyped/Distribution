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
    
    inline def apply(): TimelineItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimelineItem]
    }
    
    extension [Self <: TimelineItem](x: Self) {
      
      inline def setCustomPrefix(value: ReactNode): Self = StObject.set(x, "customPrefix", value.asInstanceOf[js.Any])
      
      inline def setCustomPrefixUndefined: Self = StObject.set(x, "customPrefix", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelAction(value: ReactNode): Self = StObject.set(x, "labelAction", value.asInstanceOf[js.Any])
      
      inline def setLabelActionUndefined: Self = StObject.set(x, "labelAction", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setSuffix(value: ReactNode | String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
  
  trait TimelineProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var items: js.Array[TimelineItem]
  }
  object TimelineProps {
    
    inline def apply(items: js.Array[TimelineItem]): TimelineProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimelineProps]
    }
    
    extension [Self <: TimelineProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setItems(value: js.Array[TimelineItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: TimelineItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    }
  }
}
