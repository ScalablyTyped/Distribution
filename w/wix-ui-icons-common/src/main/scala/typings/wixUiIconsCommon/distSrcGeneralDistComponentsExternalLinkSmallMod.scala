package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsExternalLinkSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ExternalLinkSmall", JSImport.Default)
  @js.native
  val default: FC[ExternalLinkSmallProps] = js.native
  
  trait ExternalLinkSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ExternalLinkSmallProps {
    
    inline def apply(): ExternalLinkSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExternalLinkSmallProps]
    }
    
    extension [Self <: ExternalLinkSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ExternalLinkSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsExternalLinkSmallMod.foo` */
  override def _to: FC[ExternalLinkSmallProps] = default
}
