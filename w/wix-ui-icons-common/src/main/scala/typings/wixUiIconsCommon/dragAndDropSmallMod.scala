package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragAndDropSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/DragAndDropSmall", JSImport.Default)
  @js.native
  val default: SFC[DragAndDropSmallProps] = js.native
  
  trait DragAndDropSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object DragAndDropSmallProps {
    
    inline def apply(): DragAndDropSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragAndDropSmallProps]
    }
    
    extension [Self <: DragAndDropSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[DragAndDropSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `dragAndDropSmallMod.foo` */
  override def _to: SFC[DragAndDropSmallProps] = default
}
