package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsEsignaturesmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/ESignatureSmall", JSImport.Default)
  @js.native
  val default: FC[ESignatureSmallProps] = js.native
  
  trait ESignatureSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ESignatureSmallProps {
    
    inline def apply(): ESignatureSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ESignatureSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ESignatureSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ESignatureSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsEsignaturesmallMod.foo` */
  override def _to: FC[ESignatureSmallProps] = default
}
