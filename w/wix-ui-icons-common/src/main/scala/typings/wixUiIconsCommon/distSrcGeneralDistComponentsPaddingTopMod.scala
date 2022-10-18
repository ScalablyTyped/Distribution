package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsPaddingTopMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PaddingTop", JSImport.Default)
  @js.native
  val default: FC[PaddingTopProps] = js.native
  
  trait PaddingTopProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PaddingTopProps {
    
    inline def apply(): PaddingTopProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaddingTopProps]
    }
    
    extension [Self <: PaddingTopProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PaddingTopProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsPaddingTopMod.foo` */
  override def _to: FC[PaddingTopProps] = default
}
