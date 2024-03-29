package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsEmailAlertSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/EmailAlertSmall", JSImport.Default)
  @js.native
  val default: FC[EmailAlertSmallProps] = js.native
  
  trait EmailAlertSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object EmailAlertSmallProps {
    
    inline def apply(): EmailAlertSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmailAlertSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EmailAlertSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[EmailAlertSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsEmailAlertSmallMod.foo` */
  override def _to: FC[EmailAlertSmallProps] = default
}
