package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsPhoneFilledMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/PhoneFilled", JSImport.Default)
  @js.native
  val default: FC[PhoneFilledProps] = js.native
  
  trait PhoneFilledProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PhoneFilledProps {
    
    inline def apply(): PhoneFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhoneFilledProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PhoneFilledProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PhoneFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsPhoneFilledMod.foo` */
  override def _to: FC[PhoneFilledProps] = default
}
