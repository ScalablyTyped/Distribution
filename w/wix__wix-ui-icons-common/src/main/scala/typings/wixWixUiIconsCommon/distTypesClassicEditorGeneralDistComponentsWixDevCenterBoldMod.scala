package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsWixDevCenterBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/WixDevCenterBold", JSImport.Default)
  @js.native
  val default: FC[WixDevCenterBoldProps] = js.native
  
  trait WixDevCenterBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object WixDevCenterBoldProps {
    
    inline def apply(): WixDevCenterBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixDevCenterBoldProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WixDevCenterBoldProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[WixDevCenterBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsWixDevCenterBoldMod.foo` */
  override def _to: FC[WixDevCenterBoldProps] = default
}
