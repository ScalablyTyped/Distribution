package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addItemSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/AddItemSmall", JSImport.Default)
  @js.native
  val default: FC[AddItemSmallProps] = js.native
  
  trait AddItemSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AddItemSmallProps {
    
    inline def apply(): AddItemSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddItemSmallProps]
    }
    
    extension [Self <: AddItemSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AddItemSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `addItemSmallMod.foo` */
  override def _to: FC[AddItemSmallProps] = default
}
