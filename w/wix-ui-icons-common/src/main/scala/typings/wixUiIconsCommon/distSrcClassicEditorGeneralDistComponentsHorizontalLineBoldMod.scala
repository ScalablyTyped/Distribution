package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsHorizontalLineBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/HorizontalLineBold", JSImport.Default)
  @js.native
  val default: FC[HorizontalLineBoldProps] = js.native
  
  trait HorizontalLineBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HorizontalLineBoldProps {
    
    inline def apply(): HorizontalLineBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HorizontalLineBoldProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HorizontalLineBoldProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HorizontalLineBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsHorizontalLineBoldMod.foo` */
  override def _to: FC[HorizontalLineBoldProps] = default
}
