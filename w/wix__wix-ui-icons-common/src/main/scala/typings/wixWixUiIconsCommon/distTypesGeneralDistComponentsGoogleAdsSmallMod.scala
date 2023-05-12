package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsGoogleAdsSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/GoogleAdsSmall", JSImport.Default)
  @js.native
  val default: FC[GoogleAdsSmallProps] = js.native
  
  trait GoogleAdsSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object GoogleAdsSmallProps {
    
    inline def apply(): GoogleAdsSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GoogleAdsSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GoogleAdsSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[GoogleAdsSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsGoogleAdsSmallMod.foo` */
  override def _to: FC[GoogleAdsSmallProps] = default
}
