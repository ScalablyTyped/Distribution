package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsFullWidthStripBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/FullWidthStripBold", JSImport.Default)
  @js.native
  val default: FC[FullWidthStripBoldProps] = js.native
  
  trait FullWidthStripBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FullWidthStripBoldProps {
    
    inline def apply(): FullWidthStripBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FullWidthStripBoldProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FullWidthStripBoldProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FullWidthStripBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsFullWidthStripBoldMod.foo` */
  override def _to: FC[FullWidthStripBoldProps] = default
}
