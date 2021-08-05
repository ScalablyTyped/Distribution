package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.ReactChild
import typings.wordpressComponents.responsiveWrapperMod.ResponsiveWrapper.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responsiveWrapperMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/responsive-wrapper", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object ResponsiveWrapper {
    
    trait Props extends StObject {
      
      var children: ReactChild
      
      var naturalHeight: Double
      
      var naturalWidth: Double
    }
    object Props {
      
      inline def apply(children: ReactChild, naturalHeight: Double, naturalWidth: Double): Props = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], naturalHeight = naturalHeight.asInstanceOf[js.Any], naturalWidth = naturalWidth.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setChildren(value: ReactChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setNaturalHeight(value: Double): Self = StObject.set(x, "naturalHeight", value.asInstanceOf[js.Any])
        
        inline def setNaturalWidth(value: Double): Self = StObject.set(x, "naturalWidth", value.asInstanceOf[js.Any])
      }
    }
  }
}
