package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsWidgetMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/Widget", JSImport.Default)
  @js.native
  val default: FC[WidgetProps] = js.native
  
  trait WidgetProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object WidgetProps {
    
    inline def apply(): WidgetProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WidgetProps]
    }
    
    extension [Self <: WidgetProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[WidgetProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsWidgetMod.foo` */
  override def _to: FC[WidgetProps] = default
}
