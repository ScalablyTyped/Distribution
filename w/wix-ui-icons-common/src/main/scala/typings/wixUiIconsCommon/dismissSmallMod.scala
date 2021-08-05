package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dismissSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DismissSmall", JSImport.Default)
  @js.native
  val default: SFC[DismissSmallProps] = js.native
  
  trait DismissSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object DismissSmallProps {
    
    inline def apply(): DismissSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DismissSmallProps]
    }
    
    extension [Self <: DismissSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[DismissSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `dismissSmallMod.foo` */
  override def _to: SFC[DismissSmallProps] = default
}
