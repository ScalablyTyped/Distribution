package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsPageDynamicSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/PageDynamicSmall", JSImport.Default)
  @js.native
  val default: FC[PageDynamicSmallProps] = js.native
  
  trait PageDynamicSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PageDynamicSmallProps {
    
    inline def apply(): PageDynamicSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageDynamicSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageDynamicSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PageDynamicSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsPageDynamicSmallMod.foo` */
  override def _to: FC[PageDynamicSmallProps] = default
}
