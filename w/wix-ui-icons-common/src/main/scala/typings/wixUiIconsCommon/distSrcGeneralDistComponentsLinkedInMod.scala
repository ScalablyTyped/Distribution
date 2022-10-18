package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsLinkedInMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/LinkedIn", JSImport.Default)
  @js.native
  val default: FC[LinkedInProps] = js.native
  
  trait LinkedInProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object LinkedInProps {
    
    inline def apply(): LinkedInProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkedInProps]
    }
    
    extension [Self <: LinkedInProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LinkedInProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsLinkedInMod.foo` */
  override def _to: FC[LinkedInProps] = default
}
