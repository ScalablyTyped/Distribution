package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object microsoftSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/MicrosoftSmall", JSImport.Default)
  @js.native
  val default: FC[MicrosoftSmallProps] = js.native
  
  trait MicrosoftSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MicrosoftSmallProps {
    
    inline def apply(): MicrosoftSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MicrosoftSmallProps]
    }
    
    extension [Self <: MicrosoftSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MicrosoftSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `microsoftSmallMod.foo` */
  override def _to: FC[MicrosoftSmallProps] = default
}
