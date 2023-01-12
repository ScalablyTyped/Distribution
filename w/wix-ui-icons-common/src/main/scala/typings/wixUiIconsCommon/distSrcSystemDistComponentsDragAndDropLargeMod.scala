package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSystemDistComponentsDragAndDropLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/DragAndDropLarge", JSImport.Default)
  @js.native
  val default: FC[DragAndDropLargeProps] = js.native
  
  trait DragAndDropLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DragAndDropLargeProps {
    
    inline def apply(): DragAndDropLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragAndDropLargeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DragAndDropLargeProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DragAndDropLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcSystemDistComponentsDragAndDropLargeMod.foo` */
  override def _to: FC[DragAndDropLargeProps] = default
}
