package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsPinterestSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PinterestSmall", JSImport.Default)
  @js.native
  val default: FC[PinterestSmallProps] = js.native
  
  trait PinterestSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PinterestSmallProps {
    
    inline def apply(): PinterestSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PinterestSmallProps]
    }
    
    extension [Self <: PinterestSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PinterestSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsPinterestSmallMod.foo` */
  override def _to: FC[PinterestSmallProps] = default
}
