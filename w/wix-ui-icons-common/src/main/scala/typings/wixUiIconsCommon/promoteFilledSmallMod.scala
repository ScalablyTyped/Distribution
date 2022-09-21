package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promoteFilledSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PromoteFilledSmall", JSImport.Default)
  @js.native
  val default: FC[PromoteFilledSmallProps] = js.native
  
  trait PromoteFilledSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PromoteFilledSmallProps {
    
    inline def apply(): PromoteFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PromoteFilledSmallProps]
    }
    
    extension [Self <: PromoteFilledSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PromoteFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `promoteFilledSmallMod.foo` */
  override def _to: FC[PromoteFilledSmallProps] = default
}
