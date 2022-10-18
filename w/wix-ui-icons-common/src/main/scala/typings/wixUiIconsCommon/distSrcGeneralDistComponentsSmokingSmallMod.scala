package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsSmokingSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SmokingSmall", JSImport.Default)
  @js.native
  val default: FC[SmokingSmallProps] = js.native
  
  trait SmokingSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SmokingSmallProps {
    
    inline def apply(): SmokingSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SmokingSmallProps]
    }
    
    extension [Self <: SmokingSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SmokingSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsSmokingSmallMod.foo` */
  override def _to: FC[SmokingSmallProps] = default
}
