package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsVerticalMenuBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/VerticalMenuBold", JSImport.Default)
  @js.native
  val default: FC[VerticalMenuBoldProps] = js.native
  
  trait VerticalMenuBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object VerticalMenuBoldProps {
    
    inline def apply(): VerticalMenuBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerticalMenuBoldProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VerticalMenuBoldProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[VerticalMenuBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsVerticalMenuBoldMod.foo` */
  override def _to: FC[VerticalMenuBoldProps] = default
}
