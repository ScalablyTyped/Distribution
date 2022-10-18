package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemDistComponentsDragAndDropLockedLargeMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/DragAndDropLockedLarge", JSImport.Default)
  @js.native
  val default: FC[DragAndDropLockedLargeProps] = js.native
  
  trait DragAndDropLockedLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DragAndDropLockedLargeProps {
    
    inline def apply(): DragAndDropLockedLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragAndDropLockedLargeProps]
    }
    
    extension [Self <: DragAndDropLockedLargeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DragAndDropLockedLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSystemDistComponentsDragAndDropLockedLargeMod.foo` */
  override def _to: FC[DragAndDropLockedLargeProps] = default
}
