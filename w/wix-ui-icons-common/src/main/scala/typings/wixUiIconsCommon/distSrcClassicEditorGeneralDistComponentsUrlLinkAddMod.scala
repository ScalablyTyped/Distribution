package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsUrlLinkAddMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/UrlLinkAdd", JSImport.Default)
  @js.native
  val default: FC[UrlLinkAddProps] = js.native
  
  trait UrlLinkAddProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object UrlLinkAddProps {
    
    inline def apply(): UrlLinkAddProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UrlLinkAddProps]
    }
    
    extension [Self <: UrlLinkAddProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UrlLinkAddProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsUrlLinkAddMod.foo` */
  override def _to: FC[UrlLinkAddProps] = default
}
