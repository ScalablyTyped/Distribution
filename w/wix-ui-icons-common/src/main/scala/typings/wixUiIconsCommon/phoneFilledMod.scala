package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object phoneFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PhoneFilled", JSImport.Default)
  @js.native
  val default: SFC[PhoneFilledProps] = js.native
  
  @js.native
  trait PhoneFilledProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object PhoneFilledProps {
    
    @scala.inline
    def apply(): PhoneFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhoneFilledProps]
    }
    
    @scala.inline
    implicit class PhoneFilledPropsMutableBuilder[Self <: PhoneFilledProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[PhoneFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `phoneFilledMod.foo` */
  override def _to: SFC[PhoneFilledProps] = default
}
