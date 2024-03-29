package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsHeaderMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/Header", JSImport.Default)
  @js.native
  val default: FC[HeaderProps] = js.native
  
  trait HeaderProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HeaderProps {
    
    inline def apply(): HeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeaderProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HeaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsHeaderMod.foo` */
  override def _to: FC[HeaderProps] = default
}
