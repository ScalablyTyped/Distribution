package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusCompleteFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/StatusCompleteFilled", JSImport.Default)
  @js.native
  val default: SFC[StatusCompleteFilledProps] = js.native
  
  trait StatusCompleteFilledProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object StatusCompleteFilledProps {
    
    inline def apply(): StatusCompleteFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusCompleteFilledProps]
    }
    
    extension [Self <: StatusCompleteFilledProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[StatusCompleteFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `statusCompleteFilledMod.foo` */
  override def _to: SFC[StatusCompleteFilledProps] = default
}
