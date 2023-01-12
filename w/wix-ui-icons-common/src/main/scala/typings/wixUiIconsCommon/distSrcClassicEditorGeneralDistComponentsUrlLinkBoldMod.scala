package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsUrlLinkBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/UrlLinkBold", JSImport.Default)
  @js.native
  val default: FC[UrlLinkBoldProps] = js.native
  
  trait UrlLinkBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object UrlLinkBoldProps {
    
    inline def apply(): UrlLinkBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UrlLinkBoldProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UrlLinkBoldProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UrlLinkBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsUrlLinkBoldMod.foo` */
  override def _to: FC[UrlLinkBoldProps] = default
}
