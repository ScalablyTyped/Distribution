package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsExtrnalLinkMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/ExtrnalLink", JSImport.Default)
  @js.native
  val default: FC[ExtrnalLinkProps] = js.native
  
  trait ExtrnalLinkProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ExtrnalLinkProps {
    
    inline def apply(): ExtrnalLinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtrnalLinkProps]
    }
    
    extension [Self <: ExtrnalLinkProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ExtrnalLinkProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsExtrnalLinkMod.foo` */
  override def _to: FC[ExtrnalLinkProps] = default
}
