package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsMenuSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/MenuSmall", JSImport.Default)
  @js.native
  val default: FC[MenuSmallProps] = js.native
  
  trait MenuSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MenuSmallProps {
    
    inline def apply(): MenuSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MenuSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsMenuSmallMod.foo` */
  override def _to: FC[MenuSmallProps] = default
}
