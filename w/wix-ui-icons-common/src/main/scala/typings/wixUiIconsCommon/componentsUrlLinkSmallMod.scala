package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsUrlLinkSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/UrlLinkSmall", JSImport.Default)
  @js.native
  val default: FC[UrlLinkSmallProps] = js.native
  
  trait UrlLinkSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object UrlLinkSmallProps {
    
    inline def apply(): UrlLinkSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UrlLinkSmallProps]
    }
    
    extension [Self <: UrlLinkSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UrlLinkSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsUrlLinkSmallMod.foo` */
  override def _to: FC[UrlLinkSmallProps] = default
}
