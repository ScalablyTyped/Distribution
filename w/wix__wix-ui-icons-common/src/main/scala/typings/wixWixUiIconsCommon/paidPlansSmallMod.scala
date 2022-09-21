package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paidPlansSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/PaidPlansSmall", JSImport.Default)
  @js.native
  val default: FC[PaidPlansSmallProps] = js.native
  
  trait PaidPlansSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PaidPlansSmallProps {
    
    inline def apply(): PaidPlansSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaidPlansSmallProps]
    }
    
    extension [Self <: PaidPlansSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PaidPlansSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `paidPlansSmallMod.foo` */
  override def _to: FC[PaidPlansSmallProps] = default
}
