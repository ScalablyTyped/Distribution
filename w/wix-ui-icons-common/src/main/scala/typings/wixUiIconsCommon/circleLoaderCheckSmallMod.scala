package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circleLoaderCheckSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/CircleLoaderCheckSmall", JSImport.Default)
  @js.native
  val default: SFC[CircleLoaderCheckSmallProps] = js.native
  
  trait CircleLoaderCheckSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object CircleLoaderCheckSmallProps {
    
    inline def apply(): CircleLoaderCheckSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CircleLoaderCheckSmallProps]
    }
    
    extension [Self <: CircleLoaderCheckSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[CircleLoaderCheckSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `circleLoaderCheckSmallMod.foo` */
  override def _to: SFC[CircleLoaderCheckSmallProps] = default
}
