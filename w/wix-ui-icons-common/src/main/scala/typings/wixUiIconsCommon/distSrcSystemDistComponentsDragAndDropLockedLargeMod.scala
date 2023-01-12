package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSystemDistComponentsDragAndDropLockedLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/DragAndDropLockedLarge", JSImport.Default)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DragAndDropLockedLargeProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DragAndDropLockedLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcSystemDistComponentsDragAndDropLockedLargeMod.foo` */
  override def _to: FC[DragAndDropLockedLargeProps] = default
}
