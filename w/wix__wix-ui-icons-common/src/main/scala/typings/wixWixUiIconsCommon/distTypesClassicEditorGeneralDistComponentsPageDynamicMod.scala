package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsPageDynamicMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/PageDynamic", JSImport.Default)
  @js.native
  val default: FC[PageDynamicProps] = js.native
  
  trait PageDynamicProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PageDynamicProps {
    
    inline def apply(): PageDynamicProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageDynamicProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageDynamicProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PageDynamicProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsPageDynamicMod.foo` */
  override def _to: FC[PageDynamicProps] = default
}
