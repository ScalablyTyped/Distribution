package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusCompleteFilledSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/StatusCompleteFilledSmall", JSImport.Default)
  @js.native
  val default: SFC[StatusCompleteFilledSmallProps] = js.native
  
  trait StatusCompleteFilledSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object StatusCompleteFilledSmallProps {
    
    inline def apply(): StatusCompleteFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusCompleteFilledSmallProps]
    }
    
    extension [Self <: StatusCompleteFilledSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[StatusCompleteFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `statusCompleteFilledSmallMod.foo` */
  override def _to: SFC[StatusCompleteFilledSmallProps] = default
}
