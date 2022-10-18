package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsPageSpecialMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/PageSpecial", JSImport.Default)
  @js.native
  val default: FC[PageSpecialProps] = js.native
  
  trait PageSpecialProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PageSpecialProps {
    
    inline def apply(): PageSpecialProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageSpecialProps]
    }
    
    extension [Self <: PageSpecialProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PageSpecialProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsPageSpecialMod.foo` */
  override def _to: FC[PageSpecialProps] = default
}
