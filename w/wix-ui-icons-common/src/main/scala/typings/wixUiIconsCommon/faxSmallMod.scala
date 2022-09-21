package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object faxSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FaxSmall", JSImport.Default)
  @js.native
  val default: FC[FaxSmallProps] = js.native
  
  trait FaxSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FaxSmallProps {
    
    inline def apply(): FaxSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FaxSmallProps]
    }
    
    extension [Self <: FaxSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FaxSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `faxSmallMod.foo` */
  override def _to: FC[FaxSmallProps] = default
}
