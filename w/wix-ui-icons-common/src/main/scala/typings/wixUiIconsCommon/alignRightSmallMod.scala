package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alignRightSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AlignRightSmall", JSImport.Default)
  @js.native
  val default: SFC[AlignRightSmallProps] = js.native
  
  trait AlignRightSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object AlignRightSmallProps {
    
    inline def apply(): AlignRightSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlignRightSmallProps]
    }
    
    extension [Self <: AlignRightSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[AlignRightSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `alignRightSmallMod.foo` */
  override def _to: SFC[AlignRightSmallProps] = default
}
