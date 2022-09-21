package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shadowsSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ShadowsSmall", JSImport.Default)
  @js.native
  val default: FC[ShadowsSmallProps] = js.native
  
  trait ShadowsSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ShadowsSmallProps {
    
    inline def apply(): ShadowsSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShadowsSmallProps]
    }
    
    extension [Self <: ShadowsSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ShadowsSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `shadowsSmallMod.foo` */
  override def _to: FC[ShadowsSmallProps] = default
}
