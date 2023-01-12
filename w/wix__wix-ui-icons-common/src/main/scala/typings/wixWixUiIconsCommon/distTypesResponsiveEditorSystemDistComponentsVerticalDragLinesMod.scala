package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorSystemDistComponentsVerticalDragLinesMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/system/dist/components/VerticalDragLines", JSImport.Default)
  @js.native
  val default: FC[VerticalDragLinesProps] = js.native
  
  trait VerticalDragLinesProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object VerticalDragLinesProps {
    
    inline def apply(): VerticalDragLinesProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerticalDragLinesProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VerticalDragLinesProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[VerticalDragLinesProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorSystemDistComponentsVerticalDragLinesMod.foo` */
  override def _to: FC[VerticalDragLinesProps] = default
}
