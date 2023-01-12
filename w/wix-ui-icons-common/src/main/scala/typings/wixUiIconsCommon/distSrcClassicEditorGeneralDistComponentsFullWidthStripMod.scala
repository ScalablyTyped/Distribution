package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsFullWidthStripMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/FullWidthStrip", JSImport.Default)
  @js.native
  val default: FC[FullWidthStripProps] = js.native
  
  trait FullWidthStripProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FullWidthStripProps {
    
    inline def apply(): FullWidthStripProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FullWidthStripProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FullWidthStripProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FullWidthStripProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsFullWidthStripMod.foo` */
  override def _to: FC[FullWidthStripProps] = default
}
