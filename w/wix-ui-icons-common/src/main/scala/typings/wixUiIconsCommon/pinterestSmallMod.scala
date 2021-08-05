package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinterestSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PinterestSmall", JSImport.Default)
  @js.native
  val default: SFC[PinterestSmallProps] = js.native
  
  trait PinterestSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object PinterestSmallProps {
    
    inline def apply(): PinterestSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PinterestSmallProps]
    }
    
    extension [Self <: PinterestSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[PinterestSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `pinterestSmallMod.foo` */
  override def _to: SFC[PinterestSmallProps] = default
}
