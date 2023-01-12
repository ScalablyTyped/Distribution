package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsPinBoldSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/PinBoldSmall", JSImport.Default)
  @js.native
  val default: FC[PinBoldSmallProps] = js.native
  
  trait PinBoldSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PinBoldSmallProps {
    
    inline def apply(): PinBoldSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PinBoldSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PinBoldSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PinBoldSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsPinBoldSmallMod.foo` */
  override def _to: FC[PinBoldSmallProps] = default
}
