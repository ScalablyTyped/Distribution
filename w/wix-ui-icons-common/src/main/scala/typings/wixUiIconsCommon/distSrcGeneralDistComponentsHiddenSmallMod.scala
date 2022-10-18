package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsHiddenSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/HiddenSmall", JSImport.Default)
  @js.native
  val default: FC[HiddenSmallProps] = js.native
  
  trait HiddenSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HiddenSmallProps {
    
    inline def apply(): HiddenSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HiddenSmallProps]
    }
    
    extension [Self <: HiddenSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HiddenSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsHiddenSmallMod.foo` */
  override def _to: FC[HiddenSmallProps] = default
}
