package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsPanToolSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PanToolSmall", JSImport.Default)
  @js.native
  val default: FC[PanToolSmallProps] = js.native
  
  trait PanToolSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PanToolSmallProps {
    
    inline def apply(): PanToolSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanToolSmallProps]
    }
    
    extension [Self <: PanToolSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PanToolSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsPanToolSmallMod.foo` */
  override def _to: FC[PanToolSmallProps] = default
}
