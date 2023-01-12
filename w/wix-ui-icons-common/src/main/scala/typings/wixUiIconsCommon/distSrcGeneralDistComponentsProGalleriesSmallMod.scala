package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsProGalleriesSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ProGalleriesSmall", JSImport.Default)
  @js.native
  val default: FC[ProGalleriesSmallProps] = js.native
  
  trait ProGalleriesSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ProGalleriesSmallProps {
    
    inline def apply(): ProGalleriesSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProGalleriesSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProGalleriesSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ProGalleriesSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsProGalleriesSmallMod.foo` */
  override def _to: FC[ProGalleriesSmallProps] = default
}
