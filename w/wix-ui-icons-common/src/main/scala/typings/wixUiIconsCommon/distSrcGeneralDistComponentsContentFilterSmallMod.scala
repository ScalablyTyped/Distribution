package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsContentFilterSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ContentFilterSmall", JSImport.Default)
  @js.native
  val default: FC[ContentFilterSmallProps] = js.native
  
  trait ContentFilterSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ContentFilterSmallProps {
    
    inline def apply(): ContentFilterSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentFilterSmallProps]
    }
    
    extension [Self <: ContentFilterSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ContentFilterSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsContentFilterSmallMod.foo` */
  override def _to: FC[ContentFilterSmallProps] = default
}
