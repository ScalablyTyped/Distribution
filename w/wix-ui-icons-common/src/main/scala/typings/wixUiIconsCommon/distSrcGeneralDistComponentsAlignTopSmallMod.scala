package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsAlignTopSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AlignTopSmall", JSImport.Default)
  @js.native
  val default: FC[AlignTopSmallProps] = js.native
  
  trait AlignTopSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AlignTopSmallProps {
    
    inline def apply(): AlignTopSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlignTopSmallProps]
    }
    
    extension [Self <: AlignTopSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AlignTopSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsAlignTopSmallMod.foo` */
  override def _to: FC[AlignTopSmallProps] = default
}
