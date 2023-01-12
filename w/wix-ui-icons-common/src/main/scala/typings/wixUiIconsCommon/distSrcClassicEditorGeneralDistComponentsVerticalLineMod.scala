package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsVerticalLineMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/VerticalLine", JSImport.Default)
  @js.native
  val default: FC[VerticalLineProps] = js.native
  
  trait VerticalLineProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object VerticalLineProps {
    
    inline def apply(): VerticalLineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerticalLineProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VerticalLineProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[VerticalLineProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsVerticalLineMod.foo` */
  override def _to: FC[VerticalLineProps] = default
}
